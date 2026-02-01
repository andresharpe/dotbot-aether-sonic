package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC2347x0;

/* loaded from: classes2.dex */
final class f extends AbstractC2347x0 implements k, Executor {

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54615M = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final d f54616H;

    /* renamed from: I, reason: collision with root package name */
    private final int f54617I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private final String f54618J;

    /* renamed from: K, reason: collision with root package name */
    private final int f54619K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final ConcurrentLinkedQueue<Runnable> f54620L = new ConcurrentLinkedQueue<>();

    @l3.d
    private volatile /* synthetic */ int inFlightTasks = 0;

    public f(@l3.d d dVar, int i4, @l3.e String str, int i5) {
        this.f54616H = dVar;
        this.f54617I = i4;
        this.f54618J = str;
        this.f54619K = i5;
    }

    private final void n1(Runnable runnable, boolean z3) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54615M;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f54617I) {
                this.f54616H.q1(runnable, this, z3);
                return;
            }
            this.f54620L.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f54617I) {
                return;
            } else {
                runnable = this.f54620L.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void P() {
        Runnable poll = this.f54620L.poll();
        if (poll != null) {
            this.f54616H.q1(poll, this, true);
            return;
        }
        f54615M.decrementAndGet(this);
        Runnable poll2 = this.f54620L.poll();
        if (poll2 == null) {
            return;
        }
        n1(poll2, true);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@l3.d Runnable runnable) {
        n1(runnable, false);
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        n1(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public int i0() {
        return this.f54619K;
    }

    @Override // kotlinx.coroutines.N
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        n1(runnable, true);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0
    @l3.d
    public Executor m1() {
        return this;
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        String str = this.f54618J;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f54616H + ']';
        }
        return str;
    }
}
