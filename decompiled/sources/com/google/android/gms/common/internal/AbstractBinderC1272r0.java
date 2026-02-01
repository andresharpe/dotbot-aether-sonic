package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1272r0 extends com.google.android.gms.internal.common.k implements r {
    public AbstractBinderC1272r0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.k
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                J0 j02 = (J0) com.google.android.gms.internal.common.l.a(parcel, J0.CREATOR);
                com.google.android.gms.internal.common.l.b(parcel);
                Y0(readInt, readStrongBinder, j02);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) com.google.android.gms.internal.common.l.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.common.l.b(parcel);
                w0(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.l.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.l.b(parcel);
            S0(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
