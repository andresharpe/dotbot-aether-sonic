package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.load.engine.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25865a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f25866b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    final Map<com.bumptech.glide.load.c, d> f25867c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f25868d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f25869e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f25870f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private volatile c f25871g;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ThreadFactoryC0224a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0225a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Runnable f25872E;

            RunnableC0225a(Runnable runnable) {
                this.f25872E = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f25872E.run();
            }
        }

        ThreadFactoryC0224a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@N Runnable runnable) {
            return new Thread(new RunnableC0225a(runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.c f25875a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f25876b;

        /* renamed from: c, reason: collision with root package name */
        @P
        u<?> f25877c;

        d(@N com.bumptech.glide.load.c cVar, @N p<?> pVar, @N ReferenceQueue<? super p<?>> referenceQueue, boolean z3) {
            super(pVar, referenceQueue);
            u<?> uVar;
            this.f25875a = (com.bumptech.glide.load.c) com.bumptech.glide.util.l.d(cVar);
            if (pVar.f() && z3) {
                uVar = (u) com.bumptech.glide.util.l.d(pVar.e());
            } else {
                uVar = null;
            }
            this.f25877c = uVar;
            this.f25876b = pVar.f();
        }

        void a() {
            this.f25877c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z3) {
        this(z3, Executors.newSingleThreadExecutor(new ThreadFactoryC0224a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(com.bumptech.glide.load.c cVar, p<?> pVar) {
        d put = this.f25867c.put(cVar, new d(cVar, pVar, this.f25868d, this.f25865a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f25870f) {
            try {
                c((d) this.f25868d.remove());
                c cVar = this.f25871g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@N d dVar) {
        u<?> uVar;
        synchronized (this) {
            this.f25867c.remove(dVar.f25875a);
            if (dVar.f25876b && (uVar = dVar.f25877c) != null) {
                this.f25869e.d(dVar.f25875a, new p<>(uVar, true, false, dVar.f25875a, this.f25869e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(com.bumptech.glide.load.c cVar) {
        d remove = this.f25867c.remove(cVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public synchronized p<?> e(com.bumptech.glide.load.c cVar) {
        d dVar = this.f25867c.get(cVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    @i0
    void f(c cVar) {
        this.f25871g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f25869e = aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    public void h() {
        this.f25870f = true;
        Executor executor = this.f25866b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.f.c((ExecutorService) executor);
        }
    }

    @i0
    a(boolean z3, Executor executor) {
        this.f25867c = new HashMap();
        this.f25868d = new ReferenceQueue<>();
        this.f25865a = z3;
        this.f25866b = executor;
        executor.execute(new b());
    }
}
