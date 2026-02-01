package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.common.C1313a;

/* loaded from: classes.dex */
public final class Y0 extends C1313a implements a1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.a1
    public final int zzc() throws RemoteException {
        Parcel v3 = v(2, O0());
        int readInt = v3.readInt();
        v3.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.a1
    public final com.google.android.gms.dynamic.d zzd() throws RemoteException {
        Parcel v3 = v(1, O0());
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }
}
