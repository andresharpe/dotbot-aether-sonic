package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class N implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.N Runnable runnable) {
        runnable.run();
    }
}
