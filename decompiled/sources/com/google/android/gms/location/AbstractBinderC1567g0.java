package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1567g0 extends com.google.android.gms.internal.location.B implements InterfaceC1571i0 {
    public AbstractBinderC1567g0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static InterfaceC1571i0 A(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof InterfaceC1571i0) {
            return (InterfaceC1571i0) queryLocalInterface;
        }
        return new C1565f0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            z0((LocationAvailability) com.google.android.gms.internal.location.X.b(parcel, LocationAvailability.CREATOR));
        } else {
            Z((LocationResult) com.google.android.gms.internal.location.X.b(parcel, LocationResult.CREATOR));
        }
        return true;
    }
}
