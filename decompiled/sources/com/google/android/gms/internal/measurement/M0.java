package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M0 implements ThreadFactory {

    /* renamed from: E, reason: collision with root package name */
    private final ThreadFactory f29385E = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(C1421j1 c1421j1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f29385E.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
