package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.internal.C2306m;

@kotlin.U
/* loaded from: classes2.dex */
public class r<T> extends AbstractC2291h0<T> implements InterfaceC2333q<T>, kotlin.coroutines.jvm.internal.c {

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54548K = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decision");

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54549L = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<T> f54550H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f54551I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private InterfaceC2328n0 f54552J;

    @l3.d
    private volatile /* synthetic */ int _decision;

    @l3.d
    private volatile /* synthetic */ Object _state;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@l3.d kotlin.coroutines.c<? super T> cVar, int i4) {
        super(i4);
        this.f54550H = cVar;
        this.f54551I = cVar.e();
        this._decision = 0;
        this._state = C2268d.f53367E;
    }

    private final String B() {
        Object A3 = A();
        if (A3 instanceof InterfaceC2236a1) {
            return "Active";
        }
        if (A3 instanceof C2340u) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final InterfaceC2328n0 C() {
        L0 l02 = (L0) e().a(L0.f52941w);
        if (l02 == null) {
            return null;
        }
        InterfaceC2328n0 f4 = L0.a.f(l02, true, false, new C2342v(this), 2, null);
        this.f54552J = f4;
        return f4;
    }

    private final boolean D() {
        if (C2293i0.d(this.f54395G) && ((C2306m) this.f54550H).s()) {
            return true;
        }
        return false;
    }

    private final AbstractC2329o E(X2.l<? super Throwable, kotlin.H0> lVar) {
        if (lVar instanceof AbstractC2329o) {
            return (AbstractC2329o) lVar;
        }
        return new I0(lVar);
    }

    private final void F(X2.l<? super Throwable, kotlin.H0> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void J() {
        C2306m c2306m;
        Throwable A3;
        kotlin.coroutines.c<T> cVar = this.f54550H;
        if (cVar instanceof C2306m) {
            c2306m = (C2306m) cVar;
        } else {
            c2306m = null;
        }
        if (c2306m != null && (A3 = c2306m.A(this)) != null) {
            t();
            d(A3);
        }
    }

    private final void N(Object obj, int i4, X2.l<? super Throwable, kotlin.H0> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof InterfaceC2236a1) {
            } else {
                if (obj2 instanceof C2340u) {
                    C2340u c2340u = (C2340u) obj2;
                    if (c2340u.c()) {
                        if (lVar != null) {
                            r(lVar, c2340u.f52925a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f54549L, this, obj2, R((InterfaceC2236a1) obj2, obj, i4, lVar, null)));
        v();
        w(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void P(r rVar, Object obj, int i4, X2.l lVar, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 4) != 0) {
                lVar = null;
            }
            rVar.N(obj, i4, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object R(InterfaceC2236a1 interfaceC2236a1, Object obj, int i4, X2.l<? super Throwable, kotlin.H0> lVar, Object obj2) {
        AbstractC2329o abstractC2329o;
        if (!(obj instanceof E)) {
            if (C2293i0.c(i4) || obj2 != null) {
                if (lVar != null || (((interfaceC2236a1 instanceof AbstractC2329o) && !(interfaceC2236a1 instanceof AbstractC2288g)) || obj2 != null)) {
                    if (interfaceC2236a1 instanceof AbstractC2329o) {
                        abstractC2329o = (AbstractC2329o) interfaceC2236a1;
                    } else {
                        abstractC2329o = null;
                    }
                    return new D(obj, abstractC2329o, lVar, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean S() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f54548K.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.S U(Object obj, Object obj2, X2.l<? super Throwable, kotlin.H0> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof InterfaceC2236a1) {
            } else {
                if (!(obj3 instanceof D) || obj2 == null || ((D) obj3).f52921d != obj2) {
                    return null;
                }
                return C2336s.f54561d;
            }
        } while (!androidx.concurrent.futures.b.a(f54549L, this, obj3, R((InterfaceC2236a1) obj3, obj, this.f54395G, lVar, obj2)));
        v();
        return C2336s.f54561d;
    }

    private final boolean V() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f54548K.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void l(X2.l<? super Throwable, kotlin.H0> lVar, Throwable th) {
        try {
            lVar.C(th);
        } catch (Throwable th2) {
            Q.b(e(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void p(X2.a<kotlin.H0> aVar) {
        try {
            aVar.n();
        } catch (Throwable th) {
            Q.b(e(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final boolean s(Throwable th) {
        if (!D()) {
            return false;
        }
        return ((C2306m) this.f54550H).t(th);
    }

    private final void v() {
        if (!D()) {
            t();
        }
    }

    private final void w(int i4) {
        if (S()) {
            return;
        }
        C2293i0.a(this, i4);
    }

    @l3.e
    public final Object A() {
        return this._state;
    }

    @l3.d
    protected String G() {
        return "CancellableContinuation";
    }

    public final void H(@l3.d Throwable th) {
        if (s(th)) {
            return;
        }
        d(th);
        v();
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @W2.i(name = "resetStateReusable")
    public final boolean K() {
        Object obj = this._state;
        if ((obj instanceof D) && ((D) obj).f52921d != null) {
            t();
            return false;
        }
        this._decision = 0;
        this._state = C2268d.f53367E;
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    @l3.e
    public Object L(@l3.d Throwable th) {
        return U(new E(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void M(T t3, @l3.e X2.l<? super Throwable, kotlin.H0> lVar) {
        N(t3, this.f54395G, lVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void O(@l3.d N n4, @l3.d Throwable th) {
        C2306m c2306m;
        int i4;
        kotlin.coroutines.c<T> cVar = this.f54550H;
        N n5 = null;
        if (cVar instanceof C2306m) {
            c2306m = (C2306m) cVar;
        } else {
            c2306m = null;
        }
        E e4 = new E(th, false, 2, null);
        if (c2306m != null) {
            n5 = c2306m.f54493H;
        }
        if (n5 == n4) {
            i4 = 4;
        } else {
            i4 = this.f54395G;
        }
        P(this, e4, i4, null, 4, null);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void Q(@l3.d N n4, T t3) {
        C2306m c2306m;
        int i4;
        kotlin.coroutines.c<T> cVar = this.f54550H;
        N n5 = null;
        if (cVar instanceof C2306m) {
            c2306m = (C2306m) cVar;
        } else {
            c2306m = null;
        }
        if (c2306m != null) {
            n5 = c2306m.f54493H;
        }
        if (n5 == n4) {
            i4 = 4;
        } else {
            i4 = this.f54395G;
        }
        P(this, t3, i4, null, 4, null);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void T() {
        InterfaceC2328n0 C3 = C();
        if (C3 != null && m()) {
            C3.f();
            this.f54552J = Z0.f53009E;
        }
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    public void b(@l3.e Object obj, @l3.d Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC2236a1)) {
                if (obj2 instanceof E) {
                    return;
                }
                if (obj2 instanceof D) {
                    D d4 = (D) obj2;
                    if (!d4.h()) {
                        if (androidx.concurrent.futures.b.a(f54549L, this, obj2, D.g(d4, null, null, null, null, th, 15, null))) {
                            d4.i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.b.a(f54549L, this, obj2, new D(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public boolean c() {
        return A() instanceof InterfaceC2236a1;
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public boolean d(@l3.e Throwable th) {
        Object obj;
        boolean z3;
        AbstractC2329o abstractC2329o;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC2236a1)) {
                return false;
            }
            z3 = obj instanceof AbstractC2329o;
        } while (!androidx.concurrent.futures.b.a(f54549L, this, obj, new C2340u(this, th, z3)));
        if (z3) {
            abstractC2329o = (AbstractC2329o) obj;
        } else {
            abstractC2329o = null;
        }
        if (abstractC2329o != null) {
            n(abstractC2329o, th);
        }
        v();
        w(this.f54395G);
        return true;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return this.f54551I;
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    @l3.d
    public final kotlin.coroutines.c<T> f() {
        return this.f54550H;
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    @l3.e
    public Throwable g(@l3.e Object obj) {
        Throwable g4 = super.g(obj);
        if (g4 == null) {
            return null;
        }
        return g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC2291h0
    public <T> T h(@l3.e Object obj) {
        if (obj instanceof D) {
            return (T) ((D) obj).f52918a;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public boolean isCancelled() {
        return A() instanceof C2340u;
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    @l3.e
    public Object j() {
        return A();
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    @l3.e
    public Object j0(T t3, @l3.e Object obj, @l3.e X2.l<? super Throwable, kotlin.H0> lVar) {
        return U(t3, obj, lVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public boolean m() {
        return !(A() instanceof InterfaceC2236a1);
    }

    public final void n(@l3.d AbstractC2329o abstractC2329o, @l3.e Throwable th) {
        try {
            abstractC2329o.c(th);
        } catch (Throwable th2) {
            Q.b(e(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    @l3.e
    public Object o(T t3, @l3.e Object obj) {
        return U(t3, obj, null);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<T> cVar = this.f54550H;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    public final void r(@l3.d X2.l<? super Throwable, kotlin.H0> lVar, @l3.d Throwable th) {
        try {
            lVar.C(th);
        } catch (Throwable th2) {
            Q.b(e(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void t() {
        InterfaceC2328n0 interfaceC2328n0 = this.f54552J;
        if (interfaceC2328n0 == null) {
            return;
        }
        interfaceC2328n0.f();
        this.f54552J = Z0.f53009E;
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void t0(@l3.d Object obj) {
        w(this.f54395G);
    }

    @l3.d
    public String toString() {
        return G() + '(' + X.c(this.f54550H) + "){" + B() + "}@" + X.b(this);
    }

    @Override // kotlinx.coroutines.InterfaceC2333q
    public void u(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        AbstractC2329o E3 = E(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C2268d) {
                if (androidx.concurrent.futures.b.a(f54549L, this, obj, E3)) {
                    return;
                }
            } else if (obj instanceof AbstractC2329o) {
                F(lVar, obj);
            } else {
                boolean z3 = obj instanceof E;
                if (z3) {
                    E e4 = (E) obj;
                    if (!e4.b()) {
                        F(lVar, obj);
                    }
                    if (obj instanceof C2340u) {
                        Throwable th = null;
                        if (!z3) {
                            e4 = null;
                        }
                        if (e4 != null) {
                            th = e4.f52925a;
                        }
                        l(lVar, th);
                        return;
                    }
                    return;
                }
                if (obj instanceof D) {
                    D d4 = (D) obj;
                    if (d4.f52919b != null) {
                        F(lVar, obj);
                    }
                    if (E3 instanceof AbstractC2288g) {
                        return;
                    }
                    if (d4.h()) {
                        l(lVar, d4.f52922e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f54549L, this, obj, D.g(d4, null, E3, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (E3 instanceof AbstractC2288g) {
                        return;
                    }
                    if (androidx.concurrent.futures.b.a(f54549L, this, obj, new D(obj, E3, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        P(this, J.c(obj, this), this.f54395G, null, 4, null);
    }

    @l3.d
    public Throwable y(@l3.d L0 l02) {
        return l02.a0();
    }

    @l3.e
    @kotlin.U
    public final Object z() {
        L0 l02;
        Object l4;
        boolean D3 = D();
        if (V()) {
            if (this.f54552J == null) {
                C();
            }
            if (D3) {
                J();
            }
            l4 = kotlin.coroutines.intrinsics.b.l();
            return l4;
        }
        if (D3) {
            J();
        }
        Object A3 = A();
        if (!(A3 instanceof E)) {
            if (C2293i0.c(this.f54395G) && (l02 = (L0) e().a(L0.f52941w)) != null && !l02.c()) {
                CancellationException a02 = l02.a0();
                b(A3, a02);
                throw a02;
            }
            return h(A3);
        }
        throw ((E) A3).f52925a;
    }
}
