package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class k0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Location f29227c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(u0 u0Var, com.google.android.gms.common.api.i iVar, Location location) {
        super(iVar);
        this.f29227c = location;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.E0(this.f29227c);
        setResult(Status.f28025K);
    }
}
