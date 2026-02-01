package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class Y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f29203c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ PendingIntent f29204d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(b0 b0Var, com.google.android.gms.common.api.i iVar, long j4, PendingIntent pendingIntent) {
        super(iVar);
        this.f29203c = j4;
        this.f29204d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.H0(this.f29203c, this.f29204d);
        setResult(Status.f28025K);
    }
}
