package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29398I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ BinderC1364c0 f29399J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29400K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(C1421j1 c1421j1, String str, BinderC1364c0 binderC1364c0) {
        super(c1421j1, true);
        this.f29400K = c1421j1;
        this.f29398I = str;
        this.f29399J = binderC1364c0;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29400K.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).getMaxUserProperties(this.f29398I, this.f29399J);
    }

    @Override // com.google.android.gms.internal.measurement.X0
    protected final void b() {
        this.f29399J.o(null);
    }
}
