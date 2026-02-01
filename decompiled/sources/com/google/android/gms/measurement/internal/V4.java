package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* loaded from: classes2.dex */
final class V4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30450E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30451F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30452G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30453H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1420j0 interfaceC1420j0, String str, String str2) {
        this.f30453H = appMeasurementDynamiteService;
        this.f30450E = interfaceC1420j0;
        this.f30451F = str;
        this.f30452G = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30453H.f30107i.J().R(this.f30450E, this.f30451F, this.f30452G);
    }
}
