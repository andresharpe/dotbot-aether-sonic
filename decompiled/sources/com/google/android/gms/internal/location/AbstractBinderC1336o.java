package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.C1595v;

/* renamed from: com.google.android.gms.internal.location.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1336o extends B implements InterfaceC1337p {
    public AbstractBinderC1336o() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            p0((C1595v) X.b(parcel, C1595v.CREATOR));
            return true;
        }
        return false;
    }
}
