package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1199k;
import com.google.android.gms.location.C1564f;
import com.google.android.gms.location.C1584p;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.C1602y0;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334m extends C1322a implements InterfaceC1335n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1334m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void E0(PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, pendingIntent);
        X.d(v3, interfaceC1199k);
        G(69, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final Location F0(String str) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        Parcel A3 = A(80, v3);
        Location location = (Location) X.b(A3, Location.CREATOR);
        A3.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void F1(PendingIntent pendingIntent, InterfaceC1333l interfaceC1333l, String str) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, pendingIntent);
        X.d(v3, interfaceC1333l);
        v3.writeString(str);
        G(2, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void G1(PendingIntent pendingIntent, com.google.android.gms.location.E e4, InterfaceC1199k interfaceC1199k) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, pendingIntent);
        X.c(v3, e4);
        X.d(v3, interfaceC1199k);
        G(79, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void I1(boolean z3) throws RemoteException {
        Parcel v3 = v();
        X.a(v3, z3);
        G(12, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void K(C1591t c1591t, InterfaceC1337p interfaceC1337p, String str) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, c1591t);
        X.d(v3, interfaceC1337p);
        v3.writeString(null);
        G(63, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void M0(C1602y0 c1602y0, InterfaceC1333l interfaceC1333l) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, c1602y0);
        X.d(v3, interfaceC1333l);
        G(74, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void N0(long j4, boolean z3, PendingIntent pendingIntent) throws RemoteException {
        Parcel v3 = v();
        v3.writeLong(j4);
        X.a(v3, true);
        X.c(v3, pendingIntent);
        G(5, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void P0(g0 g0Var) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, g0Var);
        G(75, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void U(PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, pendingIntent);
        X.d(v3, interfaceC1199k);
        G(73, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void X(E e4) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, e4);
        G(59, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void c1(Location location) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, location);
        G(13, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void g1(String[] strArr, InterfaceC1333l interfaceC1333l, String str) throws RemoteException {
        Parcel v3 = v();
        v3.writeStringArray(strArr);
        X.d(v3, interfaceC1333l);
        v3.writeString(str);
        G(3, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final LocationAvailability h0(String str) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        Parcel A3 = A(34, v3);
        LocationAvailability locationAvailability = (LocationAvailability) X.b(A3, LocationAvailability.CREATOR);
        A3.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void p1(InterfaceC1331j interfaceC1331j) throws RemoteException {
        Parcel v3 = v();
        X.d(v3, interfaceC1331j);
        G(67, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void s1(C1564f c1564f, PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, c1564f);
        X.c(v3, pendingIntent);
        X.d(v3, interfaceC1199k);
        G(72, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void t0(PendingIntent pendingIntent) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, pendingIntent);
        G(6, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final void y1(C1584p c1584p, PendingIntent pendingIntent, InterfaceC1333l interfaceC1333l) throws RemoteException {
        Parcel v3 = v();
        X.c(v3, c1584p);
        X.c(v3, pendingIntent);
        X.d(v3, interfaceC1333l);
        G(57, v3);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1335n
    public final Location zzm() throws RemoteException {
        Parcel A3 = A(7, v());
        Location location = (Location) X.b(A3, Location.CREATOR);
        A3.recycle();
        return location;
    }
}
