package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Long f29519I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29520J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ String f29521K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ Bundle f29522L;

    /* renamed from: M, reason: collision with root package name */
    final /* synthetic */ boolean f29523M;

    /* renamed from: N, reason: collision with root package name */
    final /* synthetic */ boolean f29524N;

    /* renamed from: O, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29525O;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C1421j1 c1421j1, Long l4, String str, String str2, Bundle bundle, boolean z3, boolean z4) {
        super(c1421j1, true);
        this.f29525O = c1421j1;
        this.f29519I = l4;
        this.f29520J = str;
        this.f29521K = str2;
        this.f29522L = bundle;
        this.f29523M = z3;
        this.f29524N = z4;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        long longValue;
        InterfaceC1396g0 interfaceC1396g0;
        Long l4 = this.f29519I;
        if (l4 == null) {
            longValue = this.f29546E;
        } else {
            longValue = l4.longValue();
        }
        long j4 = longValue;
        interfaceC1396g0 = this.f29525O.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).logEvent(this.f29520J, this.f29521K, this.f29522L, this.f29523M, this.f29524N, j4);
    }
}
