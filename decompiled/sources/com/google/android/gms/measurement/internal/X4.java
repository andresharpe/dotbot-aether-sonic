package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1444m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X4 implements G2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1444m0 f30485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f30486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1444m0 interfaceC1444m0) {
        this.f30486b = appMeasurementDynamiteService;
        this.f30485a = interfaceC1444m0;
    }

    @Override // com.google.android.gms.measurement.internal.G2
    public final void a(String str, String str2, Bundle bundle, long j4) {
        try {
            this.f30485a.L(str, str2, bundle, j4);
        } catch (RemoteException e4) {
            C1638f2 c1638f2 = this.f30486b.f30107i;
            if (c1638f2 != null) {
                c1638f2.b().u().b("Event interceptor threw exception", e4);
            }
        }
    }
}
