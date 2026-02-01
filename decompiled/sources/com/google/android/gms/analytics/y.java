package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class y implements ThreadFactory {

    /* renamed from: E, reason: collision with root package name */
    private static final AtomicInteger f27829E = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(x xVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new z(runnable, "measurement-" + f27829E.incrementAndGet());
    }

    private y() {
    }
}
