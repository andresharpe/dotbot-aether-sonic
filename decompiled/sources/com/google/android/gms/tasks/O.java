package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class O implements Executor {

    /* renamed from: E, reason: collision with root package name */
    private final Handler f31166E = new M0.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.N Runnable runnable) {
        this.f31166E.post(runnable);
    }
}
