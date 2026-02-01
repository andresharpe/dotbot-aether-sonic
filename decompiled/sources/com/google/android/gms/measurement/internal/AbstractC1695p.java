package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.HandlerC1356b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1695p {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f30899d;

    /* renamed from: a, reason: collision with root package name */
    private final B2 f30900a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f30901b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f30902c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1695p(B2 b22) {
        C1285y.l(b22);
        this.f30900a = b22;
        this.f30901b = new RunnableC1689o(this, b22);
    }

    private final Handler f() {
        Handler handler;
        if (f30899d != null) {
            return f30899d;
        }
        synchronized (AbstractC1695p.class) {
            try {
                if (f30899d == null) {
                    f30899d = new HandlerC1356b0(this.f30900a.d().getMainLooper());
                }
                handler = f30899d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f30902c = 0L;
        f().removeCallbacks(this.f30901b);
    }

    public abstract void c();

    public final void d(long j4) {
        b();
        if (j4 >= 0) {
            this.f30902c = this.f30900a.zzav().a();
            if (!f().postDelayed(this.f30901b, j4)) {
                this.f30900a.b().p().b("Failed to schedule delayed post. time", Long.valueOf(j4));
            }
        }
    }

    public final boolean e() {
        return this.f30902c != 0;
    }
}
