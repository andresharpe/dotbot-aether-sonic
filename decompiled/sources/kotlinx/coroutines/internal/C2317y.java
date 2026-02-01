package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.G0;

@G0
/* renamed from: kotlinx.coroutines.internal.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2317y {

    /* renamed from: E, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f54513E = AtomicReferenceFieldUpdater.newUpdater(C2317y.class, Object.class, "_next");

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f54514F = AtomicReferenceFieldUpdater.newUpdater(C2317y.class, Object.class, "_prev");

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54515G = AtomicReferenceFieldUpdater.newUpdater(C2317y.class, Object.class, "_removedRef");

    @l3.d
    volatile /* synthetic */ Object _next = this;

    @l3.d
    volatile /* synthetic */ Object _prev = this;

    @l3.d
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.y$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends AbstractC2295b {
        @Override // kotlinx.coroutines.internal.AbstractC2295b
        public final void a(@l3.d AbstractC2297d<?> abstractC2297d, @l3.e Object obj) {
            boolean z3;
            C2317y i4;
            Object obj2;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C2317y h4 = h();
            if (h4 == null || (i4 = i()) == null) {
                return;
            }
            if (z3) {
                obj2 = n(h4, i4);
            } else {
                obj2 = i4;
            }
            if (androidx.concurrent.futures.b.a(C2317y.f54513E, h4, abstractC2297d, obj2) && z3) {
                f(h4, i4);
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC2295b
        @l3.e
        public final Object c(@l3.d AbstractC2297d<?> abstractC2297d) {
            while (true) {
                C2317y m4 = m(abstractC2297d);
                if (m4 == null) {
                    return C2296c.f54475b;
                }
                Object obj = m4._next;
                if (obj == abstractC2297d || abstractC2297d.h()) {
                    return null;
                }
                if (obj instanceof J) {
                    J j4 = (J) obj;
                    if (abstractC2297d.b(j4)) {
                        return C2296c.f54475b;
                    }
                    j4.c(m4);
                } else {
                    Object e4 = e(m4);
                    if (e4 != null) {
                        return e4;
                    }
                    if (l(m4, obj)) {
                        continue;
                    } else {
                        d dVar = new d(m4, (C2317y) obj, this);
                        if (androidx.concurrent.futures.b.a(C2317y.f54513E, m4, obj, dVar)) {
                            try {
                                if (dVar.c(m4) != C2318z.f54528a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.b.a(C2317y.f54513E, m4, dVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @l3.e
        protected Object e(@l3.d C2317y c2317y) {
            return null;
        }

        protected abstract void f(@l3.d C2317y c2317y, @l3.d C2317y c2317y2);

        public abstract void g(@l3.d d dVar);

        @l3.e
        protected abstract C2317y h();

        @l3.e
        protected abstract C2317y i();

        @l3.e
        public Object j(@l3.d d dVar) {
            g(dVar);
            return null;
        }

        public void k(@l3.d C2317y c2317y) {
        }

        protected boolean l(@l3.d C2317y c2317y, @l3.d Object obj) {
            return false;
        }

        @l3.e
        protected C2317y m(@l3.d J j4) {
            C2317y h4 = h();
            kotlin.jvm.internal.F.m(h4);
            return h4;
        }

        @l3.d
        public abstract Object n(@l3.d C2317y c2317y, @l3.d C2317y c2317y2);
    }

    /* renamed from: kotlinx.coroutines.internal.y$b */
    /* loaded from: classes2.dex */
    public static class b<T extends C2317y> extends a {

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f54516d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");

        @l3.d
        private volatile /* synthetic */ Object _affectedNode = null;

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y f54517b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public final T f54518c;

        public b(@l3.d C2317y c2317y, @l3.d T t3) {
            this.f54517b = c2317y;
            this.f54518c = t3;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        protected void f(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
            this.f54518c.H0(this.f54517b);
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        public void g(@l3.d d dVar) {
            androidx.concurrent.futures.b.a(f54516d, this, null, dVar.f54521a);
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected final C2317y h() {
            return (C2317y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.d
        protected final C2317y i() {
            return this.f54517b;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        protected boolean l(@l3.d C2317y c2317y, @l3.d Object obj) {
            if (obj != this.f54517b) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected final C2317y m(@l3.d J j4) {
            return this.f54517b.D0(j4);
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.d
        public Object n(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
            T t3 = this.f54518c;
            androidx.concurrent.futures.b.a(C2317y.f54514F, t3, t3, c2317y);
            T t4 = this.f54518c;
            androidx.concurrent.futures.b.a(C2317y.f54513E, t4, t4, this.f54517b);
            return this.f54518c;
        }
    }

    @kotlin.U
    /* renamed from: kotlinx.coroutines.internal.y$c */
    /* loaded from: classes2.dex */
    public static abstract class c extends AbstractC2297d<C2317y> {

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y f54519b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.e
        public C2317y f54520c;

        public c(@l3.d C2317y c2317y) {
            this.f54519b = c2317y;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@l3.d C2317y c2317y, @l3.e Object obj) {
            boolean z3;
            C2317y c2317y2;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c2317y2 = this.f54519b;
            } else {
                c2317y2 = this.f54520c;
            }
            if (c2317y2 != null && androidx.concurrent.futures.b.a(C2317y.f54513E, c2317y, this, c2317y2) && z3) {
                C2317y c2317y3 = this.f54519b;
                C2317y c2317y4 = this.f54520c;
                kotlin.jvm.internal.F.m(c2317y4);
                c2317y3.H0(c2317y4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$d */
    /* loaded from: classes2.dex */
    public static final class d extends J {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y f54521a;

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y f54522b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.d
        public final a f54523c;

        public d(@l3.d C2317y c2317y, @l3.d C2317y c2317y2, @l3.d a aVar) {
            this.f54521a = c2317y;
            this.f54522b = c2317y2;
            this.f54523c = aVar;
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.d
        public AbstractC2297d<?> a() {
            return this.f54523c.b();
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.e
        public Object c(@l3.e Object obj) {
            Object f4;
            Object obj2;
            if (obj != null) {
                C2317y c2317y = (C2317y) obj;
                Object j4 = this.f54523c.j(this);
                Object obj3 = C2318z.f54528a;
                if (j4 == obj3) {
                    C2317y c2317y2 = this.f54522b;
                    if (androidx.concurrent.futures.b.a(C2317y.f54513E, c2317y, this, c2317y2.U0())) {
                        this.f54523c.k(c2317y);
                        c2317y2.D0(null);
                    }
                    return obj3;
                }
                if (j4 != null) {
                    f4 = a().e(j4);
                } else {
                    f4 = a().f();
                }
                if (f4 == C2296c.f54474a) {
                    obj2 = a();
                } else if (f4 == null) {
                    obj2 = this.f54523c.n(c2317y, this.f54522b);
                } else {
                    obj2 = this.f54522b;
                }
                androidx.concurrent.futures.b.a(C2317y.f54513E, c2317y, this, obj2);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f54523c.g(this);
        }

        @Override // kotlinx.coroutines.internal.J
        @l3.d
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$e */
    /* loaded from: classes2.dex */
    public static class e<T> extends a {

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f54524c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f54525d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");

        @l3.d
        private volatile /* synthetic */ Object _affectedNode = null;

        @l3.d
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C2317y f54526b;

        public e(@l3.d C2317y c2317y) {
            this.f54526b = c2317y;
        }

        public static /* synthetic */ void p() {
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected Object e(@l3.d C2317y c2317y) {
            if (c2317y == this.f54526b) {
                return C2316x.d();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        protected final void f(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
            c2317y2.D0(null);
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        public void g(@l3.d d dVar) {
            androidx.concurrent.futures.b.a(f54524c, this, null, dVar.f54521a);
            androidx.concurrent.futures.b.a(f54525d, this, null, dVar.f54522b);
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected final C2317y h() {
            return (C2317y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected final C2317y i() {
            return (C2317y) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        protected final boolean l(@l3.d C2317y c2317y, @l3.d Object obj) {
            if (!(obj instanceof L)) {
                return false;
            }
            ((L) obj).f54447a.M0();
            return true;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected final C2317y m(@l3.d J j4) {
            C2317y c2317y = this.f54526b;
            while (true) {
                Object obj = c2317y._next;
                if (obj instanceof J) {
                    J j5 = (J) obj;
                    if (j4.b(j5)) {
                        return null;
                    }
                    j5.c(this.f54526b);
                } else {
                    return (C2317y) obj;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.d
        public final Object n(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
            return c2317y2.U0();
        }

        public final T o() {
            T t3 = (T) h();
            kotlin.jvm.internal.F.m(t3);
            return t3;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$f */
    /* loaded from: classes2.dex */
    public static final class f extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X2.a<Boolean> f54527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C2317y c2317y, X2.a<Boolean> aVar) {
            super(c2317y);
            this.f54527d = aVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@l3.d C2317y c2317y) {
            if (this.f54527d.n().booleanValue()) {
                return null;
            }
            return C2316x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (androidx.concurrent.futures.b.a(kotlinx.coroutines.internal.C2317y.f54513E, r3, r2, ((kotlinx.coroutines.internal.L) r4).f54447a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.C2317y D0(kotlinx.coroutines.internal.J r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.C2317y) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C2317y.f54514F
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.N0()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.J
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.J r0 = (kotlinx.coroutines.internal.J) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.J r4 = (kotlinx.coroutines.internal.J) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.L
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C2317y.f54513E
            kotlinx.coroutines.internal.L r4 = (kotlinx.coroutines.internal.L) r4
            kotlinx.coroutines.internal.y r4 = r4.f54447a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.C2317y) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.C2317y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2317y.D0(kotlinx.coroutines.internal.J):kotlinx.coroutines.internal.y");
    }

    private final C2317y G0(C2317y c2317y) {
        while (c2317y.N0()) {
            c2317y = (C2317y) c2317y._prev;
        }
        return c2317y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(C2317y c2317y) {
        C2317y c2317y2;
        do {
            c2317y2 = (C2317y) c2317y._prev;
            if (I0() != c2317y) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f54514F, c2317y, c2317y2, this));
        if (N0()) {
            c2317y.D0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L U0() {
        L l4 = (L) this._removedRef;
        if (l4 == null) {
            L l5 = new L(this);
            f54515G.lazySet(this, l5);
            return l5;
        }
        return l4;
    }

    public final boolean A0(@l3.d C2317y c2317y, @l3.d X2.l<? super C2317y, Boolean> lVar, @l3.d X2.a<Boolean> aVar) {
        int V02;
        f fVar = new f(c2317y, aVar);
        do {
            C2317y K02 = K0();
            if (!lVar.C(K02).booleanValue()) {
                return false;
            }
            V02 = K02.V0(c2317y, this, fVar);
            if (V02 == 1) {
                return true;
            }
        } while (V02 != 2);
        return false;
    }

    @kotlin.U
    public final boolean B0(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
        f54514F.lazySet(c2317y, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54513E;
        atomicReferenceFieldUpdater.lazySet(c2317y, c2317y2);
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c2317y2, c2317y)) {
            return false;
        }
        c2317y.H0(c2317y2);
        return true;
    }

    public final boolean C0(@l3.d C2317y c2317y) {
        f54514F.lazySet(c2317y, this);
        f54513E.lazySet(c2317y, this);
        while (I0() == this) {
            if (androidx.concurrent.futures.b.a(f54513E, this, this, c2317y)) {
                c2317y.H0(this);
                return true;
            }
        }
        return false;
    }

    @l3.d
    public final <T extends C2317y> b<T> E0(@l3.d T t3) {
        return new b<>(this, t3);
    }

    @l3.d
    public final e<C2317y> F0() {
        return new e<>(this);
    }

    @l3.d
    public final Object I0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof J)) {
                return obj;
            }
            ((J) obj).c(this);
        }
    }

    @l3.d
    public final C2317y J0() {
        return C2316x.h(I0());
    }

    @l3.d
    public final C2317y K0() {
        C2317y D02 = D0(null);
        if (D02 == null) {
            return G0((C2317y) this._prev);
        }
        return D02;
    }

    public final void L0() {
        ((L) I0()).f54447a.M0();
    }

    @kotlin.U
    public final void M0() {
        C2317y c2317y = this;
        while (true) {
            Object I02 = c2317y.I0();
            if (I02 instanceof L) {
                c2317y = ((L) I02).f54447a;
            } else {
                c2317y.D0(null);
                return;
            }
        }
    }

    public boolean N0() {
        return I0() instanceof L;
    }

    @l3.d
    @kotlin.U
    public final c O0(@l3.d C2317y c2317y, @l3.d X2.a<Boolean> aVar) {
        return new f(c2317y, aVar);
    }

    @l3.e
    protected C2317y P0() {
        L l4;
        Object I02 = I0();
        if (I02 instanceof L) {
            l4 = (L) I02;
        } else {
            l4 = null;
        }
        if (l4 == null) {
            return null;
        }
        return l4.f54447a;
    }

    public boolean Q0() {
        if (T0() == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlinx.coroutines.internal.y, java.lang.Object] */
    public final /* synthetic */ <T> T R0(X2.l<? super T, Boolean> lVar) {
        while (true) {
            C2317y c2317y = (C2317y) I0();
            if (c2317y == this) {
                return null;
            }
            kotlin.jvm.internal.F.y(3, androidx.exifinterface.media.a.f5);
            if (!(c2317y instanceof Object)) {
                return null;
            }
            if (lVar.C(c2317y).booleanValue() && !c2317y.N0()) {
                return c2317y;
            }
            C2317y T02 = c2317y.T0();
            if (T02 == null) {
                return c2317y;
            }
            T02.M0();
        }
    }

    @l3.e
    public final C2317y S0() {
        while (true) {
            C2317y c2317y = (C2317y) I0();
            if (c2317y == this) {
                return null;
            }
            if (c2317y.Q0()) {
                return c2317y;
            }
            c2317y.L0();
        }
    }

    @l3.e
    @kotlin.U
    public final C2317y T0() {
        Object I02;
        C2317y c2317y;
        do {
            I02 = I0();
            if (I02 instanceof L) {
                return ((L) I02).f54447a;
            }
            if (I02 == this) {
                return (C2317y) I02;
            }
            c2317y = (C2317y) I02;
        } while (!androidx.concurrent.futures.b.a(f54513E, this, I02, c2317y.U0()));
        c2317y.D0(null);
        return null;
    }

    @kotlin.U
    public final int V0(@l3.d C2317y c2317y, @l3.d C2317y c2317y2, @l3.d c cVar) {
        f54514F.lazySet(c2317y, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54513E;
        atomicReferenceFieldUpdater.lazySet(c2317y, c2317y2);
        cVar.f54520c = c2317y2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c2317y2, cVar)) {
            return 0;
        }
        if (cVar.c(this) == null) {
            return 1;
        }
        return 2;
    }

    public final void W0(@l3.d C2317y c2317y, @l3.d C2317y c2317y2) {
    }

    @l3.d
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.y.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.o
            @l3.e
            public Object get() {
                return kotlinx.coroutines.X.a(this.f52262F);
            }
        } + '@' + kotlinx.coroutines.X.b(this);
    }

    public final void x0(@l3.d C2317y c2317y) {
        do {
        } while (!K0().B0(c2317y, this));
    }

    public final boolean y0(@l3.d C2317y c2317y, @l3.d X2.a<Boolean> aVar) {
        int V02;
        f fVar = new f(c2317y, aVar);
        do {
            V02 = K0().V0(c2317y, this, fVar);
            if (V02 == 1) {
                return true;
            }
        } while (V02 != 2);
        return false;
    }

    public final boolean z0(@l3.d C2317y c2317y, @l3.d X2.l<? super C2317y, Boolean> lVar) {
        C2317y K02;
        do {
            K02 = K0();
            if (!lVar.C(K02).booleanValue()) {
                return false;
            }
        } while (!K02.B0(c2317y, this));
        return true;
    }
}
