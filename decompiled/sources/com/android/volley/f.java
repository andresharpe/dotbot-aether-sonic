package com.android.volley;

import android.os.Process;
import androidx.annotation.i0;
import com.android.volley.e;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class f extends Thread {

    /* renamed from: K, reason: collision with root package name */
    private static final boolean f24464K = s.f24525b;

    /* renamed from: E, reason: collision with root package name */
    private final BlockingQueue<Request<?>> f24465E;

    /* renamed from: F, reason: collision with root package name */
    private final BlockingQueue<Request<?>> f24466F;

    /* renamed from: G, reason: collision with root package name */
    private final e f24467G;

    /* renamed from: H, reason: collision with root package name */
    private final q f24468H;

    /* renamed from: I, reason: collision with root package name */
    private volatile boolean f24469I = false;

    /* renamed from: J, reason: collision with root package name */
    private final t f24470J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Request f24471E;

        a(Request request) {
            this.f24471E = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f24466F.put(this.f24471E);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public f(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, e eVar, q qVar) {
        this.f24465E = blockingQueue;
        this.f24466F = blockingQueue2;
        this.f24467G = eVar;
        this.f24468H = qVar;
        this.f24470J = new t(this, blockingQueue2, qVar);
    }

    private void b() throws InterruptedException {
        c(this.f24465E.take());
    }

    @i0
    void c(Request<?> request) throws InterruptedException {
        request.e("cache-queue-take");
        request.O(1);
        try {
            if (request.I()) {
                request.m("cache-discard-canceled");
                return;
            }
            e.a a4 = this.f24467G.a(request.q());
            if (a4 == null) {
                request.e("cache-miss");
                if (!this.f24470J.c(request)) {
                    this.f24466F.put(request);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a4.b(currentTimeMillis)) {
                request.e("cache-hit-expired");
                request.P(a4);
                if (!this.f24470J.c(request)) {
                    this.f24466F.put(request);
                }
                return;
            }
            request.e("cache-hit");
            p<?> N3 = request.N(new l(a4.f24456a, a4.f24462g));
            request.e("cache-hit-parsed");
            if (!N3.b()) {
                request.e("cache-parsing-failed");
                this.f24467G.c(request.q(), true);
                request.P(null);
                if (!this.f24470J.c(request)) {
                    this.f24466F.put(request);
                }
                return;
            }
            if (!a4.d(currentTimeMillis)) {
                this.f24468H.a(request, N3);
            } else {
                request.e("cache-hit-refresh-needed");
                request.P(a4);
                N3.f24523d = true;
                if (!this.f24470J.c(request)) {
                    this.f24468H.b(request, N3, new a(request));
                } else {
                    this.f24468H.a(request, N3);
                }
            }
        } finally {
            request.O(2);
        }
    }

    public void d() {
        this.f24469I = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f24464K) {
            s.f("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f24467G.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f24469I) {
                    Thread.currentThread().interrupt();
                    return;
                }
                s.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
