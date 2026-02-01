package com.google.firebase.installations.remote;

import androidx.annotation.B;
import com.google.firebase.installations.r;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class d {

    /* renamed from: d, reason: collision with root package name */
    private static final long f36333d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f36334e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final r f36335a;

    /* renamed from: b, reason: collision with root package name */
    @B("this")
    private long f36336b;

    /* renamed from: c, reason: collision with root package name */
    @B("this")
    private int f36337c;

    d(r rVar) {
        this.f36335a = rVar;
    }

    private synchronized long a(int i4) {
        if (!c(i4)) {
            return f36333d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f36337c) + this.f36335a.e(), f36334e);
    }

    private static boolean c(int i4) {
        return i4 == 429 || (i4 >= 500 && i4 < 600);
    }

    private static boolean d(int i4) {
        return (i4 >= 200 && i4 < 300) || i4 == 401 || i4 == 404;
    }

    private synchronized void e() {
        this.f36337c = 0;
    }

    public synchronized boolean b() {
        boolean z3;
        if (this.f36337c != 0) {
            if (this.f36335a.a() <= this.f36336b) {
                z3 = false;
            }
        }
        z3 = true;
        return z3;
    }

    public synchronized void f(int i4) {
        if (d(i4)) {
            e();
            return;
        }
        this.f36337c++;
        this.f36336b = this.f36335a.a() + a(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.f36335a = r.c();
    }
}
