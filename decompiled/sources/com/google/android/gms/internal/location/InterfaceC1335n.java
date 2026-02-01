package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1199k;
import com.google.android.gms.location.C1564f;
import com.google.android.gms.location.C1584p;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.C1602y0;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1335n extends IInterface {
    void E0(PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException;

    Location F0(@androidx.annotation.P String str) throws RemoteException;

    void F1(PendingIntent pendingIntent, InterfaceC1333l interfaceC1333l, String str) throws RemoteException;

    void G1(PendingIntent pendingIntent, @androidx.annotation.P com.google.android.gms.location.E e4, InterfaceC1199k interfaceC1199k) throws RemoteException;

    void I1(boolean z3) throws RemoteException;

    void K(C1591t c1591t, InterfaceC1337p interfaceC1337p, String str) throws RemoteException;

    void M0(C1602y0 c1602y0, InterfaceC1333l interfaceC1333l) throws RemoteException;

    void N0(long j4, boolean z3, PendingIntent pendingIntent) throws RemoteException;

    void P0(g0 g0Var) throws RemoteException;

    void U(PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException;

    void X(E e4) throws RemoteException;

    void c1(Location location) throws RemoteException;

    void g1(String[] strArr, InterfaceC1333l interfaceC1333l, String str) throws RemoteException;

    LocationAvailability h0(String str) throws RemoteException;

    void p1(InterfaceC1331j interfaceC1331j) throws RemoteException;

    void s1(C1564f c1564f, PendingIntent pendingIntent, InterfaceC1199k interfaceC1199k) throws RemoteException;

    void t0(PendingIntent pendingIntent) throws RemoteException;

    void y1(C1584p c1584p, PendingIntent pendingIntent, InterfaceC1333l interfaceC1333l) throws RemoteException;

    @Deprecated
    Location zzm() throws RemoteException;
}
