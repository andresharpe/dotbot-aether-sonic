package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.measurement.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1698p2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30904E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30905F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1698p2(BinderC1751y2 binderC1751y2, Z4 z4) {
        this.f30905F = binderC1751y2;
        this.f30904E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        l4 = this.f30905F.f31053i;
        l4.c();
        l42 = this.f30905F.f31053i;
        Z4 z4 = this.f30904E;
        l42.a().f();
        l42.e();
        C1285y.h(z4.f30506E);
        l42.Q(z4);
    }
}
