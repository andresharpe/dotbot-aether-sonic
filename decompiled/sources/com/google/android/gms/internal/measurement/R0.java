package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Bundle f29431I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29432J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C1421j1 c1421j1, Bundle bundle) {
        super(c1421j1, true);
        this.f29432J = c1421j1;
        this.f29431I = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29432J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setDefaultEventParameters(this.f29431I);
    }
}
