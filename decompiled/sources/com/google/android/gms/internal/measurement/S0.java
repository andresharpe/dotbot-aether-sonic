package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Y0 f29472I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29473J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C1421j1 c1421j1, Y0 y02) {
        super(c1421j1, true);
        this.f29473J = c1421j1;
        this.f29472I = y02;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29473J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setEventInterceptor(this.f29472I);
    }
}
