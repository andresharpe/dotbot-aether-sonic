package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b, a {

    /* renamed from: g, reason: collision with root package name */
    static final String f34978g = "_ae";

    /* renamed from: a, reason: collision with root package name */
    private final e f34979a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34980b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f34981c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f34983e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f34982d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f34984f = false;

    public c(@N e eVar, int i4, TimeUnit timeUnit) {
        this.f34979a = eVar;
        this.f34980b = i4;
        this.f34981c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void E(@N String str, @N Bundle bundle) {
        CountDownLatch countDownLatch = this.f34983e;
        if (countDownLatch != null && f34978g.equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@N String str, @P Bundle bundle) {
        synchronized (this.f34982d) {
            try {
                com.google.firebase.crashlytics.internal.f.f().k("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f34983e = new CountDownLatch(1);
                this.f34984f = false;
                this.f34979a.a(str, bundle);
                com.google.firebase.crashlytics.internal.f.f().k("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f34983e.await(this.f34980b, this.f34981c)) {
                        this.f34984f = true;
                        com.google.firebase.crashlytics.internal.f.f().k("App exception callback received from Analytics listener.");
                    } else {
                        com.google.firebase.crashlytics.internal.f.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    com.google.firebase.crashlytics.internal.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f34983e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        return this.f34984f;
    }
}
