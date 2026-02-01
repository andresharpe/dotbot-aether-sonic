package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class k extends com.google.android.gms.internal.base.b implements l {
    public k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean N1(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            H0(parcel.readInt());
            return true;
        }
        return false;
    }
}
