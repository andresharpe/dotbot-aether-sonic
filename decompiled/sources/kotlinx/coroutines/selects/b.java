package kotlinx.coroutines.selects;

import X2.l;
import X2.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.H0;
import kotlin.Result;
import kotlin.U;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.E;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.internal.AbstractC2295b;
import kotlinx.coroutines.internal.AbstractC2297d;
import kotlinx.coroutines.internal.C2315w;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.J;
import kotlinx.coroutines.selects.a;

@U
/* loaded from: classes2.dex */
public final class b<R> extends C2315w implements kotlinx.coroutines.selects.a<R>, f<R>, kotlin.coroutines.c<R>, kotlin.coroutines.jvm.internal.c {

    /* renamed from: I, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f54652I = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54653J = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<R> f54654H;

    @l3.d
    volatile /* synthetic */ Object _state = g.f();

    @l3.d
    private volatile /* synthetic */ Object _result = g.c();

    @l3.d
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2297d<Object> {

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final b<?> f54655b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public final AbstractC2295b f54656c;

        /* renamed from: d, reason: collision with root package name */
        private final long f54657d = g.b().a();

        public a(@l3.d b<?> bVar, @l3.d AbstractC2295b abstractC2295b) {
            this.f54655b = bVar;
            this.f54656c = abstractC2295b;
            abstractC2295b.d(this);
        }

        private final void j(Object obj) {
            boolean z3;
            Object f4;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f4 = null;
            } else {
                f4 = g.f();
            }
            if (androidx.concurrent.futures.b.a(b.f54652I, this.f54655b, this, f4) && z3) {
                this.f54655b.c1();
            }
        }

        private final Object k() {
            b<?> bVar = this.f54655b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof J) {
                    ((J) obj).c(this.f54655b);
                } else if (obj == g.f()) {
                    if (androidx.concurrent.futures.b.a(b.f54652I, this.f54655b, g.f(), this)) {
                        return null;
                    }
                } else {
                    return g.d();
                }
            }
        }

        private final void l() {
            androidx.concurrent.futures.b.a(b.f54652I, this.f54655b, this, g.f());
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        public void d(@l3.e Object obj, @l3.e Object obj2) {
            j(obj2);
            this.f54656c.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        public long g() {
            return this.f54657d;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        public Object i(@l3.e Object obj) {
            Object k4;
            if (obj == null && (k4 = k()) != null) {
                return k4;
            }
            try {
                return this.f54656c.c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    l();
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.d
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.selects.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0505b extends C2317y {

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.d
        public final InterfaceC2328n0 f54658H;

        public C0505b(@l3.d InterfaceC2328n0 interfaceC2328n0) {
            this.f54658H = interfaceC2328n0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c extends J {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y.d f54659a;

        public c(@l3.d C2317y.d dVar) {
            this.f54659a = dVar;
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.d
        public AbstractC2297d<?> a() {
            return this.f54659a.a();
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.e
        public Object c(@l3.e Object obj) {
            Object f4;
            if (obj != null) {
                b bVar = (b) obj;
                this.f54659a.d();
                Object e4 = this.f54659a.a().e(null);
                if (e4 == null) {
                    f4 = this.f54659a.f54523c;
                } else {
                    f4 = g.f();
                }
                androidx.concurrent.futures.b.a(b.f54652I, bVar, this, f4);
                return e4;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class d extends M0 {
        public d() {
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            X0(th);
            return H0.f51801a;
        }

        @Override // kotlinx.coroutines.G
        public void X0(@l3.e Throwable th) {
            if (b.this.y()) {
                b.this.e0(Y0().a0());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l f54662F;

        public e(l lVar) {
            this.f54662F = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.y()) {
                j3.a.c(this.f54662F, b.this.R());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l3.d kotlin.coroutines.c<? super R> cVar) {
        this.f54654H = cVar;
    }

    private final void T() {
        L0 l02 = (L0) e().a(L0.f52941w);
        if (l02 == null) {
            return;
        }
        InterfaceC2328n0 f4 = L0.a.f(l02, true, false, new d(), 2, null);
        h1(f4);
        if (J()) {
            f4.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1() {
        InterfaceC2328n0 e12 = e1();
        if (e12 != null) {
            e12.f();
        }
        for (C2317y c2317y = (C2317y) I0(); !F.g(c2317y, this); c2317y = c2317y.J0()) {
            if (c2317y instanceof C0505b) {
                ((C0505b) c2317y).f54658H.f();
            }
        }
    }

    private final void d1(X2.a<? extends Object> aVar, X2.a<H0> aVar2) {
        Object l4;
        Object l5;
        while (true) {
            Object obj = this._result;
            if (obj != g.c()) {
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (obj == l4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54653J;
                    l5 = kotlin.coroutines.intrinsics.b.l();
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l5, g.a())) {
                        aVar2.n();
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else {
                if (androidx.concurrent.futures.b.a(f54653J, this, g.c(), aVar.n())) {
                    return;
                }
            }
        }
    }

    private final InterfaceC2328n0 e1() {
        return (InterfaceC2328n0) this._parentHandle;
    }

    private final void h1(InterfaceC2328n0 interfaceC2328n0) {
        this._parentHandle = interfaceC2328n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void H(@l3.d kotlinx.coroutines.selects.d<? extends Q> dVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        dVar.X(this, pVar);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean J() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (obj instanceof J) {
                ((J) obj).c(this);
            } else {
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.selects.f
    @l3.d
    public kotlin.coroutines.c<R> R() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.a
    public void b0(@l3.d kotlinx.coroutines.selects.c cVar, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        cVar.J(this, lVar);
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return this.f54654H.e();
    }

    @Override // kotlinx.coroutines.selects.f
    public void e0(@l3.d Throwable th) {
        Object l4;
        Object l5;
        kotlin.coroutines.c e4;
        while (true) {
            Object obj = this._result;
            if (obj != g.c()) {
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (obj == l4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54653J;
                    l5 = kotlin.coroutines.intrinsics.b.l();
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l5, g.a())) {
                        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(this.f54654H);
                        Result.a aVar = Result.f51807F;
                        e4.x(Result.b(W.a(th)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else {
                if (androidx.concurrent.futures.b.a(f54653J, this, g.c(), new E(th, false, 2, null))) {
                    return;
                }
            }
        }
    }

    @l3.e
    @U
    public final Object f1() {
        Object l4;
        Object l5;
        if (!J()) {
            T();
        }
        Object obj = this._result;
        if (obj == g.c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54653J;
            Object c4 = g.c();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c4, l4)) {
                l5 = kotlin.coroutines.intrinsics.b.l();
                return l5;
            }
            obj = this._result;
        }
        if (obj != g.a()) {
            if (!(obj instanceof E)) {
                return obj;
            }
            throw ((E) obj).f52925a;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // kotlinx.coroutines.selects.f
    @l3.e
    public Object g0(@l3.d AbstractC2295b abstractC2295b) {
        return new a(this, abstractC2295b).c(null);
    }

    @U
    public final void g1(@l3.d Throwable th) {
        if (y()) {
            Result.a aVar = Result.f51807F;
            x(Result.b(W.a(th)));
        } else if (!(th instanceof CancellationException)) {
            Object f12 = f1();
            if (!(f12 instanceof E) || ((E) f12).f52925a != th) {
                Q.b(e(), th);
            }
        }
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void h(@l3.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        a.C0504a.a(this, eVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void i(@l3.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, P p4, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        eVar.C(this, p4, pVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public void j(long j4, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        if (j4 <= 0) {
            if (y()) {
                j3.b.c(lVar, R());
            }
        } else {
            q0(C2269d0.d(e()).x0(j4, new e(lVar), e()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0030, code lost:
    
        c1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        return kotlinx.coroutines.C2336s.f54561d;
     */
    @Override // kotlinx.coroutines.selects.f
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(@l3.e kotlinx.coroutines.internal.C2317y.d r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.b.f54652I
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            boolean r0 = androidx.concurrent.futures.b.a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.b.f54652I
            java.lang.Object r2 = kotlinx.coroutines.selects.g.f()
            boolean r1 = androidx.concurrent.futures.b.a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.c1()
            kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.C2336s.f54561d
            return r4
        L36:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.J
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            kotlinx.coroutines.internal.d r1 = r4.a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.b.a
            if (r2 == 0) goto L58
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.b.a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f54655b
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            kotlinx.coroutines.internal.J r2 = (kotlinx.coroutines.internal.J) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = kotlinx.coroutines.internal.C2296c.f54475b
            return r4
        L64:
            kotlinx.coroutines.internal.J r0 = (kotlinx.coroutines.internal.J) r0
            r0.c(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            kotlinx.coroutines.internal.y$a r4 = r4.f54523c
            if (r0 != r4) goto L74
            kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.C2336s.f54561d
            return r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.k(kotlinx.coroutines.internal.y$d):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<R> cVar = this.f54654H;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.selects.f
    public void q0(@l3.d InterfaceC2328n0 interfaceC2328n0) {
        C0505b c0505b = new C0505b(interfaceC2328n0);
        if (!J()) {
            x0(c0505b);
            if (!J()) {
                return;
            }
        }
        interfaceC2328n0.f();
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.d
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        Object l4;
        Object l5;
        while (true) {
            Object obj2 = this._result;
            if (obj2 != g.c()) {
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (obj2 == l4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54653J;
                    l5 = kotlin.coroutines.intrinsics.b.l();
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l5, g.a())) {
                        if (Result.i(obj)) {
                            kotlin.coroutines.c<R> cVar = this.f54654H;
                            Throwable e4 = Result.e(obj);
                            F.m(e4);
                            Result.a aVar = Result.f51807F;
                            cVar.x(Result.b(W.a(e4)));
                            return;
                        }
                        this.f54654H.x(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else {
                if (androidx.concurrent.futures.b.a(f54653J, this, g.c(), kotlinx.coroutines.J.d(obj, null, 1, null))) {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean y() {
        Object k4 = k(null);
        if (k4 == C2336s.f54561d) {
            return true;
        }
        if (k4 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + k4).toString());
    }
}
