package com.google.firebase.messaging.threads;

import androidx.annotation.N;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.d;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.messaging.threads.a f37130a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.messaging.threads.a f37131b;

    /* renamed from: com.google.firebase.messaging.threads.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0341b implements com.google.firebase.messaging.threads.a {

        /* renamed from: a, reason: collision with root package name */
        private static final long f37132a = 60;

        private C0341b() {
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService a(ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService b(ThreadPriority threadPriority) {
            return h(1, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public Future<?> c(@d String str, @d String str2, ThreadPriority threadPriority, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public void d(@d String str, @d String str2, ThreadPriority threadPriority, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ScheduledExecutorService e(int i4, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i4, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ScheduledExecutorService f(int i4, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i4));
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService g(int i4, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService h(int i4, ThreadPriority threadPriority) {
            return g(i4, Executors.defaultThreadFactory(), threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService i(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return g(1, threadFactory, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public ExecutorService j(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }
    }

    static {
        C0341b c0341b = new C0341b();
        f37130a = c0341b;
        f37131b = c0341b;
    }

    private b() {
    }

    public static com.google.firebase.messaging.threads.a a() {
        return f37131b;
    }

    static void b(com.google.firebase.messaging.threads.a aVar) {
        if (f37131b == f37130a) {
            f37131b = aVar;
            return;
        }
        throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
    }
}
