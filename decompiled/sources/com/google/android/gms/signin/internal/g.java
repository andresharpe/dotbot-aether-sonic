package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1268p;

/* loaded from: classes2.dex */
public final class g extends com.google.android.gms.internal.base.a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void N1(int i4) throws RemoteException {
        Parcel v3 = v();
        v3.writeInt(i4);
        G(7, v3);
    }

    public final void O1(InterfaceC1268p interfaceC1268p, int i4, boolean z3) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.base.c.d(v3, interfaceC1268p);
        v3.writeInt(i4);
        com.google.android.gms.internal.base.c.b(v3, z3);
        G(9, v3);
    }

    public final void P1(j jVar, f fVar) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.base.c.c(v3, jVar);
        com.google.android.gms.internal.base.c.d(v3, fVar);
        G(12, v3);
    }
}
