package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.BinderC1224x;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1301b;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.C1564f;
import com.google.android.gms.location.C1584p;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.C1595v;
import com.google.android.gms.location.C1602y0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.Z0;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends d0 {

    /* renamed from: S, reason: collision with root package name */
    private final C1343w f29164S;

    public A(Context context, Looper looper, i.b bVar, i.c cVar, String str, C1250g c1250g) {
        super(context, looper, bVar, cVar, str, c1250g);
        this.f29164S = new C1343w(context, this.f29214R);
    }

    public final void A0(C1205n.a<com.google.android.gms.location.r> aVar, InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.h(aVar, interfaceC1331j);
    }

    public final void B0(PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.j(pendingIntent, interfaceC1331j);
    }

    public final void C0(C1205n.a<AbstractC1586q> aVar, InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.i(aVar, interfaceC1331j);
    }

    public final void D0(boolean z3) throws RemoteException {
        this.f29164S.k(z3);
    }

    public final void E0(Location location) throws RemoteException {
        this.f29164S.l(location);
    }

    public final void F0(InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.m(interfaceC1331j);
    }

    public final void G0(C1591t c1591t, C1181e.b<C1595v> bVar, String str) throws RemoteException {
        boolean z3;
        z();
        boolean z4 = false;
        if (c1591t != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "locationSettingsRequest can't be null nor empty.");
        if (bVar != null) {
            z4 = true;
        }
        C1285y.b(z4, "listener can't be null.");
        ((InterfaceC1335n) M()).K(c1591t, new BinderC1346z(bVar), null);
    }

    public final void H0(long j4, PendingIntent pendingIntent) throws RemoteException {
        boolean z3;
        z();
        C1285y.l(pendingIntent);
        if (j4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "detectionIntervalMillis must be >= 0");
        ((InterfaceC1335n) M()).N0(j4, true, pendingIntent);
    }

    public final void I0(C1564f c1564f, PendingIntent pendingIntent, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(c1564f, "activityTransitionRequest must be specified.");
        C1285y.m(pendingIntent, "PendingIntent must be specified.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).s1(c1564f, pendingIntent, new BinderC1224x(bVar));
    }

    public final void J0(PendingIntent pendingIntent, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).U(pendingIntent, new BinderC1224x(bVar));
    }

    public final void K0(PendingIntent pendingIntent) throws RemoteException {
        z();
        C1285y.l(pendingIntent);
        ((InterfaceC1335n) M()).t0(pendingIntent);
    }

    public final void L0(PendingIntent pendingIntent, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(pendingIntent, "PendingIntent must be specified.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).E0(pendingIntent, new BinderC1224x(bVar));
    }

    public final void M0(C1584p c1584p, PendingIntent pendingIntent, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(c1584p, "geofencingRequest can't be null.");
        C1285y.m(pendingIntent, "PendingIntent must be specified.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).y1(c1584p, pendingIntent, new BinderC1344x(bVar));
    }

    public final void N0(C1602y0 c1602y0, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(c1602y0, "removeGeofencingRequest can't be null.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).M0(c1602y0, new BinderC1345y(bVar));
    }

    public final void O0(PendingIntent pendingIntent, C1181e.b<Status> bVar) throws RemoteException {
        z();
        C1285y.m(pendingIntent, "PendingIntent must be specified.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).F1(pendingIntent, new BinderC1345y(bVar), G().getPackageName());
    }

    public final void P0(List<String> list, C1181e.b<Status> bVar) throws RemoteException {
        boolean z3;
        z();
        if (list != null && list.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "geofenceRequestIds can't be null nor empty.");
        C1285y.m(bVar, "ResultHolder not provided.");
        ((InterfaceC1335n) M()).g1((String[]) list.toArray(new String[0]), new BinderC1345y(bVar), G().getPackageName());
    }

    public final Location Q0(String str) throws RemoteException {
        if (C1301b.d(t(), Z0.f29961c)) {
            return this.f29164S.a(str);
        }
        return this.f29164S.b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final boolean a0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final void c() {
        synchronized (this.f29164S) {
            if (a()) {
                try {
                    this.f29164S.n();
                    this.f29164S.o();
                } catch (Exception e4) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e4);
                }
            }
            super.c();
        }
    }

    public final LocationAvailability v0() throws RemoteException {
        return this.f29164S.c();
    }

    public final void w0(C c4, C1205n<AbstractC1586q> c1205n, InterfaceC1331j interfaceC1331j) throws RemoteException {
        synchronized (this.f29164S) {
            this.f29164S.e(c4, c1205n, interfaceC1331j);
        }
    }

    public final void x0(LocationRequest locationRequest, C1205n<com.google.android.gms.location.r> c1205n, InterfaceC1331j interfaceC1331j) throws RemoteException {
        synchronized (this.f29164S) {
            this.f29164S.d(locationRequest, c1205n, interfaceC1331j);
        }
    }

    public final void y0(C c4, PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.f(c4, pendingIntent, interfaceC1331j);
    }

    public final void z0(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        this.f29164S.g(locationRequest, pendingIntent, interfaceC1331j);
    }
}
