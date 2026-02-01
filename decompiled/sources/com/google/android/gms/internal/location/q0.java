package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1207o;

/* loaded from: classes.dex */
final class q0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.r f29239c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, com.google.android.gms.common.api.i iVar, com.google.android.gms.location.r rVar) {
        super(iVar);
        this.f29239c = rVar;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.A0(C1207o.c(this.f29239c, com.google.android.gms.location.r.class.getSimpleName()), new t0(this));
    }
}
