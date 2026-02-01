package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.random.Random;
import kotlin.ranges.u;
import kotlinx.coroutines.AbstractC2237b;
import kotlinx.coroutines.C2240c;
import kotlinx.coroutines.X;
import kotlinx.coroutines.internal.M;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: Q, reason: collision with root package name */
    private static final int f54578Q = -1;

    /* renamed from: R, reason: collision with root package name */
    private static final int f54579R = 0;

    /* renamed from: S, reason: collision with root package name */
    private static final int f54580S = 1;

    /* renamed from: T, reason: collision with root package name */
    private static final int f54581T = 21;

    /* renamed from: U, reason: collision with root package name */
    private static final long f54582U = 2097151;

    /* renamed from: V, reason: collision with root package name */
    private static final long f54583V = 4398044413952L;

    /* renamed from: W, reason: collision with root package name */
    private static final int f54584W = 42;

    /* renamed from: X, reason: collision with root package name */
    private static final long f54585X = 9223367638808264704L;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f54586Y = 1;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f54587Z = 2097150;

    /* renamed from: a0, reason: collision with root package name */
    private static final long f54588a0 = 2097151;

    /* renamed from: b0, reason: collision with root package name */
    private static final long f54589b0 = -2097152;

    /* renamed from: c0, reason: collision with root package name */
    private static final long f54590c0 = 2097152;

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    public final int f54591E;

    /* renamed from: F, reason: collision with root package name */
    @W2.f
    public final int f54592F;

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    public final long f54593G;

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    @l3.d
    public final String f54594H;

    /* renamed from: I, reason: collision with root package name */
    @W2.f
    @l3.d
    public final e f54595I;

    /* renamed from: J, reason: collision with root package name */
    @W2.f
    @l3.d
    public final e f54596J;

    /* renamed from: K, reason: collision with root package name */
    @W2.f
    @l3.d
    public final M<c> f54597K;

    @l3.d
    private volatile /* synthetic */ int _isTerminated;

    @l3.d
    volatile /* synthetic */ long controlState;

    @l3.d
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    public static final a f54573L = new a(null);

    /* renamed from: P, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final S f54577P = new S("NOT_IN_STACK");

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f54574M = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: N, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f54575N = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54576O = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54598a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f54598a = iArr;
        }
    }

    public CoroutineScheduler(int i4, int i5, long j4, @l3.d String str) {
        this.f54591E = i4;
        this.f54592F = i5;
        this.f54593G = j4;
        this.f54594H = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 > 0) {
            this.f54595I = new e();
            this.f54596J = new e();
            this.parkedWorkersStack = 0L;
            this.f54597K = new M<>(i4 + 1);
            this.controlState = i4 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
    }

    private final int A(c cVar) {
        Object h4 = cVar.h();
        while (h4 != f54577P) {
            if (h4 == null) {
                return 0;
            }
            c cVar2 = (c) h4;
            int g4 = cVar2.g();
            if (g4 != 0) {
                return g4;
            }
            h4 = cVar2.h();
        }
        return -1;
    }

    private final c D() {
        while (true) {
            long j4 = this.parkedWorkersStack;
            c b4 = this.f54597K.b((int) (2097151 & j4));
            if (b4 == null) {
                return null;
            }
            long j5 = (2097152 + j4) & f54589b0;
            int A3 = A(b4);
            if (A3 >= 0 && f54574M.compareAndSet(this, j4, A3 | j5)) {
                b4.q(f54577P);
                return b4;
            }
        }
    }

    private final long H() {
        return f54575N.addAndGet(this, 4398046511104L);
    }

    private final boolean a(j jVar) {
        if (jVar.f54628F.i0() == 1) {
            return this.f54596J.a(jVar);
        }
        return this.f54595I.a(jVar);
    }

    private final void a0(boolean z3) {
        long addAndGet = f54575N.addAndGet(this, 2097152L);
        if (z3 || y0() || u0(addAndGet)) {
            return;
        }
        y0();
    }

    private final int c(long j4) {
        return (int) ((j4 & f54583V) >> 21);
    }

    private final int d() {
        int u3;
        synchronized (this.f54597K) {
            if (isTerminated()) {
                return -1;
            }
            long j4 = this.controlState;
            int i4 = (int) (j4 & 2097151);
            u3 = u.u(i4 - ((int) ((j4 & f54583V) >> 21)), 0);
            if (u3 >= this.f54591E) {
                return 0;
            }
            if (i4 >= this.f54592F) {
                return 0;
            }
            int i5 = ((int) (this.controlState & 2097151)) + 1;
            if (i5 > 0 && this.f54597K.b(i5) == null) {
                c cVar = new c(this, i5);
                this.f54597K.c(i5, cVar);
                if (i5 == ((int) (2097151 & f54575N.incrementAndGet(this)))) {
                    cVar.start();
                    return u3 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final j e0(c cVar, j jVar, boolean z3) {
        if (cVar == null) {
            return jVar;
        }
        if (cVar.f54601F == WorkerState.TERMINATED) {
            return jVar;
        }
        if (jVar.f54628F.i0() == 0 && cVar.f54601F == WorkerState.BLOCKING) {
            return jVar;
        }
        cVar.f54605J = true;
        return cVar.f54600E.a(jVar, z3);
    }

    private final int h(long j4) {
        return (int) (j4 & 2097151);
    }

    private final c i() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !F.g(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean i0() {
        long j4;
        do {
            j4 = this.controlState;
            if (((int) ((f54585X & j4) >> 42)) == 0) {
                return false;
            }
        } while (!f54575N.compareAndSet(this, j4, j4 - 4398046511104L));
        return true;
    }

    private final void j() {
        f54575N.addAndGet(this, f54589b0);
    }

    private final int k() {
        return (int) (f54575N.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void n(CoroutineScheduler coroutineScheduler, Runnable runnable, k kVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = n.f54639i;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        coroutineScheduler.m(runnable, kVar, z3);
    }

    private final int p() {
        return (int) ((this.controlState & f54585X) >> 42);
    }

    private final int t() {
        return (int) (this.controlState & 2097151);
    }

    private final boolean u0(long j4) {
        int u3;
        u3 = u.u(((int) (2097151 & j4)) - ((int) ((j4 & f54583V) >> 21)), 0);
        if (u3 < this.f54591E) {
            int d4 = d();
            if (d4 == 1 && this.f54591E > 1) {
                d();
            }
            if (d4 > 0) {
                return true;
            }
        }
        return false;
    }

    private final long v() {
        return f54575N.addAndGet(this, 2097152L);
    }

    static /* synthetic */ boolean x0(CoroutineScheduler coroutineScheduler, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.u0(j4);
    }

    private final boolean y0() {
        c D3;
        do {
            D3 = D();
            if (D3 == null) {
                return false;
            }
        } while (!c.f54599L.compareAndSet(D3, -1, 0));
        LockSupport.unpark(D3);
        return true;
    }

    private final int z() {
        return (int) (f54575N.incrementAndGet(this) & 2097151);
    }

    public final boolean F(@l3.d c cVar) {
        long j4;
        long j5;
        int g4;
        if (cVar.h() != f54577P) {
            return false;
        }
        do {
            j4 = this.parkedWorkersStack;
            j5 = (2097152 + j4) & f54589b0;
            g4 = cVar.g();
            cVar.q(this.f54597K.b((int) (2097151 & j4)));
        } while (!f54574M.compareAndSet(this, j4, j5 | g4));
        return true;
    }

    public final void G(@l3.d c cVar, int i4, int i5) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & f54589b0;
            if (i6 == i4) {
                if (i5 == 0) {
                    i6 = A(cVar);
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0 && f54574M.compareAndSet(this, j4, j5 | i6)) {
                return;
            }
        }
    }

    public final void P(@l3.d j jVar) {
        try {
            jVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                AbstractC2237b b4 = C2240c.b();
                if (b4 == null) {
                }
            } finally {
                AbstractC2237b b5 = C2240c.b();
                if (b5 != null) {
                    b5.f();
                }
            }
        }
    }

    public final void V(long j4) {
        int i4;
        j g4;
        if (!f54576O.compareAndSet(this, 0, 1)) {
            return;
        }
        c i5 = i();
        synchronized (this.f54597K) {
            i4 = (int) (this.controlState & 2097151);
        }
        if (1 <= i4) {
            int i6 = 1;
            while (true) {
                c b4 = this.f54597K.b(i6);
                F.m(b4);
                c cVar = b4;
                if (cVar != i5) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j4);
                    }
                    cVar.f54600E.g(this.f54596J);
                }
                if (i6 == i4) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f54596J.b();
        this.f54595I.b();
        while (true) {
            if (i5 != null) {
                g4 = i5.f(true);
                if (g4 != null) {
                    continue;
                    P(g4);
                }
            }
            g4 = this.f54595I.g();
            if (g4 == null && (g4 = this.f54596J.g()) == null) {
                break;
            }
            P(g4);
        }
        if (i5 != null) {
            i5.t(WorkerState.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    public final int b(long j4) {
        return (int) ((j4 & f54585X) >> 42);
    }

    public final void c0() {
        if (y0() || x0(this, 0L, 1, null)) {
            return;
        }
        y0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        V(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@l3.d Runnable runnable) {
        n(this, runnable, null, false, 6, null);
    }

    @l3.d
    public final j f(@l3.d Runnable runnable, @l3.d k kVar) {
        long a4 = n.f54636f.a();
        if (runnable instanceof j) {
            j jVar = (j) runnable;
            jVar.f54627E = a4;
            jVar.f54628F = kVar;
            return jVar;
        }
        return new m(runnable, a4, kVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void m(@l3.d Runnable runnable, @l3.d k kVar, boolean z3) {
        boolean z4;
        AbstractC2237b b4 = C2240c.b();
        if (b4 != null) {
            b4.e();
        }
        j f4 = f(runnable, kVar);
        c i4 = i();
        j e02 = e0(i4, f4, z3);
        if (e02 != null && !a(e02)) {
            throw new RejectedExecutionException(this.f54594H + " was terminated");
        }
        if (z3 && i4 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (f4.f54628F.i0() == 0) {
            if (z4) {
                return;
            }
            c0();
            return;
        }
        a0(z4);
    }

    @l3.d
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a4 = this.f54597K.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            c b4 = this.f54597K.b(i9);
            if (b4 != null) {
                int f4 = b4.f54600E.f();
                int i10 = b.f54598a[b4.f54601F.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    i8++;
                                }
                            } else {
                                i7++;
                                if (f4 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(f4);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i4++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f4);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i5++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f4);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i6++;
                }
            }
        }
        long j4 = this.controlState;
        return this.f54594H + '@' + X.b(this) + "[Pool Size {core = " + this.f54591E + ", max = " + this.f54592F + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f54595I.c() + ", global blocking queue size = " + this.f54596J.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((f54583V & j4) >> 21)) + ", CPUs acquired = " + (this.f54591E - ((int) ((f54585X & j4) >> 42))) + "}]";
    }

    /* loaded from: classes2.dex */
    public final class c extends Thread {

        /* renamed from: L, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f54599L = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: E, reason: collision with root package name */
        @W2.f
        @l3.d
        public final p f54600E;

        /* renamed from: F, reason: collision with root package name */
        @W2.f
        @l3.d
        public WorkerState f54601F;

        /* renamed from: G, reason: collision with root package name */
        private long f54602G;

        /* renamed from: H, reason: collision with root package name */
        private long f54603H;

        /* renamed from: I, reason: collision with root package name */
        private int f54604I;

        /* renamed from: J, reason: collision with root package name */
        @W2.f
        public boolean f54605J;
        private volatile int indexInArray;

        @l3.e
        private volatile Object nextParkedWorker;

        @l3.d
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f54600E = new p();
            this.f54601F = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f54577P;
            this.f54604I = Random.f52425E.l();
        }

        private final void b(int i4) {
            if (i4 == 0) {
                return;
            }
            CoroutineScheduler.f54575N.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f54589b0);
            if (this.f54601F != WorkerState.TERMINATED) {
                this.f54601F = WorkerState.DORMANT;
            }
        }

        private final void c(int i4) {
            if (i4 != 0 && t(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.c0();
            }
        }

        private final void d(j jVar) {
            int i02 = jVar.f54628F.i0();
            j(i02);
            c(i02);
            CoroutineScheduler.this.P(jVar);
            b(i02);
        }

        private final j e(boolean z3) {
            boolean z4;
            j n4;
            j n5;
            if (z3) {
                if (l(CoroutineScheduler.this.f54591E * 2) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (n5 = n()) != null) {
                    return n5;
                }
                j h4 = this.f54600E.h();
                if (h4 != null) {
                    return h4;
                }
                if (!z4 && (n4 = n()) != null) {
                    return n4;
                }
            } else {
                j n6 = n();
                if (n6 != null) {
                    return n6;
                }
            }
            return u(false);
        }

        private final void j(int i4) {
            this.f54602G = 0L;
            if (this.f54601F == WorkerState.PARKING) {
                this.f54601F = WorkerState.BLOCKING;
            }
        }

        private final boolean k() {
            if (this.nextParkedWorker != CoroutineScheduler.f54577P) {
                return true;
            }
            return false;
        }

        private final void m() {
            if (this.f54602G == 0) {
                this.f54602G = System.nanoTime() + CoroutineScheduler.this.f54593G;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f54593G);
            if (System.nanoTime() - this.f54602G >= 0) {
                this.f54602G = 0L;
                v();
            }
        }

        private final j n() {
            if (l(2) == 0) {
                j g4 = CoroutineScheduler.this.f54595I.g();
                if (g4 != null) {
                    return g4;
                }
                return CoroutineScheduler.this.f54596J.g();
            }
            j g5 = CoroutineScheduler.this.f54596J.g();
            if (g5 != null) {
                return g5;
            }
            return CoroutineScheduler.this.f54595I.g();
        }

        private final void o() {
            loop0: while (true) {
                boolean z3 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f54601F != WorkerState.TERMINATED) {
                    j f4 = f(this.f54605J);
                    if (f4 != null) {
                        this.f54603H = 0L;
                        d(f4);
                    } else {
                        this.f54605J = false;
                        if (this.f54603H != 0) {
                            if (!z3) {
                                z3 = true;
                            } else {
                                t(WorkerState.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f54603H);
                                this.f54603H = 0L;
                            }
                        } else {
                            s();
                        }
                    }
                }
            }
            t(WorkerState.TERMINATED);
        }

        private final boolean r() {
            long j4;
            if (this.f54601F == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            do {
                j4 = coroutineScheduler.controlState;
                if (((int) ((CoroutineScheduler.f54585X & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.f54575N.compareAndSet(coroutineScheduler, j4, j4 - 4398046511104L));
            this.f54601F = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void s() {
            if (!k()) {
                CoroutineScheduler.this.F(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f54601F != WorkerState.TERMINATED) {
                t(WorkerState.PARKING);
                Thread.interrupted();
                m();
            }
        }

        private final j u(boolean z3) {
            long l4;
            int i4 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i4 < 2) {
                return null;
            }
            int l5 = l(i4);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j4 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                l5++;
                if (l5 > i4) {
                    l5 = 1;
                }
                c b4 = coroutineScheduler.f54597K.b(l5);
                if (b4 != null && b4 != this) {
                    if (z3) {
                        l4 = this.f54600E.k(b4.f54600E);
                    } else {
                        l4 = this.f54600E.l(b4.f54600E);
                    }
                    if (l4 == -1) {
                        return this.f54600E.h();
                    }
                    if (l4 > 0) {
                        j4 = Math.min(j4, l4);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f54603H = j4;
            return null;
        }

        private final void v() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f54597K) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (coroutineScheduler.controlState & 2097151)) <= coroutineScheduler.f54591E) {
                        return;
                    }
                    if (!f54599L.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i4 = this.indexInArray;
                    p(0);
                    coroutineScheduler.G(this, i4, 0);
                    int andDecrement = (int) (CoroutineScheduler.f54575N.getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i4) {
                        c b4 = coroutineScheduler.f54597K.b(andDecrement);
                        F.m(b4);
                        c cVar = b4;
                        coroutineScheduler.f54597K.c(i4, cVar);
                        cVar.p(i4);
                        coroutineScheduler.G(cVar, andDecrement, i4);
                    }
                    coroutineScheduler.f54597K.c(andDecrement, null);
                    H0 h02 = H0.f51801a;
                    this.f54601F = WorkerState.TERMINATED;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @l3.e
        public final j f(boolean z3) {
            j g4;
            if (r()) {
                return e(z3);
            }
            if (z3) {
                g4 = this.f54600E.h();
                if (g4 == null) {
                    g4 = CoroutineScheduler.this.f54596J.g();
                }
            } else {
                g4 = CoroutineScheduler.this.f54596J.g();
            }
            if (g4 == null) {
                return u(true);
            }
            return g4;
        }

        public final int g() {
            return this.indexInArray;
        }

        @l3.e
        public final Object h() {
            return this.nextParkedWorker;
        }

        @l3.d
        public final CoroutineScheduler i() {
            return CoroutineScheduler.this;
        }

        public final int l(int i4) {
            int i5 = this.f54604I;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f54604I = i8;
            int i9 = i4 - 1;
            if ((i9 & i4) == 0) {
                return i8 & i9;
            }
            return (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void p(int i4) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f54594H);
            sb.append("-worker-");
            if (i4 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i4);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void q(@l3.e Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final boolean t(@l3.d WorkerState workerState) {
            boolean z3;
            WorkerState workerState2 = this.f54601F;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                CoroutineScheduler.f54575N.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f54601F = workerState;
            }
            return z3;
        }

        public c(CoroutineScheduler coroutineScheduler, int i4) {
            this();
            p(i4);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i4, int i5, long j4, String str, int i6, C2197u c2197u) {
        this(i4, i5, (i6 & 4) != 0 ? n.f54635e : j4, (i6 & 8) != 0 ? n.f54631a : str);
    }
}
