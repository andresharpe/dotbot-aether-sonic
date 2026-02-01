package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.common.C1313a;

/* loaded from: classes.dex */
public final class t extends C1313a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.d N1(com.google.android.gms.dynamic.d dVar, String str, int i4, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        O02.writeInt(i4);
        com.google.android.gms.internal.common.l.f(O02, dVar2);
        Parcel v3 = v(2, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }

    public final com.google.android.gms.dynamic.d O1(com.google.android.gms.dynamic.d dVar, String str, int i4, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        O02.writeInt(i4);
        com.google.android.gms.internal.common.l.f(O02, dVar2);
        Parcel v3 = v(3, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }
}
