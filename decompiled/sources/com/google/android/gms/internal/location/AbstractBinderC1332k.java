package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1332k extends B implements InterfaceC1333l {
    public AbstractBinderC1332k() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.B
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                w1(parcel.readInt(), (PendingIntent) X.b(parcel, PendingIntent.CREATOR));
            } else {
                Y(parcel.readInt(), parcel.createStringArray());
            }
        } else {
            L1(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
