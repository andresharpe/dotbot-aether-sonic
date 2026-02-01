package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class Z extends a0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ PendingIntent f29205c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(b0 b0Var, com.google.android.gms.common.api.i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f29205c = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.K0(this.f29205c);
        setResult(Status.f28025K);
    }
}
