package com.google.android.gms.measurement.internal;

import N0.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.C0909k;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1307h;
import com.google.android.gms.internal.measurement.C1418i6;
import com.google.android.gms.internal.measurement.D6;
import com.google.android.gms.internal.measurement.Y5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1687n3 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected C1681m3 f30873c;

    /* renamed from: d, reason: collision with root package name */
    private G2 f30874d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f30875e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30876f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f30877g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f30878h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.B("consentLock")
    private C1653i f30879i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.B("consentLock")
    private int f30880j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicLong f30881k;

    /* renamed from: l, reason: collision with root package name */
    private long f30882l;

    /* renamed from: m, reason: collision with root package name */
    private int f30883m;

    /* renamed from: n, reason: collision with root package name */
    final b5 f30884n;

    /* renamed from: o, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected boolean f30885o;

    /* renamed from: p, reason: collision with root package name */
    private final T4 f30886p;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1687n3(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30875e = new CopyOnWriteArraySet();
        this.f30878h = new Object();
        this.f30885o = true;
        this.f30886p = new C1609a3(this);
        this.f30877g = new AtomicReference();
        this.f30879i = new C1653i(null, null);
        this.f30880j = 100;
        this.f30882l = -1L;
        this.f30883m = 100;
        this.f30881k = new AtomicLong(0L);
        this.f30884n = new b5(c1638f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void M(Boolean bool, boolean z3) {
        f();
        g();
        this.f31060a.b().o().b("Setting app measurement enabled (FE)", bool);
        this.f31060a.D().q(bool);
        if (z3) {
            J1 D3 = this.f31060a.D();
            C1638f2 c1638f2 = D3.f31060a;
            D3.f();
            SharedPreferences.Editor edit = D3.m().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.f31060a.n() && (bool == null || bool.booleanValue())) {
            return;
        }
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void N() {
        long j4;
        f();
        String a4 = this.f31060a.D().f30259m.a();
        if (a4 != null) {
            if ("unset".equals(a4)) {
                K(com.spotify.android.appremote.internal.l.f48821i, "_npa", null, this.f31060a.zzav().a());
            } else {
                if (true != L1.a.f1650s3.equals(a4)) {
                    j4 = 0;
                } else {
                    j4 = 1;
                }
                K(com.spotify.android.appremote.internal.l.f48821i, "_npa", Long.valueOf(j4), this.f31060a.zzav().a());
            }
        }
        if (this.f31060a.m() && this.f30885o) {
            this.f31060a.b().o().a("Recording app launch after enabling measurement for the first time (FE)");
            e0();
            C1418i6.b();
            if (this.f31060a.x().z(null, C1643g1.f30709f0)) {
                this.f31060a.K().f31004d.a();
            }
            this.f31060a.a().x(new P2(this));
            return;
        }
        this.f31060a.b().o().a("Updating Scion state (FE)");
        this.f31060a.J().u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a0(C1687n3 c1687n3, C1653i c1653i, C1653i c1653i2) {
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                break;
            }
            zzah zzahVar = zzahVarArr[i4];
            if (!c1653i2.i(zzahVar) && c1653i.i(zzahVar)) {
                z3 = true;
                break;
            }
            i4++;
        }
        boolean l4 = c1653i.l(c1653i2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (!z3 && !l4) {
            return;
        }
        c1687n3.f31060a.z().t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b0(C1687n3 c1687n3, C1653i c1653i, int i4, long j4, boolean z3, boolean z4) {
        c1687n3.f();
        c1687n3.g();
        if (j4 <= c1687n3.f30882l && C1653i.j(c1687n3.f30883m, i4)) {
            c1687n3.f31060a.b().s().b("Dropped out-of-date consent setting, proposed settings", c1653i);
            return;
        }
        J1 D3 = c1687n3.f31060a.D();
        C1638f2 c1638f2 = D3.f31060a;
        D3.f();
        if (D3.u(i4)) {
            SharedPreferences.Editor edit = D3.m().edit();
            edit.putString("consent_settings", c1653i.h());
            edit.putInt("consent_source", i4);
            edit.apply();
            c1687n3.f30882l = j4;
            c1687n3.f30883m = i4;
            c1687n3.f31060a.J().r(z3);
            if (z4) {
                c1687n3.f31060a.J().Q(new AtomicReference());
                return;
            }
            return;
        }
        c1687n3.f31060a.b().s().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str) {
        this.f30877g.set(str);
    }

    public final void B(Bundle bundle) {
        C(bundle, this.f31060a.zzav().a());
    }

    public final void C(Bundle bundle, long j4) {
        C1285y.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f31060a.b().u().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C1285y.l(bundle2);
        C2.a(bundle2, "app_id", String.class, null);
        C2.a(bundle2, "origin", String.class, null);
        C2.a(bundle2, a.C0015a.f1688b, String.class, null);
        C2.a(bundle2, "value", Object.class, null);
        C2.a(bundle2, a.C0015a.f1690d, String.class, null);
        C2.a(bundle2, a.C0015a.f1691e, Long.class, 0L);
        C2.a(bundle2, a.C0015a.f1692f, String.class, null);
        C2.a(bundle2, a.C0015a.f1693g, Bundle.class, null);
        C2.a(bundle2, a.C0015a.f1694h, String.class, null);
        C2.a(bundle2, a.C0015a.f1695i, Bundle.class, null);
        C2.a(bundle2, a.C0015a.f1696j, Long.class, 0L);
        C2.a(bundle2, a.C0015a.f1697k, String.class, null);
        C2.a(bundle2, a.C0015a.f1698l, Bundle.class, null);
        C1285y.h(bundle2.getString(a.C0015a.f1688b));
        C1285y.h(bundle2.getString("origin"));
        C1285y.l(bundle2.get("value"));
        bundle2.putLong(a.C0015a.f1699m, j4);
        String string = bundle2.getString(a.C0015a.f1688b);
        Object obj = bundle2.get("value");
        if (this.f31060a.L().l0(string) == 0) {
            if (this.f31060a.L().h0(string, obj) == 0) {
                Object n4 = this.f31060a.L().n(string, obj);
                if (n4 == null) {
                    this.f31060a.b().p().c("Unable to normalize conditional user property value", this.f31060a.B().f(string), obj);
                    return;
                }
                C2.b(bundle2, n4);
                long j5 = bundle2.getLong(a.C0015a.f1691e);
                if (!TextUtils.isEmpty(bundle2.getString(a.C0015a.f1690d))) {
                    this.f31060a.x();
                    if (j5 > 15552000000L || j5 < 1) {
                        this.f31060a.b().p().c("Invalid conditional user property timeout", this.f31060a.B().f(string), Long.valueOf(j5));
                        return;
                    }
                }
                long j6 = bundle2.getLong(a.C0015a.f1696j);
                this.f31060a.x();
                if (j6 <= 15552000000L && j6 >= 1) {
                    this.f31060a.a().x(new V2(this, bundle2));
                    return;
                } else {
                    this.f31060a.b().p().c("Invalid conditional user property time to live", this.f31060a.B().f(string), Long.valueOf(j6));
                    return;
                }
            }
            this.f31060a.b().p().c("Invalid conditional user property value", this.f31060a.B().f(string), obj);
            return;
        }
        this.f31060a.b().p().b("Invalid conditional user property name", this.f31060a.B().f(string));
    }

    public final void D(Bundle bundle, int i4, long j4) {
        g();
        String g4 = C1653i.g(bundle);
        if (g4 != null) {
            this.f31060a.b().v().b("Ignoring invalid consent setting", g4);
            this.f31060a.b().v().a("Valid consent values are 'granted', 'denied'");
        }
        E(C1653i.a(bundle), i4, j4);
    }

    public final void E(C1653i c1653i, int i4, long j4) {
        C1653i c1653i2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1653i c1653i3 = c1653i;
        g();
        if (i4 != -10 && c1653i.e() == null && c1653i.f() == null) {
            this.f31060a.b().v().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f30878h) {
            try {
                c1653i2 = this.f30879i;
                z3 = false;
                if (C1653i.j(i4, this.f30880j)) {
                    z4 = c1653i3.k(this.f30879i);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (c1653i3.i(zzahVar) && !this.f30879i.i(zzahVar)) {
                        z3 = true;
                    }
                    c1653i3 = c1653i3.d(this.f30879i);
                    this.f30879i = c1653i3;
                    this.f30880j = i4;
                    z5 = z3;
                    z3 = true;
                } else {
                    z4 = false;
                    z5 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            this.f31060a.b().s().b("Ignoring lower-priority consent settings, proposed settings", c1653i3);
            return;
        }
        long andIncrement = this.f30881k.getAndIncrement();
        if (z4) {
            this.f30877g.set(null);
            this.f31060a.a().y(new RunnableC1645g3(this, c1653i3, j4, i4, andIncrement, z5, c1653i2));
            return;
        }
        RunnableC1651h3 runnableC1651h3 = new RunnableC1651h3(this, c1653i3, i4, andIncrement, z5, c1653i2);
        if (i4 != 30 && i4 != -10) {
            this.f31060a.a().x(runnableC1651h3);
        } else {
            this.f31060a.a().y(runnableC1651h3);
        }
    }

    @androidx.annotation.j0
    public final void F(G2 g22) {
        G2 g23;
        boolean z3;
        f();
        g();
        if (g22 != null && g22 != (g23 = this.f30874d)) {
            if (g23 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.s(z3, "EventInterceptor already set.");
        }
        this.f30874d = g22;
    }

    public final void G(Boolean bool) {
        g();
        this.f31060a.a().x(new RunnableC1639f3(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void H(C1653i c1653i) {
        boolean z3;
        Boolean bool;
        f();
        if ((c1653i.i(zzah.ANALYTICS_STORAGE) && c1653i.i(zzah.AD_STORAGE)) || this.f31060a.J().y()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != this.f31060a.n()) {
            this.f31060a.j(z3);
            J1 D3 = this.f31060a.D();
            C1638f2 c1638f2 = D3.f31060a;
            D3.f();
            if (D3.m().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(D3.m().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z3 || bool == null || bool.booleanValue()) {
                M(Boolean.valueOf(z3), false);
            }
        }
    }

    public final void I(String str, String str2, Object obj, boolean z3) {
        J(kotlinx.coroutines.W.f52989c, "_ldl", obj, true, this.f31060a.zzav().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) {
        /*
            r17 = this;
            r6 = r17
            r2 = r19
            r0 = r20
            if (r18 != 0) goto Lb
            java.lang.String r1 = "app"
            goto Ld
        Lb:
            r1 = r18
        Ld:
            r3 = 0
            r4 = 24
            if (r21 == 0) goto L1e
            com.google.android.gms.measurement.internal.f2 r5 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r5 = r5.L()
            int r5 = r5.l0(r2)
        L1c:
            r13 = r5
            goto L48
        L1e:
            com.google.android.gms.measurement.internal.f2 r5 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r5 = r5.L()
            java.lang.String r7 = "user property"
            boolean r8 = r5.P(r7, r2)
            r9 = 6
            if (r8 != 0) goto L2f
        L2d:
            r13 = r9
            goto L48
        L2f:
            java.lang.String[] r8 = com.google.android.gms.measurement.internal.F2.f30176a
            r10 = 0
            boolean r8 = r5.L(r7, r8, r10, r2)
            if (r8 != 0) goto L3b
            r5 = 15
            goto L1c
        L3b:
            com.google.android.gms.measurement.internal.f2 r8 = r5.f31060a
            r8.x()
            boolean r5 = r5.K(r7, r4, r2)
            if (r5 != 0) goto L47
            goto L2d
        L47:
            r13 = r3
        L48:
            r5 = 1
            if (r13 == 0) goto L71
            com.google.android.gms.measurement.internal.f2 r0 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r0 = r0.L()
            com.google.android.gms.measurement.internal.f2 r1 = r6.f31060a
            r1.x()
            java.lang.String r15 = r0.p(r2, r4, r5)
            if (r2 == 0) goto L60
            int r3 = r19.length()
        L60:
            r16 = r3
            com.google.android.gms.measurement.internal.f2 r0 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r10 = r0.L()
            com.google.android.gms.measurement.internal.T4 r11 = r6.f30886p
            r12 = 0
            java.lang.String r14 = "_ev"
            r10.z(r11, r12, r13, r14, r15, r16)
            return
        L71:
            if (r0 == 0) goto Lc7
            com.google.android.gms.measurement.internal.f2 r7 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r7 = r7.L()
            int r11 = r7.h0(r2, r0)
            if (r11 == 0) goto Lb1
            com.google.android.gms.measurement.internal.f2 r1 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r1 = r1.L()
            com.google.android.gms.measurement.internal.f2 r7 = r6.f31060a
            r7.x()
            java.lang.String r13 = r1.p(r2, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L99
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L97
            goto L99
        L97:
            r14 = r3
            goto La2
        L99:
            java.lang.String r0 = r20.toString()
            int r3 = r0.length()
            goto L97
        La2:
            com.google.android.gms.measurement.internal.f2 r0 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r8 = r0.L()
            com.google.android.gms.measurement.internal.T4 r9 = r6.f30886p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.z(r9, r10, r11, r12, r13, r14)
            return
        Lb1:
            com.google.android.gms.measurement.internal.f2 r3 = r6.f31060a
            com.google.android.gms.measurement.internal.U4 r3 = r3.L()
            java.lang.Object r5 = r3.n(r2, r0)
            if (r5 == 0) goto Lc6
            r0 = r17
            r2 = r19
            r3 = r22
            r0.z(r1, r2, r3, r5)
        Lc6:
            return
        Lc7:
            r5 = 0
            r0 = r17
            r2 = r19
            r3 = r22
            r0.z(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1687n3.J(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C1285y.h(r9)
            com.google.android.gms.common.internal.C1285y.h(r10)
            r8.f()
            r8.g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L65
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L54
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L54
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L37
            r4 = 0
            goto L38
        L37:
            r4 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.f2 r0 = r8.f31060a
            com.google.android.gms.measurement.internal.J1 r0 = r0.D()
            com.google.android.gms.measurement.internal.I1 r0 = r0.f30259m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r11 = "true"
        L4e:
            r0.b(r11)
            r6 = r10
        L52:
            r3 = r1
            goto L67
        L54:
            if (r11 != 0) goto L65
            com.google.android.gms.measurement.internal.f2 r10 = r8.f31060a
            com.google.android.gms.measurement.internal.J1 r10 = r10.D()
            com.google.android.gms.measurement.internal.I1 r10 = r10.f30259m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            goto L52
        L65:
            r3 = r10
            r6 = r11
        L67:
            com.google.android.gms.measurement.internal.f2 r10 = r8.f31060a
            boolean r10 = r10.m()
            if (r10 != 0) goto L7f
            com.google.android.gms.measurement.internal.f2 r9 = r8.f31060a
            com.google.android.gms.measurement.internal.t1 r9 = r9.b()
            com.google.android.gms.measurement.internal.r1 r9 = r9.t()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7f:
            com.google.android.gms.measurement.internal.f2 r10 = r8.f31060a
            boolean r10 = r10.p()
            if (r10 != 0) goto L88
            return
        L88:
            com.google.android.gms.measurement.internal.P4 r10 = new com.google.android.gms.measurement.internal.P4
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.f2 r9 = r8.f31060a
            com.google.android.gms.measurement.internal.d4 r9 = r9.J()
            r9.w(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1687n3.K(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void L(H2 h22) {
        g();
        C1285y.l(h22);
        if (!this.f30875e.remove(h22)) {
            this.f31060a.b().u().a("OnEventListener had not been registered");
        }
    }

    public final int O(String str) {
        C1285y.h(str);
        this.f31060a.x();
        return 25;
    }

    public final Boolean P() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f31060a.a().p(atomicReference, 15000L, "boolean test flag value", new Y2(this, atomicReference));
    }

    public final Double Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f31060a.a().p(atomicReference, 15000L, "double test flag value", new RunnableC1633e3(this, atomicReference));
    }

    public final Integer R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f31060a.a().p(atomicReference, 15000L, "int test flag value", new RunnableC1627d3(this, atomicReference));
    }

    public final Long S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f31060a.a().p(atomicReference, 15000L, "long test flag value", new RunnableC1621c3(this, atomicReference));
    }

    public final String T() {
        return (String) this.f30877g.get();
    }

    public final String U() {
        C1728u3 p4 = this.f31060a.I().p();
        if (p4 != null) {
            return p4.f30998b;
        }
        return null;
    }

    public final String V() {
        C1728u3 p4 = this.f31060a.I().p();
        if (p4 != null) {
            return p4.f30997a;
        }
        return null;
    }

    public final String W() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f31060a.a().p(atomicReference, 15000L, "String test flag value", new RunnableC1615b3(this, atomicReference));
    }

    public final ArrayList X(String str, String str2) {
        if (this.f31060a.a().A()) {
            this.f31060a.b().p().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f31060a.zzaw();
        if (C1617c.a()) {
            this.f31060a.b().p().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f31060a.a().p(atomicReference, C0909k.f15658a, "get conditional user properties", new X2(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f31060a.b().p().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return U4.t(list);
    }

    public final List Y(boolean z3) {
        g();
        this.f31060a.b().t().a("Getting user properties (FE)");
        if (!this.f31060a.a().A()) {
            this.f31060a.zzaw();
            if (C1617c.a()) {
                this.f31060a.b().p().a("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.f31060a.a().p(atomicReference, C0909k.f15658a, "get user properties", new T2(this, atomicReference, z3));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.f31060a.b().p().b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z3));
                return Collections.emptyList();
            }
            return list;
        }
        this.f31060a.b().p().a("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map Z(String str, String str2, boolean z3) {
        if (this.f31060a.a().A()) {
            this.f31060a.b().p().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f31060a.zzaw();
        if (C1617c.a()) {
            this.f31060a.b().p().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f31060a.a().p(atomicReference, C0909k.f15658a, "get user properties", new Z2(this, atomicReference, null, str, str2, z3));
        List<P4> list = (List) atomicReference.get();
        if (list == null) {
            this.f31060a.b().p().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z3));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (P4 p4 : list) {
            Object c02 = p4.c0();
            if (c02 != null) {
                aVar.put(p4.f30366F, c02);
            }
        }
        return aVar;
    }

    @androidx.annotation.j0
    public final void e0() {
        f();
        g();
        if (this.f31060a.p()) {
            if (this.f31060a.x().z(null, C1643g1.f30697Z)) {
                C1647h x3 = this.f31060a.x();
                x3.f31060a.zzaw();
                Boolean r4 = x3.r("google_analytics_deferred_deep_link_enabled");
                if (r4 != null && r4.booleanValue()) {
                    this.f31060a.b().o().a("Deferred Deep Link feature enabled.");
                    this.f31060a.a().x(new Runnable() { // from class: com.google.android.gms.measurement.internal.O2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1687n3 c1687n3 = C1687n3.this;
                            c1687n3.f();
                            if (!c1687n3.f31060a.D().f30264r.b()) {
                                long a4 = c1687n3.f31060a.D().f30265s.a();
                                c1687n3.f31060a.D().f30265s.b(1 + a4);
                                c1687n3.f31060a.x();
                                if (a4 >= 5) {
                                    c1687n3.f31060a.b().u().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    c1687n3.f31060a.D().f30264r.a(true);
                                    return;
                                } else {
                                    c1687n3.f31060a.h();
                                    return;
                                }
                            }
                            c1687n3.f31060a.b().o().a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f31060a.J().M();
            this.f30885o = false;
            J1 D3 = this.f31060a.D();
            D3.f();
            String string = D3.m().getString("previous_os_version", null);
            D3.f31060a.y().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = D3.m().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f31060a.y().i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    s(kotlinx.coroutines.W.f52989c, "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.F1
    protected final boolean l() {
        return false;
    }

    public final void m(String str, String str2, Bundle bundle) {
        long a4 = this.f31060a.zzav().a();
        C1285y.h(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(a.C0015a.f1688b, str);
        bundle2.putLong(a.C0015a.f1699m, a4);
        if (str2 != null) {
            bundle2.putString(a.C0015a.f1697k, str2);
            bundle2.putBundle(a.C0015a.f1698l, bundle);
        }
        this.f31060a.a().x(new W2(this, bundle2));
    }

    public final void n() {
        if ((this.f31060a.d().getApplicationContext() instanceof Application) && this.f30873c != null) {
            ((Application) this.f31060a.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f30873c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void o(Bundle bundle) {
        if (bundle == null) {
            this.f31060a.D().f30269w.b(new Bundle());
            return;
        }
        Bundle a4 = this.f31060a.D().f30269w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f31060a.L().S(obj)) {
                    this.f31060a.L().z(this.f30886p, null, 27, null, null, 0);
                }
                this.f31060a.b().v().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (U4.U(str)) {
                this.f31060a.b().v().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a4.remove(str);
            } else {
                U4 L3 = this.f31060a.L();
                this.f31060a.x();
                if (L3.N("param", str, 100, obj)) {
                    this.f31060a.L().A(a4, str, obj);
                }
            }
        }
        this.f31060a.L();
        int k4 = this.f31060a.x().k();
        if (a4.size() > k4) {
            int i4 = 0;
            for (String str2 : new TreeSet(a4.keySet())) {
                i4++;
                if (i4 > k4) {
                    a4.remove(str2);
                }
            }
            this.f31060a.L().z(this.f30886p, null, 26, null, null, 0);
            this.f31060a.b().v().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f31060a.D().f30269w.b(a4);
        this.f31060a.J().t(a4);
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f31060a.zzav().a());
    }

    public final void q(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) {
        String str3;
        Bundle bundle2;
        if (str == null) {
            str3 = com.spotify.android.appremote.internal.l.f48821i;
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != FirebaseAnalytics.a.f34719A && (str2 == null || !str2.equals(FirebaseAnalytics.a.f34719A))) {
            boolean z5 = true;
            if (z4 && this.f30874d != null && !U4.U(str2)) {
                z5 = false;
            }
            y(str3, str2, j4, bundle2, z4, z5, z3, null);
            return;
        }
        this.f31060a.I().C(bundle2, j4);
    }

    public final void r(String str, String str2, Bundle bundle, String str3) {
        C1638f2.r();
        y(kotlinx.coroutines.W.f52989c, str2, this.f31060a.zzav().a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void s(String str, String str2, Bundle bundle) {
        f();
        t(str, str2, this.f31060a.zzav().a(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void t(String str, String str2, long j4, Bundle bundle) {
        boolean z3;
        f();
        if (this.f30874d == null || U4.U(str2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        u(str, str2, j4, bundle, true, z3, true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void u(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        boolean z6;
        String str4;
        long j5;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        C1285y.h(str);
        C1285y.l(bundle);
        f();
        g();
        if (this.f31060a.m()) {
            List s4 = this.f31060a.z().s();
            if (s4 != null && !s4.contains(str2)) {
                this.f31060a.b().o().c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f30876f) {
                this.f30876f = true;
                try {
                    if (!this.f31060a.q()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f31060a.d().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f31060a.d());
                    } catch (Exception e4) {
                        this.f31060a.b().u().b("Failed to invoke Tag Manager's initialize() method", e4);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f31060a.b().s().a("Tag Manager is not found and thus will not be used");
                }
            }
            if (C1821f.C0339f.f36999l.equals(str2) && bundle.containsKey("gclid")) {
                this.f31060a.zzaw();
                K(kotlinx.coroutines.W.f52989c, "_lgclid", bundle.getString("gclid"), this.f31060a.zzav().a());
            }
            this.f31060a.zzaw();
            if (z3 && U4.Y(str2)) {
                this.f31060a.L().x(bundle, this.f31060a.D().f30269w.a());
            }
            if (!z5) {
                this.f31060a.zzaw();
                if (!"_iap".equals(str2)) {
                    U4 L3 = this.f31060a.L();
                    int i4 = 2;
                    if (L3.P("event", str2)) {
                        if (L3.L("event", D2.f30145a, D2.f30146b, str2)) {
                            L3.f31060a.x();
                            if (L3.K("event", 40, str2)) {
                                i4 = 0;
                            }
                        } else {
                            i4 = 13;
                        }
                    }
                    if (i4 != 0) {
                        this.f31060a.b().q().b("Invalid public event name. Event will not be logged (FE)", this.f31060a.B().d(str2));
                        U4 L4 = this.f31060a.L();
                        this.f31060a.x();
                        this.f31060a.L().z(this.f30886p, null, i4, "_ev", L4.p(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.f31060a.zzaw();
            C1728u3 q4 = this.f31060a.I().q(false);
            if (q4 != null && !bundle.containsKey("_sc")) {
                q4.f31000d = true;
            }
            U4.w(q4, bundle, z3 && !z5);
            boolean equals = "am".equals(str);
            boolean U3 = U4.U(str2);
            if (!z3 || this.f30874d == null || U3) {
                z6 = equals;
            } else {
                if (!equals) {
                    this.f31060a.b().o().c("Passing event to registered event handler (FE)", this.f31060a.B().d(str2), this.f31060a.B().b(bundle));
                    C1285y.l(this.f30874d);
                    this.f30874d.a(str, str2, bundle, j4);
                    return;
                }
                z6 = true;
            }
            if (this.f31060a.p()) {
                int i02 = this.f31060a.L().i0(str2);
                if (i02 != 0) {
                    this.f31060a.b().q().b("Invalid event name. Event will not be logged (FE)", this.f31060a.B().d(str2));
                    U4 L5 = this.f31060a.L();
                    this.f31060a.x();
                    this.f31060a.L().z(this.f30886p, str3, i02, "_ev", L5.p(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle t02 = this.f31060a.L().t0(str3, str2, bundle, C1307h.d("_o", "_sn", "_sc", "_si"), z5);
                C1285y.l(t02);
                this.f31060a.zzaw();
                if (this.f31060a.I().q(false) != null && "_ae".equals(str2)) {
                    C1717s4 c1717s4 = this.f31060a.K().f31005e;
                    long c4 = c1717s4.f30968d.f31060a.zzav().c();
                    long j6 = c4 - c1717s4.f30966b;
                    c1717s4.f30966b = c4;
                    if (j6 > 0) {
                        this.f31060a.L().u(t02, j6);
                    }
                }
                Y5.b();
                if (this.f31060a.x().z(null, C1643g1.f30707e0)) {
                    if (!kotlinx.coroutines.W.f52989c.equals(str) && "_ssr".equals(str2)) {
                        U4 L6 = this.f31060a.L();
                        String string = t02.getString("_ffr");
                        if (com.google.android.gms.common.util.B.b(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!S4.a(string, L6.f31060a.D().f30266t.a())) {
                            L6.f31060a.D().f30266t.b(string);
                        } else {
                            L6.f31060a.b().o().a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String a4 = this.f31060a.L().f31060a.D().f30266t.a();
                        if (!TextUtils.isEmpty(a4)) {
                            t02.putString("_ffr", a4);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(t02);
                if (this.f31060a.D().f30261o.a() > 0 && this.f31060a.D().t(j4) && this.f31060a.D().f30263q.b()) {
                    this.f31060a.b().t().a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j5 = 0;
                    K(kotlinx.coroutines.W.f52989c, "_sid", null, this.f31060a.zzav().a());
                    K(kotlinx.coroutines.W.f52989c, "_sno", null, this.f31060a.zzav().a());
                    K(kotlinx.coroutines.W.f52989c, "_se", null, this.f31060a.zzav().a());
                } else {
                    str4 = "_ae";
                    j5 = 0;
                }
                if (t02.getLong(FirebaseAnalytics.b.f34804m, j5) == 1) {
                    this.f31060a.b().t().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f31060a.K().f31004d.b(j4, true);
                }
                ArrayList arrayList2 = new ArrayList(t02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String str7 = (String) arrayList2.get(i5);
                    if (str7 != null) {
                        this.f31060a.L();
                        Object obj = t02.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            t02.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i6);
                    if (i6 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z4) {
                        bundle2 = this.f31060a.L().s0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f31060a.J().m(new C1736w(str6, new C1724u(bundle3), str, j4), str3);
                    if (!z6) {
                        Iterator it = this.f30875e.iterator();
                        while (it.hasNext()) {
                            ((H2) it.next()).a(str, str2, new Bundle(bundle3), j4);
                        }
                    }
                }
                this.f31060a.zzaw();
                if (this.f31060a.I().q(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f31060a.K().f31005e.d(true, true, this.f31060a.zzav().c());
                return;
            }
            return;
        }
        this.f31060a.b().o().a("Event not sent since app measurement is disabled");
    }

    public final void v(H2 h22) {
        g();
        C1285y.l(h22);
        if (!this.f30875e.add(h22)) {
            this.f31060a.b().u().a("OnEventListener already registered");
        }
    }

    public final void w(long j4) {
        this.f30877g.set(null);
        this.f31060a.a().x(new U2(this, j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(long j4, boolean z3) {
        f();
        g();
        this.f31060a.b().o().a("Resetting analytics data (FE)");
        C1729u4 K3 = this.f31060a.K();
        K3.f();
        K3.f31005e.a();
        D6.b();
        if (this.f31060a.x().z(null, C1643g1.f30739u0)) {
            this.f31060a.z().t();
        }
        boolean m4 = this.f31060a.m();
        J1 D3 = this.f31060a.D();
        D3.f30251e.b(j4);
        if (!TextUtils.isEmpty(D3.f31060a.D().f30266t.a())) {
            D3.f30266t.b(null);
        }
        C1418i6.b();
        C1647h x3 = D3.f31060a.x();
        C1637f1 c1637f1 = C1643g1.f30709f0;
        if (x3.z(null, c1637f1)) {
            D3.f30261o.b(0L);
        }
        if (!D3.f31060a.x().C()) {
            D3.r(!m4);
        }
        D3.f30267u.b(null);
        D3.f30268v.b(0L);
        D3.f30269w.b(null);
        if (z3) {
            this.f31060a.J().o();
        }
        C1418i6.b();
        if (this.f31060a.x().z(null, c1637f1)) {
            this.f31060a.K().f31004d.a();
        }
        this.f30885o = !m4;
    }

    protected final void y(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i4 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i4 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i4];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i4] = new Bundle((Bundle) parcelable);
                        }
                        i4++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i4 < list.size()) {
                        Object obj2 = list.get(i4);
                        if (obj2 instanceof Bundle) {
                            list.set(i4, new Bundle((Bundle) obj2));
                        }
                        i4++;
                    }
                }
            }
        }
        this.f31060a.a().x(new R2(this, str, str2, j4, bundle2, z3, z4, z5, str3));
    }

    final void z(String str, String str2, long j4, Object obj) {
        this.f31060a.a().x(new S2(this, str, str2, obj, j4));
    }
}
