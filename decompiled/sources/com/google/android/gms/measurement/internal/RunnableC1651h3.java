package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.D6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1651h3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1653i f30769E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ int f30770F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ long f30771G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ boolean f30772H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1653i f30773I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30774J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1651h3(C1687n3 c1687n3, C1653i c1653i, int i4, long j4, boolean z3, C1653i c1653i2) {
        this.f30774J = c1687n3;
        this.f30769E = c1653i;
        this.f30770F = i4;
        this.f30771G = j4;
        this.f30772H = z3;
        this.f30773I = c1653i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30774J.H(this.f30769E);
        C1687n3.b0(this.f30774J, this.f30769E, this.f30770F, this.f30771G, false, this.f30772H);
        D6.b();
        if (this.f30774J.f31060a.x().z(null, C1643g1.f30739u0)) {
            C1687n3.a0(this.f30774J, this.f30769E, this.f30773I);
        }
    }
}
