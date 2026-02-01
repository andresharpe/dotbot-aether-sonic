package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.InterfaceC0566i;
import java.lang.Thread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f25300a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Map<Integer, ExecutorService>> f25301b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<g, ExecutorService> f25302c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final int f25303d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e, reason: collision with root package name */
    private static final Timer f25304e = new Timer();

    /* renamed from: f, reason: collision with root package name */
    private static final byte f25305f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f25306g = -2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f25307h = -4;

    /* renamed from: i, reason: collision with root package name */
    private static final byte f25308i = -8;

    /* renamed from: j, reason: collision with root package name */
    private static Executor f25309j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends TimerTask {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ExecutorService f25310E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ g f25311F;

        a(ExecutorService executorService, g gVar) {
            this.f25310E = executorService;
            this.f25311F = gVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f25310E.execute(this.f25311F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends TimerTask {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ExecutorService f25312E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ g f25313F;

        b(ExecutorService executorService, g gVar) {
            this.f25312E = executorService;
            this.f25313F = gVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f25312E.execute(this.f25313F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.N Runnable runnable) {
            y0.s0(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> extends g<T> {
        @Override // com.blankj.utilcode.util.y0.g
        public void j() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.blankj.utilcode.util.y0.g
        public void l(Throwable th) {
            Log.e("ThreadUtils", "onFail: ", th);
        }
    }

    /* loaded from: classes.dex */
    public static class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private CountDownLatch f25316a = new CountDownLatch(1);

        /* renamed from: b, reason: collision with root package name */
        private AtomicBoolean f25317b = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        private T f25318c;

        public T a() {
            if (!this.f25317b.get()) {
                try {
                    this.f25316a.await();
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            return this.f25318c;
        }

        public T b(long j4, TimeUnit timeUnit, T t3) {
            if (!this.f25317b.get()) {
                try {
                    this.f25316a.await(j4, timeUnit);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                    return t3;
                }
            }
            return this.f25318c;
        }

        public void c(T t3) {
            if (this.f25317b.compareAndSet(false, true)) {
                this.f25318c = t3;
                this.f25316a.countDown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<T> implements Runnable {

        /* renamed from: L, reason: collision with root package name */
        private static final int f25319L = 0;

        /* renamed from: M, reason: collision with root package name */
        private static final int f25320M = 1;

        /* renamed from: N, reason: collision with root package name */
        private static final int f25321N = 2;

        /* renamed from: O, reason: collision with root package name */
        private static final int f25322O = 3;

        /* renamed from: P, reason: collision with root package name */
        private static final int f25323P = 4;

        /* renamed from: Q, reason: collision with root package name */
        private static final int f25324Q = 5;

        /* renamed from: R, reason: collision with root package name */
        private static final int f25325R = 6;

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f25326E = new AtomicInteger(0);

        /* renamed from: F, reason: collision with root package name */
        private volatile boolean f25327F;

        /* renamed from: G, reason: collision with root package name */
        private volatile Thread f25328G;

        /* renamed from: H, reason: collision with root package name */
        private Timer f25329H;

        /* renamed from: I, reason: collision with root package name */
        private long f25330I;

        /* renamed from: J, reason: collision with root package name */
        private f f25331J;

        /* renamed from: K, reason: collision with root package name */
        private Executor f25332K;

        /* loaded from: classes.dex */
        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (!g.this.i() && g.this.f25331J != null) {
                    g.this.q();
                    g.this.f25331J.a();
                    g.this.k();
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Object f25334E;

            b(Object obj) {
                this.f25334E = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                g.this.m(this.f25334E);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Object f25336E;

            c(Object obj) {
                this.f25336E = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                g.this.m(this.f25336E);
                g.this.k();
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Throwable f25338E;

            d(Throwable th) {
                this.f25338E = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.l(this.f25338E);
                g.this.k();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.j();
                g.this.k();
            }
        }

        /* loaded from: classes.dex */
        public interface f {
            void a();
        }

        private Executor g() {
            Executor executor = this.f25332K;
            if (executor == null) {
                return y0.b();
            }
            return executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(boolean z3) {
            this.f25327F = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            synchronized (this.f25326E) {
                try {
                    if (this.f25326E.get() > 1) {
                        return;
                    }
                    this.f25326E.set(6);
                    if (this.f25328G != null) {
                        this.f25328G.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d() {
            e(true);
        }

        public void e(boolean z3) {
            synchronized (this.f25326E) {
                try {
                    if (this.f25326E.get() > 1) {
                        return;
                    }
                    this.f25326E.set(4);
                    if (z3 && this.f25328G != null) {
                        this.f25328G.interrupt();
                    }
                    g().execute(new e());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public abstract T f() throws Throwable;

        public boolean h() {
            if (this.f25326E.get() >= 4) {
                return true;
            }
            return false;
        }

        public boolean i() {
            if (this.f25326E.get() > 1) {
                return true;
            }
            return false;
        }

        public abstract void j();

        @InterfaceC0566i
        protected void k() {
            y0.f25302c.remove(this);
            Timer timer = this.f25329H;
            if (timer != null) {
                timer.cancel();
                this.f25329H = null;
                this.f25331J = null;
            }
        }

        public abstract void l(Throwable th);

        public abstract void m(T t3);

        public g<T> n(Executor executor) {
            this.f25332K = executor;
            return this;
        }

        public g<T> p(long j4, f fVar) {
            this.f25330I = j4;
            this.f25331J = fVar;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25327F) {
                if (this.f25328G == null) {
                    if (!this.f25326E.compareAndSet(0, 1)) {
                        return;
                    }
                    this.f25328G = Thread.currentThread();
                    if (this.f25331J != null) {
                        Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.f25326E.get() != 1) {
                    return;
                }
            } else {
                if (!this.f25326E.compareAndSet(0, 1)) {
                    return;
                }
                this.f25328G = Thread.currentThread();
                if (this.f25331J != null) {
                    Timer timer = new Timer();
                    this.f25329H = timer;
                    timer.schedule(new a(), this.f25330I);
                }
            }
            try {
                T f4 = f();
                if (this.f25327F) {
                    if (this.f25326E.get() != 1) {
                        return;
                    }
                    g().execute(new b(f4));
                } else {
                    if (!this.f25326E.compareAndSet(1, 3)) {
                        return;
                    }
                    g().execute(new c(f4));
                }
            } catch (InterruptedException unused) {
                this.f25326E.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (!this.f25326E.compareAndSet(1, 2)) {
                    return;
                }
                g().execute(new d(th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends ThreadPoolExecutor {

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f25341E;

        /* renamed from: F, reason: collision with root package name */
        private d f25342F;

        h(int i4, int i5, long j4, TimeUnit timeUnit, d dVar, ThreadFactory threadFactory) {
            super(i4, i5, j4, timeUnit, dVar, threadFactory);
            this.f25341E = new AtomicInteger();
            dVar.f25314E = this;
            this.f25342F = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService b(int i4, int i5) {
            if (i4 != -8) {
                if (i4 != -4) {
                    if (i4 != -2) {
                        if (i4 != -1) {
                            return new h(i4, i4, 0L, TimeUnit.MILLISECONDS, new d(), new i("fixed(" + i4 + ")", i5));
                        }
                        return new h(1, 1, 0L, TimeUnit.MILLISECONDS, new d(), new i("single", i5));
                    }
                    return new h(0, 128, 60L, TimeUnit.SECONDS, new d(true), new i("cached", i5));
                }
                return new h((y0.f25303d * 2) + 1, (y0.f25303d * 2) + 1, 30L, TimeUnit.SECONDS, new d(), new i("io", i5));
            }
            return new h(y0.f25303d + 1, (y0.f25303d * 2) + 1, 30L, TimeUnit.SECONDS, new d(true), new i("cpu", i5));
        }

        private int c() {
            return this.f25341E.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            this.f25341E.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@androidx.annotation.N Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f25341E.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f25342F.offer(runnable);
            } catch (Throwable unused2) {
                this.f25341E.decrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends AtomicLong implements ThreadFactory {

        /* renamed from: H, reason: collision with root package name */
        private static final AtomicInteger f25343H = new AtomicInteger(1);

        /* renamed from: I, reason: collision with root package name */
        private static final long f25344I = -9209200509960368598L;

        /* renamed from: E, reason: collision with root package name */
        private final String f25345E;

        /* renamed from: F, reason: collision with root package name */
        private final int f25346F;

        /* renamed from: G, reason: collision with root package name */
        private final boolean f25347G;

        /* loaded from: classes.dex */
        class a extends Thread {
            a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Thread.UncaughtExceptionHandler {
            b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        i(String str, int i4) {
            this(str, i4, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@androidx.annotation.N Runnable runnable) {
            a aVar = new a(runnable, this.f25345E + getAndIncrement());
            aVar.setDaemon(this.f25347G);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.f25346F);
            return aVar;
        }

        i(String str, int i4, boolean z3) {
            this.f25345E = str + "-pool-" + f25343H.getAndIncrement() + "-thread-";
            this.f25346F = i4;
            this.f25347G = z3;
        }
    }

    public static <T> void A(ExecutorService executorService, g<T> gVar) {
        h(executorService, gVar);
    }

    public static <T> void B(ExecutorService executorService, g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(executorService, gVar, j4, j5, timeUnit);
    }

    public static <T> void C(ExecutorService executorService, g<T> gVar, long j4, TimeUnit timeUnit) {
        j(executorService, gVar, 0L, j4, timeUnit);
    }

    public static <T> void D(ExecutorService executorService, g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(executorService, gVar, j4, timeUnit);
    }

    public static <T> void E(@androidx.annotation.F(from = 1) int i4, g<T> gVar) {
        h(n0(i4), gVar);
    }

    public static <T> void F(@androidx.annotation.F(from = 1) int i4, g<T> gVar, @androidx.annotation.F(from = 1, to = 10) int i5) {
        h(o0(i4, i5), gVar);
    }

    public static <T> void G(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(n0(i4), gVar, j4, j5, timeUnit);
    }

    public static <T> void H(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, long j5, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i5) {
        j(o0(i4, i5), gVar, j4, j5, timeUnit);
    }

    public static <T> void I(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, TimeUnit timeUnit) {
        j(n0(i4), gVar, 0L, j4, timeUnit);
    }

    public static <T> void J(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i5) {
        j(o0(i4, i5), gVar, 0L, j4, timeUnit);
    }

    public static <T> void K(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(n0(i4), gVar, j4, timeUnit);
    }

    public static <T> void L(@androidx.annotation.F(from = 1) int i4, g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i5) {
        c0(o0(i4, i5), gVar, j4, timeUnit);
    }

    public static <T> void M(g<T> gVar) {
        h(n0(-4), gVar);
    }

    public static <T> void N(g<T> gVar, @androidx.annotation.F(from = 1, to = 10) int i4) {
        h(o0(-4, i4), gVar);
    }

    public static <T> void O(g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(n0(-4), gVar, j4, j5, timeUnit);
    }

    public static <T> void P(g<T> gVar, long j4, long j5, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-4, i4), gVar, j4, j5, timeUnit);
    }

    public static <T> void Q(g<T> gVar, long j4, TimeUnit timeUnit) {
        j(n0(-4), gVar, 0L, j4, timeUnit);
    }

    public static <T> void R(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-4, i4), gVar, 0L, j4, timeUnit);
    }

    public static <T> void S(g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(n0(-4), gVar, j4, timeUnit);
    }

    public static <T> void T(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        c0(o0(-4, i4), gVar, j4, timeUnit);
    }

    public static <T> void U(g<T> gVar) {
        h(n0(-1), gVar);
    }

    public static <T> void V(g<T> gVar, @androidx.annotation.F(from = 1, to = 10) int i4) {
        h(o0(-1, i4), gVar);
    }

    public static <T> void W(g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(n0(-1), gVar, j4, j5, timeUnit);
    }

    public static <T> void X(g<T> gVar, long j4, long j5, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-1, i4), gVar, j4, j5, timeUnit);
    }

    public static <T> void Y(g<T> gVar, long j4, TimeUnit timeUnit) {
        j(n0(-1), gVar, 0L, j4, timeUnit);
    }

    public static <T> void Z(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-1, i4), gVar, 0L, j4, timeUnit);
    }

    public static <T> void a0(g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(n0(-1), gVar, j4, timeUnit);
    }

    static /* synthetic */ Executor b() {
        return j0();
    }

    public static <T> void b0(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        c0(o0(-1, i4), gVar, j4, timeUnit);
    }

    private static <T> void c0(ExecutorService executorService, g<T> gVar, long j4, TimeUnit timeUnit) {
        i(executorService, gVar, j4, 0L, timeUnit);
    }

    public static void d(g gVar) {
        if (gVar == null) {
            return;
        }
        gVar.d();
    }

    public static ExecutorService d0() {
        return n0(-2);
    }

    public static void e(List<g> list) {
        if (list != null && list.size() != 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.d();
                }
            }
        }
    }

    public static ExecutorService e0(@androidx.annotation.F(from = 1, to = 10) int i4) {
        return o0(-2, i4);
    }

    public static void f(ExecutorService executorService) {
        if (executorService instanceof h) {
            for (Map.Entry<g, ExecutorService> entry : f25302c.entrySet()) {
                if (entry.getValue() == executorService) {
                    d(entry.getKey());
                }
            }
            return;
        }
        Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
    }

    public static ExecutorService f0() {
        return n0(-8);
    }

    public static void g(g... gVarArr) {
        if (gVarArr != null && gVarArr.length != 0) {
            for (g gVar : gVarArr) {
                if (gVar != null) {
                    gVar.d();
                }
            }
        }
    }

    public static ExecutorService g0(@androidx.annotation.F(from = 1, to = 10) int i4) {
        return o0(-8, i4);
    }

    private static <T> void h(ExecutorService executorService, g<T> gVar) {
        i(executorService, gVar, 0L, 0L, null);
    }

    public static ExecutorService h0(@androidx.annotation.F(from = 1) int i4) {
        return n0(i4);
    }

    private static <T> void i(ExecutorService executorService, g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        Map<g, ExecutorService> map = f25302c;
        synchronized (map) {
            try {
                if (map.get(gVar) != null) {
                    Log.e("ThreadUtils", "Task can only be executed once.");
                    return;
                }
                map.put(gVar, executorService);
                if (j5 != 0) {
                    gVar.o(true);
                    f25304e.scheduleAtFixedRate(new b(executorService, gVar), timeUnit.toMillis(j4), timeUnit.toMillis(j5));
                } else if (j4 == 0) {
                    executorService.execute(gVar);
                } else {
                    f25304e.schedule(new a(executorService, gVar), timeUnit.toMillis(j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ExecutorService i0(@androidx.annotation.F(from = 1) int i4, @androidx.annotation.F(from = 1, to = 10) int i5) {
        return o0(i4, i5);
    }

    private static <T> void j(ExecutorService executorService, g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        i(executorService, gVar, j4, j5, timeUnit);
    }

    private static Executor j0() {
        if (f25309j == null) {
            f25309j = new c();
        }
        return f25309j;
    }

    public static <T> void k(g<T> gVar) {
        h(n0(-2), gVar);
    }

    public static ExecutorService k0() {
        return n0(-4);
    }

    public static <T> void l(g<T> gVar, @androidx.annotation.F(from = 1, to = 10) int i4) {
        h(o0(-2, i4), gVar);
    }

    public static ExecutorService l0(@androidx.annotation.F(from = 1, to = 10) int i4) {
        return o0(-4, i4);
    }

    public static <T> void m(g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(n0(-2), gVar, j4, j5, timeUnit);
    }

    public static Handler m0() {
        return f25300a;
    }

    public static <T> void n(g<T> gVar, long j4, long j5, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-2, i4), gVar, j4, j5, timeUnit);
    }

    private static ExecutorService n0(int i4) {
        return o0(i4, 5);
    }

    public static <T> void o(g<T> gVar, long j4, TimeUnit timeUnit) {
        j(n0(-2), gVar, 0L, j4, timeUnit);
    }

    private static ExecutorService o0(int i4, int i5) {
        ExecutorService executorService;
        Map<Integer, Map<Integer, ExecutorService>> map = f25301b;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i4));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorService = h.b(i4, i5);
                    concurrentHashMap.put(Integer.valueOf(i5), executorService);
                    map.put(Integer.valueOf(i4), concurrentHashMap);
                } else {
                    executorService = map2.get(Integer.valueOf(i5));
                    if (executorService == null) {
                        executorService = h.b(i4, i5);
                        map2.put(Integer.valueOf(i5), executorService);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static <T> void p(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-2, i4), gVar, 0L, j4, timeUnit);
    }

    public static ExecutorService p0() {
        return n0(-1);
    }

    public static <T> void q(g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(n0(-2), gVar, j4, timeUnit);
    }

    public static ExecutorService q0(@androidx.annotation.F(from = 1, to = 10) int i4) {
        return o0(-1, i4);
    }

    public static <T> void r(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        c0(o0(-2, i4), gVar, j4, timeUnit);
    }

    public static boolean r0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static <T> void s(g<T> gVar) {
        h(n0(-8), gVar);
    }

    public static void s0(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f25300a.post(runnable);
        }
    }

    public static <T> void t(g<T> gVar, @androidx.annotation.F(from = 1, to = 10) int i4) {
        h(o0(-8, i4), gVar);
    }

    public static void t0(Runnable runnable, long j4) {
        f25300a.postDelayed(runnable, j4);
    }

    public static <T> void u(g<T> gVar, long j4, long j5, TimeUnit timeUnit) {
        j(n0(-8), gVar, j4, j5, timeUnit);
    }

    public static void u0(Executor executor) {
        f25309j = executor;
    }

    public static <T> void v(g<T> gVar, long j4, long j5, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-8, i4), gVar, j4, j5, timeUnit);
    }

    public static <T> void w(g<T> gVar, long j4, TimeUnit timeUnit) {
        j(n0(-8), gVar, 0L, j4, timeUnit);
    }

    public static <T> void x(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        j(o0(-8, i4), gVar, 0L, j4, timeUnit);
    }

    public static <T> void y(g<T> gVar, long j4, TimeUnit timeUnit) {
        c0(n0(-8), gVar, j4, timeUnit);
    }

    public static <T> void z(g<T> gVar, long j4, TimeUnit timeUnit, @androidx.annotation.F(from = 1, to = 10) int i4) {
        c0(o0(-8, i4), gVar, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends LinkedBlockingQueue<Runnable> {

        /* renamed from: E, reason: collision with root package name */
        private volatile h f25314E;

        /* renamed from: F, reason: collision with root package name */
        private int f25315F;

        d() {
            this.f25315F = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean offer(@androidx.annotation.N Runnable runnable) {
            if (this.f25315F <= size() && this.f25314E != null && this.f25314E.getPoolSize() < this.f25314E.getMaximumPoolSize()) {
                return false;
            }
            return super.offer(runnable);
        }

        d(boolean z3) {
            this.f25315F = Integer.MAX_VALUE;
            if (z3) {
                this.f25315F = 0;
            }
        }

        d(int i4) {
            this.f25315F = i4;
        }
    }
}
