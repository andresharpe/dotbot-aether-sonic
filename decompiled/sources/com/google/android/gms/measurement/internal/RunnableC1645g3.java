package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.D6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1645g3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1653i f30753E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f30754F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ int f30755G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f30756H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ boolean f30757I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1653i f30758J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30759K;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1645g3(C1687n3 c1687n3, C1653i c1653i, long j4, int i4, long j5, boolean z3, C1653i c1653i2) {
        this.f30759K = c1687n3;
        this.f30753E = c1653i;
        this.f30754F = j4;
        this.f30755G = i4;
        this.f30756H = j5;
        this.f30757I = z3;
        this.f30758J = c1653i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30759K.H(this.f30753E);
        this.f30759K.x(this.f30754F, false);
        C1687n3.b0(this.f30759K, this.f30753E, this.f30755G, this.f30756H, true, this.f30757I);
        D6.b();
        if (this.f30759K.f31060a.x().z(null, C1643g1.f30739u0)) {
            C1687n3.a0(this.f30759K, this.f30753E, this.f30758J);
        }
    }
}
