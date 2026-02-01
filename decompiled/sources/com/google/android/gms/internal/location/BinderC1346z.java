package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.location.C1595v;

/* renamed from: com.google.android.gms.internal.location.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1346z extends AbstractBinderC1336o {

    /* renamed from: i, reason: collision with root package name */
    private C1181e.b<C1595v> f29254i;

    public BinderC1346z(C1181e.b<C1595v> bVar) {
        boolean z3;
        if (bVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "listener can't be null.");
        this.f29254i = bVar;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1337p
    public final void p0(C1595v c1595v) throws RemoteException {
        this.f29254i.b(c1595v);
        this.f29254i = null;
    }
}
