package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1727u2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ P4 f30994E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Z4 f30995F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30996G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1727u2(BinderC1751y2 binderC1751y2, P4 p4, Z4 z4) {
        this.f30996G = binderC1751y2;
        this.f30994E = p4;
        this.f30995F = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        L4 l43;
        l4 = this.f30996G.f31053i;
        l4.c();
        if (this.f30994E.c0() == null) {
            l43 = this.f30996G.f31053i;
            l43.s(this.f30994E, this.f30995F);
        } else {
            l42 = this.f30996G.f31053i;
            l42.z(this.f30994E, this.f30995F);
        }
    }
}
