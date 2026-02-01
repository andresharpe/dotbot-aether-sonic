package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ BinderC1364c0 f29409I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29410J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C1421j1 c1421j1, BinderC1364c0 binderC1364c0) {
        super(c1421j1, true);
        this.f29410J = c1421j1;
        this.f29409I = binderC1364c0;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29410J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).getAppInstanceId(this.f29409I);
    }

    @Override // com.google.android.gms.internal.measurement.X0
    protected final void b() {
        this.f29409I.o(null);
    }
}
