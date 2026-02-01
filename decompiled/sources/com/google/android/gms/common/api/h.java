package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.j0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.d;
import com.google.android.gms.common.api.internal.AbstractC1216t;
import com.google.android.gms.common.api.internal.B0;
import com.google.android.gms.common.api.internal.BinderC1171a1;
import com.google.android.gms.common.api.internal.C1172b;
import com.google.android.gms.common.api.internal.C1175c;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.C1193i;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.api.internal.C1207o;
import com.google.android.gms.common.api.internal.C1218u;
import com.google.android.gms.common.api.internal.C1223w0;
import com.google.android.gms.common.api.internal.I;
import com.google.android.gms.common.api.internal.InterfaceC1226y;
import com.google.android.gms.common.api.internal.ServiceConnectionC1209p;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@I0.a
/* loaded from: classes.dex */
public abstract class h<O extends C1164a.d> implements j<O> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28076a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f28077b;

    /* renamed from: c, reason: collision with root package name */
    private final C1164a<O> f28078c;

    /* renamed from: d, reason: collision with root package name */
    private final O f28079d;

    /* renamed from: e, reason: collision with root package name */
    private final C1175c<O> f28080e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f28081f;

    /* renamed from: g, reason: collision with root package name */
    private final int f28082g;

    /* renamed from: h, reason: collision with root package name */
    @NotOnlyInitialized
    private final i f28083h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1226y f28084i;

    /* renamed from: j, reason: collision with root package name */
    @N
    protected final C1193i f28085j;

    @I0.a
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        @I0.a
        @N
        public static final a f28086c = new C0268a().a();

        /* renamed from: a, reason: collision with root package name */
        @N
        public final InterfaceC1226y f28087a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final Looper f28088b;

        @I0.a
        /* renamed from: com.google.android.gms.common.api.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0268a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC1226y f28089a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f28090b;

            @I0.a
            public C0268a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @I0.a
            @N
            public a a() {
                if (this.f28089a == null) {
                    this.f28089a = new C1172b();
                }
                if (this.f28090b == null) {
                    this.f28090b = Looper.getMainLooper();
                }
                return new a(this.f28089a, this.f28090b);
            }

            @I0.a
            @N
            public C0268a b(@N Looper looper) {
                C1285y.m(looper, "Looper must not be null.");
                this.f28090b = looper;
                return this;
            }

            @I0.a
            @N
            public C0268a c(@N InterfaceC1226y interfaceC1226y) {
                C1285y.m(interfaceC1226y, "StatusExceptionMapper must not be null.");
                this.f28089a = interfaceC1226y;
                return this;
            }
        }

        @I0.a
        private a(InterfaceC1226y interfaceC1226y, Account account, Looper looper) {
            this.f28087a = interfaceC1226y;
            this.f28088b = looper;
        }
    }

    @I0.a
    @K
    public h(@N Activity activity, @N C1164a<O> c1164a, @N O o4, @N a aVar) {
        this(activity, activity, c1164a, o4, aVar);
    }

    private final <A extends C1164a.b, T extends C1181e.a<? extends q, A>> T y(int i4, @N T t3) {
        t3.zak();
        this.f28085j.J(this, i4, t3);
        return t3;
    }

    private final <TResult, A extends C1164a.b> AbstractC1770k<TResult> z(int i4, @N com.google.android.gms.common.api.internal.A<A, TResult> a4) {
        C1771l c1771l = new C1771l();
        this.f28085j.K(this, i4, a4, c1771l, this.f28084i);
        return c1771l.a();
    }

    @Override // com.google.android.gms.common.api.j
    @N
    public final C1175c<O> b() {
        return this.f28080e;
    }

    @I0.a
    @N
    public i c() {
        return this.f28083h;
    }

    @I0.a
    @N
    protected C1250g.a d() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount v3;
        C1250g.a aVar = new C1250g.a();
        O o4 = this.f28079d;
        if ((o4 instanceof C1164a.d.b) && (v3 = ((C1164a.d.b) o4).v()) != null) {
            account = v3.z();
        } else {
            O o5 = this.f28079d;
            if (o5 instanceof C1164a.d.InterfaceC0266a) {
                account = ((C1164a.d.InterfaceC0266a) o5).z();
            } else {
                account = null;
            }
        }
        aVar.d(account);
        O o6 = this.f28079d;
        if (o6 instanceof C1164a.d.b) {
            GoogleSignInAccount v4 = ((C1164a.d.b) o6).v();
            if (v4 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = v4.M0();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        aVar.c(emptySet);
        aVar.e(this.f28076a.getClass().getName());
        aVar.b(this.f28076a.getPackageName());
        return aVar;
    }

    @I0.a
    @N
    protected AbstractC1770k<Boolean> e() {
        return this.f28085j.C(this);
    }

    @I0.a
    @N
    public <A extends C1164a.b, T extends C1181e.a<? extends q, A>> T f(@N T t3) {
        y(2, t3);
        return t3;
    }

    @I0.a
    @N
    public <TResult, A extends C1164a.b> AbstractC1770k<TResult> g(@N com.google.android.gms.common.api.internal.A<A, TResult> a4) {
        return z(2, a4);
    }

    @I0.a
    @N
    public <A extends C1164a.b, T extends C1181e.a<? extends q, A>> T h(@N T t3) {
        y(0, t3);
        return t3;
    }

    @I0.a
    @N
    public <TResult, A extends C1164a.b> AbstractC1770k<TResult> i(@N com.google.android.gms.common.api.internal.A<A, TResult> a4) {
        return z(0, a4);
    }

    @I0.a
    @N
    @Deprecated
    public <A extends C1164a.b, T extends AbstractC1216t<A, ?>, U extends com.google.android.gms.common.api.internal.C<A, ?>> AbstractC1770k<Void> j(@N T t3, @N U u3) {
        C1285y.l(t3);
        C1285y.l(u3);
        C1285y.m(t3.b(), "Listener has already been released.");
        C1285y.m(u3.a(), "Listener has already been released.");
        C1285y.b(C1281w.b(t3.b(), u3.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f28085j.D(this, t3, u3, new Runnable() { // from class: com.google.android.gms.common.api.y
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @I0.a
    @N
    public <A extends C1164a.b> AbstractC1770k<Void> k(@N C1218u<A, ?> c1218u) {
        C1285y.l(c1218u);
        C1285y.m(c1218u.f28416a.b(), "Listener has already been released.");
        C1285y.m(c1218u.f28417b.a(), "Listener has already been released.");
        return this.f28085j.D(this, c1218u.f28416a, c1218u.f28417b, c1218u.f28418c);
    }

    @I0.a
    @N
    public AbstractC1770k<Boolean> l(@N C1205n.a<?> aVar) {
        return m(aVar, 0);
    }

    @I0.a
    @N
    public AbstractC1770k<Boolean> m(@N C1205n.a<?> aVar, int i4) {
        C1285y.m(aVar, "Listener key cannot be null.");
        return this.f28085j.E(this, aVar, i4);
    }

    @I0.a
    @N
    public <A extends C1164a.b, T extends C1181e.a<? extends q, A>> T n(@N T t3) {
        y(1, t3);
        return t3;
    }

    @I0.a
    @N
    public <TResult, A extends C1164a.b> AbstractC1770k<TResult> o(@N com.google.android.gms.common.api.internal.A<A, TResult> a4) {
        return z(1, a4);
    }

    @I0.a
    @N
    public O p() {
        return this.f28079d;
    }

    @I0.a
    @N
    public Context q() {
        return this.f28076a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @P
    @I0.a
    public String r() {
        return this.f28077b;
    }

    @P
    @I0.a
    @Deprecated
    protected String s() {
        return this.f28077b;
    }

    @I0.a
    @N
    public Looper t() {
        return this.f28081f;
    }

    @I0.a
    @N
    public <L> C1205n<L> u(@N L l4, @N String str) {
        return C1207o.a(l4, this.f28081f, str);
    }

    public final int v() {
        return this.f28082g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j0
    public final C1164a.f w(Looper looper, C1223w0<O> c1223w0) {
        C1164a.f c4 = ((C1164a.AbstractC0265a) C1285y.l(this.f28078c.a())).c(this.f28076a, looper, d().a(), this.f28079d, c1223w0, c1223w0);
        String r4 = r();
        if (r4 != null && (c4 instanceof AbstractC1246e)) {
            ((AbstractC1246e) c4).X(r4);
        }
        if (r4 != null && (c4 instanceof ServiceConnectionC1209p)) {
            ((ServiceConnectionC1209p) c4).B(r4);
        }
        return c4;
    }

    public final BinderC1171a1 x(Context context, Handler handler) {
        return new BinderC1171a1(context, handler, d().a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@androidx.annotation.N android.app.Activity r2, @androidx.annotation.N com.google.android.gms.common.api.C1164a<O> r3, @androidx.annotation.N O r4, @androidx.annotation.N com.google.android.gms.common.api.internal.InterfaceC1226y r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.h$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.h.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.y):void");
    }

    private h(@N Context context, @P Activity activity, C1164a<O> c1164a, O o4, a aVar) {
        C1285y.m(context, "Null context is not permitted.");
        C1285y.m(c1164a, "Api must not be null.");
        C1285y.m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f28076a = context.getApplicationContext();
        String str = null;
        if (com.google.android.gms.common.util.v.q()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f28077b = str;
        this.f28078c = c1164a;
        this.f28079d = o4;
        this.f28081f = aVar.f28088b;
        C1175c<O> a4 = C1175c.a(c1164a, o4, str);
        this.f28080e = a4;
        this.f28083h = new B0(this);
        C1193i z3 = C1193i.z(this.f28076a);
        this.f28085j = z3;
        this.f28082g = z3.n();
        this.f28084i = aVar.f28087a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            I.v(activity, z3, a4);
        }
        z3.c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@androidx.annotation.N android.content.Context r2, @androidx.annotation.N com.google.android.gms.common.api.C1164a<O> r3, @androidx.annotation.N O r4, @androidx.annotation.N android.os.Looper r5, @androidx.annotation.N com.google.android.gms.common.api.internal.InterfaceC1226y r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.b(r5)
            r0.c(r6)
            com.google.android.gms.common.api.h$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.h.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.y):void");
    }

    @I0.a
    public h(@N Context context, @N C1164a<O> c1164a, @N O o4, @N a aVar) {
        this(context, (Activity) null, c1164a, o4, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@androidx.annotation.N android.content.Context r2, @androidx.annotation.N com.google.android.gms.common.api.C1164a<O> r3, @androidx.annotation.N O r4, @androidx.annotation.N com.google.android.gms.common.api.internal.InterfaceC1226y r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.h$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.h.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.y):void");
    }
}
