package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class r0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ PendingIntent f29241c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, com.google.android.gms.common.api.i iVar, PendingIntent pendingIntent) {
        super(iVar);
        this.f29241c = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.B0(this.f29241c, new t0(this));
    }
}
