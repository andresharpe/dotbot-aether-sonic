package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlinx.coroutines.InterfaceC2241c0;

/* renamed from: kotlinx.coroutines.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2337s0 extends AbstractC2339t0 implements InterfaceC2241c0 {

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54562J = AtomicReferenceFieldUpdater.newUpdater(AbstractC2337s0.class, Object.class, "_queue");

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54563K = AtomicReferenceFieldUpdater.newUpdater(AbstractC2337s0.class, Object.class, "_delayed");

    @l3.d
    private volatile /* synthetic */ Object _queue = null;

    @l3.d
    private volatile /* synthetic */ Object _delayed = null;

    @l3.d
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.s0$a */
    /* loaded from: classes2.dex */
    public final class a extends c {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        private final InterfaceC2333q<kotlin.H0> f54564G;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j4, @l3.d InterfaceC2333q<? super kotlin.H0> interfaceC2333q) {
            super(j4);
            this.f54564G = interfaceC2333q;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54564G.Q(AbstractC2337s0.this, kotlin.H0.f51801a);
        }

        @Override // kotlinx.coroutines.AbstractC2337s0.c
        @l3.d
        public String toString() {
            return super.toString() + this.f54564G;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.s0$b */
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        private final Runnable f54566G;

        public b(long j4, @l3.d Runnable runnable) {
            super(j4);
            this.f54566G = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54566G.run();
        }

        @Override // kotlinx.coroutines.AbstractC2337s0.c
        @l3.d
        public String toString() {
            return super.toString() + this.f54566G;
        }
    }

    /* renamed from: kotlinx.coroutines.s0$c */
    /* loaded from: classes2.dex */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC2328n0, kotlinx.coroutines.internal.c0 {

        /* renamed from: E, reason: collision with root package name */
        @W2.f
        public long f54567E;

        /* renamed from: F, reason: collision with root package name */
        private int f54568F = -1;

        @l3.e
        private volatile Object _heap;

        public c(long j4) {
            this.f54567E = j4;
        }

        @Override // kotlinx.coroutines.internal.c0
        public void b(@l3.e kotlinx.coroutines.internal.b0<?> b0Var) {
            kotlinx.coroutines.internal.S s4;
            Object obj = this._heap;
            s4 = C2343v0.f54746a;
            if (obj != s4) {
                this._heap = b0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.c0
        @l3.e
        public kotlinx.coroutines.internal.b0<?> e() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                return (kotlinx.coroutines.internal.b0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.InterfaceC2328n0
        public final synchronized void f() {
            kotlinx.coroutines.internal.S s4;
            d dVar;
            kotlinx.coroutines.internal.S s5;
            try {
                Object obj = this._heap;
                s4 = C2343v0.f54746a;
                if (obj == s4) {
                    return;
                }
                if (obj instanceof d) {
                    dVar = (d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.k(this);
                }
                s5 = C2343v0.f54746a;
                this._heap = s5;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.c0
        public void g(int i4) {
            this.f54568F = i4;
        }

        @Override // java.lang.Comparable
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l3.d c cVar) {
            long j4 = this.f54567E - cVar.f54567E;
            if (j4 > 0) {
                return 1;
            }
            if (j4 < 0) {
                return -1;
            }
            return 0;
        }

        public final synchronized int j(long j4, @l3.d d dVar, @l3.d AbstractC2337s0 abstractC2337s0) {
            kotlinx.coroutines.internal.S s4;
            Object obj = this._heap;
            s4 = C2343v0.f54746a;
            if (obj == s4) {
                return 2;
            }
            synchronized (dVar) {
                try {
                    c f4 = dVar.f();
                    if (abstractC2337s0.m()) {
                        return 1;
                    }
                    if (f4 == null) {
                        dVar.f54569b = j4;
                    } else {
                        long j5 = f4.f54567E;
                        if (j5 - j4 < 0) {
                            j4 = j5;
                        }
                        if (j4 - dVar.f54569b > 0) {
                            dVar.f54569b = j4;
                        }
                    }
                    long j6 = this.f54567E;
                    long j7 = dVar.f54569b;
                    if (j6 - j7 < 0) {
                        this.f54567E = j7;
                    }
                    dVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.c0
        public int k() {
            return this.f54568F;
        }

        public final boolean l(long j4) {
            if (j4 - this.f54567E >= 0) {
                return true;
            }
            return false;
        }

        @l3.d
        public String toString() {
            return "Delayed[nanos=" + this.f54567E + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.s0$d */
    /* loaded from: classes2.dex */
    public static final class d extends kotlinx.coroutines.internal.b0<c> {

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        public long f54569b;

        public d(long j4) {
            this.f54569b = j4;
        }
    }

    private final void D1() {
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54562J;
                s4 = C2343v0.f54753h;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, s4)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.B)) {
                s5 = C2343v0.f54753h;
                if (obj == s5) {
                    return;
                }
                kotlinx.coroutines.internal.B b4 = new kotlinx.coroutines.internal.B(8, true);
                b4.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f54562J, this, obj, b4)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.B) obj).d();
                return;
            }
        }
    }

    private final Runnable E1() {
        kotlinx.coroutines.internal.S s4;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.B)) {
                s4 = C2343v0.f54753h;
                if (obj == s4) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f54562J, this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                kotlinx.coroutines.internal.B b4 = (kotlinx.coroutines.internal.B) obj;
                Object l4 = b4.l();
                if (l4 != kotlinx.coroutines.internal.B.f54419t) {
                    return (Runnable) l4;
                }
                androidx.concurrent.futures.b.a(f54562J, this, obj, b4.k());
            }
        }
    }

    private final boolean G1(Runnable runnable) {
        kotlinx.coroutines.internal.S s4;
        while (true) {
            Object obj = this._queue;
            if (m()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f54562J, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.B)) {
                s4 = C2343v0.f54753h;
                if (obj == s4) {
                    return false;
                }
                kotlinx.coroutines.internal.B b4 = new kotlinx.coroutines.internal.B(8, true);
                b4.a((Runnable) obj);
                b4.a(runnable);
                if (androidx.concurrent.futures.b.a(f54562J, this, obj, b4)) {
                    return true;
                }
            } else {
                kotlinx.coroutines.internal.B b5 = (kotlinx.coroutines.internal.B) obj;
                int a4 = b5.a(runnable);
                if (a4 == 0) {
                    return true;
                }
                if (a4 != 1) {
                    if (a4 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.b.a(f54562J, this, obj, b5.k());
                }
            }
        }
    }

    private final void H1() {
        long nanoTime;
        c n4;
        AbstractC2237b b4 = C2240c.b();
        if (b4 != null) {
            nanoTime = b4.b();
        } else {
            nanoTime = System.nanoTime();
        }
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (n4 = dVar.n()) != null) {
                A1(nanoTime, n4);
            } else {
                return;
            }
        }
    }

    private final int K1(long j4, c cVar) {
        if (m()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f54563K, this, null, new d(j4));
            Object obj = this._delayed;
            kotlin.jvm.internal.F.m(obj);
            dVar = (d) obj;
        }
        return cVar.j(j4, dVar, this);
    }

    private final void M1(boolean z3) {
        this._isCompleted = z3 ? 1 : 0;
    }

    private final boolean N1(c cVar) {
        c cVar2;
        d dVar = (d) this._delayed;
        if (dVar != null) {
            cVar2 = dVar.i();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean m() {
        return this._isCompleted;
    }

    public void F1(@l3.d Runnable runnable) {
        if (G1(runnable)) {
            B1();
        } else {
            Y.f52996L.F1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void J1(long j4, @l3.d c cVar) {
        int K12 = K1(j4, cVar);
        if (K12 != 0) {
            if (K12 != 1) {
                if (K12 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                A1(j4, cVar);
                return;
            }
        }
        if (N1(cVar)) {
            B1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final InterfaceC2328n0 L1(long j4, @l3.d Runnable runnable) {
        long nanoTime;
        long d4 = C2343v0.d(j4);
        if (d4 < kotlin.time.g.f52881c) {
            AbstractC2237b b4 = C2240c.b();
            if (b4 != null) {
                nanoTime = b4.b();
            } else {
                nanoTime = System.nanoTime();
            }
            b bVar = new b(d4 + nanoTime, runnable);
            J1(nanoTime, bVar);
            return bVar;
        }
        return Z0.f53009E;
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    public void h(long j4, @l3.d InterfaceC2333q<? super kotlin.H0> interfaceC2333q) {
        long nanoTime;
        long d4 = C2343v0.d(j4);
        if (d4 < kotlin.time.g.f52881c) {
            AbstractC2237b b4 = C2240c.b();
            if (b4 != null) {
                nanoTime = b4.b();
            } else {
                nanoTime = System.nanoTime();
            }
            a aVar = new a(d4 + nanoTime, interfaceC2333q);
            J1(nanoTime, aVar);
            C2338t.a(interfaceC2333q, aVar);
        }
    }

    @Override // kotlinx.coroutines.N
    public final void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        F1(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC2335r0
    public long q1() {
        c i4;
        long nanoTime;
        long v3;
        kotlinx.coroutines.internal.S s4;
        if (super.q1() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.B)) {
                s4 = C2343v0.f54753h;
                if (obj != s4) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((kotlinx.coroutines.internal.B) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (i4 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j4 = i4.f54567E;
        AbstractC2237b b4 = C2240c.b();
        if (b4 != null) {
            nanoTime = b4.b();
        } else {
            nanoTime = System.nanoTime();
        }
        v3 = kotlin.ranges.u.v(j4 - nanoTime, 0L);
        return v3;
    }

    @Override // kotlinx.coroutines.AbstractC2335r0
    public void shutdown() {
        r1.f54556a.c();
        M1(true);
        D1();
        do {
        } while (w1() <= 0);
        H1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC2335r0
    public boolean t1() {
        kotlinx.coroutines.internal.S s4;
        if (!v1()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.B)) {
                s4 = C2343v0.f54753h;
                if (obj != s4) {
                    return false;
                }
            } else {
                return ((kotlinx.coroutines.internal.B) obj).h();
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC2335r0
    public long w1() {
        long nanoTime;
        c cVar;
        if (x1()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            AbstractC2237b b4 = C2240c.b();
            if (b4 != null) {
                nanoTime = b4.b();
            } else {
                nanoTime = System.nanoTime();
            }
            do {
                synchronized (dVar) {
                    c f4 = dVar.f();
                    cVar = null;
                    if (f4 != null) {
                        c cVar2 = f4;
                        if (cVar2.l(nanoTime) && G1(cVar2)) {
                            cVar = dVar.l(0);
                        }
                    }
                }
            } while (cVar != null);
        }
        Runnable E12 = E1();
        if (E12 != null) {
            E12.run();
            return 0L;
        }
        return q1();
    }

    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        return InterfaceC2241c0.a.b(this, j4, runnable, fVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object z0(long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        return InterfaceC2241c0.a.a(this, j4, cVar);
    }
}
