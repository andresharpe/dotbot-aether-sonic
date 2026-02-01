package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.crashlytics.internal.log.b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o1.InterfaceC2379a;
import o1.InterfaceC2380b;
import r1.C2402a;
import r1.C2404c;

/* renamed from: com.google.firebase.crashlytics.internal.common.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1806n {

    /* renamed from: o, reason: collision with root package name */
    private static final String f35136o = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";

    /* renamed from: p, reason: collision with root package name */
    static final int f35137p = 1024;

    /* renamed from: q, reason: collision with root package name */
    static final int f35138q = 10;

    /* renamed from: r, reason: collision with root package name */
    static final String f35139r = "com.crashlytics.RequireBuildId";

    /* renamed from: s, reason: collision with root package name */
    static final boolean f35140s = true;

    /* renamed from: t, reason: collision with root package name */
    static final int f35141t = 4;

    /* renamed from: u, reason: collision with root package name */
    private static final String f35142u = "initialization_marker";

    /* renamed from: v, reason: collision with root package name */
    static final String f35143v = "crash_marker";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35144a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.e f35145b;

    /* renamed from: c, reason: collision with root package name */
    private final C1812u f35146c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35147d = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private C1807o f35148e;

    /* renamed from: f, reason: collision with root package name */
    private C1807o f35149f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35150g;

    /* renamed from: h, reason: collision with root package name */
    private C1804l f35151h;

    /* renamed from: i, reason: collision with root package name */
    private final x f35152i;

    /* renamed from: j, reason: collision with root package name */
    @i0
    public final InterfaceC2380b f35153j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f35154k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f35155l;

    /* renamed from: m, reason: collision with root package name */
    private final C1800h f35156m;

    /* renamed from: n, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f35157n;

    /* renamed from: com.google.firebase.crashlytics.internal.common.n$a */
    /* loaded from: classes2.dex */
    class a implements Callable<AbstractC1770k<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.d f35158a;

        a(com.google.firebase.crashlytics.internal.settings.d dVar) {
            this.f35158a = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1770k<Void> call() throws Exception {
            return C1806n.this.i(this.f35158a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.n$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.d f35160E;

        b(com.google.firebase.crashlytics.internal.settings.d dVar) {
            this.f35160E = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1806n.this.i(this.f35160E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.n$c */
    /* loaded from: classes2.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean d4 = C1806n.this.f35148e.d();
                if (!d4) {
                    com.google.firebase.crashlytics.internal.f.f().m("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d4);
            } catch (Exception e4) {
                com.google.firebase.crashlytics.internal.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e4);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.n$d */
    /* loaded from: classes2.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C1806n.this.f35151h.v());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.n$e */
    /* loaded from: classes2.dex */
    private static final class e implements b.InterfaceC0312b {

        /* renamed from: b, reason: collision with root package name */
        private static final String f35164b = "log-files";

        /* renamed from: a, reason: collision with root package name */
        private final com.google.firebase.crashlytics.internal.persistence.h f35165a;

        public e(com.google.firebase.crashlytics.internal.persistence.h hVar) {
            this.f35165a = hVar;
        }

        @Override // com.google.firebase.crashlytics.internal.log.b.InterfaceC0312b
        public File a() {
            File file = new File(this.f35165a.b(), f35164b);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public C1806n(com.google.firebase.e eVar, x xVar, com.google.firebase.crashlytics.internal.a aVar, C1812u c1812u, InterfaceC2380b interfaceC2380b, com.google.firebase.crashlytics.internal.analytics.a aVar2, ExecutorService executorService) {
        this.f35145b = eVar;
        this.f35146c = c1812u;
        this.f35144a = eVar.n();
        this.f35152i = xVar;
        this.f35157n = aVar;
        this.f35153j = interfaceC2380b;
        this.f35154k = aVar2;
        this.f35155l = executorService;
        this.f35156m = new C1800h(executorService);
    }

    private void d() {
        try {
            this.f35150g = Boolean.TRUE.equals((Boolean) V.b(this.f35156m.h(new d())));
        } catch (Exception unused) {
            this.f35150g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1770k<Void> i(com.google.firebase.crashlytics.internal.settings.d dVar) {
        r();
        try {
            this.f35153j.a(new InterfaceC2379a() { // from class: com.google.firebase.crashlytics.internal.common.m
                @Override // o1.InterfaceC2379a
                public final void a(String str) {
                    C1806n.this.o(str);
                }
            });
            if (!dVar.b().a().f57347a) {
                com.google.firebase.crashlytics.internal.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return C1773n.f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f35151h.D(dVar)) {
                com.google.firebase.crashlytics.internal.f.f().m("Previous sessions could not be finalized.");
            }
            return this.f35151h.c0(dVar.a());
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e4);
            return C1773n.f(e4);
        } finally {
            q();
        }
    }

    private void k(com.google.firebase.crashlytics.internal.settings.d dVar) {
        Future<?> submit = this.f35155l.submit(new b(dVar));
        com.google.firebase.crashlytics.internal.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Crashlytics was interrupted during initialization.", e4);
        } catch (ExecutionException e5) {
            com.google.firebase.crashlytics.internal.f.f().e("Crashlytics encountered a problem during initialization.", e5);
        } catch (TimeoutException e6) {
            com.google.firebase.crashlytics.internal.f.f().e("Crashlytics timed out during initialization.", e6);
        }
    }

    public static String m() {
        return com.google.firebase.crashlytics.e.f34961f;
    }

    static boolean n(String str, boolean z3) {
        if (!z3) {
            com.google.firebase.crashlytics.internal.f.f().k("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  | ");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  |");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  |");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".   \\ |  | /");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".    \\    /");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     \\  /");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".      \\/");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, f35136o);
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".      /\\");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     /  \\");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".    /    \\");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".   / |  | \\");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  |");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  |");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".     |  |");
        Log.e(com.google.firebase.crashlytics.internal.f.f35226c, ".");
        return false;
    }

    @androidx.annotation.N
    public AbstractC1770k<Boolean> e() {
        return this.f35151h.p();
    }

    public AbstractC1770k<Void> f() {
        return this.f35151h.u();
    }

    public boolean g() {
        return this.f35150g;
    }

    boolean h() {
        return this.f35148e.c();
    }

    public AbstractC1770k<Void> j(com.google.firebase.crashlytics.internal.settings.d dVar) {
        return V.c(this.f35155l, new a(dVar));
    }

    C1804l l() {
        return this.f35151h;
    }

    public void o(String str) {
        this.f35151h.g0(System.currentTimeMillis() - this.f35147d, str);
    }

    public void p(@androidx.annotation.N Throwable th) {
        this.f35151h.f0(Thread.currentThread(), th);
    }

    void q() {
        this.f35156m.h(new c());
    }

    void r() {
        this.f35156m.b();
        this.f35148e.a();
        com.google.firebase.crashlytics.internal.f.f().k("Initialization marker file was created.");
    }

    public boolean s(C1793a c1793a, com.google.firebase.crashlytics.internal.settings.d dVar) {
        if (n(c1793a.f35029b, C1799g.k(this.f35144a, f35139r, true))) {
            try {
                com.google.firebase.crashlytics.internal.persistence.i iVar = new com.google.firebase.crashlytics.internal.persistence.i(this.f35144a);
                this.f35149f = new C1807o(f35143v, iVar);
                this.f35148e = new C1807o(f35142u, iVar);
                T t3 = new T();
                e eVar = new e(iVar);
                com.google.firebase.crashlytics.internal.log.b bVar = new com.google.firebase.crashlytics.internal.log.b(this.f35144a, eVar);
                this.f35151h = new C1804l(this.f35144a, this.f35156m, this.f35152i, this.f35146c, iVar, this.f35149f, c1793a, t3, bVar, eVar, Q.k(this.f35144a, this.f35152i, iVar, c1793a, bVar, t3, new C2402a(1024, new C2404c(10)), dVar), this.f35157n, this.f35154k);
                boolean h4 = h();
                d();
                this.f35151h.A(Thread.getDefaultUncaughtExceptionHandler(), dVar);
                if (h4 && C1799g.c(this.f35144a)) {
                    com.google.firebase.crashlytics.internal.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    k(dVar);
                    return false;
                }
                com.google.firebase.crashlytics.internal.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e4) {
                com.google.firebase.crashlytics.internal.f.f().e("Crashlytics was not started due to an exception during initialization", e4);
                this.f35151h = null;
                return false;
            }
        }
        throw new IllegalStateException(f35136o);
    }

    public AbstractC1770k<Void> t() {
        return this.f35151h.X();
    }

    public void u(@androidx.annotation.P Boolean bool) {
        this.f35146c.g(bool);
    }

    public void v(String str, String str2) {
        this.f35151h.Y(str, str2);
    }

    public void w(Map<String, String> map) {
        this.f35151h.Z(map);
    }

    public void x(String str, String str2) {
        this.f35151h.a0(str, str2);
    }

    public void y(String str) {
        this.f35151h.b0(str);
    }
}
