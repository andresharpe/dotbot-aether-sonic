package com.google.firebase;

import N0.a;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.core.os.O;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1178d;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1302c;
import com.google.android.gms.common.util.v;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import com.google.firebase.components.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private static final String f35883k = "FirebaseApp";

    /* renamed from: l, reason: collision with root package name */
    @N
    public static final String f35884l = "[DEFAULT]";

    /* renamed from: m, reason: collision with root package name */
    private static final Object f35885m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final Executor f35886n = new d();

    /* renamed from: o, reason: collision with root package name */
    @B("LOCK")
    static final Map<String, e> f35887o = new androidx.collection.a();

    /* renamed from: p, reason: collision with root package name */
    private static final String f35888p = "fire-android";

    /* renamed from: q, reason: collision with root package name */
    private static final String f35889q = "fire-core";

    /* renamed from: r, reason: collision with root package name */
    private static final String f35890r = "kotlin";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35891a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35892b;

    /* renamed from: c, reason: collision with root package name */
    private final m f35893c;

    /* renamed from: d, reason: collision with root package name */
    private final r f35894d;

    /* renamed from: g, reason: collision with root package name */
    private final x<G1.a> f35897g;

    /* renamed from: h, reason: collision with root package name */
    private final C1.b<com.google.firebase.heartbeatinfo.h> f35898h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f35895e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f35896f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<b> f35899i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<f> f35900j = new CopyOnWriteArrayList();

    @I0.a
    /* loaded from: classes2.dex */
    public interface b {
        @I0.a
        void a(boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class c implements ComponentCallbacks2C1178d.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<c> f35901a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (v.c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f35901a.get() == null) {
                    c cVar = new c();
                    if (androidx.lifecycle.B.a(f35901a, null, cVar)) {
                        ComponentCallbacks2C1178d.c(application);
                        ComponentCallbacks2C1178d.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1178d.a
        public void a(boolean z3) {
            synchronized (e.f35885m) {
                try {
                    Iterator it = new ArrayList(e.f35887o.values()).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.f35895e.get()) {
                            eVar.F(z3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements Executor {

        /* renamed from: E, reason: collision with root package name */
        private static final Handler f35902E = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            f35902E.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: com.google.firebase.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0332e extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<C0332e> f35903b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f35904a;

        public C0332e(Context context) {
            this.f35904a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f35903b.get() == null) {
                C0332e c0332e = new C0332e(context);
                if (androidx.lifecycle.B.a(f35903b, null, c0332e)) {
                    context.registerReceiver(c0332e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f35904a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f35885m) {
                try {
                    Iterator<e> it = e.f35887o.values().iterator();
                    while (it.hasNext()) {
                        it.next().v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, m mVar) {
        this.f35891a = (Context) C1285y.l(context);
        this.f35892b = C1285y.h(str);
        this.f35893c = (m) C1285y.l(mVar);
        J1.c.b("Firebase");
        J1.c.b("ComponentDiscovery");
        List<C1.b<ComponentRegistrar>> c4 = com.google.firebase.components.i.d(context, ComponentDiscoveryService.class).c();
        J1.c.a();
        J1.c.b("Runtime");
        r e4 = r.k(f35886n).d(c4).c(new FirebaseCommonRegistrar()).b(C1792f.u(context, Context.class, new Class[0])).b(C1792f.u(this, e.class, new Class[0])).b(C1792f.u(mVar, m.class, new Class[0])).g(new J1.b()).e();
        this.f35894d = e4;
        J1.c.a();
        this.f35897g = new x<>(new C1.b() { // from class: com.google.firebase.c
            @Override // C1.b
            public final Object get() {
                G1.a C3;
                C3 = e.this.C(context);
                return C3;
            }
        });
        this.f35898h = e4.b(com.google.firebase.heartbeatinfo.h.class);
        g(new b() { // from class: com.google.firebase.d
            @Override // com.google.firebase.e.b
            public final void a(boolean z3) {
                e.this.D(z3);
            }
        });
        J1.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ G1.a C(Context context) {
        return new G1.a(context, t(), (y1.c) this.f35894d.a(y1.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(boolean z3) {
        if (!z3) {
            this.f35898h.get().n();
        }
    }

    private static String E(@N String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(boolean z3) {
        Log.d(f35883k, "Notifying background state change listeners.");
        Iterator<b> it = this.f35899i.iterator();
        while (it.hasNext()) {
            it.next().a(z3);
        }
    }

    private void G() {
        Iterator<f> it = this.f35900j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f35892b, this.f35893c);
        }
    }

    private void i() {
        C1285y.s(!this.f35896f.get(), "FirebaseApp was deleted");
    }

    @i0
    public static void j() {
        synchronized (f35885m) {
            f35887o.clear();
        }
    }

    private static List<String> m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f35885m) {
            try {
                Iterator<e> it = f35887o.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @N
    public static List<e> o(@N Context context) {
        ArrayList arrayList;
        synchronized (f35885m) {
            arrayList = new ArrayList(f35887o.values());
        }
        return arrayList;
    }

    @N
    public static e p() {
        e eVar;
        synchronized (f35885m) {
            try {
                eVar = f35887o.get(f35884l);
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.x.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @N
    public static e q(@N String str) {
        e eVar;
        String str2;
        synchronized (f35885m) {
            try {
                eVar = f35887o.get(E(str));
                if (eVar != null) {
                    eVar.f35898h.get().n();
                } else {
                    List<String> m4 = m();
                    if (m4.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", m4);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return eVar;
    }

    @I0.a
    public static String u(String str, m mVar) {
        return C1302c.f(str.getBytes(Charset.defaultCharset())) + "+" + C1302c.f(mVar.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (!O.a(this.f35891a)) {
            Log.i(f35883k, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + r());
            C0332e.b(this.f35891a);
            return;
        }
        Log.i(f35883k, "Device unlocked: initializing all Firebase APIs for app " + r());
        this.f35894d.p(B());
        this.f35898h.get().n();
    }

    @P
    public static e x(@N Context context) {
        synchronized (f35885m) {
            try {
                if (f35887o.containsKey(f35884l)) {
                    return p();
                }
                m h4 = m.h(context);
                if (h4 == null) {
                    Log.w(f35883k, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return y(context, h4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @N
    public static e y(@N Context context, @N m mVar) {
        return z(context, mVar, f35884l);
    }

    @N
    public static e z(@N Context context, @N m mVar, @N String str) {
        e eVar;
        c.c(context);
        String E3 = E(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f35885m) {
            Map<String, e> map = f35887o;
            C1285y.s(!map.containsKey(E3), "FirebaseApp name " + E3 + " already exists!");
            C1285y.m(context, "Application context cannot be null.");
            eVar = new e(context, E3, mVar);
            map.put(E3, eVar);
        }
        eVar.v();
        return eVar;
    }

    @I0.a
    public boolean A() {
        i();
        return this.f35897g.get().b();
    }

    @i0
    @I0.a
    public boolean B() {
        return f35884l.equals(r());
    }

    @I0.a
    public void H(b bVar) {
        i();
        this.f35899i.remove(bVar);
    }

    @I0.a
    public void I(@N f fVar) {
        i();
        C1285y.l(fVar);
        this.f35900j.remove(fVar);
    }

    public void J(boolean z3) {
        i();
        if (this.f35895e.compareAndSet(!z3, z3)) {
            boolean d4 = ComponentCallbacks2C1178d.b().d();
            if (z3 && d4) {
                F(true);
            } else if (!z3 && d4) {
                F(false);
            }
        }
    }

    @I0.a
    public void K(Boolean bool) {
        i();
        this.f35897g.get().e(bool);
    }

    @I0.a
    @Deprecated
    public void L(boolean z3) {
        K(Boolean.valueOf(z3));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f35892b.equals(((e) obj).r());
    }

    @I0.a
    public void g(b bVar) {
        i();
        if (this.f35895e.get() && ComponentCallbacks2C1178d.b().d()) {
            bVar.a(true);
        }
        this.f35899i.add(bVar);
    }

    @I0.a
    public void h(@N f fVar) {
        i();
        C1285y.l(fVar);
        this.f35900j.add(fVar);
    }

    public int hashCode() {
        return this.f35892b.hashCode();
    }

    public void k() {
        if (!this.f35896f.compareAndSet(false, true)) {
            return;
        }
        synchronized (f35885m) {
            f35887o.remove(this.f35892b);
        }
        G();
    }

    @I0.a
    public <T> T l(Class<T> cls) {
        i();
        return (T) this.f35894d.a(cls);
    }

    @N
    public Context n() {
        i();
        return this.f35891a;
    }

    @N
    public String r() {
        i();
        return this.f35892b;
    }

    @N
    public m s() {
        i();
        return this.f35893c;
    }

    @I0.a
    public String t() {
        return C1302c.f(r().getBytes(Charset.defaultCharset())) + "+" + C1302c.f(s().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C1281w.d(this).a(a.C0015a.f1688b, this.f35892b).a("options", this.f35893c).toString();
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    void w() {
        this.f35894d.o();
    }
}
