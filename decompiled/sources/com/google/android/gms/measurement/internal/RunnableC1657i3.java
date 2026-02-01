package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1657i3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ boolean f30791E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30792F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1657i3(C1687n3 c1687n3, boolean z3) {
        this.f30792F = c1687n3;
        this.f30791E = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m4 = this.f30792F.f31060a.m();
        boolean l4 = this.f30792F.f31060a.l();
        this.f30792F.f31060a.i(this.f30791E);
        if (l4 == this.f30791E) {
            this.f30792F.f31060a.b().t().b("Default data collection state already set to", Boolean.valueOf(this.f30791E));
        }
        if (this.f30792F.f31060a.m() == m4 || this.f30792F.f31060a.m() != this.f30792F.f31060a.l()) {
            this.f30792F.f31060a.b().v().c("Default data collection is different than actual status", Boolean.valueOf(this.f30791E), Boolean.valueOf(m4));
        }
        this.f30792F.N();
    }
}
