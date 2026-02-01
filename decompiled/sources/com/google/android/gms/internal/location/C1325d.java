package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.C1584p;

/* renamed from: com.google.android.gms.internal.location.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1325d extends AbstractC1327f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1584p f29211c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ PendingIntent f29212d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325d(C1328g c1328g, com.google.android.gms.common.api.i iVar, C1584p c1584p, PendingIntent pendingIntent) {
        super(iVar);
        this.f29211c = c1584p;
        this.f29212d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.M0(this.f29211c, this.f29212d, this);
    }
}
