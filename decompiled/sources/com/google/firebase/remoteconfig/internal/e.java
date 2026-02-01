package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1763d;
import com.google.android.gms.tasks.InterfaceC1765f;
import com.google.android.gms.tasks.InterfaceC1766g;
import com.google.android.gms.tasks.InterfaceC1769j;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC0561d
/* loaded from: classes2.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    static final long f37413d = 5;

    /* renamed from: e, reason: collision with root package name */
    @B("ConfigCacheClient.class")
    private static final Map<String, e> f37414e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Executor f37415f = new androidx.profileinstaller.g();

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f37416a;

    /* renamed from: b, reason: collision with root package name */
    private final o f37417b;

    /* renamed from: c, reason: collision with root package name */
    @P
    @B("this")
    private AbstractC1770k<f> f37418c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b<TResult> implements InterfaceC1766g<TResult>, InterfaceC1765f, InterfaceC1763d {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f37419a;

        private b() {
            this.f37419a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.InterfaceC1763d
        public void a() {
            this.f37419a.countDown();
        }

        public void b() throws InterruptedException {
            this.f37419a.await();
        }

        @Override // com.google.android.gms.tasks.InterfaceC1766g
        public void c(TResult tresult) {
            this.f37419a.countDown();
        }

        @Override // com.google.android.gms.tasks.InterfaceC1765f
        public void d(@N Exception exc) {
            this.f37419a.countDown();
        }

        public boolean e(long j4, TimeUnit timeUnit) throws InterruptedException {
            return this.f37419a.await(j4, timeUnit);
        }
    }

    private e(ExecutorService executorService, o oVar) {
        this.f37416a = executorService;
        this.f37417b = oVar;
    }

    private static <TResult> TResult c(AbstractC1770k<TResult> abstractC1770k, long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f37415f;
        abstractC1770k.l(executor, bVar);
        abstractC1770k.i(executor, bVar);
        abstractC1770k.c(executor, bVar);
        if (bVar.e(j4, timeUnit)) {
            if (abstractC1770k.v()) {
                return abstractC1770k.r();
            }
            throw new ExecutionException(abstractC1770k.q());
        }
        throw new TimeoutException("Task await timed out.");
    }

    @i0
    public static synchronized void e() {
        synchronized (e.class) {
            f37414e.clear();
        }
    }

    public static synchronized e j(ExecutorService executorService, o oVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String c4 = oVar.c();
                Map<String, e> map = f37414e;
                if (!map.containsKey(c4)) {
                    map.put(c4, new e(executorService, oVar));
                }
                eVar = map.get(c4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k(f fVar) throws Exception {
        return this.f37417b.f(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k l(boolean z3, f fVar, Void r32) throws Exception {
        if (z3) {
            o(fVar);
        }
        return C1773n.g(fVar);
    }

    private synchronized void o(f fVar) {
        this.f37418c = C1773n.g(fVar);
    }

    public void d() {
        synchronized (this) {
            this.f37418c = C1773n.g(null);
        }
        this.f37417b.a();
    }

    public synchronized AbstractC1770k<f> f() {
        try {
            AbstractC1770k<f> abstractC1770k = this.f37418c;
            if (abstractC1770k != null) {
                if (abstractC1770k.u() && !this.f37418c.v()) {
                }
            }
            ExecutorService executorService = this.f37416a;
            final o oVar = this.f37417b;
            Objects.requireNonNull(oVar);
            this.f37418c = C1773n.d(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return o.this.e();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.f37418c;
    }

    @P
    public f g() {
        return h(5L);
    }

    @P
    @i0
    f h(long j4) {
        synchronized (this) {
            try {
                AbstractC1770k<f> abstractC1770k = this.f37418c;
                if (abstractC1770k != null && abstractC1770k.v()) {
                    return this.f37418c.r();
                }
                try {
                    return (f) c(f(), j4, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.d(com.google.firebase.remoteconfig.l.f37534x, "Reading from storage file failed.", e4);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    @i0
    synchronized AbstractC1770k<f> i() {
        return this.f37418c;
    }

    public AbstractC1770k<f> m(f fVar) {
        return n(fVar, true);
    }

    public AbstractC1770k<f> n(final f fVar, final boolean z3) {
        return C1773n.d(this.f37416a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k4;
                k4 = e.this.k(fVar);
                return k4;
            }
        }).x(this.f37416a, new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.internal.c
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k l4;
                l4 = e.this.l(z3, fVar, (Void) obj);
                return l4;
            }
        });
    }
}
