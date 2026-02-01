package com.bumptech.glide.load.engine;

import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.i0;
import androidx.core.util.t;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class l<R> implements h.b<R>, a.f {

    /* renamed from: d0, reason: collision with root package name */
    private static final c f26142d0 = new c();

    /* renamed from: E, reason: collision with root package name */
    final e f26143E;

    /* renamed from: F, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f26144F;

    /* renamed from: G, reason: collision with root package name */
    private final p.a f26145G;

    /* renamed from: H, reason: collision with root package name */
    private final t.a<l<?>> f26146H;

    /* renamed from: I, reason: collision with root package name */
    private final c f26147I;

    /* renamed from: J, reason: collision with root package name */
    private final m f26148J;

    /* renamed from: K, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f26149K;

    /* renamed from: L, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f26150L;

    /* renamed from: M, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f26151M;

    /* renamed from: N, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f26152N;

    /* renamed from: O, reason: collision with root package name */
    private final AtomicInteger f26153O;

    /* renamed from: P, reason: collision with root package name */
    private com.bumptech.glide.load.c f26154P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f26155Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f26156R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f26157S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f26158T;

    /* renamed from: U, reason: collision with root package name */
    private u<?> f26159U;

    /* renamed from: V, reason: collision with root package name */
    DataSource f26160V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f26161W;

    /* renamed from: X, reason: collision with root package name */
    GlideException f26162X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f26163Y;

    /* renamed from: Z, reason: collision with root package name */
    p<?> f26164Z;

    /* renamed from: a0, reason: collision with root package name */
    private h<R> f26165a0;

    /* renamed from: b0, reason: collision with root package name */
    private volatile boolean f26166b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f26167c0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final com.bumptech.glide.request.i f26168E;

        a(com.bumptech.glide.request.i iVar) {
            this.f26168E = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f26168E.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f26143E.c(this.f26168E)) {
                            l.this.c(this.f26168E);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final com.bumptech.glide.request.i f26170E;

        b(com.bumptech.glide.request.i iVar) {
            this.f26170E = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f26170E.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f26143E.c(this.f26170E)) {
                            l.this.f26164Z.b();
                            l.this.f(this.f26170E);
                            l.this.s(this.f26170E);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> p<R> a(u<R> uVar, boolean z3, com.bumptech.glide.load.c cVar, p.a aVar) {
            return new p<>(uVar, z3, true, cVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.i f26172a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f26173b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f26172a = iVar;
            this.f26173b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f26172a.equals(((d) obj).f26172a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26172a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: E, reason: collision with root package name */
        private final List<d> f26174E;

        e() {
            this(new ArrayList(2));
        }

        private static d f(com.bumptech.glide.request.i iVar) {
            return new d(iVar, com.bumptech.glide.util.f.a());
        }

        void b(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f26174E.add(new d(iVar, executor));
        }

        boolean c(com.bumptech.glide.request.i iVar) {
            return this.f26174E.contains(f(iVar));
        }

        void clear() {
            this.f26174E.clear();
        }

        e d() {
            return new e(new ArrayList(this.f26174E));
        }

        void g(com.bumptech.glide.request.i iVar) {
            this.f26174E.remove(f(iVar));
        }

        boolean isEmpty() {
            return this.f26174E.isEmpty();
        }

        @Override // java.lang.Iterable
        @N
        public Iterator<d> iterator() {
            return this.f26174E.iterator();
        }

        int size() {
            return this.f26174E.size();
        }

        e(List<d> list) {
            this.f26174E = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, t.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, f26142d0);
    }

    private com.bumptech.glide.load.engine.executor.a j() {
        if (this.f26156R) {
            return this.f26151M;
        }
        if (this.f26157S) {
            return this.f26152N;
        }
        return this.f26150L;
    }

    private boolean n() {
        if (!this.f26163Y && !this.f26161W && !this.f26166b0) {
            return false;
        }
        return true;
    }

    private synchronized void r() {
        if (this.f26154P != null) {
            this.f26143E.clear();
            this.f26154P = null;
            this.f26164Z = null;
            this.f26159U = null;
            this.f26163Y = false;
            this.f26166b0 = false;
            this.f26161W = false;
            this.f26167c0 = false;
            this.f26165a0.A(false);
            this.f26165a0 = null;
            this.f26162X = null;
            this.f26160V = null;
            this.f26146H.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.f26162X = glideException;
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(com.bumptech.glide.request.i iVar, Executor executor) {
        try {
            this.f26144F.c();
            this.f26143E.b(iVar, executor);
            if (this.f26161W) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f26163Y) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                com.bumptech.glide.util.l.a(!this.f26166b0, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @B("this")
    void c(com.bumptech.glide.request.i iVar) {
        try {
            iVar.a(this.f26162X);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void d(u<R> uVar, DataSource dataSource, boolean z3) {
        synchronized (this) {
            this.f26159U = uVar;
            this.f26160V = dataSource;
            this.f26167c0 = z3;
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void e(h<?> hVar) {
        j().execute(hVar);
    }

    @B("this")
    void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.d(this.f26164Z, this.f26160V, this.f26167c0);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @N
    public com.bumptech.glide.util.pool.c g() {
        return this.f26144F;
    }

    void h() {
        if (n()) {
            return;
        }
        this.f26166b0 = true;
        this.f26165a0.i();
        this.f26148J.c(this, this.f26154P);
    }

    void i() {
        boolean z3;
        p<?> pVar;
        synchronized (this) {
            try {
                this.f26144F.c();
                com.bumptech.glide.util.l.a(n(), "Not yet complete!");
                int decrementAndGet = this.f26153O.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.bumptech.glide.util.l.a(z3, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f26164Z;
                    r();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    synchronized void k(int i4) {
        p<?> pVar;
        com.bumptech.glide.util.l.a(n(), "Not yet complete!");
        if (this.f26153O.getAndAdd(i4) == 0 && (pVar = this.f26164Z) != null) {
            pVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    public synchronized l<R> l(com.bumptech.glide.load.c cVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f26154P = cVar;
        this.f26155Q = z3;
        this.f26156R = z4;
        this.f26157S = z5;
        this.f26158T = z6;
        return this;
    }

    synchronized boolean m() {
        return this.f26166b0;
    }

    void o() {
        synchronized (this) {
            try {
                this.f26144F.c();
                if (this.f26166b0) {
                    r();
                    return;
                }
                if (!this.f26143E.isEmpty()) {
                    if (!this.f26163Y) {
                        this.f26163Y = true;
                        com.bumptech.glide.load.c cVar = this.f26154P;
                        e d4 = this.f26143E.d();
                        k(d4.size() + 1);
                        this.f26148J.b(this, cVar, null);
                        Iterator<d> it = d4.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.f26173b.execute(new a(next.f26172a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                }
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void p() {
        synchronized (this) {
            try {
                this.f26144F.c();
                if (this.f26166b0) {
                    this.f26159U.a();
                    r();
                    return;
                }
                if (!this.f26143E.isEmpty()) {
                    if (!this.f26161W) {
                        this.f26164Z = this.f26147I.a(this.f26159U, this.f26155Q, this.f26154P, this.f26145G);
                        this.f26161W = true;
                        e d4 = this.f26143E.d();
                        k(d4.size() + 1);
                        this.f26148J.b(this, this.f26154P, this.f26164Z);
                        Iterator<d> it = d4.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            next.f26173b.execute(new b(next.f26172a));
                        }
                        i();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                }
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.f26158T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void s(com.bumptech.glide.request.i iVar) {
        try {
            this.f26144F.c();
            this.f26143E.g(iVar);
            if (this.f26143E.isEmpty()) {
                h();
                if (!this.f26161W) {
                    if (this.f26163Y) {
                    }
                }
                if (this.f26153O.get() == 0) {
                    r();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(h<R> hVar) {
        com.bumptech.glide.load.engine.executor.a j4;
        try {
            this.f26165a0 = hVar;
            if (hVar.G()) {
                j4 = this.f26149K;
            } else {
                j4 = j();
            }
            j4.execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @i0
    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, t.a<l<?>> aVar6, c cVar) {
        this.f26143E = new e();
        this.f26144F = com.bumptech.glide.util.pool.c.a();
        this.f26153O = new AtomicInteger();
        this.f26149K = aVar;
        this.f26150L = aVar2;
        this.f26151M = aVar3;
        this.f26152N = aVar4;
        this.f26148J = mVar;
        this.f26145G = aVar5;
        this.f26146H = aVar6;
        this.f26147I = cVar;
    }
}
