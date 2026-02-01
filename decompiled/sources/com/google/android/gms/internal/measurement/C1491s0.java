package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1491s0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29771I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29772J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ Bundle f29773K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29774L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491s0(C1421j1 c1421j1, String str, String str2, Bundle bundle) {
        super(c1421j1, true);
        this.f29774L = c1421j1;
        this.f29771I = str;
        this.f29772J = str2;
        this.f29773K = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29774L.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).clearConditionalUserProperty(this.f29771I, this.f29772J, this.f29773K);
    }
}
