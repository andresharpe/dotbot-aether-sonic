package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1628d4 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC1622c4 f30588c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1661j1 f30589d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f30590e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1695p f30591f;

    /* renamed from: g, reason: collision with root package name */
    private final C1735v4 f30592g;

    /* renamed from: h, reason: collision with root package name */
    private final List f30593h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC1695p f30594i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1628d4(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30593h = new ArrayList();
        this.f30592g = new C1735v4(c1638f2.zzav());
        this.f30588c = new ServiceConnectionC1622c4(this);
        this.f30591f = new N3(this, c1638f2);
        this.f30594i = new P3(this, c1638f2);
    }

    @androidx.annotation.j0
    private final Z4 A(boolean z3) {
        Pair a4;
        this.f31060a.zzaw();
        C1667k1 z4 = this.f31060a.z();
        String str = null;
        if (z3) {
            C1720t1 b4 = this.f31060a.b();
            if (b4.f31060a.D().f30250d != null && (a4 = b4.f31060a.D().f30250d.a()) != null && a4 != J1.f30248x) {
                str = String.valueOf(a4.second) + ":" + ((String) a4.first);
            }
        }
        return z4.o(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void B() {
        f();
        this.f31060a.b().t().b("Processing queued up service tasks", Integer.valueOf(this.f30593h.size()));
        Iterator it = this.f30593h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e4) {
                this.f31060a.b().p().b("Task exception while flushing queue", e4);
            }
        }
        this.f30593h.clear();
        this.f30594i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void C() {
        f();
        this.f30592g.b();
        AbstractC1695p abstractC1695p = this.f30591f;
        this.f31060a.x();
        abstractC1695p.d(((Long) C1643g1.f30682K.a(null)).longValue());
    }

    @androidx.annotation.j0
    private final void D(Runnable runnable) throws IllegalStateException {
        f();
        if (x()) {
            runnable.run();
            return;
        }
        int size = this.f30593h.size();
        this.f31060a.x();
        if (size >= 1000) {
            this.f31060a.b().p().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f30593h.add(runnable);
        this.f30594i.d(com.harman.jbl.partybox.ui.party.b.f44883c);
        N();
    }

    private final boolean E() {
        this.f31060a.zzaw();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void K(C1628d4 c1628d4, ComponentName componentName) {
        c1628d4.f();
        if (c1628d4.f30589d != null) {
            c1628d4.f30589d = null;
            c1628d4.f31060a.b().t().b("Disconnected from device MeasurementService", componentName);
            c1628d4.f();
            c1628d4.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean H() {
        return this.f30590e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void M() {
        f();
        g();
        Z4 A3 = A(true);
        this.f31060a.A().p();
        D(new J3(this, A3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void N() {
        f();
        g();
        if (x()) {
            return;
        }
        if (!z()) {
            if (!this.f31060a.x().E()) {
                this.f31060a.zzaw();
                List<ResolveInfo> queryIntentServices = this.f31060a.d().getPackageManager().queryIntentServices(new Intent().setClassName(this.f31060a.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context d4 = this.f31060a.d();
                    this.f31060a.zzaw();
                    intent.setComponent(new ComponentName(d4, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f30588c.b(intent);
                    return;
                }
                this.f31060a.b().p().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f30588c.c();
    }

    @androidx.annotation.j0
    public final void O() {
        f();
        g();
        this.f30588c.d();
        try {
            com.google.android.gms.common.stats.b.b().c(this.f31060a.d(), this.f30588c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f30589d = null;
    }

    @androidx.annotation.j0
    public final void P(InterfaceC1420j0 interfaceC1420j0) {
        f();
        g();
        D(new I3(this, A(false), interfaceC1420j0));
    }

    @androidx.annotation.j0
    public final void Q(AtomicReference atomicReference) {
        f();
        g();
        D(new H3(this, atomicReference, A(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void R(InterfaceC1420j0 interfaceC1420j0, String str, String str2) {
        f();
        g();
        D(new V3(this, str, str2, A(false), interfaceC1420j0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void S(AtomicReference atomicReference, String str, String str2, String str3) {
        f();
        g();
        D(new U3(this, atomicReference, null, str2, str3, A(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void T(AtomicReference atomicReference, boolean z3) {
        f();
        g();
        D(new F3(this, atomicReference, A(false), z3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void U(InterfaceC1420j0 interfaceC1420j0, String str, String str2, boolean z3) {
        f();
        g();
        D(new D3(this, str, str2, A(false), z3, interfaceC1420j0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void V(AtomicReference atomicReference, String str, String str2, String str3, boolean z3) {
        f();
        g();
        D(new W3(this, atomicReference, null, str2, str3, A(false), z3));
    }

    @Override // com.google.android.gms.measurement.internal.F1
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void m(C1736w c1736w, String str) {
        C1285y.l(c1736w);
        f();
        g();
        E();
        D(new S3(this, true, A(true), this.f31060a.A().t(c1736w), c1736w, str));
    }

    @androidx.annotation.j0
    public final void n(InterfaceC1420j0 interfaceC1420j0, C1736w c1736w, String str) {
        f();
        g();
        if (this.f31060a.L().n0(C1290k.f28840a) != 0) {
            this.f31060a.b().u().a("Not bundling data. Service unavailable or out of date");
            this.f31060a.L().E(interfaceC1420j0, new byte[0]);
        } else {
            D(new O3(this, c1736w, str, interfaceC1420j0));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void o() {
        f();
        g();
        Z4 A3 = A(false);
        E();
        this.f31060a.A().o();
        D(new G3(this, A3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final void p(InterfaceC1661j1 interfaceC1661j1, K0.a aVar, Z4 z4) {
        int i4;
        f();
        g();
        E();
        this.f31060a.x();
        int i5 = 100;
        int i6 = 0;
        while (i6 < 1001 && i5 == 100) {
            ArrayList arrayList = new ArrayList();
            List n4 = this.f31060a.A().n(100);
            if (n4 != null) {
                arrayList.addAll(n4);
                i4 = n4.size();
            } else {
                i4 = 0;
            }
            if (aVar != null && i4 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                K0.a aVar2 = (K0.a) arrayList.get(i7);
                if (aVar2 instanceof C1736w) {
                    try {
                        interfaceC1661j1.L0((C1736w) aVar2, z4);
                    } catch (RemoteException e4) {
                        this.f31060a.b().p().b("Failed to send event to the service", e4);
                    }
                } else if (aVar2 instanceof P4) {
                    try {
                        interfaceC1661j1.b1((P4) aVar2, z4);
                    } catch (RemoteException e5) {
                        this.f31060a.b().p().b("Failed to send user property to the service", e5);
                    }
                } else if (aVar2 instanceof C1623d) {
                    try {
                        interfaceC1661j1.x1((C1623d) aVar2, z4);
                    } catch (RemoteException e6) {
                        this.f31060a.b().p().b("Failed to send conditional user property to the service", e6);
                    }
                } else {
                    this.f31060a.b().p().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i6++;
            i5 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void q(C1623d c1623d) {
        C1285y.l(c1623d);
        f();
        g();
        this.f31060a.zzaw();
        D(new T3(this, true, A(true), this.f31060a.A().s(c1623d), new C1623d(c1623d), c1623d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void r(boolean z3) {
        f();
        g();
        if (z3) {
            E();
            this.f31060a.A().o();
        }
        if (y()) {
            D(new R3(this, A(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void s(C1728u3 c1728u3) {
        f();
        g();
        D(new L3(this, c1728u3));
    }

    @androidx.annotation.j0
    public final void t(Bundle bundle) {
        f();
        g();
        D(new M3(this, A(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void u() {
        f();
        g();
        D(new Q3(this, A(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final void v(InterfaceC1661j1 interfaceC1661j1) {
        f();
        C1285y.l(interfaceC1661j1);
        this.f30589d = interfaceC1661j1;
        C();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void w(P4 p4) {
        f();
        g();
        E();
        D(new E3(this, A(true), this.f31060a.A().u(p4), p4));
    }

    @androidx.annotation.j0
    public final boolean x() {
        f();
        g();
        if (this.f30589d != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean y() {
        f();
        g();
        if (!z() || this.f31060a.L().m0() >= ((Integer) C1643g1.f30713h0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1628d4.z():boolean");
    }
}
