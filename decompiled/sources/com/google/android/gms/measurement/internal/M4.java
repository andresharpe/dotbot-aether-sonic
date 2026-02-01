package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class M4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X4 f30343E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30344F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M4(AppMeasurementDynamiteService appMeasurementDynamiteService, X4 x4) {
        this.f30344F = appMeasurementDynamiteService;
        this.f30343E = x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30344F.f30107i.G().F(this.f30343E);
    }
}
