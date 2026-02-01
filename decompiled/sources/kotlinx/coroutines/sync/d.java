package kotlinx.coroutines.sync;

import X2.l;
import X2.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.H0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.internal.AbstractC2295b;
import kotlinx.coroutines.internal.AbstractC2297d;
import kotlinx.coroutines.internal.C2296c;
import kotlinx.coroutines.internal.C2315w;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.J;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class d implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> {

    /* renamed from: E, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f54690E = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");

    @l3.d
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a extends c {

        /* renamed from: K, reason: collision with root package name */
        @l3.d
        private final InterfaceC2333q<H0> f54691K;

        /* renamed from: kotlinx.coroutines.sync.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0506a extends Lambda implements l<Throwable, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ d f54693F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ a f54694G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0506a(d dVar, a aVar) {
                super(1);
                this.f54693F = dVar;
                this.f54694G = aVar;
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Throwable th) {
                c(th);
                return H0.f51801a;
            }

            public final void c(@l3.d Throwable th) {
                this.f54693F.d(this.f54694G.f54701H);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l3.e Object obj, @l3.d InterfaceC2333q<? super H0> interfaceC2333q) {
            super(obj);
            this.f54691K = interfaceC2333q;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void X0() {
            this.f54691K.t0(C2336s.f54561d);
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean Z0() {
            if (!Y0() || this.f54691K.j0(H0.f51801a, null, new C0506a(d.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "LockCont[" + this.f54701H + ", " + this.f54691K + "] for " + d.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class b<R> extends c {

        /* renamed from: K, reason: collision with root package name */
        @W2.f
        @l3.d
        public final kotlinx.coroutines.selects.f<R> f54695K;

        /* renamed from: L, reason: collision with root package name */
        @W2.f
        @l3.d
        public final p<kotlinx.coroutines.sync.c, kotlin.coroutines.c<? super R>, Object> f54696L;

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements l<Throwable, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ d f54698F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ b<R> f54699G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b<R> bVar) {
                super(1);
                this.f54698F = dVar;
                this.f54699G = bVar;
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Throwable th) {
                c(th);
                return H0.f51801a;
            }

            public final void c(@l3.d Throwable th) {
                this.f54698F.d(this.f54699G.f54701H);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@l3.e Object obj, @l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d p<? super kotlinx.coroutines.sync.c, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            super(obj);
            this.f54695K = fVar;
            this.f54696L = pVar;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void X0() {
            j3.a.d(this.f54696L, d.this, this.f54695K.R(), new a(d.this, this));
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean Z0() {
            if (Y0() && this.f54695K.y()) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "LockSelect[" + this.f54701H + ", " + this.f54695K + "] for " + d.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class c extends C2317y implements InterfaceC2328n0 {

        /* renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f54700J = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Object f54701H;

        @l3.d
        private volatile /* synthetic */ int isTaken = 0;

        public c(@l3.e Object obj) {
            this.f54701H = obj;
        }

        public abstract void X0();

        public final boolean Y0() {
            return f54700J.compareAndSet(this, 0, 1);
        }

        public abstract boolean Z0();

        @Override // kotlinx.coroutines.InterfaceC2328n0
        public final void f() {
            Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.sync.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0507d extends C2315w {

        @W2.f
        @l3.d
        public volatile Object owner;

        public C0507d(@l3.d Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* loaded from: classes2.dex */
    private static final class e extends AbstractC2295b {

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final d f54703b;

        /* renamed from: c, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Object f54704c;

        /* loaded from: classes2.dex */
        private final class a extends J {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            private final AbstractC2297d<?> f54705a;

            public a(@l3.d AbstractC2297d<?> abstractC2297d) {
                this.f54705a = abstractC2297d;
            }

            @Override // kotlinx.coroutines.internal.J
            @l3.d
            public AbstractC2297d<?> a() {
                return this.f54705a;
            }

            @Override // kotlinx.coroutines.internal.J
            @l3.e
            public Object c(@l3.e Object obj) {
                Object a4;
                if (a().h()) {
                    a4 = kotlinx.coroutines.sync.e.f54715f;
                } else {
                    a4 = a();
                }
                if (obj != null) {
                    androidx.concurrent.futures.b.a(d.f54690E, (d) obj, this, a4);
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
            }
        }

        public e(@l3.d d dVar, @l3.e Object obj) {
            this.f54703b = dVar;
            this.f54704c = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2295b
        public void a(@l3.d AbstractC2297d<?> abstractC2297d, @l3.e Object obj) {
            kotlinx.coroutines.sync.b bVar;
            if (obj != null) {
                bVar = kotlinx.coroutines.sync.e.f54715f;
            } else {
                Object obj2 = this.f54704c;
                bVar = obj2 == null ? kotlinx.coroutines.sync.e.f54714e : new kotlinx.coroutines.sync.b(obj2);
            }
            androidx.concurrent.futures.b.a(d.f54690E, this.f54703b, abstractC2297d, bVar);
        }

        @Override // kotlinx.coroutines.internal.AbstractC2295b
        @l3.e
        public Object c(@l3.d AbstractC2297d<?> abstractC2297d) {
            kotlinx.coroutines.sync.b bVar;
            S s4;
            a aVar = new a(abstractC2297d);
            d dVar = this.f54703b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f54690E;
            bVar = kotlinx.coroutines.sync.e.f54715f;
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, dVar, bVar, aVar)) {
                s4 = kotlinx.coroutines.sync.e.f54710a;
                return s4;
            }
            return aVar.c(this.f54703b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC2297d<d> {

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C0507d f54707b;

        public f(@l3.d C0507d c0507d) {
            this.f54707b = c0507d;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@l3.d d dVar, @l3.e Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = kotlinx.coroutines.sync.e.f54715f;
            } else {
                obj2 = this.f54707b;
            }
            androidx.concurrent.futures.b.a(d.f54690E, dVar, this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@l3.d d dVar) {
            S s4;
            if (!this.f54707b.Y0()) {
                s4 = kotlinx.coroutines.sync.e.f54711b;
                return s4;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements l<Throwable, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Object f54709G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj) {
            super(1);
            this.f54709G = obj;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.d Throwable th) {
            d.this.d(this.f54709G);
        }
    }

    public d(boolean z3) {
        this._state = z3 ? kotlinx.coroutines.sync.e.f54714e : kotlinx.coroutines.sync.e.f54715f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        kotlinx.coroutines.C2338t.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r7, kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r6 = this;
            kotlin.coroutines.c r0 = kotlin.coroutines.intrinsics.a.e(r8)
            kotlinx.coroutines.r r0 = kotlinx.coroutines.C2338t.b(r0)
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.b
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.b) r3
            java.lang.Object r4 = r3.f54689a
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.sync.e.g()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f54690E
            kotlinx.coroutines.sync.d$d r5 = new kotlinx.coroutines.sync.d$d
            java.lang.Object r3 = r3.f54689a
            r5.<init>(r3)
            androidx.concurrent.futures.b.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.b r3 = kotlinx.coroutines.sync.e.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.b r3 = new kotlinx.coroutines.sync.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f54690E
            boolean r2 = androidx.concurrent.futures.b.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.H0 r1 = kotlin.H0.f51801a
            kotlinx.coroutines.sync.d$g r2 = new kotlinx.coroutines.sync.d$g
            r2.<init>(r7)
            r0.M(r1, r2)
            goto L6c
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.d.C0507d
            if (r3 == 0) goto L9e
            r3 = r2
            kotlinx.coroutines.sync.d$d r3 = (kotlinx.coroutines.sync.d.C0507d) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L83
            r3.x0(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L69
            boolean r2 = r1.Y0()
            if (r2 != 0) goto L63
            goto L69
        L63:
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
            goto Ld
        L69:
            kotlinx.coroutines.C2338t.c(r0, r1)
        L6c:
            java.lang.Object r7 = r0.z()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r7 != r0) goto L79
            kotlin.coroutines.jvm.internal.f.c(r8)
        L79:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.l()
            if (r7 != r8) goto L80
            return r7
        L80:
            kotlin.H0 r7 = kotlin.H0.f51801a
            return r7
        L83:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L9e:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.J
            if (r3 == 0) goto La9
            kotlinx.coroutines.internal.J r2 = (kotlinx.coroutines.internal.J) r2
            r2.c(r6)
            goto Ld
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.i(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.e
    public <R> void C(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.e Object obj, @l3.d p<? super kotlinx.coroutines.sync.c, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        S s4;
        S s5;
        while (!fVar.J()) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                Object obj3 = bVar.f54689a;
                s4 = kotlinx.coroutines.sync.e.f54713d;
                if (obj3 != s4) {
                    androidx.concurrent.futures.b.a(f54690E, this, obj2, new C0507d(bVar.f54689a));
                } else {
                    Object g02 = fVar.g0(new e(this, obj));
                    if (g02 == null) {
                        j3.b.d(pVar, this, fVar.R());
                        return;
                    }
                    if (g02 != kotlinx.coroutines.selects.g.d()) {
                        s5 = kotlinx.coroutines.sync.e.f54710a;
                        if (g02 != s5 && g02 != C2296c.f54475b) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + g02).toString());
                        }
                    } else {
                        return;
                    }
                }
            } else if (obj2 instanceof C0507d) {
                C0507d c0507d = (C0507d) obj2;
                if (c0507d.owner != obj) {
                    b bVar2 = new b(obj, fVar, pVar);
                    c0507d.x0(bVar2);
                    if (this._state == obj2 || !bVar2.Y0()) {
                        fVar.q0(bVar2);
                        return;
                    }
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof J) {
                ((J) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean a(@l3.e Object obj) {
        S s4;
        kotlinx.coroutines.sync.b bVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f54689a;
                s4 = kotlinx.coroutines.sync.e.f54713d;
                if (obj3 != s4) {
                    return false;
                }
                if (obj == null) {
                    bVar = kotlinx.coroutines.sync.e.f54714e;
                } else {
                    bVar = new kotlinx.coroutines.sync.b(obj);
                }
                if (androidx.concurrent.futures.b.a(f54690E, this, obj2, bVar)) {
                    return true;
                }
            } else {
                if (obj2 instanceof C0507d) {
                    if (((C0507d) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                if (obj2 instanceof J) {
                    ((J) obj2).c(this);
                } else {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean b() {
        S s4;
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                Object obj2 = ((kotlinx.coroutines.sync.b) obj).f54689a;
                s4 = kotlinx.coroutines.sync.e.f54713d;
                if (obj2 != s4) {
                    return true;
                }
                return false;
            }
            if (obj instanceof C0507d) {
                return true;
            }
            if (obj instanceof J) {
                ((J) obj).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    @l3.e
    public Object c(@l3.e Object obj, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        if (a(obj)) {
            return H0.f51801a;
        }
        Object i4 = i(obj, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (i4 == l4) {
            return i4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.sync.c
    public void d(@l3.e Object obj) {
        kotlinx.coroutines.sync.b bVar;
        S s4;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.sync.b) obj2).f54689a;
                    s4 = kotlinx.coroutines.sync.e.f54713d;
                    if (obj3 == s4) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar2 = (kotlinx.coroutines.sync.b) obj2;
                    if (bVar2.f54689a != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f54689a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54690E;
                bVar = kotlinx.coroutines.sync.e.f54715f;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof J) {
                ((J) obj2).c(this);
            } else if (obj2 instanceof C0507d) {
                if (obj != null) {
                    C0507d c0507d = (C0507d) obj2;
                    if (c0507d.owner != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + c0507d.owner + " but expected " + obj).toString());
                    }
                }
                C0507d c0507d2 = (C0507d) obj2;
                C2317y S02 = c0507d2.S0();
                if (S02 == null) {
                    f fVar = new f(c0507d2);
                    if (androidx.concurrent.futures.b.a(f54690E, this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) S02;
                    if (cVar.Z0()) {
                        Object obj4 = cVar.f54701H;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.e.f54712c;
                        }
                        c0507d2.owner = obj4;
                        cVar.X0();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean e(@l3.d Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj2).f54689a == obj) {
                return true;
            }
        } else if ((obj2 instanceof C0507d) && ((C0507d) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.c
    @l3.d
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        if ((obj instanceof C0507d) && ((C0507d) obj).Y0()) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).f54689a + ']';
            }
            if (obj instanceof J) {
                ((J) obj).c(this);
            } else {
                if (obj instanceof C0507d) {
                    return "Mutex[" + ((C0507d) obj).owner + ']';
                }
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
