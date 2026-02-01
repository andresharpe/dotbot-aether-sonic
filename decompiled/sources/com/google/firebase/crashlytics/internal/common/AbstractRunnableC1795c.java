package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.internal.common.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1795c implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
