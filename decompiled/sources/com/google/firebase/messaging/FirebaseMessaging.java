package com.google.firebase.messaging;

import B1.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1766g;
import com.google.android.gms.tasks.InterfaceC1769j;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.X;
import com.google.firebase.messaging.b0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.C2444a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: o, reason: collision with root package name */
    static final String f36427o = "FirebaseMessaging";

    /* renamed from: p, reason: collision with root package name */
    static final String f36428p = "com.google.android.gms";

    /* renamed from: q, reason: collision with root package name */
    private static final String f36429q = "com.google.android.gcm.intent.SEND";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36430r = "app";

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final String f36431s = "FCM";

    /* renamed from: t, reason: collision with root package name */
    private static final long f36432t = 30;

    /* renamed from: u, reason: collision with root package name */
    private static final long f36433u = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: v, reason: collision with root package name */
    private static final String f36434v = "";

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.B("FirebaseMessaging.class")
    private static b0 f36435w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.P
    @androidx.annotation.i0
    @SuppressLint({"FirebaseUnknownNullness"})
    static com.google.android.datatransport.h f36436x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.i0
    @androidx.annotation.B("FirebaseMessaging.class")
    static ScheduledExecutorService f36437y;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f36438a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private final B1.a f36439b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.j f36440c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f36441d;

    /* renamed from: e, reason: collision with root package name */
    private final F f36442e;

    /* renamed from: f, reason: collision with root package name */
    private final X f36443f;

    /* renamed from: g, reason: collision with root package name */
    private final a f36444g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f36445h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f36446i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f36447j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC1770k<g0> f36448k;

    /* renamed from: l, reason: collision with root package name */
    private final K f36449l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.B("this")
    private boolean f36450m;

    /* renamed from: n, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f36451n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f36452f = "firebase_messaging_auto_init_enabled";

        /* renamed from: g, reason: collision with root package name */
        private static final String f36453g = "com.google.firebase.messaging";

        /* renamed from: h, reason: collision with root package name */
        private static final String f36454h = "auto_init";

        /* renamed from: a, reason: collision with root package name */
        private final y1.d f36455a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.B("this")
        private boolean f36456b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        @androidx.annotation.B("this")
        private y1.b<com.google.firebase.b> f36457c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        @androidx.annotation.B("this")
        private Boolean f36458d;

        a(y1.d dVar) {
            this.f36455a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(C2444a c2444a) {
            if (c()) {
                FirebaseMessaging.this.W();
            }
        }

        @androidx.annotation.P
        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context n4 = FirebaseMessaging.this.f36438a.n();
            SharedPreferences sharedPreferences = n4.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f36454h)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(f36454h, false));
            }
            try {
                PackageManager packageManager = n4.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n4.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f36452f)) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean(f36452f));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f36456b) {
                    return;
                }
                Boolean e4 = e();
                this.f36458d = e4;
                if (e4 == null) {
                    y1.b<com.google.firebase.b> bVar = new y1.b() { // from class: com.google.firebase.messaging.C
                        @Override // y1.b
                        public final void a(C2444a c2444a) {
                            FirebaseMessaging.a.this.d(c2444a);
                        }
                    };
                    this.f36457c = bVar;
                    this.f36455a.c(com.google.firebase.b.class, bVar);
                }
                this.f36456b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            boolean A3;
            try {
                b();
                Boolean bool = this.f36458d;
                if (bool != null) {
                    A3 = bool.booleanValue();
                } else {
                    A3 = FirebaseMessaging.this.f36438a.A();
                }
            } catch (Throwable th) {
                throw th;
            }
            return A3;
        }

        synchronized void f(boolean z3) {
            try {
                b();
                y1.b<com.google.firebase.b> bVar = this.f36457c;
                if (bVar != null) {
                    this.f36455a.d(com.google.firebase.b.class, bVar);
                    this.f36457c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f36438a.n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean(f36454h, z3);
                edit.apply();
                if (z3) {
                    FirebaseMessaging.this.W();
                }
                this.f36458d = Boolean.valueOf(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(com.google.firebase.e eVar, @androidx.annotation.P B1.a aVar, C1.b<com.google.firebase.platforminfo.i> bVar, C1.b<HeartBeatInfo> bVar2, com.google.firebase.installations.j jVar, @androidx.annotation.P com.google.android.datatransport.h hVar, y1.d dVar) {
        this(eVar, aVar, bVar, bVar2, jVar, hVar, dVar, new K(eVar.n()));
    }

    @androidx.annotation.P
    public static com.google.android.datatransport.h A() {
        return f36436x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void K(String str) {
        if (com.google.firebase.e.f35884l.equals(this.f36438a.r())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f36438a.r());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C1829n(this.f36441d).i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k F(final String str, final b0.a aVar) {
        return this.f36442e.f().x(this.f36447j, new InterfaceC1769j() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k G3;
                G3 = FirebaseMessaging.this.G(str, aVar, (String) obj);
                return G3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k G(String str, b0.a aVar, String str2) throws Exception {
        v(this.f36441d).g(w(), str, str2, this.f36449l.a());
        if (aVar == null || !str2.equals(aVar.f36881a)) {
            K(str2);
        }
        return C1773n.g(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(C1771l c1771l) {
        try {
            this.f36439b.c(K.c(this.f36438a), f36431s);
            c1771l.c(null);
        } catch (Exception e4) {
            c1771l.b(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(C1771l c1771l) {
        try {
            C1773n.a(this.f36442e.c());
            v(this.f36441d).d(w(), K.c(this.f36438a));
            c1771l.c(null);
        } catch (Exception e4) {
            c1771l.b(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(C1771l c1771l) {
        try {
            c1771l.c(n());
        } catch (Exception e4) {
            c1771l.b(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        if (C()) {
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(g0 g0Var) {
        if (C()) {
            g0Var.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        Q.c(this.f36441d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k O(String str, g0 g0Var) throws Exception {
        return g0Var.s(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k P(String str, g0 g0Var) throws Exception {
        return g0Var.v(str);
    }

    private synchronized void V() {
        if (!this.f36450m) {
            Y(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        B1.a aVar = this.f36439b;
        if (aVar != null) {
            aVar.a();
        } else if (Z(y())) {
            V();
        }
    }

    @Keep
    @androidx.annotation.N
    static synchronized FirebaseMessaging getInstance(@androidx.annotation.N com.google.firebase.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.l(FirebaseMessaging.class);
            C1285y.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @androidx.annotation.i0
    static synchronized void o() {
        synchronized (FirebaseMessaging.class) {
            f36435w = null;
        }
    }

    static void p() {
        f36436x = null;
    }

    @androidx.annotation.N
    public static synchronized FirebaseMessaging u() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.e.p());
        }
        return firebaseMessaging;
    }

    @androidx.annotation.N
    private static synchronized b0 v(Context context) {
        b0 b0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36435w == null) {
                    f36435w = new b0(context);
                }
                b0Var = f36435w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    private String w() {
        if (com.google.firebase.e.f35884l.equals(this.f36438a.r())) {
            return "";
        }
        return this.f36438a.t();
    }

    public boolean C() {
        return this.f36444g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.i0
    public boolean D() {
        return this.f36449l.g();
    }

    public boolean E() {
        return Q.d(this.f36441d);
    }

    public void Q(@androidx.annotation.N U u3) {
        if (!TextUtils.isEmpty(u3.a1())) {
            Intent intent = new Intent(f36429q);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f36441d, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            u3.h1(intent);
            this.f36441d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void R(boolean z3) {
        this.f36444g.f(z3);
    }

    public void S(boolean z3) {
        J.B(z3);
    }

    public AbstractC1770k<Void> T(boolean z3) {
        return Q.f(this.f36445h, this.f36441d, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void U(boolean z3) {
        this.f36450m = z3;
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> X(@androidx.annotation.N final String str) {
        return this.f36448k.w(new InterfaceC1769j() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k O3;
                O3 = FirebaseMessaging.O(str, (g0) obj);
                return O3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void Y(long j4) {
        s(new c0(this, Math.min(Math.max(f36432t, 2 * j4), f36433u)), j4);
        this.f36450m = true;
    }

    @androidx.annotation.i0
    boolean Z(@androidx.annotation.P b0.a aVar) {
        if (aVar != null && !aVar.b(this.f36449l.a())) {
            return false;
        }
        return true;
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> a0(@androidx.annotation.N final String str) {
        return this.f36448k.w(new InterfaceC1769j() { // from class: com.google.firebase.messaging.y
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k P3;
                P3 = FirebaseMessaging.P(str, (g0) obj);
                return P3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() throws IOException {
        B1.a aVar = this.f36439b;
        if (aVar != null) {
            try {
                return (String) C1773n.a(aVar.d());
            } catch (InterruptedException | ExecutionException e4) {
                throw new IOException(e4);
            }
        }
        final b0.a y3 = y();
        if (!Z(y3)) {
            return y3.f36881a;
        }
        final String c4 = K.c(this.f36438a);
        try {
            return (String) C1773n.a(this.f36443f.b(c4, new X.a() { // from class: com.google.firebase.messaging.z
                @Override // com.google.firebase.messaging.X.a
                public final AbstractC1770k start() {
                    AbstractC1770k F3;
                    F3 = FirebaseMessaging.this.F(c4, y3);
                    return F3;
                }
            }));
        } catch (InterruptedException | ExecutionException e5) {
            throw new IOException(e5);
        }
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> q() {
        if (this.f36439b != null) {
            final C1771l c1771l = new C1771l();
            this.f36445h.execute(new Runnable() { // from class: com.google.firebase.messaging.A
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.H(c1771l);
                }
            });
            return c1771l.a();
        }
        if (y() == null) {
            return C1773n.g(null);
        }
        final C1771l c1771l2 = new C1771l();
        C1830o.f().execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I(c1771l2);
            }
        });
        return c1771l2.a();
    }

    @androidx.annotation.N
    public boolean r() {
        return J.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Runnable runnable, long j4) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36437y == null) {
                    f36437y = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("TAG"));
                }
                f36437y.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context t() {
        return this.f36441d;
    }

    @androidx.annotation.N
    public AbstractC1770k<String> x() {
        B1.a aVar = this.f36439b;
        if (aVar != null) {
            return aVar.d();
        }
        final C1771l c1771l = new C1771l();
        this.f36445h.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.J(c1771l);
            }
        });
        return c1771l.a();
    }

    @androidx.annotation.P
    @androidx.annotation.i0
    b0.a y() {
        return v(this.f36441d).e(w(), K.c(this.f36438a));
    }

    AbstractC1770k<g0> z() {
        return this.f36448k;
    }

    FirebaseMessaging(com.google.firebase.e eVar, @androidx.annotation.P B1.a aVar, C1.b<com.google.firebase.platforminfo.i> bVar, C1.b<HeartBeatInfo> bVar2, com.google.firebase.installations.j jVar, @androidx.annotation.P com.google.android.datatransport.h hVar, y1.d dVar, K k4) {
        this(eVar, aVar, jVar, hVar, dVar, k4, new F(eVar, k4, bVar, bVar2, jVar), C1830o.h(), C1830o.d(), C1830o.c());
    }

    FirebaseMessaging(com.google.firebase.e eVar, @androidx.annotation.P B1.a aVar, com.google.firebase.installations.j jVar, @androidx.annotation.P com.google.android.datatransport.h hVar, y1.d dVar, K k4, F f4, Executor executor, Executor executor2, Executor executor3) {
        this.f36450m = false;
        f36436x = hVar;
        this.f36438a = eVar;
        this.f36439b = aVar;
        this.f36440c = jVar;
        this.f36444g = new a(dVar);
        Context n4 = eVar.n();
        this.f36441d = n4;
        C1832q c1832q = new C1832q();
        this.f36451n = c1832q;
        this.f36449l = k4;
        this.f36446i = executor;
        this.f36442e = f4;
        this.f36443f = new X(executor);
        this.f36445h = executor2;
        this.f36447j = executor3;
        Context n5 = eVar.n();
        if (n5 instanceof Application) {
            ((Application) n5).registerActivityLifecycleCallbacks(c1832q);
        } else {
            Log.w("FirebaseMessaging", "Context " + n5 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new a.InterfaceC0002a() { // from class: com.google.firebase.messaging.t
                @Override // B1.a.InterfaceC0002a
                public final void a(String str) {
                    FirebaseMessaging.this.K(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.L();
            }
        });
        AbstractC1770k<g0> f5 = g0.f(this, k4, f4, n4, C1830o.i());
        this.f36448k = f5;
        f5.l(executor2, new InterfaceC1766g() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.InterfaceC1766g
            public final void c(Object obj) {
                FirebaseMessaging.this.M((g0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.N();
            }
        });
    }
}
