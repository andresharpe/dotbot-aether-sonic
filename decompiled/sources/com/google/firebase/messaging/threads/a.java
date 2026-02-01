package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import l1.d;

/* loaded from: classes2.dex */
public interface a {
    ExecutorService a(ThreadPriority threadPriority);

    ExecutorService b(ThreadPriority threadPriority);

    Future<?> c(@d String str, @d String str2, ThreadPriority threadPriority, Runnable runnable);

    void d(@d String str, @d String str2, ThreadPriority threadPriority, Runnable runnable);

    ScheduledExecutorService e(int i4, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ScheduledExecutorService f(int i4, ThreadPriority threadPriority);

    ExecutorService g(int i4, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService h(int i4, ThreadPriority threadPriority);

    ExecutorService i(ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService j(ThreadFactory threadFactory, ThreadPriority threadPriority);
}
