package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1207o;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class m0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LocationRequest f29228c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.r f29229d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u0 u0Var, com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, com.google.android.gms.location.r rVar) {
        super(iVar);
        this.f29228c = locationRequest;
        this.f29229d = rVar;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.x0(this.f29228c, C1207o.a(this.f29229d, L.b(), com.google.android.gms.location.r.class.getSimpleName()), new t0(this));
    }
}
