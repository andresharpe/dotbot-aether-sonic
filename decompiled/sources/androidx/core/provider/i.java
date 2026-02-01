package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.core.util.InterfaceC0764e;
import androidx.core.util.u;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class i {

    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: E, reason: collision with root package name */
        private String f12820E;

        /* renamed from: F, reason: collision with root package name */
        private int f12821F;

        /* renamed from: androidx.core.provider.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0096a extends Thread {

            /* renamed from: E, reason: collision with root package name */
            private final int f12822E;

            C0096a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f12822E = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f12822E);
                super.run();
            }
        }

        a(@N String str, int i4) {
            this.f12820E = str;
            this.f12821F = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0096a(runnable, this.f12820E, this.f12821F);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements Executor {

        /* renamed from: E, reason: collision with root package name */
        private final Handler f12823E;

        b(@N Handler handler) {
            this.f12823E = (Handler) u.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            if (this.f12823E.post((Runnable) u.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f12823E + " is shutting down");
        }
    }

    /* loaded from: classes.dex */
    private static class c<T> implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        @N
        private Callable<T> f12824E;

        /* renamed from: F, reason: collision with root package name */
        @N
        private InterfaceC0764e<T> f12825F;

        /* renamed from: G, reason: collision with root package name */
        @N
        private Handler f12826G;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InterfaceC0764e f12827E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ Object f12828F;

            a(InterfaceC0764e interfaceC0764e, Object obj) {
                this.f12827E = interfaceC0764e;
                this.f12828F = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f12827E.accept(this.f12828F);
            }
        }

        c(@N Handler handler, @N Callable<T> callable, @N InterfaceC0764e<T> interfaceC0764e) {
            this.f12824E = callable;
            this.f12825F = interfaceC0764e;
            this.f12826G = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t3;
            try {
                t3 = this.f12824E.call();
            } catch (Exception unused) {
                t3 = null;
            }
            this.f12826G.post(new a(this.f12825F, t3));
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(@N String str, int i4, @F(from = 0) int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b(@N Handler handler) {
        return new b(handler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void c(@N Executor executor, @N Callable<T> callable, @N InterfaceC0764e<T> interfaceC0764e) {
        executor.execute(new c(androidx.core.provider.b.a(), callable, interfaceC0764e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T d(@N ExecutorService executorService, @N Callable<T> callable, @F(from = 0) int i4) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
