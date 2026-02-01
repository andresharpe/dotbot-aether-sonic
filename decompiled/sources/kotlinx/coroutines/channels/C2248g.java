package kotlinx.coroutines.channels;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlinx.coroutines.internal.C2300g;

/* renamed from: kotlinx.coroutines.channels.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2248g<E> extends AbstractC2244c<E> implements InterfaceC2250i<E> {

    /* renamed from: H, reason: collision with root package name */
    private final int f53094H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final ReentrantLock f53095I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final Object[] f53096J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final List<a<E>> f53097K;

    @l3.d
    private volatile /* synthetic */ long _head;

    @l3.d
    private volatile /* synthetic */ int _size;

    @l3.d
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.g$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends AbstractC2242a<E> implements F<E> {

        /* renamed from: H, reason: collision with root package name */
        @l3.d
        private final C2248g<E> f53098H;

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final ReentrantLock f53099I;

        @l3.d
        private volatile /* synthetic */ long _subHead;

        public a(@l3.d C2248g<E> c2248g) {
            super(null);
            this.f53098H = c2248g;
            this.f53099I = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean u0() {
            if (o() != null) {
                return false;
            }
            if (g0() && this.f53098H.o() == null) {
                return false;
            }
            return true;
        }

        private final Object v0() {
            long t02 = t0();
            v<?> o4 = this.f53098H.o();
            if (t02 < this.f53098H.f0()) {
                Object a02 = this.f53098H.a0(t02);
                v<?> o5 = o();
                if (o5 != null) {
                    return o5;
                }
                return a02;
            }
            if (o4 == null) {
                v<?> o6 = o();
                if (o6 == null) {
                    return C2243b.f53080f;
                }
                return o6;
            }
            return o4;
        }

        @Override // kotlinx.coroutines.channels.AbstractC2244c
        protected boolean C() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractC2244c
        protected boolean D() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractC2244c, kotlinx.coroutines.channels.J
        public boolean P(@l3.e Throwable th) {
            boolean P3 = super.P(th);
            if (P3) {
                C2248g.k0(this.f53098H, null, this, 1, null);
                ReentrantLock reentrantLock = this.f53099I;
                reentrantLock.lock();
                try {
                    w0(this.f53098H.f0());
                    H0 h02 = H0.f51801a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return P3;
        }

        @Override // kotlinx.coroutines.channels.AbstractC2242a
        protected boolean f0() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractC2242a
        protected boolean g0() {
            if (t0() >= this.f53098H.f0()) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractC2242a
        @l3.e
        protected Object m0() {
            boolean z3;
            v vVar;
            ReentrantLock reentrantLock = this.f53099I;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                if (!(v02 instanceof v) && v02 != C2243b.f53080f) {
                    w0(t0() + 1);
                    z3 = true;
                } else {
                    z3 = false;
                }
                reentrantLock.unlock();
                if (v02 instanceof v) {
                    vVar = (v) v02;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    P(vVar.f53350H);
                }
                if (s0() || z3) {
                    C2248g.k0(this.f53098H, null, null, 3, null);
                }
                return v02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.channels.AbstractC2242a
        @l3.e
        protected Object n0(@l3.d kotlinx.coroutines.selects.f<?> fVar) {
            v vVar;
            ReentrantLock reentrantLock = this.f53099I;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                boolean z3 = false;
                if (!(v02 instanceof v) && v02 != C2243b.f53080f) {
                    if (!fVar.y()) {
                        v02 = kotlinx.coroutines.selects.g.d();
                    } else {
                        w0(t0() + 1);
                        z3 = true;
                    }
                }
                reentrantLock.unlock();
                if (v02 instanceof v) {
                    vVar = (v) v02;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    P(vVar.f53350H);
                }
                if (s0() || z3) {
                    C2248g.k0(this.f53098H, null, null, 3, null);
                }
                return v02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0022, code lost:
        
            r2 = (kotlinx.coroutines.channels.v) r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean s0() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.u0()
                r2 = 0
                if (r1 == 0) goto L5a
                java.util.concurrent.locks.ReentrantLock r1 = r8.f53099I
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L5a
                java.lang.Object r1 = r8.v0()     // Catch: java.lang.Throwable -> L2b
                kotlinx.coroutines.internal.S r3 = kotlinx.coroutines.channels.C2243b.f53080f     // Catch: java.lang.Throwable -> L2b
                if (r1 != r3) goto L1e
            L18:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f53099I
                r1.unlock()
                goto L1
            L1e:
                boolean r3 = r1 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L2b
                if (r3 == 0) goto L2d
                r2 = r1
                kotlinx.coroutines.channels.v r2 = (kotlinx.coroutines.channels.v) r2     // Catch: java.lang.Throwable -> L2b
            L25:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f53099I
                r1.unlock()
                goto L5a
            L2b:
                r0 = move-exception
                goto L54
            L2d:
                kotlinx.coroutines.channels.G r3 = r8.O()     // Catch: java.lang.Throwable -> L2b
                if (r3 != 0) goto L34
                goto L25
            L34:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L2b
                if (r4 == 0) goto L39
                goto L25
            L39:
                kotlinx.coroutines.internal.S r2 = r3.o0(r1, r2)     // Catch: java.lang.Throwable -> L2b
                if (r2 != 0) goto L40
                goto L18
            L40:
                long r4 = r8.t0()     // Catch: java.lang.Throwable -> L2b
                r6 = 1
                long r4 = r4 + r6
                r8.w0(r4)     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.locks.ReentrantLock r0 = r8.f53099I
                r0.unlock()
                r3.X(r1)
                r0 = 1
                goto L1
            L54:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f53099I
                r1.unlock()
                throw r0
            L5a:
                if (r2 == 0) goto L61
                java.lang.Throwable r1 = r2.f53350H
                r8.P(r1)
            L61:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C2248g.a.s0():boolean");
        }

        public final long t0() {
            return this._subHead;
        }

        public final void w0(long j4) {
            this._subHead = j4;
        }
    }

    public C2248g(int i4) {
        super(null);
        this.f53094H = i4;
        if (i4 >= 1) {
            this.f53095I = new ReentrantLock();
            this.f53096J = new Object[i4];
            this._head = 0L;
            this._tail = 0L;
            this._size = 0;
            this.f53097K = C2300g.d();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final boolean d(Throwable th) {
        boolean P3 = P(th);
        Iterator<a<E>> it = this.f53097K.iterator();
        while (it.hasNext()) {
            it.next().d(th);
        }
        return P3;
    }

    private final void Y() {
        boolean z3;
        Iterator<a<E>> it = this.f53097K.iterator();
        boolean z4 = false;
        loop0: while (true) {
            z3 = z4;
            while (it.hasNext()) {
                if (it.next().s0()) {
                    break;
                } else {
                    z3 = true;
                }
            }
            z4 = true;
        }
        if (z4 || !z3) {
            k0(this, null, null, 3, null);
        }
    }

    private final long Z() {
        Iterator<a<E>> it = this.f53097K.iterator();
        long j4 = Long.MAX_VALUE;
        while (it.hasNext()) {
            j4 = kotlin.ranges.u.C(j4, it.next().t0());
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E a0(long j4) {
        return (E) this.f53096J[(int) (j4 % this.f53094H)];
    }

    private final long c0() {
        return this._head;
    }

    private final int d0() {
        return this._size;
    }

    private static /* synthetic */ void e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f0() {
        return this._tail;
    }

    private final void g0(long j4) {
        this._head = j4;
    }

    private final void h0(int i4) {
        this._size = i4;
    }

    private final void i0(long j4) {
        this._tail = j4;
    }

    private final void j0(a<E> aVar, a<E> aVar2) {
        long C3;
        boolean z3;
        I Q3;
        while (true) {
            ReentrantLock reentrantLock = this.f53095I;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.w0(f0());
                    boolean isEmpty = this.f53097K.isEmpty();
                    this.f53097K.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.f53097K.remove(aVar2);
                if (c0() != aVar2.t0()) {
                    return;
                }
            }
            long Z3 = Z();
            long f02 = f0();
            long c02 = c0();
            C3 = kotlin.ranges.u.C(Z3, f02);
            if (C3 <= c02) {
                return;
            }
            int d02 = d0();
            while (c02 < C3) {
                Object[] objArr = this.f53096J;
                int i4 = this.f53094H;
                objArr[(int) (c02 % i4)] = null;
                if (d02 >= i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c02++;
                g0(c02);
                int i5 = d02 - 1;
                h0(i5);
                if (!z3) {
                    d02 = i5;
                }
                do {
                    Q3 = Q();
                    if (Q3 != null && !(Q3 instanceof v)) {
                        kotlin.jvm.internal.F.m(Q3);
                    }
                    d02 = i5;
                } while (Q3.a1(null) == null);
                this.f53096J[(int) (f02 % this.f53094H)] = Q3.Y0();
                h0(d02);
                i0(f02 + 1);
                H0 h02 = H0.f51801a;
                reentrantLock.unlock();
                Q3.X0();
                Y();
                aVar = null;
                aVar2 = null;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void k0(C2248g c2248g, a aVar, a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar2 = null;
        }
        c2248g.j0(aVar, aVar2);
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected boolean D() {
        if (d0() >= this.f53094H) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    public Object G(E e4) {
        ReentrantLock reentrantLock = this.f53095I;
        reentrantLock.lock();
        try {
            v<?> p4 = p();
            if (p4 != null) {
                return p4;
            }
            int d02 = d0();
            if (d02 >= this.f53094H) {
                return C2243b.f53079e;
            }
            long f02 = f0();
            this.f53096J[(int) (f02 % this.f53094H)] = e4;
            h0(d02 + 1);
            i0(f02 + 1);
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
            Y();
            return C2243b.f53078d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    public Object H(E e4, @l3.d kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f53095I;
        reentrantLock.lock();
        try {
            v<?> p4 = p();
            if (p4 != null) {
                return p4;
            }
            int d02 = d0();
            if (d02 >= this.f53094H) {
                return C2243b.f53079e;
            }
            if (!fVar.y()) {
                return kotlinx.coroutines.selects.g.d();
            }
            long f02 = f0();
            this.f53096J[(int) (f02 % this.f53094H)] = e4;
            h0(d02 + 1);
            i0(f02 + 1);
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
            Y();
            return C2243b.f53078d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c, kotlinx.coroutines.channels.J
    public boolean P(@l3.e Throwable th) {
        if (!super.P(th)) {
            return false;
        }
        Y();
        return true;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    @l3.d
    public F<E> R() {
        a aVar = new a(this);
        k0(this, aVar, null, 2, null);
        return aVar;
    }

    public final int b0() {
        return this.f53094H;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    public void f(@l3.e CancellationException cancellationException) {
        d(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    protected String n() {
        return "(buffer:capacity=" + this.f53096J.length + ",size=" + d0() + ')';
    }
}
