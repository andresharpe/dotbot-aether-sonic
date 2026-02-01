package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class p0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LocationRequest f29236c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ PendingIntent f29237d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(iVar);
        this.f29236c = locationRequest;
        this.f29237d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.z0(this.f29236c, this.f29237d, new t0(this));
    }
}
