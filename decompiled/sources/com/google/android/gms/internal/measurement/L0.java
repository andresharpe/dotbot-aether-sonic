package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Bundle f29378I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ BinderC1364c0 f29379J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29380K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C1421j1 c1421j1, Bundle bundle, BinderC1364c0 binderC1364c0) {
        super(c1421j1, true);
        this.f29380K = c1421j1;
        this.f29378I = bundle;
        this.f29379J = binderC1364c0;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29380K.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).performAction(this.f29378I, this.f29379J, this.f29546E);
    }

    @Override // com.google.android.gms.internal.measurement.X0
    protected final void b() {
        this.f29379J.o(null);
    }
}
