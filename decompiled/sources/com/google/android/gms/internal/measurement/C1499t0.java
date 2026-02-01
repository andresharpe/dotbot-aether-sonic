package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1499t0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29784I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29785J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ BinderC1364c0 f29786K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29787L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499t0(C1421j1 c1421j1, String str, String str2, BinderC1364c0 binderC1364c0) {
        super(c1421j1, true);
        this.f29787L = c1421j1;
        this.f29784I = str;
        this.f29785J = str2;
        this.f29786K = binderC1364c0;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29787L.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).getConditionalUserProperties(this.f29784I, this.f29785J, this.f29786K);
    }

    @Override // com.google.android.gms.internal.measurement.X0
    protected final void b() {
        this.f29786K.o(null);
    }
}
