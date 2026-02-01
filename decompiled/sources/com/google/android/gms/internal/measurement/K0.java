package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class K0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29372I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ Object f29373J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29374K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C1421j1 c1421j1, boolean z3, int i4, String str, Object obj, Object obj2, Object obj3) {
        super(c1421j1, false);
        this.f29374K = c1421j1;
        this.f29372I = str;
        this.f29373J = obj;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29374K.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).logHealthData(5, this.f29372I, com.google.android.gms.dynamic.f.O0(this.f29373J), com.google.android.gms.dynamic.f.O0(null), com.google.android.gms.dynamic.f.O0(null));
    }
}
