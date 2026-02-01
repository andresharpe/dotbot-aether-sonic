package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1662j2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1623d f30801E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30802F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1662j2(BinderC1751y2 binderC1751y2, C1623d c1623d) {
        this.f30802F = binderC1751y2;
        this.f30801E = c1623d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        L4 l43;
        l4 = this.f30802F.f31053i;
        l4.c();
        if (this.f30801E.f30575G.c0() == null) {
            l43 = this.f30802F.f31053i;
            l43.q(this.f30801E);
        } else {
            l42 = this.f30802F.f31053i;
            l42.w(this.f30801E);
        }
    }
}
