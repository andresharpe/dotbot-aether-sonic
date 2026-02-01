package com.harman.sdk.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class b<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Callable<T> f47740a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f47741b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47742c;

    public b(Callable<T> callable, int i4) {
        this.f47740a = callable;
        this.f47741b = null;
        this.f47742c = i4;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        Thread currentThread = Thread.currentThread();
        int priority = currentThread.getPriority();
        currentThread.setPriority(this.f47742c);
        try {
            Callable<T> callable = this.f47740a;
            if (callable != null) {
                return callable.call();
            }
            Runnable runnable = this.f47741b;
            if (runnable != null) {
                runnable.run();
            }
            currentThread.setPriority(priority);
            return null;
        } finally {
            currentThread.setPriority(priority);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("PrioritizedCallable { mCallable = ");
        sb.append(this.f47740a);
        sb.append(", mRunnable = ");
        sb.append(this.f47741b);
        sb.append(", mPriority = ");
        sb.append(this.f47742c);
        sb.append(" }");
        return sb.toString();
    }

    public b(Runnable runnable, int i4) {
        this.f47740a = null;
        this.f47741b = runnable;
        this.f47742c = i4;
    }
}
