package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.i0;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class k extends Thread {

    /* renamed from: E, reason: collision with root package name */
    private final BlockingQueue<Request<?>> f24488E;

    /* renamed from: F, reason: collision with root package name */
    private final j f24489F;

    /* renamed from: G, reason: collision with root package name */
    private final e f24490G;

    /* renamed from: H, reason: collision with root package name */
    private final q f24491H;

    /* renamed from: I, reason: collision with root package name */
    private volatile boolean f24492I = false;

    public k(BlockingQueue<Request<?>> blockingQueue, j jVar, e eVar, q qVar) {
        this.f24488E = blockingQueue;
        this.f24489F = jVar;
        this.f24490G = eVar;
        this.f24491H = qVar;
    }

    @TargetApi(14)
    private void a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.F());
    }

    private void b(Request<?> request, VolleyError volleyError) {
        this.f24491H.c(request, request.M(volleyError));
    }

    private void c() throws InterruptedException {
        d(this.f24488E.take());
    }

    @i0
    void d(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.O(3);
        try {
            try {
                try {
                    request.e("network-queue-take");
                } catch (VolleyError e4) {
                    e4.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                    b(request, e4);
                    request.K();
                }
            } catch (Exception e5) {
                s.d(e5, "Unhandled exception %s", e5.toString());
                VolleyError volleyError = new VolleyError(e5);
                volleyError.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f24491H.c(request, volleyError);
                request.K();
            }
            if (request.I()) {
                request.m("network-discard-cancelled");
                request.K();
                return;
            }
            a(request);
            l a4 = this.f24489F.a(request);
            request.e("network-http-complete");
            if (a4.f24497e && request.H()) {
                request.m("not-modified");
                request.K();
                return;
            }
            p<?> N3 = request.N(a4);
            request.e("network-parse-complete");
            if (request.Y() && N3.f24521b != null) {
                this.f24490G.d(request.q(), N3.f24521b);
                request.e("network-cache-written");
            }
            request.J();
            this.f24491H.a(request, N3);
            request.L(N3);
        } finally {
            request.O(4);
        }
    }

    public void e() {
        this.f24492I = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f24492I) {
                    Thread.currentThread().interrupt();
                    return;
                }
                s.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
