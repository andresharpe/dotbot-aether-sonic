package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1663j3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30803E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30804F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1663j3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1420j0 interfaceC1420j0) {
        this.f30804F = appMeasurementDynamiteService;
        this.f30803E = interfaceC1420j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30804F.f30107i.J().P(this.f30803E);
    }
}
