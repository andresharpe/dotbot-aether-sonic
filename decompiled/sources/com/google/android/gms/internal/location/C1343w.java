package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343w {

    /* renamed from: a, reason: collision with root package name */
    private final I<InterfaceC1335n> f29246a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29247b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29248c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Map<C1205n.a<com.google.android.gms.location.r>, BinderC1342v> f29249d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<C1205n.a, BinderC1340t> f29250e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<C1205n.a<AbstractC1586q>, BinderC1339s> f29251f = new HashMap();

    public C1343w(Context context, I<InterfaceC1335n> i4) {
        this.f29247b = context;
        this.f29246a = i4;
    }

    public final Location a(String str) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        return ((c0) this.f29246a).a().F0(str);
    }

    @Deprecated
    public final Location b() throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        return ((c0) this.f29246a).a().zzm();
    }

    public final LocationAvailability c() throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        return ((c0) this.f29246a).a().h0(this.f29247b.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(LocationRequest locationRequest, C1205n<com.google.android.gms.location.r> c1205n, InterfaceC1331j interfaceC1331j) throws RemoteException {
        BinderC1342v binderC1342v;
        BinderC1342v binderC1342v2;
        ((c0) this.f29246a).f29210a.z();
        C1205n.a<com.google.android.gms.location.r> b4 = c1205n.b();
        if (b4 == null) {
            binderC1342v2 = null;
        } else {
            synchronized (this.f29249d) {
                try {
                    binderC1342v = this.f29249d.get(b4);
                    if (binderC1342v == null) {
                        binderC1342v = new BinderC1342v(c1205n);
                    }
                    this.f29249d.put(b4, binderC1342v);
                } catch (Throwable th) {
                    throw th;
                }
            }
            binderC1342v2 = binderC1342v;
        }
        if (binderC1342v2 == null) {
            return;
        }
        ((c0) this.f29246a).a().X(new E(1, C.c0(null, locationRequest), binderC1342v2, null, null, interfaceC1331j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(C c4, C1205n<AbstractC1586q> c1205n, InterfaceC1331j interfaceC1331j) throws RemoteException {
        BinderC1339s binderC1339s;
        ((c0) this.f29246a).f29210a.z();
        C1205n.a<AbstractC1586q> b4 = c1205n.b();
        if (b4 == null) {
            binderC1339s = null;
        } else {
            synchronized (this.f29251f) {
                try {
                    BinderC1339s binderC1339s2 = this.f29251f.get(b4);
                    if (binderC1339s2 == null) {
                        binderC1339s2 = new BinderC1339s(c1205n);
                    }
                    binderC1339s = binderC1339s2;
                    this.f29251f.put(b4, binderC1339s);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        BinderC1339s binderC1339s3 = binderC1339s;
        if (binderC1339s3 == null) {
            return;
        }
        ((c0) this.f29246a).a().X(new E(1, c4, null, null, binderC1339s3, interfaceC1331j));
    }

    public final void f(C c4, PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().X(E.e0(c4, pendingIntent, interfaceC1331j));
    }

    public final void g(LocationRequest locationRequest, PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().X(E.e0(C.c0(null, locationRequest), pendingIntent, interfaceC1331j));
    }

    public final void h(C1205n.a<com.google.android.gms.location.r> aVar, InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        C1285y.m(aVar, "Invalid null listener key");
        synchronized (this.f29249d) {
            try {
                BinderC1342v remove = this.f29249d.remove(aVar);
                if (remove != null) {
                    remove.zzc();
                    ((c0) this.f29246a).a().X(E.c0(remove, interfaceC1331j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C1205n.a<AbstractC1586q> aVar, InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        C1285y.m(aVar, "Invalid null listener key");
        synchronized (this.f29251f) {
            try {
                BinderC1339s remove = this.f29251f.remove(aVar);
                if (remove != null) {
                    remove.zzc();
                    ((c0) this.f29246a).a().X(E.i0(remove, interfaceC1331j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(PendingIntent pendingIntent, InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().X(new E(2, null, null, pendingIntent, null, interfaceC1331j));
    }

    public final void k(boolean z3) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().I1(z3);
        this.f29248c = z3;
    }

    public final void l(Location location) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().c1(location);
    }

    public final void m(InterfaceC1331j interfaceC1331j) throws RemoteException {
        ((c0) this.f29246a).f29210a.z();
        ((c0) this.f29246a).a().p1(interfaceC1331j);
    }

    public final void n() throws RemoteException {
        synchronized (this.f29249d) {
            try {
                for (BinderC1342v binderC1342v : this.f29249d.values()) {
                    if (binderC1342v != null) {
                        ((c0) this.f29246a).a().X(E.c0(binderC1342v, null));
                    }
                }
                this.f29249d.clear();
            } finally {
            }
        }
        synchronized (this.f29251f) {
            try {
                for (BinderC1339s binderC1339s : this.f29251f.values()) {
                    if (binderC1339s != null) {
                        ((c0) this.f29246a).a().X(E.i0(binderC1339s, null));
                    }
                }
                this.f29251f.clear();
            } finally {
            }
        }
        synchronized (this.f29250e) {
            try {
                for (BinderC1340t binderC1340t : this.f29250e.values()) {
                    if (binderC1340t != null) {
                        ((c0) this.f29246a).a().P0(new g0(2, null, binderC1340t, null));
                    }
                }
                this.f29250e.clear();
            } finally {
            }
        }
    }

    public final void o() throws RemoteException {
        if (this.f29248c) {
            k(false);
        }
    }
}
