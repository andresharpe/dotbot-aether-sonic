package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29361I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29362J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ boolean f29363K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ BinderC1364c0 f29364L;

    /* renamed from: M, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29365M;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C1421j1 c1421j1, String str, String str2, boolean z3, BinderC1364c0 binderC1364c0) {
        super(c1421j1, true);
        this.f29365M = c1421j1;
        this.f29361I = str;
        this.f29362J = str2;
        this.f29363K = z3;
        this.f29364L = binderC1364c0;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29365M.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).getUserProperties(this.f29361I, this.f29362J, this.f29363K, this.f29364L);
    }

    @Override // com.google.android.gms.internal.measurement.X0
    protected final void b() {
        this.f29364L.o(null);
    }
}
