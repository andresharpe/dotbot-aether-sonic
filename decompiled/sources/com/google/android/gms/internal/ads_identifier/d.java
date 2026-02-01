package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class d extends a implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final boolean j0(boolean z3) throws RemoteException {
        Parcel v3 = v();
        c.a(v3, true);
        Parcel A3 = A(2, v3);
        boolean b4 = c.b(A3);
        A3.recycle();
        return b4;
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final String zzc() throws RemoteException {
        Parcel A3 = A(1, v());
        String readString = A3.readString();
        A3.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final boolean zzd() throws RemoteException {
        Parcel A3 = A(6, v());
        boolean b4 = c.b(A3);
        A3.recycle();
        return b4;
    }
}
