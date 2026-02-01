package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final Runnable f28994E;

    public d(Runnable runnable, int i4) {
        this.f28994E = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f28994E.run();
    }
}
