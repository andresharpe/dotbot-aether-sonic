package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1704q2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30926E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30927F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1704q2(BinderC1751y2 binderC1751y2, Z4 z4) {
        this.f30927F = binderC1751y2;
        this.f30926E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        l4 = this.f30927F.f31053i;
        l4.c();
        l42 = this.f30927F.f31053i;
        Z4 z4 = this.f30926E;
        l42.a().f();
        l42.e();
        C1285y.h(z4.f30506E);
        C1653i b4 = C1653i.b(z4.f30527Z);
        C1653i T3 = l42.T(z4.f30506E);
        l42.b().t().c("Setting consent, package, consent", z4.f30506E, b4);
        l42.y(z4.f30506E, b4);
        if (b4.k(T3)) {
            l42.t(z4);
        }
    }
}
