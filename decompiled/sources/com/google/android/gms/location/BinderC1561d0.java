package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC1561d0 extends com.google.android.gms.internal.location.B implements InterfaceC1563e0 {
    public static InterfaceC1563e0 A(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof InterfaceC1563e0) {
            return (InterfaceC1563e0) queryLocalInterface;
        }
        return new C1559c0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        throw null;
    }
}
