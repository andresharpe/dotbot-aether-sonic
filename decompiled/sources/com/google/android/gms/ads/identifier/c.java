package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.D;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: E, reason: collision with root package name */
    private final WeakReference<a> f27730E;

    /* renamed from: F, reason: collision with root package name */
    private final long f27731F;

    /* renamed from: G, reason: collision with root package name */
    final CountDownLatch f27732G = new CountDownLatch(1);

    /* renamed from: H, reason: collision with root package name */
    boolean f27733H = false;

    public c(a aVar, long j4) {
        this.f27730E = new WeakReference<>(aVar);
        this.f27731F = j4;
        start();
    }

    private final void a() {
        a aVar = this.f27730E.get();
        if (aVar != null) {
            aVar.f();
            this.f27733H = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f27732G.await(this.f27731F, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
