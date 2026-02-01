package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29536I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29537J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ Object f29538K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ boolean f29539L;

    /* renamed from: M, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29540M;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(C1421j1 c1421j1, String str, String str2, Object obj, boolean z3) {
        super(c1421j1, true);
        this.f29540M = c1421j1;
        this.f29536I = str;
        this.f29537J = str2;
        this.f29538K = obj;
        this.f29539L = z3;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29540M.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setUserProperty(this.f29536I, this.f29537J, com.google.android.gms.dynamic.f.O0(this.f29538K), this.f29539L, this.f29546E);
    }
}
