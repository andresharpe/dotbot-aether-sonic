package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1356b0;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1729u4 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f31003c;

    /* renamed from: d, reason: collision with root package name */
    protected final C1723t4 f31004d;

    /* renamed from: e, reason: collision with root package name */
    protected final C1717s4 f31005e;

    /* renamed from: f, reason: collision with root package name */
    protected final C1706q4 f31006f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1729u4(C1638f2 c1638f2) {
        super(c1638f2);
        this.f31004d = new C1723t4(this);
        this.f31005e = new C1717s4(this);
        this.f31006f = new C1706q4(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void o(C1729u4 c1729u4, long j4) {
        c1729u4.f();
        c1729u4.q();
        c1729u4.f31060a.b().t().b("Activity paused, time", Long.valueOf(j4));
        c1729u4.f31006f.a(j4);
        if (c1729u4.f31060a.x().B()) {
            c1729u4.f31005e.b(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void p(C1729u4 c1729u4, long j4) {
        c1729u4.f();
        c1729u4.q();
        c1729u4.f31060a.b().t().b("Activity resumed, time", Long.valueOf(j4));
        if (c1729u4.f31060a.x().B() || c1729u4.f31060a.D().f30263q.b()) {
            c1729u4.f31005e.c(j4);
        }
        c1729u4.f31006f.b();
        C1723t4 c1723t4 = c1729u4.f31004d;
        c1723t4.f30987a.f();
        if (!c1723t4.f30987a.f31060a.m()) {
            return;
        }
        c1723t4.b(c1723t4.f30987a.f31060a.zzav().a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void q() {
        f();
        if (this.f31003c == null) {
            this.f31003c = new HandlerC1356b0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.F1
    protected final boolean l() {
        return false;
    }
}
