package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.i0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f26945a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f26946b = new b();

    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            n.x(runnable);
        }
    }

    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            runnable.run();
        }
    }

    private f() {
    }

    public static Executor a() {
        return f26946b;
    }

    public static Executor b() {
        return f26945a;
    }

    @i0
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5L, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e4) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e4);
        }
    }
}
