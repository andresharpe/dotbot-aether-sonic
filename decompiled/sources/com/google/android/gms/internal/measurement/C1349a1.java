package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1349a1 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Bundle f29582I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ Activity f29583J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ C1413i1 f29584K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349a1(C1413i1 c1413i1, Bundle bundle, Activity activity) {
        super(c1413i1.f29669E, true);
        this.f29584K = c1413i1;
        this.f29582I = bundle;
        this.f29583J = activity;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        Bundle bundle;
        InterfaceC1396g0 interfaceC1396g0;
        if (this.f29582I != null) {
            bundle = new Bundle();
            if (this.f29582I.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f29582I.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC1396g0 = this.f29584K.f29669E.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).onActivityCreated(com.google.android.gms.dynamic.f.O0(this.f29583J), bundle, this.f29547F);
    }
}
