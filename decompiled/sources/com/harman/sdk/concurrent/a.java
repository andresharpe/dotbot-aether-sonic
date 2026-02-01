package com.harman.sdk.concurrent;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.N;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f47728a = "BackgroundWorker";

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList<Handler> f47729b;

    /* renamed from: c, reason: collision with root package name */
    private static int f47730c;

    /* renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f47731d;

    /* renamed from: e, reason: collision with root package name */
    private static int f47732e;

    /* renamed from: f, reason: collision with root package name */
    private static long f47733f;

    /* renamed from: g, reason: collision with root package name */
    private static ThreadPoolExecutor f47734g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements ThreadFactory {

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f47738E = new AtomicInteger(1);

        /* renamed from: F, reason: collision with root package name */
        private final String f47739F;

        /* renamed from: com.harman.sdk.concurrent.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0429a extends Thread {
            public C0429a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        public b(String str) {
            this.f47739F = str;
        }

        private String a() {
            return this.f47739F + " - WorkerThread-" + this.f47738E.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@N Runnable runnable) {
            C0429a c0429a = new C0429a(runnable, a());
            c0429a.setDaemon(true);
            return c0429a;
        }
    }

    static {
        ArrayList<Handler> arrayList = new ArrayList<>();
        f47729b = arrayList;
        arrayList.add(null);
        f47730c = 0;
        f47731d = null;
        f47732e = 10;
        f47733f = 16L;
        f47734g = null;
    }

    private a() {
    }

    public static ThreadPoolExecutor a() {
        if (f47731d == null) {
            synchronized (a.class) {
                try {
                    if (f47731d == null) {
                        f47731d = f(f47732e, f47728a);
                    }
                } finally {
                }
            }
        }
        return f47731d;
    }

    public static synchronized int b() {
        int size;
        synchronized (a.class) {
            size = f47729b.size();
        }
        return size;
    }

    public static ThreadPoolExecutor c() {
        if (f47734g == null) {
            synchronized (a.class) {
                try {
                    if (f47734g == null) {
                        f47734g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 16L, TimeUnit.SECONDS, new SynchronousQueue(), new b("BackgroundWorker-Prior"));
                    }
                } finally {
                }
            }
        }
        return f47734g;
    }

    public static synchronized long d() {
        long j4;
        synchronized (a.class) {
            j4 = f47733f;
        }
        return j4;
    }

    public static synchronized int e() {
        int i4;
        synchronized (a.class) {
            i4 = f47732e;
        }
        return i4;
    }

    public static ThreadPoolExecutor f(int i4, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, f47733f, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void g(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            a().submit(runnable);
        }
    }

    public static synchronized void h(int i4) {
        synchronized (a.class) {
            if (i4 > 0) {
                while (true) {
                    try {
                        ArrayList<Handler> arrayList = f47729b;
                        if (i4 == arrayList.size()) {
                            break;
                        }
                        if (i4 > arrayList.size()) {
                            arrayList.add(null);
                        } else if (!arrayList.remove((Object) null)) {
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static synchronized void i(long j4) {
        synchronized (a.class) {
            f47733f = j4;
            ThreadPoolExecutor threadPoolExecutor = f47731d;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.setKeepAliveTime(j4, TimeUnit.SECONDS);
            }
        }
    }

    public static synchronized void j(int i4) {
        synchronized (a.class) {
            if (i4 > 0) {
                try {
                    f47732e = i4;
                    ThreadPoolExecutor threadPoolExecutor = f47731d;
                    if (threadPoolExecutor != null) {
                        if (threadPoolExecutor.getCorePoolSize() > i4) {
                            f47731d.setCorePoolSize(f47732e);
                            f47731d.setMaximumPoolSize(f47732e);
                        } else if (f47731d.getCorePoolSize() < i4) {
                            f47731d.setMaximumPoolSize(f47732e);
                            f47731d.setCorePoolSize(f47732e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Future<?> k(Runnable runnable) {
        return a().submit(runnable);
    }

    public static Future<?> l(Runnable runnable, int i4) {
        return a().submit(new com.harman.sdk.concurrent.b(runnable, i4));
    }

    public static <T> Future<T> m(Callable<T> callable) {
        return a().submit(callable);
    }

    public static <T> Future<T> n(Callable<T> callable, int i4) {
        return a().submit(new com.harman.sdk.concurrent.b(callable, i4));
    }

    public static Future<?> o(Runnable runnable) {
        return c().submit(runnable);
    }

    public static Future<?> p(Runnable runnable, int i4) {
        return c().submit(new com.harman.sdk.concurrent.b(runnable, i4));
    }

    public static <T> Future<T> q(Callable<T> callable) {
        return c().submit(callable);
    }

    public static <T> Future<T> r(Callable<T> callable, int i4) {
        return c().submit(new com.harman.sdk.concurrent.b(callable, i4));
    }

    /* renamed from: com.harman.sdk.concurrent.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class HandlerThreadC0428a extends HandlerThread {

        /* renamed from: G, reason: collision with root package name */
        private static final AtomicInteger f47735G = new AtomicInteger(1);

        /* renamed from: E, reason: collision with root package name */
        private final Runnable f47736E;

        /* renamed from: F, reason: collision with root package name */
        private final Runnable f47737F;

        public HandlerThreadC0428a(String str, Runnable runnable, Runnable runnable2) {
            super(a(str));
            this.f47736E = runnable;
            this.f47737F = runnable2;
        }

        private static String a(String str) {
            return str + " - HandlerThread-" + f47735G.getAndIncrement();
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            Runnable runnable = this.f47736E;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
            Runnable runnable = this.f47737F;
            if (runnable != null) {
                runnable.run();
            }
        }

        public HandlerThreadC0428a(String str, int i4, Runnable runnable, Runnable runnable2) {
            super(a(str), i4);
            this.f47736E = runnable;
            this.f47737F = runnable2;
        }
    }
}
