package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class j0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f29226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u0 u0Var, com.google.android.gms.common.api.i iVar, boolean z3) {
        super(iVar);
        this.f29226c = z3;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.D0(this.f29226c);
        setResult(Status.f28025K);
    }
}
