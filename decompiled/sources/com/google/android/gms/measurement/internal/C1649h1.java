package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1649h1 extends com.google.android.gms.internal.measurement.O implements InterfaceC1661j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1649h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void L0(C1736w c1736w, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, c1736w);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(1, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void N(Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(6, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void Q0(Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(4, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final List R0(String str, String str2, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        Parcel A3 = A(16, v3);
        ArrayList createTypedArrayList = A3.createTypedArrayList(C1623d.CREATOR);
        A3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void S(Bundle bundle, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, bundle);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(19, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final List V(String str, String str2, String str3, boolean z3) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(null);
        v3.writeString(str2);
        v3.writeString(str3);
        com.google.android.gms.internal.measurement.Q.d(v3, z3);
        Parcel A3 = A(15, v3);
        ArrayList createTypedArrayList = A3.createTypedArrayList(P4.CREATOR);
        A3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void W0(long j4, String str, String str2, String str3) throws RemoteException {
        Parcel v3 = v();
        v3.writeLong(j4);
        v3.writeString(str);
        v3.writeString(str2);
        v3.writeString(str3);
        G(10, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void a0(C1623d c1623d) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void a1(C1736w c1736w, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void b1(P4 p4, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, p4);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(2, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final List d0(Z4 z4, boolean z3) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        com.google.android.gms.internal.measurement.Q.d(v3, z3);
        Parcel A3 = A(7, v3);
        ArrayList createTypedArrayList = A3.createTypedArrayList(P4.CREATOR);
        A3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final byte[] f0(C1736w c1736w, String str) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, c1736w);
        v3.writeString(str);
        Parcel A3 = A(9, v3);
        byte[] createByteArray = A3.createByteArray();
        A3.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final String k0(Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        Parcel A3 = A(11, v3);
        String readString = A3.readString();
        A3.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void l1(Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(20, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final List n1(String str, String str2, boolean z3, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        com.google.android.gms.internal.measurement.Q.d(v3, z3);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        Parcel A3 = A(14, v3);
        ArrayList createTypedArrayList = A3.createTypedArrayList(P4.CREATOR);
        A3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final List r0(String str, String str2, String str3) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(null);
        v3.writeString(str2);
        v3.writeString(str3);
        Parcel A3 = A(17, v3);
        ArrayList createTypedArrayList = A3.createTypedArrayList(C1623d.CREATOR);
        A3.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void t1(Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(18, v3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    public final void x1(C1623d c1623d, Z4 z4) throws RemoteException {
        Parcel v3 = v();
        com.google.android.gms.internal.measurement.Q.e(v3, c1623d);
        com.google.android.gms.internal.measurement.Q.e(v3, z4);
        G(12, v3);
    }
}
