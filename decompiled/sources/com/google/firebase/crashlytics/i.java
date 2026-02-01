package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.firebase.crashlytics.internal.common.C1793a;
import com.google.firebase.crashlytics.internal.common.C1799g;
import com.google.firebase.crashlytics.internal.common.C1806n;
import com.google.firebase.crashlytics.internal.common.C1812u;
import com.google.firebase.crashlytics.internal.common.C1813v;
import com.google.firebase.crashlytics.internal.common.x;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import s1.C2408a;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    static final String f34971b = "clx";

    /* renamed from: c, reason: collision with root package name */
    static final String f34972c = "crash";

    /* renamed from: d, reason: collision with root package name */
    static final int f34973d = 500;

    /* renamed from: a, reason: collision with root package name */
    @i0
    final C1806n f34974a;

    /* loaded from: classes2.dex */
    class a implements InterfaceC1762c<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC1762c
        public Object a(@N AbstractC1770k<Void> abstractC1770k) throws Exception {
            if (!abstractC1770k.v()) {
                com.google.firebase.crashlytics.internal.f.f().e("Error fetching settings.", abstractC1770k.q());
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34975a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1806n f34976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.c f34977c;

        b(boolean z3, C1806n c1806n, com.google.firebase.crashlytics.internal.settings.c cVar) {
            this.f34975a = z3;
            this.f34976b = c1806n;
            this.f34977c = cVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (this.f34975a) {
                this.f34976b.j(this.f34977c);
                return null;
            }
            return null;
        }
    }

    private i(@N C1806n c1806n) {
        this.f34974a = c1806n;
    }

    @N
    public static i d() {
        i iVar = (i) com.google.firebase.e.p().l(i.class);
        if (iVar != null) {
            return iVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static i e(@N com.google.firebase.e eVar, @N com.google.firebase.installations.j jVar, @N C1.a<com.google.firebase.crashlytics.internal.a> aVar, @N C1.a<com.google.firebase.analytics.connector.a> aVar2) {
        Context n4 = eVar.n();
        String packageName = n4.getPackageName();
        com.google.firebase.crashlytics.internal.f.f().g("Initializing Firebase Crashlytics " + C1806n.m() + " for " + packageName);
        C1812u c1812u = new C1812u(eVar);
        x xVar = new x(n4, packageName, jVar, c1812u);
        com.google.firebase.crashlytics.internal.e eVar2 = new com.google.firebase.crashlytics.internal.e(aVar);
        d dVar = new d(aVar2);
        C1806n c1806n = new C1806n(eVar, xVar, eVar2, c1812u, dVar.e(), dVar.d(), C1813v.c("Crashlytics Exception Handler"));
        String j4 = eVar.s().j();
        String o4 = C1799g.o(n4);
        com.google.firebase.crashlytics.internal.f.f().b("Mapping file ID is: " + o4);
        try {
            C1793a a4 = C1793a.a(n4, xVar, j4, o4, new C2408a(n4));
            com.google.firebase.crashlytics.internal.f.f().k("Installer package name is: " + a4.f35030c);
            ExecutorService c4 = C1813v.c("com.google.firebase.crashlytics.startup");
            com.google.firebase.crashlytics.internal.settings.c l4 = com.google.firebase.crashlytics.internal.settings.c.l(n4, j4, xVar, new p1.b(), a4.f35032e, a4.f35033f, c1812u);
            l4.p(c4).n(c4, new a());
            C1773n.d(c4, new b(c1806n.s(a4, l4), c1806n, l4));
            return new i(c1806n);
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Error retrieving app package info.", e4);
            return null;
        }
    }

    @N
    public AbstractC1770k<Boolean> a() {
        return this.f34974a.e();
    }

    public void b() {
        this.f34974a.f();
    }

    public boolean c() {
        return this.f34974a.g();
    }

    public void f(@N String str) {
        this.f34974a.o(str);
    }

    public void g(@N Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.f.f().m("A null value was passed to recordException. Ignoring.");
        } else {
            this.f34974a.p(th);
        }
    }

    public void h() {
        this.f34974a.t();
    }

    public void i(@P Boolean bool) {
        this.f34974a.u(bool);
    }

    public void j(boolean z3) {
        this.f34974a.u(Boolean.valueOf(z3));
    }

    public void k(@N String str, double d4) {
        this.f34974a.v(str, Double.toString(d4));
    }

    public void l(@N String str, float f4) {
        this.f34974a.v(str, Float.toString(f4));
    }

    public void m(@N String str, int i4) {
        this.f34974a.v(str, Integer.toString(i4));
    }

    public void n(@N String str, long j4) {
        this.f34974a.v(str, Long.toString(j4));
    }

    public void o(@N String str, @N String str2) {
        this.f34974a.v(str, str2);
    }

    public void p(@N String str, boolean z3) {
        this.f34974a.v(str, Boolean.toString(z3));
    }

    public void q(@N h hVar) {
        this.f34974a.w(hVar.f34969a);
    }

    public void r(@N String str) {
        this.f34974a.y(str);
    }
}
