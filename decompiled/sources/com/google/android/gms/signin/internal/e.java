package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class e extends com.google.android.gms.internal.base.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean N1(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        switch (i4) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                n0((l) com.google.android.gms.internal.base.c.a(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
