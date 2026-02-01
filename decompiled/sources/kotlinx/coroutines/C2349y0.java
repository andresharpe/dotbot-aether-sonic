package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlinx.coroutines.InterfaceC2241c0;
import kotlinx.coroutines.internal.C2300g;

/* renamed from: kotlinx.coroutines.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2349y0 extends AbstractC2347x0 implements InterfaceC2241c0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Executor f54764H;

    public C2349y0(@l3.d Executor executor) {
        this.f54764H = executor;
        C2300g.c(m1());
    }

    private final void n1(kotlin.coroutines.f fVar, RejectedExecutionException rejectedExecutionException) {
        O0.f(fVar, C2345w0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> o1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.f fVar, long j4) {
        try {
            return scheduledExecutorService.schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            n1(fVar, e4);
            return null;
        }
    }

    @Override // kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor m12 = m1();
        if (m12 instanceof ExecutorService) {
            executorService = (ExecutorService) m12;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof C2349y0) && ((C2349y0) obj).m1() == m1()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    public void h(long j4, @l3.d InterfaceC2333q<? super kotlin.H0> interfaceC2333q) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m12 = m1();
        ScheduledFuture<?> scheduledFuture = null;
        if (m12 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m12;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = o1(scheduledExecutorService, new g1(this, interfaceC2333q), interfaceC2333q.e(), j4);
        }
        if (scheduledFuture != null) {
            O0.w(interfaceC2333q, scheduledFuture);
        } else {
            Y.f52996L.h(j4, interfaceC2333q);
        }
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        Runnable runnable2;
        try {
            Executor m12 = m1();
            AbstractC2237b b4 = C2240c.b();
            if (b4 != null) {
                runnable2 = b4.i(runnable);
                if (runnable2 == null) {
                }
                m12.execute(runnable2);
            }
            runnable2 = runnable;
            m12.execute(runnable2);
        } catch (RejectedExecutionException e4) {
            AbstractC2237b b5 = C2240c.b();
            if (b5 != null) {
                b5.f();
            }
            n1(fVar, e4);
            C2322k0.c().h1(fVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(m1());
    }

    @Override // kotlinx.coroutines.AbstractC2347x0
    @l3.d
    public Executor m1() {
        return this.f54764H;
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        return m1().toString();
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor m12 = m1();
        ScheduledFuture<?> scheduledFuture = null;
        if (m12 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) m12;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = o1(scheduledExecutorService, runnable, fVar, j4);
        }
        if (scheduledFuture != null) {
            return new C2326m0(scheduledFuture);
        }
        return Y.f52996L.x0(j4, runnable, fVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object z0(long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        return InterfaceC2241c0.a.a(this, j4, cVar);
    }
}
