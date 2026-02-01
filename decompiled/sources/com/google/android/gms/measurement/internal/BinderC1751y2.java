package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.InterfaceC0564g;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.C1291l;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1355b;
import com.google.android.gms.internal.measurement.C1372d0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1751y2 extends AbstractBinderC1655i1 {

    /* renamed from: i, reason: collision with root package name */
    private final L4 f31053i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f31054j;

    /* renamed from: k, reason: collision with root package name */
    private String f31055k;

    public BinderC1751y2(L4 l4, String str) {
        C1285y.l(l4);
        this.f31053i = l4;
        this.f31055k = null;
    }

    private final void A(C1736w c1736w, Z4 z4) {
        this.f31053i.c();
        this.f31053i.h(c1736w, z4);
    }

    @InterfaceC0564g
    private final void Q1(Z4 z4, boolean z3) {
        C1285y.l(z4);
        C1285y.h(z4.f30506E);
        R1(z4.f30506E, false);
        this.f31053i.f0().J(z4.f30507F, z4.f30522U);
    }

    @InterfaceC0564g
    private final void R1(String str, boolean z3) {
        if (!TextUtils.isEmpty(str)) {
            if (z3) {
                try {
                    if (this.f31054j == null) {
                        boolean z4 = true;
                        if (!"com.google.android.gms".equals(this.f31055k) && !com.google.android.gms.common.util.C.a(this.f31053i.d(), Binder.getCallingUid()) && !C1291l.a(this.f31053i.d()).d(Binder.getCallingUid())) {
                            z4 = false;
                        }
                        this.f31054j = Boolean.valueOf(z4);
                    }
                    if (this.f31054j.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e4) {
                    this.f31053i.b().p().b("Measurement Service called with invalid calling package. appId", C1720t1.x(str));
                    throw e4;
                }
            }
            if (this.f31055k == null && C1290k.t(this.f31053i.d(), Binder.getCallingUid(), str)) {
                this.f31055k = str;
            }
            if (str.equals(this.f31055k)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f31053i.b().p().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final C1736w G(C1736w c1736w, Z4 z4) {
        C1724u c1724u;
        if (C1821f.C0339f.f36999l.equals(c1736w.f31012E) && (c1724u = c1736w.f31013F) != null && c1724u.c0() != 0) {
            String z02 = c1736w.f31013F.z0("_cis");
            if ("referrer broadcast".equals(z02) || "referrer API".equals(z02)) {
                this.f31053i.b().s().b("Event has been filtered ", c1736w.toString());
                return new C1736w("_cmpx", c1736w.f31013F, c1736w.f31014G, c1736w.f31015H);
            }
        }
        return c1736w;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void L0(C1736w c1736w, Z4 z4) {
        C1285y.l(c1736w);
        Q1(z4, false);
        P1(new RunnableC1709r2(this, c1736w, z4));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void N(Z4 z4) {
        Q1(z4, false);
        P1(new RunnableC1698p2(this, z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N1(C1736w c1736w, Z4 z4) {
        C1372d0 c1372d0;
        if (!this.f31053i.Y().A(z4.f30506E)) {
            A(c1736w, z4);
            return;
        }
        this.f31053i.b().t().b("EES config found for", z4.f30506E);
        W1 Y3 = this.f31053i.Y();
        String str = z4.f30506E;
        if (TextUtils.isEmpty(str)) {
            c1372d0 = null;
        } else {
            c1372d0 = (C1372d0) Y3.f30462j.f(str);
        }
        if (c1372d0 != null) {
            try {
                Map G3 = this.f31053i.e0().G(c1736w.f31013F.i0(), true);
                String a4 = D2.a(c1736w.f31012E);
                if (a4 == null) {
                    a4 = c1736w.f31012E;
                }
                if (c1372d0.e(new C1355b(a4, c1736w.f31015H, G3))) {
                    if (c1372d0.g()) {
                        this.f31053i.b().t().b("EES edited event", c1736w.f31012E);
                        A(this.f31053i.e0().y(c1372d0.a().b()), z4);
                    } else {
                        A(c1736w, z4);
                    }
                    if (c1372d0.f()) {
                        for (C1355b c1355b : c1372d0.a().c()) {
                            this.f31053i.b().t().b("EES logging created event", c1355b.d());
                            A(this.f31053i.e0().y(c1355b), z4);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f31053i.b().p().c("EES error. appId, eventName", z4.f30507F, c1736w.f31012E);
            }
            this.f31053i.b().t().b("EES was not applied to event", c1736w.f31012E);
            A(c1736w, z4);
            return;
        }
        this.f31053i.b().t().b("EES not loaded for", z4.f30506E);
        A(c1736w, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void O1(String str, Bundle bundle) {
        C1677m U3 = this.f31053i.U();
        U3.f();
        U3.g();
        byte[] k4 = U3.f31057b.e0().z(new r(U3.f31060a, "", str, "dep", 0L, 0L, bundle)).k();
        U3.f31060a.b().t().c("Saving default event parameters, appId, data size", U3.f31060a.B().d(str), Integer.valueOf(k4.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", k4);
        try {
            if (U3.N().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                U3.f31060a.b().p().b("Failed to insert default event parameters (got -1). appId", C1720t1.x(str));
            }
        } catch (SQLiteException e4) {
            U3.f31060a.b().p().c("Error storing default event parameters. appId", C1720t1.x(str), e4);
        }
    }

    @com.google.android.gms.common.util.D
    final void P1(Runnable runnable) {
        C1285y.l(runnable);
        if (this.f31053i.a().A()) {
            runnable.run();
        } else {
            this.f31053i.a().x(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void Q0(Z4 z4) {
        Q1(z4, false);
        P1(new RunnableC1739w2(this, z4));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final List R0(String str, String str2, Z4 z4) {
        Q1(z4, false);
        String str3 = z4.f30506E;
        C1285y.l(str3);
        try {
            return (List) this.f31053i.a().q(new CallableC1680m2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.f31053i.b().p().b("Failed to get conditional user properties", e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void S(final Bundle bundle, Z4 z4) {
        Q1(z4, false);
        final String str = z4.f30506E;
        C1285y.l(str);
        P1(new Runnable() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // java.lang.Runnable
            public final void run() {
                BinderC1751y2.this.O1(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final List V(String str, String str2, String str3, boolean z3) {
        R1(str, true);
        try {
            List<R4> list = (List) this.f31053i.a().q(new CallableC1674l2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R4 r4 : list) {
                if (!z3 && U4.U(r4.f30396c)) {
                }
                arrayList.add(new P4(r4));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f31053i.b().p().c("Failed to get user properties as. appId", C1720t1.x(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e5) {
            e = e5;
            this.f31053i.b().p().c("Failed to get user properties as. appId", C1720t1.x(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void W0(long j4, String str, String str2, String str3) {
        P1(new RunnableC1745x2(this, str2, str3, str, j4));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void a0(C1623d c1623d) {
        C1285y.l(c1623d);
        C1285y.l(c1623d.f30575G);
        C1285y.h(c1623d.f30573E);
        R1(c1623d.f30573E, true);
        P1(new RunnableC1662j2(this, new C1623d(c1623d)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void a1(C1736w c1736w, String str, String str2) {
        C1285y.l(c1736w);
        C1285y.h(str);
        R1(str, true);
        P1(new RunnableC1715s2(this, c1736w, str));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void b1(P4 p4, Z4 z4) {
        C1285y.l(p4);
        Q1(z4, false);
        P1(new RunnableC1727u2(this, p4, z4));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final List d0(Z4 z4, boolean z3) {
        Q1(z4, false);
        String str = z4.f30506E;
        C1285y.l(str);
        try {
            List<R4> list = (List) this.f31053i.a().q(new CallableC1733v2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R4 r4 : list) {
                if (!z3 && U4.U(r4.f30396c)) {
                }
                arrayList.add(new P4(r4));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f31053i.b().p().c("Failed to get user properties. appId", C1720t1.x(z4.f30506E), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            this.f31053i.b().p().c("Failed to get user properties. appId", C1720t1.x(z4.f30506E), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final byte[] f0(C1736w c1736w, String str) {
        C1285y.h(str);
        C1285y.l(c1736w);
        R1(str, true);
        this.f31053i.b().o().b("Log and bundle. event", this.f31053i.V().d(c1736w.f31012E));
        long d4 = this.f31053i.zzav().d() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f31053i.a().r(new CallableC1721t2(this, c1736w, str)).get();
            if (bArr == null) {
                this.f31053i.b().p().b("Log and bundle returned null. appId", C1720t1.x(str));
                bArr = new byte[0];
            }
            this.f31053i.b().o().d("Log and bundle processed. event, size, time_ms", this.f31053i.V().d(c1736w.f31012E), Integer.valueOf(bArr.length), Long.valueOf((this.f31053i.zzav().d() / 1000000) - d4));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            this.f31053i.b().p().d("Failed to log and bundle. appId, event, error", C1720t1.x(str), this.f31053i.V().d(c1736w.f31012E), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            this.f31053i.b().p().d("Failed to log and bundle. appId, event, error", C1720t1.x(str), this.f31053i.V().d(c1736w.f31012E), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final String k0(Z4 z4) {
        Q1(z4, false);
        return this.f31053i.h0(z4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void l1(Z4 z4) {
        C1285y.h(z4.f30506E);
        C1285y.l(z4.f30527Z);
        RunnableC1704q2 runnableC1704q2 = new RunnableC1704q2(this, z4);
        C1285y.l(runnableC1704q2);
        if (this.f31053i.a().A()) {
            runnableC1704q2.run();
        } else {
            this.f31053i.a().y(runnableC1704q2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final List n1(String str, String str2, boolean z3, Z4 z4) {
        Q1(z4, false);
        String str3 = z4.f30506E;
        C1285y.l(str3);
        try {
            List<R4> list = (List) this.f31053i.a().q(new CallableC1668k2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R4 r4 : list) {
                if (!z3 && U4.U(r4.f30396c)) {
                }
                arrayList.add(new P4(r4));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f31053i.b().p().c("Failed to query user properties. appId", C1720t1.x(z4.f30506E), e);
            return Collections.emptyList();
        } catch (ExecutionException e5) {
            e = e5;
            this.f31053i.b().p().c("Failed to query user properties. appId", C1720t1.x(z4.f30506E), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final List r0(String str, String str2, String str3) {
        R1(str, true);
        try {
            return (List) this.f31053i.a().q(new CallableC1686n2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.f31053i.b().p().b("Failed to get conditional user properties as", e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void t1(Z4 z4) {
        C1285y.h(z4.f30506E);
        R1(z4.f30506E, false);
        P1(new RunnableC1692o2(this, z4));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1661j1
    @InterfaceC0564g
    public final void x1(C1623d c1623d, Z4 z4) {
        C1285y.l(c1623d);
        C1285y.l(c1623d.f30575G);
        Q1(z4, false);
        C1623d c1623d2 = new C1623d(c1623d);
        c1623d2.f30573E = z4.f30506E;
        P1(new RunnableC1656i2(this, c1623d2, z4));
    }
}
