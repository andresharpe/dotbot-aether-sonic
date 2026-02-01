package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1655i1 extends com.google.android.gms.internal.measurement.P implements InterfaceC1661j1 {
    public AbstractBinderC1655i1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        switch (i4) {
            case 1:
                C1736w c1736w = (C1736w) com.google.android.gms.internal.measurement.Q.a(parcel, C1736w.CREATOR);
                Z4 z4 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                L0(c1736w, z4);
                parcel2.writeNoException();
                return true;
            case 2:
                P4 p4 = (P4) com.google.android.gms.internal.measurement.Q.a(parcel, P4.CREATOR);
                Z4 z42 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                b1(p4, z42);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                Z4 z43 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                Q0(z43);
                parcel2.writeNoException();
                return true;
            case 5:
                C1736w c1736w2 = (C1736w) com.google.android.gms.internal.measurement.Q.a(parcel, C1736w.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.c(parcel);
                a1(c1736w2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                Z4 z44 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                N(z44);
                parcel2.writeNoException();
                return true;
            case 7:
                Z4 z45 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                boolean g4 = com.google.android.gms.internal.measurement.Q.g(parcel);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                List d02 = d0(z45, g4);
                parcel2.writeNoException();
                parcel2.writeTypedList(d02);
                return true;
            case 9:
                C1736w c1736w3 = (C1736w) com.google.android.gms.internal.measurement.Q.a(parcel, C1736w.CREATOR);
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.c(parcel);
                byte[] f02 = f0(c1736w3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(f02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.c(parcel);
                W0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                Z4 z46 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                String k02 = k0(z46);
                parcel2.writeNoException();
                parcel2.writeString(k02);
                return true;
            case 12:
                C1623d c1623d = (C1623d) com.google.android.gms.internal.measurement.Q.a(parcel, C1623d.CREATOR);
                Z4 z47 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                x1(c1623d, z47);
                parcel2.writeNoException();
                return true;
            case 13:
                C1623d c1623d2 = (C1623d) com.google.android.gms.internal.measurement.Q.a(parcel, C1623d.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                a0(c1623d2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean g5 = com.google.android.gms.internal.measurement.Q.g(parcel);
                Z4 z48 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                List n12 = n1(readString7, readString8, g5, z48);
                parcel2.writeNoException();
                parcel2.writeTypedList(n12);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean g6 = com.google.android.gms.internal.measurement.Q.g(parcel);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                List V3 = V(readString9, readString10, readString11, g6);
                parcel2.writeNoException();
                parcel2.writeTypedList(V3);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                Z4 z49 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                List R02 = R0(readString12, readString13, z49);
                parcel2.writeNoException();
                parcel2.writeTypedList(R02);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.c(parcel);
                List r02 = r0(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(r02);
                return true;
            case 18:
                Z4 z410 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                t1(z410);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.Q.a(parcel, Bundle.CREATOR);
                Z4 z411 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                S(bundle, z411);
                parcel2.writeNoException();
                return true;
            case 20:
                Z4 z412 = (Z4) com.google.android.gms.internal.measurement.Q.a(parcel, Z4.CREATOR);
                com.google.android.gms.internal.measurement.Q.c(parcel);
                l1(z412);
                parcel2.writeNoException();
                return true;
        }
    }
}
