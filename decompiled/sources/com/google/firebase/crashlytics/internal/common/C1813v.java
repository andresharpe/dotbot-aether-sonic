package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.internal.common.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1813v {

    /* renamed from: a, reason: collision with root package name */
    private static final long f35191a = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.v$a */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f35192E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AtomicLong f35193F;

        /* renamed from: com.google.firebase.crashlytics.internal.common.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0311a extends AbstractRunnableC1795c {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Runnable f35194E;

            C0311a(Runnable runnable) {
                this.f35194E = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC1795c
            public void a() {
                this.f35194E.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f35192E = str;
            this.f35193F = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0311a(runnable));
            newThread.setName(this.f35192E + this.f35193F.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.v$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC1795c {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f35196E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ExecutorService f35197F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f35198G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ TimeUnit f35199H;

        b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
            this.f35196E = str;
            this.f35197F = executorService;
            this.f35198G = j4;
            this.f35199H = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC1795c
        public void a() {
            try {
                com.google.firebase.crashlytics.internal.f.f().b("Executing shutdown hook for " + this.f35196E);
                this.f35197F.shutdown();
                if (!this.f35197F.awaitTermination(this.f35198G, this.f35199H)) {
                    com.google.firebase.crashlytics.internal.f.f().b(this.f35196E + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f35197F.shutdownNow();
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f35196E));
                this.f35197F.shutdownNow();
            }
        }
    }

    private C1813v() {
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j4, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService f4 = f(e(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, f4);
        return f4;
    }

    public static ScheduledExecutorService d(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(e(str));
        a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static ThreadFactory e(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
