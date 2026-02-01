package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1676l4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30843E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30844F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30845G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ boolean f30846H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30847I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1676l4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1420j0 interfaceC1420j0, String str, String str2, boolean z3) {
        this.f30847I = appMeasurementDynamiteService;
        this.f30843E = interfaceC1420j0;
        this.f30844F = str;
        this.f30845G = str2;
        this.f30846H = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30847I.f30107i.J().U(this.f30843E, this.f30844F, this.f30845G, this.f30846H);
    }
}
