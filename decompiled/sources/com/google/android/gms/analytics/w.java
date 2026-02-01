package com.google.android.gms.analytics;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends ThreadPoolExecutor {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ A f27828E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a4) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f27828E = a4;
        setThreadFactory(new y(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new v(this, runnable, obj);
    }
}
