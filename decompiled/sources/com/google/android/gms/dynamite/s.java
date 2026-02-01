package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.common.C1313a;

/* loaded from: classes.dex */
public final class s extends C1313a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int N1() throws RemoteException {
        Parcel v3 = v(6, O0());
        int readInt = v3.readInt();
        v3.recycle();
        return readInt;
    }

    public final int O1(com.google.android.gms.dynamic.d dVar, String str, boolean z3) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        com.google.android.gms.internal.common.l.c(O02, z3);
        Parcel v3 = v(3, O02);
        int readInt = v3.readInt();
        v3.recycle();
        return readInt;
    }

    public final int P1(com.google.android.gms.dynamic.d dVar, String str, boolean z3) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        com.google.android.gms.internal.common.l.c(O02, z3);
        Parcel v3 = v(5, O02);
        int readInt = v3.readInt();
        v3.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.d Q1(com.google.android.gms.dynamic.d dVar, String str, int i4) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        O02.writeInt(i4);
        Parcel v3 = v(2, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }

    public final com.google.android.gms.dynamic.d R1(com.google.android.gms.dynamic.d dVar, String str, int i4, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        O02.writeInt(i4);
        com.google.android.gms.internal.common.l.f(O02, dVar2);
        Parcel v3 = v(8, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }

    public final com.google.android.gms.dynamic.d S1(com.google.android.gms.dynamic.d dVar, String str, int i4) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        O02.writeInt(i4);
        Parcel v3 = v(4, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }

    public final com.google.android.gms.dynamic.d T1(com.google.android.gms.dynamic.d dVar, String str, boolean z3, long j4) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.f(O02, dVar);
        O02.writeString(str);
        com.google.android.gms.internal.common.l.c(O02, z3);
        O02.writeLong(j4);
        Parcel v3 = v(7, O02);
        com.google.android.gms.dynamic.d A3 = d.a.A(v3.readStrongBinder());
        v3.recycle();
        return A3;
    }
}
