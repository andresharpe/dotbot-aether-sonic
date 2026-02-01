package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1539y0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Bundle f29838I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29839J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539y0(C1421j1 c1421j1, Bundle bundle) {
        super(c1421j1, true);
        this.f29839J = c1421j1;
        this.f29838I = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29839J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setConsentThirdParty(this.f29838I, this.f29546E);
    }
}
