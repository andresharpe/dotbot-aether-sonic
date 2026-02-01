package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.internal.measurement.AbstractC1423j3;
import com.google.android.gms.internal.measurement.C1468p0;
import com.google.android.gms.internal.measurement.Y5;
import com.google.firebase.messaging.C1821f;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1638f2 implements B2 {

    /* renamed from: H, reason: collision with root package name */
    private static volatile C1638f2 f30621H;

    /* renamed from: A, reason: collision with root package name */
    private volatile Boolean f30622A;

    /* renamed from: B, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected Boolean f30623B;

    /* renamed from: C, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected Boolean f30624C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f30625D;

    /* renamed from: E, reason: collision with root package name */
    private int f30626E;

    /* renamed from: G, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final long f30628G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30629a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30630b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30631c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30632d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30633e;

    /* renamed from: f, reason: collision with root package name */
    private final C1617c f30634f;

    /* renamed from: g, reason: collision with root package name */
    private final C1647h f30635g;

    /* renamed from: h, reason: collision with root package name */
    private final J1 f30636h;

    /* renamed from: i, reason: collision with root package name */
    private final C1720t1 f30637i;

    /* renamed from: j, reason: collision with root package name */
    private final C1620c2 f30638j;

    /* renamed from: k, reason: collision with root package name */
    private final C1729u4 f30639k;

    /* renamed from: l, reason: collision with root package name */
    private final U4 f30640l;

    /* renamed from: m, reason: collision with root package name */
    private final C1691o1 f30641m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1306g f30642n;

    /* renamed from: o, reason: collision with root package name */
    private final C3 f30643o;

    /* renamed from: p, reason: collision with root package name */
    private final C1687n3 f30644p;

    /* renamed from: q, reason: collision with root package name */
    private final D0 f30645q;

    /* renamed from: r, reason: collision with root package name */
    private final C1710r3 f30646r;

    /* renamed from: s, reason: collision with root package name */
    private final String f30647s;

    /* renamed from: t, reason: collision with root package name */
    private C1679m1 f30648t;

    /* renamed from: u, reason: collision with root package name */
    private C1628d4 f30649u;

    /* renamed from: v, reason: collision with root package name */
    private C1701q f30650v;

    /* renamed from: w, reason: collision with root package name */
    private C1667k1 f30651w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f30653y;

    /* renamed from: z, reason: collision with root package name */
    private long f30654z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f30652x = false;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicInteger f30627F = new AtomicInteger(0);

    C1638f2(K2 k22) {
        long a4;
        Bundle bundle;
        C1285y.l(k22);
        Context context = k22.f30278a;
        C1617c c1617c = new C1617c(context);
        this.f30634f = c1617c;
        C1619c1.f30557a = c1617c;
        this.f30629a = context;
        this.f30630b = k22.f30279b;
        this.f30631c = k22.f30280c;
        this.f30632d = k22.f30281d;
        this.f30633e = k22.f30285h;
        this.f30622A = k22.f30282e;
        this.f30647s = k22.f30287j;
        this.f30625D = true;
        C1468p0 c1468p0 = k22.f30284g;
        if (c1468p0 != null && (bundle = c1468p0.f29742K) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f30623B = (Boolean) obj;
            }
            Object obj2 = c1468p0.f29742K.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f30624C = (Boolean) obj2;
            }
        }
        AbstractC1423j3.e(context);
        InterfaceC1306g e4 = com.google.android.gms.common.util.k.e();
        this.f30642n = e4;
        Long l4 = k22.f30286i;
        if (l4 != null) {
            a4 = l4.longValue();
        } else {
            a4 = e4.a();
        }
        this.f30628G = a4;
        this.f30635g = new C1647h(this);
        J1 j12 = new J1(this);
        j12.j();
        this.f30636h = j12;
        C1720t1 c1720t1 = new C1720t1(this);
        c1720t1.j();
        this.f30637i = c1720t1;
        U4 u4 = new U4(this);
        u4.j();
        this.f30640l = u4;
        this.f30641m = new C1691o1(new J2(k22, this));
        this.f30645q = new D0(this);
        C3 c32 = new C3(this);
        c32.h();
        this.f30643o = c32;
        C1687n3 c1687n3 = new C1687n3(this);
        c1687n3.h();
        this.f30644p = c1687n3;
        C1729u4 c1729u4 = new C1729u4(this);
        c1729u4.h();
        this.f30639k = c1729u4;
        C1710r3 c1710r3 = new C1710r3(this);
        c1710r3.j();
        this.f30646r = c1710r3;
        C1620c2 c1620c2 = new C1620c2(this);
        c1620c2.j();
        this.f30638j = c1620c2;
        C1468p0 c1468p02 = k22.f30284g;
        boolean z3 = c1468p02 == null || c1468p02.f29737F == 0;
        if (context.getApplicationContext() instanceof Application) {
            C1687n3 G3 = G();
            if (G3.f31060a.f30629a.getApplicationContext() instanceof Application) {
                Application application = (Application) G3.f31060a.f30629a.getApplicationContext();
                if (G3.f30873c == null) {
                    G3.f30873c = new C1681m3(G3, null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(G3.f30873c);
                    application.registerActivityLifecycleCallbacks(G3.f30873c);
                    G3.f31060a.b().t().a("Registered activity lifecycle callback");
                }
            }
        } else {
            b().u().a("Application context is not an Application");
        }
        c1620c2.x(new RunnableC1632e2(this, k22));
    }

    public static C1638f2 F(Context context, C1468p0 c1468p0, Long l4) {
        Bundle bundle;
        if (c1468p0 != null && (c1468p0.f29740I == null || c1468p0.f29741J == null)) {
            c1468p0 = new C1468p0(c1468p0.f29736E, c1468p0.f29737F, c1468p0.f29738G, c1468p0.f29739H, null, null, c1468p0.f29742K, null);
        }
        C1285y.l(context);
        C1285y.l(context.getApplicationContext());
        if (f30621H == null) {
            synchronized (C1638f2.class) {
                try {
                    if (f30621H == null) {
                        f30621H = new C1638f2(new K2(context, c1468p0, l4));
                    }
                } finally {
                }
            }
        } else if (c1468p0 != null && (bundle = c1468p0.f29742K) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C1285y.l(f30621H);
            f30621H.f30622A = Boolean.valueOf(c1468p0.f29742K.getBoolean("dataCollectionDefaultEnabled"));
        }
        C1285y.l(f30621H);
        return f30621H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(C1638f2 c1638f2, K2 k22) {
        c1638f2.a().f();
        c1638f2.f30635g.u();
        C1701q c1701q = new C1701q(c1638f2);
        c1701q.j();
        c1638f2.f30650v = c1701q;
        C1667k1 c1667k1 = new C1667k1(c1638f2, k22.f30283f);
        c1667k1.h();
        c1638f2.f30651w = c1667k1;
        C1679m1 c1679m1 = new C1679m1(c1638f2);
        c1679m1.h();
        c1638f2.f30648t = c1679m1;
        C1628d4 c1628d4 = new C1628d4(c1638f2);
        c1628d4.h();
        c1638f2.f30649u = c1628d4;
        c1638f2.f30640l.k();
        c1638f2.f30636h.k();
        c1638f2.f30651w.i();
        C1708r1 s4 = c1638f2.b().s();
        c1638f2.f30635g.o();
        s4.b("App measurement initialized, version", 73000L);
        c1638f2.b().s().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q4 = c1667k1.q();
        if (TextUtils.isEmpty(c1638f2.f30630b)) {
            if (c1638f2.L().R(q4)) {
                c1638f2.b().s().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c1638f2.b().s().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q4)));
            }
        }
        c1638f2.b().o().a("Debug-level message logging enabled");
        if (c1638f2.f30626E != c1638f2.f30627F.get()) {
            c1638f2.b().p().c("Not all components initialized", Integer.valueOf(c1638f2.f30626E), Integer.valueOf(c1638f2.f30627F.get()));
        }
        c1638f2.f30652x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void r() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void s(C1757z2 c1757z2) {
        if (c1757z2 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(F1 f12) {
        if (f12 != null) {
            if (f12.k()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f12.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void u(A2 a22) {
        if (a22 != null) {
            if (a22.l()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a22.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final C1679m1 A() {
        t(this.f30648t);
        return this.f30648t;
    }

    @Pure
    public final C1691o1 B() {
        return this.f30641m;
    }

    public final C1720t1 C() {
        C1720t1 c1720t1 = this.f30637i;
        if (c1720t1 == null || !c1720t1.l()) {
            return null;
        }
        return c1720t1;
    }

    @Pure
    public final J1 D() {
        s(this.f30636h);
        return this.f30636h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SideEffectFree
    public final C1620c2 E() {
        return this.f30638j;
    }

    @Pure
    public final C1687n3 G() {
        t(this.f30644p);
        return this.f30644p;
    }

    @Pure
    public final C1710r3 H() {
        u(this.f30646r);
        return this.f30646r;
    }

    @Pure
    public final C3 I() {
        t(this.f30643o);
        return this.f30643o;
    }

    @Pure
    public final C1628d4 J() {
        t(this.f30649u);
        return this.f30649u;
    }

    @Pure
    public final C1729u4 K() {
        t(this.f30639k);
        return this.f30639k;
    }

    @Pure
    public final U4 L() {
        s(this.f30640l);
        return this.f30640l;
    }

    @Pure
    public final String M() {
        return this.f30630b;
    }

    @Pure
    public final String N() {
        return this.f30631c;
    }

    @Pure
    public final String O() {
        return this.f30632d;
    }

    @Pure
    public final String P() {
        return this.f30647s;
    }

    @Override // com.google.android.gms.measurement.internal.B2
    @Pure
    public final C1620c2 a() {
        u(this.f30638j);
        return this.f30638j;
    }

    @Override // com.google.android.gms.measurement.internal.B2
    @Pure
    public final C1720t1 b() {
        u(this.f30637i);
        return this.f30637i;
    }

    @Override // com.google.android.gms.measurement.internal.B2
    @Pure
    public final Context d() {
        return this.f30629a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.f30627F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str, int i4, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i4 != 200 && i4 != 204) {
            if (i4 == 304) {
                i4 = 304;
            }
            b().u().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i4), th);
        }
        if (th == null) {
            D().f30264r.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", com.google.firebase.remoteconfig.l.f37524n);
                    if (TextUtils.isEmpty(optString)) {
                        b().o().a("Deferred Deep Link is empty.");
                        return;
                    }
                    U4 L3 = L();
                    C1638f2 c1638f2 = L3.f31060a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = L3.f31060a.f30629a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f30644p.s(kotlinx.coroutines.W.f52989c, C1821f.C0339f.f36999l, bundle);
                        U4 L4 = L();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = L4.f31060a.f30629a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    L4.f31060a.f30629a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e4) {
                                L4.f31060a.b().p().b("Failed to persist Deferred Deep Link. exception", e4);
                                return;
                            }
                        }
                        return;
                    }
                    b().u().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e5) {
                    b().p().b("Failed to parse the Deferred Deep Link response. exception", e5);
                    return;
                }
            }
            b().o().a("Deferred Deep Link response empty.");
            return;
        }
        b().u().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i4), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f30626E++;
    }

    @androidx.annotation.j0
    public final void h() {
        a().f();
        u(H());
        String q4 = z().q();
        Pair n4 = D().n(q4);
        if (this.f30635g.y() && !((Boolean) n4.second).booleanValue() && !TextUtils.isEmpty((CharSequence) n4.first)) {
            C1710r3 H3 = H();
            H3.i();
            ConnectivityManager connectivityManager = (ConnectivityManager) H3.f31060a.f30629a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                U4 L3 = L();
                z().f31060a.f30635g.o();
                URL q5 = L3.q(73000L, q4, (String) n4.first, D().f30265s.a() - 1);
                if (q5 != null) {
                    C1710r3 H4 = H();
                    C1626d2 c1626d2 = new C1626d2(this);
                    H4.f();
                    H4.i();
                    C1285y.l(q5);
                    C1285y.l(c1626d2);
                    H4.f31060a.a().w(new RunnableC1705q3(H4, q4, q5, null, null, c1626d2, null));
                    return;
                }
                return;
            }
            b().u().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        b().o().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void i(boolean z3) {
        this.f30622A = Boolean.valueOf(z3);
    }

    @androidx.annotation.j0
    public final void j(boolean z3) {
        a().f();
        this.f30625D = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void k(C1468p0 c1468p0) {
        C1653i c1653i;
        a().f();
        C1653i o4 = D().o();
        J1 D3 = D();
        C1638f2 c1638f2 = D3.f31060a;
        D3.f();
        int i4 = 100;
        int i5 = D3.m().getInt("consent_source", 100);
        C1647h c1647h = this.f30635g;
        C1638f2 c1638f22 = c1647h.f31060a;
        Boolean r4 = c1647h.r("google_analytics_default_allow_ad_storage");
        C1647h c1647h2 = this.f30635g;
        C1638f2 c1638f23 = c1647h2.f31060a;
        Boolean r5 = c1647h2.r("google_analytics_default_allow_analytics_storage");
        if ((r4 != null || r5 != null) && D().u(-10)) {
            c1653i = new C1653i(r4, r5);
            i4 = -10;
        } else {
            if (!TextUtils.isEmpty(z().r()) && (i5 == 0 || i5 == 30 || i5 == 10 || i5 == 30 || i5 == 30 || i5 == 40)) {
                G().E(C1653i.f30785b, -10, this.f30628G);
            } else if (TextUtils.isEmpty(z().r()) && c1468p0 != null && c1468p0.f29742K != null && D().u(30)) {
                c1653i = C1653i.a(c1468p0.f29742K);
                if (!c1653i.equals(C1653i.f30785b)) {
                    i4 = 30;
                }
            }
            c1653i = null;
        }
        if (c1653i != null) {
            G().E(c1653i, i4, this.f30628G);
            o4 = c1653i;
        }
        G().H(o4);
        if (D().f30251e.a() == 0) {
            b().t().b("Persisting first open", Long.valueOf(this.f30628G));
            D().f30251e.b(this.f30628G);
        }
        G().f30884n.c();
        if (!p()) {
            if (m()) {
                if (!L().Q("android.permission.INTERNET")) {
                    b().p().a("App is missing INTERNET permission");
                }
                if (!L().Q("android.permission.ACCESS_NETWORK_STATE")) {
                    b().p().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!com.google.android.gms.common.wrappers.e.a(this.f30629a).g() && !this.f30635g.E()) {
                    if (!U4.W(this.f30629a)) {
                        b().p().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!U4.X(this.f30629a, false)) {
                        b().p().a("AppMeasurementService not registered/enabled");
                    }
                }
                b().p().a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(z().r()) || !TextUtils.isEmpty(z().p())) {
                U4 L3 = L();
                String r6 = z().r();
                J1 D4 = D();
                D4.f();
                String string = D4.m().getString("gmp_app_id", null);
                String p4 = z().p();
                J1 D5 = D();
                D5.f();
                if (L3.Z(r6, string, p4, D5.m().getString("admob_app_id", null))) {
                    b().s().a("Rechecking which service to use due to a GMP App Id change");
                    J1 D6 = D();
                    D6.f();
                    Boolean p5 = D6.p();
                    SharedPreferences.Editor edit = D6.m().edit();
                    edit.clear();
                    edit.apply();
                    if (p5 != null) {
                        D6.q(p5);
                    }
                    A().o();
                    this.f30649u.O();
                    this.f30649u.N();
                    D().f30251e.b(this.f30628G);
                    D().f30253g.b(null);
                }
                J1 D7 = D();
                String r7 = z().r();
                D7.f();
                SharedPreferences.Editor edit2 = D7.m().edit();
                edit2.putString("gmp_app_id", r7);
                edit2.apply();
                J1 D8 = D();
                String p6 = z().p();
                D8.f();
                SharedPreferences.Editor edit3 = D8.m().edit();
                edit3.putString("admob_app_id", p6);
                edit3.apply();
            }
            if (!D().o().i(zzah.ANALYTICS_STORAGE)) {
                D().f30253g.b(null);
            }
            G().A(D().f30253g.a());
            Y5.b();
            if (this.f30635g.z(null, C1643g1.f30707e0)) {
                try {
                    L().f31060a.f30629a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(D().f30266t.a())) {
                        b().u().a("Remote config removed with active feature rollouts");
                        D().f30266t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(z().r()) || !TextUtils.isEmpty(z().p())) {
                boolean m4 = m();
                if (!D().s() && !this.f30635g.C()) {
                    D().r(!m4);
                }
                if (m4) {
                    G().e0();
                }
                K().f31004d.a();
                J().Q(new AtomicReference());
                J().t(D().f30269w.a());
            }
        }
        D().f30260n.a(true);
    }

    @androidx.annotation.j0
    public final boolean l() {
        if (this.f30622A != null && this.f30622A.booleanValue()) {
            return true;
        }
        return false;
    }

    @androidx.annotation.j0
    public final boolean m() {
        if (v() == 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.j0
    public final boolean n() {
        a().f();
        return this.f30625D;
    }

    @Pure
    public final boolean o() {
        return TextUtils.isEmpty(this.f30630b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final boolean p() {
        boolean z3;
        if (this.f30652x) {
            a().f();
            Boolean bool = this.f30653y;
            if (bool == null || this.f30654z == 0 || (!bool.booleanValue() && Math.abs(this.f30642n.c() - this.f30654z) > 1000)) {
                this.f30654z = this.f30642n.c();
                boolean z4 = true;
                if (L().Q("android.permission.INTERNET") && L().Q("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.wrappers.e.a(this.f30629a).g() || this.f30635g.E() || (U4.W(this.f30629a) && U4.X(this.f30629a, false)))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean valueOf = Boolean.valueOf(z3);
                this.f30653y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().J(z().r(), z().p()) && TextUtils.isEmpty(z().p())) {
                        z4 = false;
                    }
                    this.f30653y = Boolean.valueOf(z4);
                }
            }
            return this.f30653y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean q() {
        return this.f30633e;
    }

    @androidx.annotation.j0
    public final int v() {
        a().f();
        if (this.f30635g.C()) {
            return 1;
        }
        Boolean bool = this.f30624C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        a().f();
        if (!this.f30625D) {
            return 8;
        }
        Boolean p4 = D().p();
        if (p4 != null) {
            if (p4.booleanValue()) {
                return 0;
            }
            return 3;
        }
        C1647h c1647h = this.f30635g;
        C1617c c1617c = c1647h.f31060a.f30634f;
        Boolean r4 = c1647h.r("firebase_analytics_collection_enabled");
        if (r4 != null) {
            if (r4.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f30623B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f30622A == null || this.f30622A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    @Pure
    public final D0 w() {
        D0 d02 = this.f30645q;
        if (d02 != null) {
            return d02;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final C1647h x() {
        return this.f30635g;
    }

    @Pure
    public final C1701q y() {
        u(this.f30650v);
        return this.f30650v;
    }

    @Pure
    public final C1667k1 z() {
        t(this.f30651w);
        return this.f30651w;
    }

    @Override // com.google.android.gms.measurement.internal.B2
    @Pure
    public final InterfaceC1306g zzav() {
        return this.f30642n;
    }

    @Override // com.google.android.gms.measurement.internal.B2
    @Pure
    public final C1617c zzaw() {
        return this.f30634f;
    }
}
