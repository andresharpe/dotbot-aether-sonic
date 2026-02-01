package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1575k0 extends com.google.android.gms.internal.location.B implements InterfaceC1577l0 {
    public AbstractBinderC1575k0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static InterfaceC1577l0 A(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof InterfaceC1577l0) {
            return (InterfaceC1577l0) queryLocalInterface;
        }
        return new C1573j0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            O((Location) com.google.android.gms.internal.location.X.b(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
