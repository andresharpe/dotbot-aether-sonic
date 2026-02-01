package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1656i2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1623d f30788E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Z4 f30789F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30790G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1656i2(BinderC1751y2 binderC1751y2, C1623d c1623d, Z4 z4) {
        this.f30790G = binderC1751y2;
        this.f30788E = c1623d;
        this.f30789F = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        L4 l43;
        l4 = this.f30790G.f31053i;
        l4.c();
        if (this.f30788E.f30575G.c0() == null) {
            l43 = this.f30790G.f31053i;
            l43.r(this.f30788E, this.f30789F);
        } else {
            l42 = this.f30790G.f31053i;
            l42.x(this.f30788E, this.f30789F);
        }
    }
}
