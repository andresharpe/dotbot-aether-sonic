package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1242c;
import com.google.android.gms.internal.location.AbstractBinderC1330i;
import com.google.android.gms.internal.location.C1323b;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class S extends AbstractBinderC1330i {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C1771l f29946i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(C1572j c1572j, C1771l c1771l) {
        this.f29946i = c1771l;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1331j
    public final void D1(C1323b c1323b) throws RemoteException {
        Status status = c1323b.getStatus();
        if (status == null) {
            this.f29946i.d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.i0() == 0) {
            this.f29946i.c(Boolean.TRUE);
        } else {
            this.f29946i.d(C1242c.a(status));
        }
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1331j
    public final void zzc() {
    }
}
