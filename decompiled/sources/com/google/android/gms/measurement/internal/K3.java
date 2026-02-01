package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* loaded from: classes2.dex */
final class K3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30288E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1736w f30289F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30290G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30291H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1420j0 interfaceC1420j0, C1736w c1736w, String str) {
        this.f30291H = appMeasurementDynamiteService;
        this.f30288E = interfaceC1420j0;
        this.f30289F = c1736w;
        this.f30290G = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30291H.f30107i.J().n(this.f30288E, this.f30289F, this.f30290G);
    }
}
