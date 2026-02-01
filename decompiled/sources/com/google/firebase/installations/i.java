package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class i implements j {

    /* renamed from: n, reason: collision with root package name */
    private static final String f36005n = "generatefid.lock";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36006o = "CHIME_ANDROID_SDK";

    /* renamed from: p, reason: collision with root package name */
    private static final int f36007p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final int f36008q = 1;

    /* renamed from: r, reason: collision with root package name */
    private static final long f36009r = 30;

    /* renamed from: t, reason: collision with root package name */
    private static final String f36011t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: u, reason: collision with root package name */
    private static final String f36012u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: v, reason: collision with root package name */
    private static final String f36013v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: w, reason: collision with root package name */
    private static final String f36014w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f36015a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.remote.c f36016b;

    /* renamed from: c, reason: collision with root package name */
    private final PersistedInstallation f36017c;

    /* renamed from: d, reason: collision with root package name */
    private final r f36018d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.local.b f36019e;

    /* renamed from: f, reason: collision with root package name */
    private final p f36020f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f36021g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f36022h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f36023i;

    /* renamed from: j, reason: collision with root package name */
    @B("this")
    private String f36024j;

    /* renamed from: k, reason: collision with root package name */
    @B("FirebaseInstallations.this")
    private Set<D1.a> f36025k;

    /* renamed from: l, reason: collision with root package name */
    @B("lock")
    private final List<q> f36026l;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f36004m = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final ThreadFactory f36010s = new a();

    /* loaded from: classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f36027E = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f36027E.getAndIncrement())));
        }
    }

    /* loaded from: classes2.dex */
    class b implements D1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D1.a f36028a;

        b(D1.a aVar) {
            this.f36028a = aVar;
        }

        @Override // D1.b
        public void a() {
            synchronized (i.this) {
                i.this.f36025k.remove(this.f36028a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36030a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36031b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f36031b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36031b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36031b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f36030a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36030a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(com.google.firebase.e eVar, @N C1.b<com.google.firebase.heartbeatinfo.k> bVar) {
        this(new ThreadPoolExecutor(0, 1, f36009r, TimeUnit.SECONDS, new LinkedBlockingQueue(), f36010s), eVar, new com.google.firebase.installations.remote.c(eVar.n(), bVar), new PersistedInstallation(eVar), r.c(), new com.google.firebase.installations.local.b(eVar), new p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        B(false);
    }

    private void C() {
        C1285y.i(q(), f36012u);
        C1285y.i(x(), f36013v);
        C1285y.i(p(), f36011t);
        C1285y.b(r.h(q()), f36012u);
        C1285y.b(r.g(p()), f36011t);
    }

    private String D(com.google.firebase.installations.local.c cVar) {
        if ((!this.f36015a.r().equals(f36006o) && !this.f36015a.B()) || !cVar.m()) {
            return this.f36020f.a();
        }
        String f4 = this.f36019e.f();
        if (TextUtils.isEmpty(f4)) {
            return this.f36020f.a();
        }
        return f4;
    }

    private com.google.firebase.installations.local.c E(com.google.firebase.installations.local.c cVar) throws FirebaseInstallationsException {
        String str;
        if (cVar.d() != null && cVar.d().length() == 11) {
            str = this.f36019e.i();
        } else {
            str = null;
        }
        InstallationResponse d4 = this.f36016b.d(p(), cVar.d(), x(), q(), str);
        int i4 = c.f36030a[d4.e().ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return cVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        return cVar.s(d4.c(), d4.d(), this.f36018d.b(), d4.b().c(), d4.b().d());
    }

    private void F(Exception exc) {
        synchronized (this.f36021g) {
            try {
                Iterator<q> it = this.f36026l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void G(com.google.firebase.installations.local.c cVar) {
        synchronized (this.f36021g) {
            try {
                Iterator<q> it = this.f36026l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(cVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void H(String str) {
        this.f36024j = str;
    }

    private synchronized void I(com.google.firebase.installations.local.c cVar, com.google.firebase.installations.local.c cVar2) {
        if (this.f36025k.size() != 0 && !TextUtils.equals(cVar.d(), cVar2.d())) {
            Iterator<D1.a> it = this.f36025k.iterator();
            while (it.hasNext()) {
                it.next().a(cVar2.d());
            }
        }
    }

    private AbstractC1770k<n> i() {
        C1771l c1771l = new C1771l();
        k(new l(this.f36018d, c1771l));
        return c1771l.a();
    }

    private AbstractC1770k<String> j() {
        C1771l c1771l = new C1771l();
        k(new m(c1771l));
        return c1771l.a();
    }

    private void k(q qVar) {
        synchronized (this.f36021g) {
            this.f36026l.add(qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void l() throws FirebaseInstallationsException {
        H(null);
        com.google.firebase.installations.local.c u3 = u();
        if (u3.k()) {
            this.f36016b.e(p(), u3.d(), x(), u3.f());
        }
        y(u3.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.c r0 = r2.u()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.r r3 = r2.f36018d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            com.google.firebase.installations.local.c r3 = r2.o(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            goto L28
        L24:
            com.google.firebase.installations.local.c r3 = r2.E(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
        L28:
            r2.y(r3)
            r2.I(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.H(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.F(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.F(r3)
            goto L60
        L5d:
            r2.G(r3)
        L60:
            return
        L61:
            r2.F(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.i.z(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void B(final boolean z3) {
        com.google.firebase.installations.local.c w3 = w();
        if (z3) {
            w3 = w3.p();
        }
        G(w3);
        this.f36023i.execute(new Runnable() { // from class: com.google.firebase.installations.e
            @Override // java.lang.Runnable
            public final void run() {
                i.this.z(z3);
            }
        });
    }

    private com.google.firebase.installations.local.c o(@N com.google.firebase.installations.local.c cVar) throws FirebaseInstallationsException {
        TokenResult f4 = this.f36016b.f(p(), cVar.d(), x(), cVar.f());
        int i4 = c.f36031b[f4.b().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    H(null);
                    return cVar.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
            }
            return cVar.q("BAD CONFIG");
        }
        return cVar.o(f4.c(), f4.d(), this.f36018d.b());
    }

    private synchronized String r() {
        return this.f36024j;
    }

    @N
    public static i s() {
        return t(com.google.firebase.e.p());
    }

    @N
    public static i t(@N com.google.firebase.e eVar) {
        boolean z3;
        if (eVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "Null is not a valid value of FirebaseApp.");
        return (i) eVar.l(j.class);
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.c u() {
        com.google.firebase.installations.local.c e4;
        synchronized (f36004m) {
            try {
                d a4 = d.a(this.f36015a.n(), f36005n);
                try {
                    e4 = this.f36017c.e();
                    if (a4 != null) {
                        a4.b();
                    }
                } catch (Throwable th) {
                    if (a4 != null) {
                        a4.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e4;
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.c w() {
        com.google.firebase.installations.local.c e4;
        synchronized (f36004m) {
            try {
                d a4 = d.a(this.f36015a.n(), f36005n);
                try {
                    e4 = this.f36017c.e();
                    if (e4.j()) {
                        e4 = this.f36017c.c(e4.t(D(e4)));
                    }
                    if (a4 != null) {
                        a4.b();
                    }
                } catch (Throwable th) {
                    if (a4 != null) {
                        a4.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e4;
    }

    /* JADX WARN: Finally extract failed */
    private void y(com.google.firebase.installations.local.c cVar) {
        synchronized (f36004m) {
            try {
                d a4 = d.a(this.f36015a.n(), f36005n);
                try {
                    this.f36017c.c(cVar);
                    if (a4 != null) {
                        a4.b();
                    }
                } catch (Throwable th) {
                    if (a4 != null) {
                        a4.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.installations.j
    @N
    public AbstractC1770k<n> a(final boolean z3) {
        C();
        AbstractC1770k<n> i4 = i();
        this.f36022h.execute(new Runnable() { // from class: com.google.firebase.installations.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.B(z3);
            }
        });
        return i4;
    }

    @Override // com.google.firebase.installations.j
    @N
    public synchronized D1.b b(@N D1.a aVar) {
        this.f36025k.add(aVar);
        return new b(aVar);
    }

    @Override // com.google.firebase.installations.j
    @N
    public AbstractC1770k<Void> c() {
        return C1773n.d(this.f36022h, new Callable() { // from class: com.google.firebase.installations.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void l4;
                l4 = i.this.l();
                return l4;
            }
        });
    }

    @Override // com.google.firebase.installations.j
    @N
    public AbstractC1770k<String> getId() {
        C();
        String r4 = r();
        if (r4 != null) {
            return C1773n.g(r4);
        }
        AbstractC1770k<String> j4 = j();
        this.f36022h.execute(new Runnable() { // from class: com.google.firebase.installations.f
            @Override // java.lang.Runnable
            public final void run() {
                i.this.A();
            }
        });
        return j4;
    }

    @P
    String p() {
        return this.f36015a.s().i();
    }

    @i0
    String q() {
        return this.f36015a.s().j();
    }

    @i0
    String v() {
        return this.f36015a.r();
    }

    @P
    String x() {
        return this.f36015a.s().n();
    }

    i(ExecutorService executorService, com.google.firebase.e eVar, com.google.firebase.installations.remote.c cVar, PersistedInstallation persistedInstallation, r rVar, com.google.firebase.installations.local.b bVar, p pVar) {
        this.f36021g = new Object();
        this.f36025k = new HashSet();
        this.f36026l = new ArrayList();
        this.f36015a = eVar;
        this.f36016b = cVar;
        this.f36017c = persistedInstallation;
        this.f36018d = rVar;
        this.f36019e = bVar;
        this.f36020f = pVar;
        this.f36022h = executorService;
        this.f36023i = new ThreadPoolExecutor(0, 1, f36009r, TimeUnit.SECONDS, new LinkedBlockingQueue(), f36010s);
    }
}
