package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1330i extends B implements InterfaceC1331j {
    public AbstractBinderC1330i() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            zzc();
        } else {
            D1((C1323b) X.b(parcel, C1323b.CREATOR));
        }
        return true;
    }
}
