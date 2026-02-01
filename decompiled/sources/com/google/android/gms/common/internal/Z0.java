package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class Z0 extends com.google.android.gms.internal.common.k implements a1 {
    public Z0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static a1 A(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof a1) {
            return (a1) queryLocalInterface;
        }
        return new Y0(iBinder);
    }

    @Override // com.google.android.gms.internal.common.k
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        } else {
            com.google.android.gms.dynamic.d zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.l.f(parcel2, zzd);
        }
        return true;
    }
}
