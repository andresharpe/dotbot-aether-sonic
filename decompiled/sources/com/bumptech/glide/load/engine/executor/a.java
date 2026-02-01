package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.i0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: F, reason: collision with root package name */
    private static final String f26010F = "source";

    /* renamed from: G, reason: collision with root package name */
    private static final String f26011G = "disk-cache";

    /* renamed from: H, reason: collision with root package name */
    private static final int f26012H = 1;

    /* renamed from: I, reason: collision with root package name */
    private static final String f26013I = "GlideExecutor";

    /* renamed from: J, reason: collision with root package name */
    private static final String f26014J = "source-unlimited";

    /* renamed from: K, reason: collision with root package name */
    private static final String f26015K = "animation";

    /* renamed from: L, reason: collision with root package name */
    private static final long f26016L = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: M, reason: collision with root package name */
    private static final int f26017M = 4;

    /* renamed from: N, reason: collision with root package name */
    private static volatile int f26018N;

    /* renamed from: E, reason: collision with root package name */
    private final ExecutorService f26019E;

    /* renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0227a {

        /* renamed from: g, reason: collision with root package name */
        public static final long f26020g = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26021a;

        /* renamed from: b, reason: collision with root package name */
        private int f26022b;

        /* renamed from: c, reason: collision with root package name */
        private int f26023c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private c f26024d = c.f26036d;

        /* renamed from: e, reason: collision with root package name */
        private String f26025e;

        /* renamed from: f, reason: collision with root package name */
        private long f26026f;

        C0227a(boolean z3) {
            this.f26021a = z3;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f26025e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f26022b, this.f26023c, this.f26026f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f26025e, this.f26024d, this.f26021a));
                if (this.f26026f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f26025e);
        }

        public C0227a b(String str) {
            this.f26025e = str;
            return this;
        }

        public C0227a c(@F(from = 1) int i4) {
            this.f26022b = i4;
            this.f26023c = i4;
            return this;
        }

        public C0227a d(long j4) {
            this.f26026f = j4;
            return this;
        }

        public C0227a e(@N c cVar) {
            this.f26024d = cVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: I, reason: collision with root package name */
        private static final int f26027I = 9;

        /* renamed from: E, reason: collision with root package name */
        private final String f26028E;

        /* renamed from: F, reason: collision with root package name */
        final c f26029F;

        /* renamed from: G, reason: collision with root package name */
        final boolean f26030G;

        /* renamed from: H, reason: collision with root package name */
        private int f26031H;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0228a extends Thread {
            C0228a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f26030G) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f26029F.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z3) {
            this.f26028E = str;
            this.f26029F = cVar;
            this.f26030G = z3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@N Runnable runnable) {
            C0228a c0228a;
            c0228a = new C0228a(runnable, "glide-" + this.f26028E + "-thread-" + this.f26031H);
            this.f26031H = this.f26031H + 1;
            return c0228a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26033a = new C0229a();

        /* renamed from: b, reason: collision with root package name */
        public static final c f26034b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f26035c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f26036d;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0229a implements c {
            C0229a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
            }
        }

        /* loaded from: classes.dex */
        class b implements c {
            b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
                if (th != null && Log.isLoggable(a.f26013I, 6)) {
                    Log.e(a.f26013I, "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0230c implements c {
            C0230c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
                if (th == null) {
                } else {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f26034b = bVar;
            f26035c = new C0230c();
            f26036d = bVar;
        }

        void a(Throwable th);
    }

    @i0
    a(ExecutorService executorService) {
        this.f26019E = executorService;
    }

    public static int a() {
        if (f26018N == 0) {
            f26018N = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return f26018N;
    }

    public static C0227a b() {
        int i4;
        if (a() >= 4) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        return new C0227a(true).c(i4).b(f26015K);
    }

    public static a c() {
        return b().a();
    }

    @Deprecated
    public static a d(int i4, c cVar) {
        return b().c(i4).e(cVar).a();
    }

    public static C0227a e() {
        return new C0227a(true).c(1).b(f26011G);
    }

    public static a f() {
        return e().a();
    }

    @Deprecated
    public static a g(int i4, String str, c cVar) {
        return e().c(i4).b(str).e(cVar).a();
    }

    @Deprecated
    public static a h(c cVar) {
        return e().e(cVar).a();
    }

    public static C0227a i() {
        return new C0227a(false).c(a()).b("source");
    }

    public static a j() {
        return i().a();
    }

    @Deprecated
    public static a k(int i4, String str, c cVar) {
        return i().c(i4).b(str).e(cVar).a();
    }

    @Deprecated
    public static a l(c cVar) {
        return i().e(cVar).a();
    }

    public static a m() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f26016L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(f26014J, c.f26036d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, @N TimeUnit timeUnit) throws InterruptedException {
        return this.f26019E.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@N Runnable runnable) {
        this.f26019E.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public <T> List<Future<T>> invokeAll(@N Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f26019E.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public <T> T invokeAny(@N Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f26019E.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f26019E.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f26019E.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f26019E.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public List<Runnable> shutdownNow() {
        return this.f26019E.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public Future<?> submit(@N Runnable runnable) {
        return this.f26019E.submit(runnable);
    }

    public String toString() {
        return this.f26019E.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public <T> List<Future<T>> invokeAll(@N Collection<? extends Callable<T>> collection, long j4, @N TimeUnit timeUnit) throws InterruptedException {
        return this.f26019E.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@N Collection<? extends Callable<T>> collection, long j4, @N TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f26019E.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public <T> Future<T> submit(@N Runnable runnable, T t3) {
        return this.f26019E.submit(runnable, t3);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@N Callable<T> callable) {
        return this.f26019E.submit(callable);
    }
}
