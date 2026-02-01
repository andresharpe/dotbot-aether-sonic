package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* loaded from: classes2.dex */
final class W4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30475E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30476F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1420j0 interfaceC1420j0) {
        this.f30476F = appMeasurementDynamiteService;
        this.f30475E = interfaceC1420j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30476F.f30107i.L().B(this.f30475E, this.f30476F.f30107i.l());
    }
}
