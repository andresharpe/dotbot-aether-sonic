package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1507u0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29802I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29803J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507u0(C1421j1 c1421j1, String str) {
        super(c1421j1, true);
        this.f29803J = c1421j1;
        this.f29802I = str;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29803J.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setUserId(this.f29802I, this.f29546E);
    }
}
