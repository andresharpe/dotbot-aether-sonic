package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1436l0 extends P implements InterfaceC1444m0 {
    public AbstractBinderC1436l0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            Q.c(parcel);
            L(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
