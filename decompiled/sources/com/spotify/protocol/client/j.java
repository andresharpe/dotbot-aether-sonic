package com.spotify.protocol.client;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class j<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    protected volatile boolean f48877a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile o<T> f48878b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile g f48879c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f48880d = new CountDownLatch(1);

    @Override // com.spotify.protocol.client.i
    public i<T> a(g errorCallback) {
        this.f48879c = errorCallback;
        if (!c() && this.f48879c != null && this.f48878b != null && this.f48878b.a() != null) {
            this.f48879c.onError(this.f48878b.a());
        }
        return this;
    }

    @Override // com.spotify.protocol.client.i
    public o<T> b(long timeout, TimeUnit timeUnit) {
        try {
            if (!this.f48880d.await(timeout, timeUnit)) {
                this.f48878b = p.a(new Exception("Result was not delivered on time."));
            }
        } catch (InterruptedException e4) {
            this.f48878b = p.a(e4);
        }
        return this.f48878b;
    }

    @Override // com.spotify.protocol.client.i
    public boolean c() {
        return this.f48877a;
    }

    @Override // com.spotify.protocol.client.i
    public void cancel() {
        this.f48877a = true;
    }

    @Override // com.spotify.protocol.client.i
    public o<T> d() {
        try {
            this.f48880d.await();
        } catch (InterruptedException e4) {
            this.f48878b = p.a(e4);
        }
        return this.f48878b;
    }

    public void e(Throwable t3) {
        this.f48878b = p.a(t3);
        this.f48880d.countDown();
        if (!c() && this.f48879c != null) {
            this.f48879c.onError(this.f48878b.a());
        }
    }

    public void f(o<T> result) {
        this.f48878b = (o) d.a(result);
        this.f48880d.countDown();
        g();
    }

    protected abstract void g();
}
