package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC2337s0;

/* loaded from: classes2.dex */
public final class Y extends AbstractC2337s0 implements Runnable {

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    public static final Y f52996L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final String f52997M = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: N, reason: collision with root package name */
    private static final long f52998N = 1000;

    /* renamed from: O, reason: collision with root package name */
    private static final long f52999O;

    /* renamed from: P, reason: collision with root package name */
    private static final int f53000P = 0;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f53001Q = 1;

    /* renamed from: R, reason: collision with root package name */
    private static final int f53002R = 2;

    /* renamed from: S, reason: collision with root package name */
    private static final int f53003S = 3;

    /* renamed from: T, reason: collision with root package name */
    private static final int f53004T = 4;

    @l3.e
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l4;
        Y y3 = new Y();
        f52996L = y3;
        AbstractC2335r0.s1(y3, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f52999O = timeUnit.toNanos(l4.longValue());
    }

    private Y() {
    }

    private final synchronized void O1() {
        if (!T1()) {
            return;
        }
        debugStatus = 3;
        I1();
        notifyAll();
    }

    private final synchronized Thread P1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f52997M);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void R1() {
    }

    private final boolean S1() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean T1() {
        int i4 = debugStatus;
        if (i4 != 2 && i4 != 3) {
            return false;
        }
        return true;
    }

    private final synchronized boolean V1() {
        if (T1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void W1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC2339t0
    protected void A1(long j4, @l3.d AbstractC2337s0.c cVar) {
        W1();
    }

    @Override // kotlinx.coroutines.AbstractC2337s0
    public void F1(@l3.d Runnable runnable) {
        if (S1()) {
            W1();
        }
        super.F1(runnable);
    }

    public final synchronized void Q1() {
        debugStatus = 0;
        P1();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean U1() {
        if (_thread != null) {
            return true;
        }
        return false;
    }

    public final synchronized void X1(long j4) {
        kotlin.H0 h02;
        try {
            long currentTimeMillis = System.currentTimeMillis() + j4;
            if (!T1()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC2237b b4 = C2240c.b();
                    if (b4 != null) {
                        b4.g(thread);
                        h02 = kotlin.H0.f51801a;
                    } else {
                        h02 = null;
                    }
                    if (h02 == null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                } else {
                    wait(j4);
                }
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.H0 h02;
        long nanoTime;
        r1.f54556a.d(this);
        AbstractC2237b b4 = C2240c.b();
        if (b4 != null) {
            b4.d();
        }
        try {
            if (!V1()) {
                _thread = null;
                O1();
                AbstractC2237b b5 = C2240c.b();
                if (b5 != null) {
                    b5.h();
                }
                if (!t1()) {
                    z1();
                    return;
                }
                return;
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long w12 = w1();
                if (w12 == Long.MAX_VALUE) {
                    AbstractC2237b b6 = C2240c.b();
                    if (b6 != null) {
                        nanoTime = b6.b();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f52999O + nanoTime;
                    }
                    long j5 = j4 - nanoTime;
                    if (j5 > 0) {
                        w12 = kotlin.ranges.u.C(w12, j5);
                    } else {
                        _thread = null;
                        O1();
                        AbstractC2237b b7 = C2240c.b();
                        if (b7 != null) {
                            b7.h();
                        }
                        if (!t1()) {
                            z1();
                            return;
                        }
                        return;
                    }
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (w12 > 0) {
                    if (T1()) {
                        _thread = null;
                        O1();
                        AbstractC2237b b8 = C2240c.b();
                        if (b8 != null) {
                            b8.h();
                        }
                        if (!t1()) {
                            z1();
                            return;
                        }
                        return;
                    }
                    AbstractC2237b b9 = C2240c.b();
                    if (b9 != null) {
                        b9.c(this, w12);
                        h02 = kotlin.H0.f51801a;
                    } else {
                        h02 = null;
                    }
                    if (h02 == null) {
                        LockSupport.parkNanos(this, w12);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            O1();
            AbstractC2237b b10 = C2240c.b();
            if (b10 != null) {
                b10.h();
            }
            if (!t1()) {
                z1();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC2337s0, kotlinx.coroutines.AbstractC2335r0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.AbstractC2337s0, kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        return L1(j4, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC2339t0
    @l3.d
    protected Thread z1() {
        Thread thread = _thread;
        if (thread == null) {
            return P1();
        }
        return thread;
    }
}
