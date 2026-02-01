package com.google.android.gms.internal.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class B extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public B(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 > 16777215) {
            if (super.onTransact(i4, parcel, parcel2, i5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return v(i4, parcel, parcel2, i5);
    }

    protected boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        throw null;
    }
}
