package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC1587q0;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.C1595v;

/* loaded from: classes.dex */
final class J extends AbstractC1587q0<C1595v> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1591t f29192c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k4, com.google.android.gms.common.api.i iVar, C1591t c1591t, String str) {
        super(iVar);
        this.f29192c = c1591t;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.q createFailedResult(Status status) {
        return new C1595v(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.G0(this.f29192c, this, null);
    }
}
