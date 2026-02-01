package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.dynamic.d;

/* loaded from: classes.dex */
public interface c extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends com.google.android.gms.internal.common.k implements c {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @N
        public static c A(@N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof c) {
                return (c) queryLocalInterface;
            }
            return new q(iBinder);
        }

        @Override // com.google.android.gms.internal.common.k
        protected final boolean v(int i4, @N Parcel parcel, @N Parcel parcel2, int i5) throws RemoteException {
            switch (i4) {
                case 2:
                    d zzg = zzg();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.f(parcel2, zzg);
                    return true;
                case 3:
                    Bundle zzd = zzd();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.e(parcel2, zzd);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    c zze = zze();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.f(parcel2, zze);
                    return true;
                case 6:
                    d zzh = zzh();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.f(parcel2, zzh);
                    return true;
                case 7:
                    boolean C3 = C();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, C3);
                    return true;
                case 8:
                    String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    c zzf = zzf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.f(parcel2, zzf);
                    return true;
                case 10:
                    int zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzc);
                    return true;
                case 11:
                    boolean H3 = H();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, H3);
                    return true;
                case 12:
                    d zzi = zzi();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.f(parcel2, zzi);
                    return true;
                case 13:
                    boolean u3 = u();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, u3);
                    return true;
                case 14:
                    boolean zzv = zzv();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, zzv);
                    return true;
                case 15:
                    boolean n4 = n();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, n4);
                    return true;
                case 16:
                    boolean zzx = zzx();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, zzx);
                    return true;
                case 17:
                    boolean c4 = c();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, c4);
                    return true;
                case 18:
                    boolean d4 = d();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, d4);
                    return true;
                case 19:
                    boolean F3 = F();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.l.c(parcel2, F3);
                    return true;
                case 20:
                    d A3 = d.a.A(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.l.b(parcel);
                    h1(A3);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean g4 = com.google.android.gms.internal.common.l.g(parcel);
                    com.google.android.gms.internal.common.l.b(parcel);
                    I(g4);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean g5 = com.google.android.gms.internal.common.l.g(parcel);
                    com.google.android.gms.internal.common.l.b(parcel);
                    W(g5);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean g6 = com.google.android.gms.internal.common.l.g(parcel);
                    com.google.android.gms.internal.common.l.b(parcel);
                    q0(g6);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean g7 = com.google.android.gms.internal.common.l.g(parcel);
                    com.google.android.gms.internal.common.l.b(parcel);
                    C1(g7);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) com.google.android.gms.internal.common.l.a(parcel, Intent.CREATOR);
                    com.google.android.gms.internal.common.l.b(parcel);
                    x0(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) com.google.android.gms.internal.common.l.a(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.common.l.b(parcel);
                    B0(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    d A4 = d.a.A(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.l.b(parcel);
                    k1(A4);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void B0(@N Intent intent, int i4) throws RemoteException;

    boolean C() throws RemoteException;

    void C1(boolean z3) throws RemoteException;

    boolean F() throws RemoteException;

    boolean H() throws RemoteException;

    void I(boolean z3) throws RemoteException;

    void W(boolean z3) throws RemoteException;

    boolean c() throws RemoteException;

    boolean d() throws RemoteException;

    void h1(@N d dVar) throws RemoteException;

    void k1(@N d dVar) throws RemoteException;

    boolean n() throws RemoteException;

    void q0(boolean z3) throws RemoteException;

    boolean u() throws RemoteException;

    void x0(@N Intent intent) throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    @P
    Bundle zzd() throws RemoteException;

    @P
    c zze() throws RemoteException;

    @P
    c zzf() throws RemoteException;

    @N
    d zzg() throws RemoteException;

    @N
    d zzh() throws RemoteException;

    @N
    d zzi() throws RemoteException;

    @P
    String zzj() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzx() throws RemoteException;
}
