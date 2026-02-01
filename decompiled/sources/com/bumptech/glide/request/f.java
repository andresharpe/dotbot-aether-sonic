package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class f<R> implements d<R>, g<R> {

    /* renamed from: O, reason: collision with root package name */
    private static final a f26776O = new a();

    /* renamed from: E, reason: collision with root package name */
    private final int f26777E;

    /* renamed from: F, reason: collision with root package name */
    private final int f26778F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f26779G;

    /* renamed from: H, reason: collision with root package name */
    private final a f26780H;

    /* renamed from: I, reason: collision with root package name */
    @P
    @B("this")
    private R f26781I;

    /* renamed from: J, reason: collision with root package name */
    @P
    @B("this")
    private e f26782J;

    /* renamed from: K, reason: collision with root package name */
    @B("this")
    private boolean f26783K;

    /* renamed from: L, reason: collision with root package name */
    @B("this")
    private boolean f26784L;

    /* renamed from: M, reason: collision with root package name */
    @B("this")
    private boolean f26785M;

    /* renamed from: N, reason: collision with root package name */
    @P
    @B("this")
    private GlideException f26786N;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j4) throws InterruptedException {
            obj.wait(j4);
        }
    }

    public f(int i4, int i5) {
        this(i4, i5, true, f26776O);
    }

    private synchronized R i(Long l4) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f26779G && !isDone()) {
                n.a();
            }
            if (!this.f26783K) {
                if (!this.f26785M) {
                    if (this.f26784L) {
                        return this.f26781I;
                    }
                    if (l4 == null) {
                        this.f26780H.b(this, 0L);
                    } else if (l4.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l4.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            this.f26780H.b(this, longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.f26785M) {
                            if (!this.f26783K) {
                                if (this.f26784L) {
                                    return this.f26781I;
                                }
                                throw new TimeoutException();
                            }
                            throw new CancellationException();
                        }
                        throw new ExecutionException(this.f26786N);
                    }
                    throw new InterruptedException();
                }
                throw new ExecutionException(this.f26786N);
            }
            throw new CancellationException();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void a() {
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void c(@N o oVar) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f26783K = true;
                this.f26780H.a(this);
                e eVar = null;
                if (z3) {
                    e eVar2 = this.f26782J;
                    this.f26782J = null;
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void e(@N R r4, @P com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean g(@P GlideException glideException, Object obj, p<R> pVar, boolean z3) {
        this.f26785M = true;
        this.f26786N = glideException;
        this.f26780H.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return i(null);
        } catch (TimeoutException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean h(R r4, Object obj, p<R> pVar, DataSource dataSource, boolean z3) {
        this.f26784L = true;
        this.f26781I = r4;
        this.f26780H.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f26783K;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z3;
        if (!this.f26783K && !this.f26784L) {
            if (!this.f26785M) {
                z3 = false;
            }
        }
        z3 = true;
        return z3;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void l(@P e eVar) {
        this.f26782J = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void m(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @P
    public synchronized e q() {
        return this.f26782J;
    }

    @Override // com.bumptech.glide.request.target.p
    public void r(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void s(@N o oVar) {
        oVar.f(this.f26777E, this.f26778F);
    }

    f(int i4, int i5, boolean z3, a aVar) {
        this.f26777E = i4;
        this.f26778F = i5;
        this.f26779G = z3;
        this.f26780H = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j4, @N TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return i(Long.valueOf(timeUnit.toMillis(j4)));
    }
}
