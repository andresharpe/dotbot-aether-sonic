package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class A<T> implements Future<T>, p.b<T>, p.a {

    /* renamed from: E, reason: collision with root package name */
    private Request<?> f24539E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f24540F = false;

    /* renamed from: G, reason: collision with root package name */
    private T f24541G;

    /* renamed from: H, reason: collision with root package name */
    private VolleyError f24542H;

    private A() {
    }

    private synchronized T d(Long l4) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f24542H == null) {
            if (this.f24540F) {
                return this.f24541G;
            }
            if (l4 == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l4.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l4.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.f24542H == null) {
                if (this.f24540F) {
                    return this.f24541G;
                }
                throw new TimeoutException();
            }
            throw new ExecutionException(this.f24542H);
        }
        throw new ExecutionException(this.f24542H);
    }

    public static <E> A<E> e() {
        return new A<>();
    }

    @Override // com.android.volley.p.b
    public synchronized void b(T t3) {
        this.f24540F = true;
        this.f24541G = t3;
        notifyAll();
    }

    @Override // com.android.volley.p.a
    public synchronized void c(VolleyError volleyError) {
        this.f24542H = volleyError;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z3) {
        if (this.f24539E == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.f24539E.f();
        return true;
    }

    public void g(Request<?> request) {
        this.f24539E = request;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return d(null);
        } catch (TimeoutException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Request<?> request = this.f24539E;
        if (request == null) {
            return false;
        }
        return request.I();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z3;
        if (!this.f24540F && this.f24542H == null) {
            if (!isCancelled()) {
                z3 = false;
            }
        }
        z3 = true;
        return z3;
    }

    @Override // java.util.concurrent.Future
    public T get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return d(Long.valueOf(TimeUnit.MILLISECONDS.convert(j4, timeUnit)));
    }
}
