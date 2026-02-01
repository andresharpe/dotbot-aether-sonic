package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class m extends com.google.android.gms.internal.base.a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void N1(l lVar) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.base.c.d(v3, lVar);
        O0(1, v3);
    }
}
