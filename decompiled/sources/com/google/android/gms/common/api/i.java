package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.fragment.app.ActivityC0889g;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.A1;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.C1195i1;
import com.google.android.gms.common.api.internal.C1200k0;
import com.google.android.gms.common.api.internal.C1201l;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.api.internal.InterfaceC1184f;
import com.google.android.gms.common.api.internal.InterfaceC1211q;
import com.google.android.gms.common.api.internal.InterfaceC1222w;
import com.google.android.gms.common.api.internal.r1;
import com.google.android.gms.common.internal.C1240b;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

@I0.a
@Deprecated
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    @N
    public static final String f28091a = "<<default account>>";

    /* renamed from: b, reason: collision with root package name */
    public static final int f28092b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f28093c = 2;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("sAllClients")
    private static final Set<i> f28094d = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends InterfaceC1184f {

        /* renamed from: g, reason: collision with root package name */
        public static final int f28113g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f28114h = 2;
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c extends InterfaceC1211q {
    }

    public static void k(@N String str, @N FileDescriptor fileDescriptor, @N PrintWriter printWriter, @N String[] strArr) {
        Set<i> set = f28094d;
        synchronized (set) {
            try {
                String concat = String.valueOf(str).concat("  ");
                int i4 = 0;
                for (i iVar : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i4);
                    iVar.j(concat, fileDescriptor, printWriter, strArr);
                    i4++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    @N
    public static Set<i> n() {
        Set<i> set = f28094d;
        synchronized (set) {
        }
        return set;
    }

    public abstract void A();

    public abstract void B(@N b bVar);

    public abstract void C(@N c cVar);

    @I0.a
    @N
    public <L> C1205n<L> D(@N L l4) {
        throw new UnsupportedOperationException();
    }

    public abstract void E(@N ActivityC0889g activityC0889g);

    public abstract void F(@N b bVar);

    public abstract void G(@N c cVar);

    public void H(C1195i1 c1195i1) {
        throw new UnsupportedOperationException();
    }

    public void I(C1195i1 c1195i1) {
        throw new UnsupportedOperationException();
    }

    @N
    public abstract C1231c d();

    @N
    public abstract C1231c e(long j4, @N TimeUnit timeUnit);

    @N
    public abstract l<Status> f();

    public abstract void g();

    public void h(int i4) {
        throw new UnsupportedOperationException();
    }

    public abstract void i();

    public abstract void j(@N String str, @N FileDescriptor fileDescriptor, @N PrintWriter printWriter, @N String[] strArr);

    @I0.a
    @N
    public <A extends C1164a.b, R extends q, T extends C1181e.a<R, A>> T l(@N T t3) {
        throw new UnsupportedOperationException();
    }

    @I0.a
    @N
    public <A extends C1164a.b, T extends C1181e.a<? extends q, A>> T m(@N T t3) {
        throw new UnsupportedOperationException();
    }

    @I0.a
    @N
    public <C extends C1164a.f> C o(@N C1164a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @N
    public abstract C1231c p(@N C1164a<?> c1164a);

    @I0.a
    @N
    public Context q() {
        throw new UnsupportedOperationException();
    }

    @I0.a
    @N
    public Looper r() {
        throw new UnsupportedOperationException();
    }

    @I0.a
    public boolean s(@N C1164a<?> c1164a) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean t(@N C1164a<?> c1164a);

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w(@N b bVar);

    public abstract boolean x(@N c cVar);

    @I0.a
    public boolean y(@N InterfaceC1222w interfaceC1222w) {
        throw new UnsupportedOperationException();
    }

    @I0.a
    public void z() {
        throw new UnsupportedOperationException();
    }

    @I0.a
    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        private Account f28095a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<Scope> f28096b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<Scope> f28097c;

        /* renamed from: d, reason: collision with root package name */
        private int f28098d;

        /* renamed from: e, reason: collision with root package name */
        private View f28099e;

        /* renamed from: f, reason: collision with root package name */
        private String f28100f;

        /* renamed from: g, reason: collision with root package name */
        private String f28101g;

        /* renamed from: h, reason: collision with root package name */
        private final Map<C1164a<?>, com.google.android.gms.common.internal.P> f28102h;

        /* renamed from: i, reason: collision with root package name */
        private final Context f28103i;

        /* renamed from: j, reason: collision with root package name */
        private final Map<C1164a<?>, C1164a.d> f28104j;

        /* renamed from: k, reason: collision with root package name */
        private C1201l f28105k;

        /* renamed from: l, reason: collision with root package name */
        private int f28106l;

        /* renamed from: m, reason: collision with root package name */
        @P
        private c f28107m;

        /* renamed from: n, reason: collision with root package name */
        private Looper f28108n;

        /* renamed from: o, reason: collision with root package name */
        private C1236h f28109o;

        /* renamed from: p, reason: collision with root package name */
        private C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28110p;

        /* renamed from: q, reason: collision with root package name */
        private final ArrayList<b> f28111q;

        /* renamed from: r, reason: collision with root package name */
        private final ArrayList<c> f28112r;

        @I0.a
        public a(@N Context context) {
            this.f28096b = new HashSet();
            this.f28097c = new HashSet();
            this.f28102h = new androidx.collection.a();
            this.f28104j = new androidx.collection.a();
            this.f28106l = -1;
            this.f28109o = C1236h.x();
            this.f28110p = com.google.android.gms.signin.e.f31083c;
            this.f28111q = new ArrayList<>();
            this.f28112r = new ArrayList<>();
            this.f28103i = context;
            this.f28108n = context.getMainLooper();
            this.f28100f = context.getPackageName();
            this.f28101g = context.getClass().getName();
        }

        private final <O extends C1164a.d> void q(C1164a<O> c1164a, @P O o4, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((C1164a.e) C1285y.m(c1164a.c(), "Base client builder must not be null")).a(o4));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f28102h.put(c1164a, new com.google.android.gms.common.internal.P(hashSet));
        }

        @N
        public a a(@N C1164a<? extends C1164a.d.e> c1164a) {
            C1285y.m(c1164a, "Api must not be null");
            this.f28104j.put(c1164a, null);
            List<Scope> a4 = ((C1164a.e) C1285y.m(c1164a.c(), "Base client builder must not be null")).a(null);
            this.f28097c.addAll(a4);
            this.f28096b.addAll(a4);
            return this;
        }

        @N
        public <O extends C1164a.d.c> a b(@N C1164a<O> c1164a, @N O o4) {
            C1285y.m(c1164a, "Api must not be null");
            C1285y.m(o4, "Null options are not permitted for this Api");
            this.f28104j.put(c1164a, o4);
            List<Scope> a4 = ((C1164a.e) C1285y.m(c1164a.c(), "Base client builder must not be null")).a(o4);
            this.f28097c.addAll(a4);
            this.f28096b.addAll(a4);
            return this;
        }

        @N
        public <O extends C1164a.d.c> a c(@N C1164a<O> c1164a, @N O o4, @N Scope... scopeArr) {
            C1285y.m(c1164a, "Api must not be null");
            C1285y.m(o4, "Null options are not permitted for this Api");
            this.f28104j.put(c1164a, o4);
            q(c1164a, o4, scopeArr);
            return this;
        }

        @N
        public <T extends C1164a.d.e> a d(@N C1164a<? extends C1164a.d.e> c1164a, @N Scope... scopeArr) {
            C1285y.m(c1164a, "Api must not be null");
            this.f28104j.put(c1164a, null);
            q(c1164a, null, scopeArr);
            return this;
        }

        @N
        public a e(@N b bVar) {
            C1285y.m(bVar, "Listener must not be null");
            this.f28111q.add(bVar);
            return this;
        }

        @N
        public a f(@N c cVar) {
            C1285y.m(cVar, "Listener must not be null");
            this.f28112r.add(cVar);
            return this;
        }

        @N
        public a g(@N Scope scope) {
            C1285y.m(scope, "Scope must not be null");
            this.f28096b.add(scope);
            return this;
        }

        @N
        public i h() {
            boolean z3;
            C1285y.b(!this.f28104j.isEmpty(), "must call addApi() to add at least one API");
            C1250g p4 = p();
            Map<C1164a<?>, com.google.android.gms.common.internal.P> n4 = p4.n();
            androidx.collection.a aVar = new androidx.collection.a();
            androidx.collection.a aVar2 = new androidx.collection.a();
            ArrayList arrayList = new ArrayList();
            boolean z4 = false;
            C1164a<?> c1164a = null;
            boolean z5 = false;
            for (C1164a<?> c1164a2 : this.f28104j.keySet()) {
                C1164a.d dVar = this.f28104j.get(c1164a2);
                if (n4.get(c1164a2) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVar.put(c1164a2, Boolean.valueOf(z3));
                A1 a12 = new A1(c1164a2, z3);
                arrayList.add(a12);
                C1164a.AbstractC0265a abstractC0265a = (C1164a.AbstractC0265a) C1285y.l(c1164a2.a());
                C1164a.f c4 = abstractC0265a.c(this.f28103i, this.f28108n, p4, dVar, a12, a12);
                aVar2.put(c1164a2.b(), c4);
                if (abstractC0265a.b() == 1) {
                    if (dVar != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                if (c4.g()) {
                    if (c1164a == null) {
                        c1164a = c1164a2;
                    } else {
                        String d4 = c1164a2.d();
                        String d5 = c1164a.d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d4).length() + 21 + String.valueOf(d5).length());
                        sb.append(d4);
                        sb.append(" cannot be used with ");
                        sb.append(d5);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (c1164a != null) {
                if (!z5) {
                    if (this.f28095a == null) {
                        z4 = true;
                    }
                    C1285y.t(z4, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c1164a.d());
                    C1285y.t(this.f28096b.equals(this.f28097c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c1164a.d());
                } else {
                    String d6 = c1164a.d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d6).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d6);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C1200k0 c1200k0 = new C1200k0(this.f28103i, new ReentrantLock(), this.f28108n, p4, this.f28109o, this.f28110p, aVar, this.f28111q, this.f28112r, aVar2, this.f28106l, C1200k0.K(aVar2.values(), true), arrayList);
            synchronized (i.f28094d) {
                i.f28094d.add(c1200k0);
            }
            if (this.f28106l >= 0) {
                r1.u(this.f28105k).v(this.f28106l, c1200k0, this.f28107m);
            }
            return c1200k0;
        }

        @N
        public a i(@N ActivityC0889g activityC0889g, int i4, @P c cVar) {
            boolean z3;
            C1201l c1201l = new C1201l((Activity) activityC0889g);
            if (i4 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.b(z3, "clientId must be non-negative");
            this.f28106l = i4;
            this.f28107m = cVar;
            this.f28105k = c1201l;
            return this;
        }

        @N
        public a j(@N ActivityC0889g activityC0889g, @P c cVar) {
            i(activityC0889g, 0, cVar);
            return this;
        }

        @N
        public a k(@N String str) {
            Account account;
            if (str == null) {
                account = null;
            } else {
                account = new Account(str, C1240b.f28682a);
            }
            this.f28095a = account;
            return this;
        }

        @N
        public a l(int i4) {
            this.f28098d = i4;
            return this;
        }

        @N
        public a m(@N Handler handler) {
            C1285y.m(handler, "Handler must not be null");
            this.f28108n = handler.getLooper();
            return this;
        }

        @N
        public a n(@N View view) {
            C1285y.m(view, "View must not be null");
            this.f28099e = view;
            return this;
        }

        @N
        public a o() {
            k("<<default account>>");
            return this;
        }

        @N
        @com.google.android.gms.common.util.D
        public final C1250g p() {
            com.google.android.gms.signin.a aVar = com.google.android.gms.signin.a.f31071N;
            Map<C1164a<?>, C1164a.d> map = this.f28104j;
            C1164a<com.google.android.gms.signin.a> c1164a = com.google.android.gms.signin.e.f31087g;
            if (map.containsKey(c1164a)) {
                aVar = (com.google.android.gms.signin.a) this.f28104j.get(c1164a);
            }
            return new C1250g(this.f28095a, this.f28096b, this.f28102h, this.f28098d, this.f28099e, this.f28100f, this.f28101g, aVar, false);
        }

        @I0.a
        public a(@N Context context, @N b bVar, @N c cVar) {
            this(context);
            C1285y.m(bVar, "Must provide a connected listener");
            this.f28111q.add(bVar);
            C1285y.m(cVar, "Must provide a connection failed listener");
            this.f28112r.add(cVar);
        }
    }
}
