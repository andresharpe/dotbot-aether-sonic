package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1614b2 extends Thread {

    /* renamed from: E, reason: collision with root package name */
    private final Object f30547E;

    /* renamed from: F, reason: collision with root package name */
    private final BlockingQueue f30548F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.B("threadLifeCycleLock")
    private boolean f30549G = false;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1620c2 f30550H;

    public C1614b2(C1620c2 c1620c2, String str, BlockingQueue blockingQueue) {
        this.f30550H = c1620c2;
        C1285y.l(str);
        C1285y.l(blockingQueue);
        this.f30547E = new Object();
        this.f30548F = blockingQueue;
        setName(str);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C1614b2 c1614b2;
        C1614b2 c1614b22;
        obj = this.f30550H.f30565i;
        synchronized (obj) {
            try {
                if (!this.f30549G) {
                    semaphore = this.f30550H.f30566j;
                    semaphore.release();
                    obj2 = this.f30550H.f30565i;
                    obj2.notifyAll();
                    C1620c2 c1620c2 = this.f30550H;
                    c1614b2 = c1620c2.f30559c;
                    if (this == c1614b2) {
                        c1620c2.f30559c = null;
                    } else {
                        c1614b22 = c1620c2.f30560d;
                        if (this == c1614b22) {
                            c1620c2.f30560d = null;
                        } else {
                            c1620c2.f31060a.b().p().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f30549G = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f30550H.f31060a.b().u().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f30547E) {
            this.f30547E.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i4;
        Object obj;
        boolean z3 = false;
        while (!z3) {
            try {
                semaphore = this.f30550H.f30566j;
                semaphore.acquire();
                z3 = true;
            } catch (InterruptedException e4) {
                c(e4);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C1608a2 c1608a2 = (C1608a2) this.f30548F.poll();
                if (c1608a2 != null) {
                    if (true != c1608a2.f30536F) {
                        i4 = 10;
                    } else {
                        i4 = threadPriority;
                    }
                    Process.setThreadPriority(i4);
                    c1608a2.run();
                } else {
                    synchronized (this.f30547E) {
                        if (this.f30548F.peek() == null) {
                            C1620c2.z(this.f30550H);
                            try {
                                this.f30547E.wait(30000L);
                            } catch (InterruptedException e5) {
                                c(e5);
                            }
                        }
                    }
                    obj = this.f30550H.f30565i;
                    synchronized (obj) {
                        if (this.f30548F.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
