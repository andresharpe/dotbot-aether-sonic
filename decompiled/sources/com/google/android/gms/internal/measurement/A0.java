package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ long f29257I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29258J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C1421j1 c1421j1, long j4) {
        super(c1421j1, true);
        this.f29258J = c1421j1;
        this.f29257I = j4;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29258J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setSessionTimeoutDuration(this.f29257I);
    }
}
