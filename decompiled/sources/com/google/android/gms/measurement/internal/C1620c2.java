package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1620c2 extends A2 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f30558l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private C1614b2 f30559c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private C1614b2 f30560d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f30561e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f30562f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f30563g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f30564h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f30565i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f30566j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f30567k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1620c2(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30565i = new Object();
        this.f30566j = new Semaphore(2);
        this.f30561e = new PriorityBlockingQueue();
        this.f30562f = new LinkedBlockingQueue();
        this.f30563g = new Z1(this, "Thread death: Uncaught exception on worker thread");
        this.f30564h = new Z1(this, "Thread death: Uncaught exception on network thread");
    }

    private final void B(C1608a2 c1608a2) {
        synchronized (this.f30565i) {
            try {
                this.f30561e.add(c1608a2);
                C1614b2 c1614b2 = this.f30559c;
                if (c1614b2 == null) {
                    C1614b2 c1614b22 = new C1614b2(this, "Measurement Worker", this.f30561e);
                    this.f30559c = c1614b22;
                    c1614b22.setUncaughtExceptionHandler(this.f30563g);
                    this.f30559c.start();
                } else {
                    c1614b2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean z(C1620c2 c1620c2) {
        boolean z3 = c1620c2.f30567k;
        return false;
    }

    public final boolean A() {
        if (Thread.currentThread() == this.f30559c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C1757z2
    public final void e() {
        if (Thread.currentThread() == this.f30560d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1757z2
    public final void f() {
        if (Thread.currentThread() == this.f30559c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.A2
    protected final boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public final Object p(AtomicReference atomicReference, long j4, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f31060a.a().x(runnable);
            try {
                atomicReference.wait(j4);
            } catch (InterruptedException unused) {
                this.f31060a.b().u().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f31060a.b().u().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future q(Callable callable) throws IllegalStateException {
        i();
        C1285y.l(callable);
        C1608a2 c1608a2 = new C1608a2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30559c) {
            if (!this.f30561e.isEmpty()) {
                this.f31060a.b().u().a("Callable skipped the worker queue.");
            }
            c1608a2.run();
        } else {
            B(c1608a2);
        }
        return c1608a2;
    }

    public final Future r(Callable callable) throws IllegalStateException {
        i();
        C1285y.l(callable);
        C1608a2 c1608a2 = new C1608a2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f30559c) {
            c1608a2.run();
        } else {
            B(c1608a2);
        }
        return c1608a2;
    }

    public final void w(Runnable runnable) throws IllegalStateException {
        i();
        C1285y.l(runnable);
        C1608a2 c1608a2 = new C1608a2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f30565i) {
            try {
                this.f30562f.add(c1608a2);
                C1614b2 c1614b2 = this.f30560d;
                if (c1614b2 == null) {
                    C1614b2 c1614b22 = new C1614b2(this, "Measurement Network", this.f30562f);
                    this.f30560d = c1614b22;
                    c1614b22.setUncaughtExceptionHandler(this.f30564h);
                    this.f30560d.start();
                } else {
                    c1614b2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(Runnable runnable) throws IllegalStateException {
        i();
        C1285y.l(runnable);
        B(new C1608a2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        i();
        C1285y.l(runnable);
        B(new C1608a2(this, runnable, true, "Task exception on worker thread"));
    }
}
