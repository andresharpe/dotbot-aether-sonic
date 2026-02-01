package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1412i0 extends P implements InterfaceC1420j0 {
    public AbstractBinderC1412i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
            Q.c(parcel);
            o(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
