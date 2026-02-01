package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1313a;

/* renamed from: com.google.android.gms.common.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276t0 extends C1313a implements InterfaceC1280v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1276t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1280v0
    public final com.google.android.gms.common.S K0(com.google.android.gms.common.P p4) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.d(O02, p4);
        Parcel v3 = v(6, O02);
        com.google.android.gms.common.S s4 = (com.google.android.gms.common.S) com.google.android.gms.internal.common.l.a(v3, com.google.android.gms.common.S.CREATOR);
        v3.recycle();
        return s4;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1280v0
    public final com.google.android.gms.common.S X0(com.google.android.gms.common.P p4) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.d(O02, p4);
        Parcel v3 = v(8, O02);
        com.google.android.gms.common.S s4 = (com.google.android.gms.common.S) com.google.android.gms.internal.common.l.a(v3, com.google.android.gms.common.S.CREATOR);
        v3.recycle();
        return s4;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1280v0
    public final boolean c0(com.google.android.gms.common.U u3, com.google.android.gms.dynamic.d dVar) throws RemoteException {
        Parcel O02 = O0();
        com.google.android.gms.internal.common.l.d(O02, u3);
        com.google.android.gms.internal.common.l.f(O02, dVar);
        Parcel v3 = v(5, O02);
        boolean g4 = com.google.android.gms.internal.common.l.g(v3);
        v3.recycle();
        return g4;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1280v0
    public final boolean zzg() throws RemoteException {
        Parcel v3 = v(9, O0());
        boolean g4 = com.google.android.gms.internal.common.l.g(v3);
        v3.recycle();
        return g4;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1280v0
    public final boolean zzi() throws RemoteException {
        Parcel v3 = v(7, O0());
        boolean g4 = com.google.android.gms.internal.common.l.g(v3);
        v3.recycle();
        return g4;
    }
}
