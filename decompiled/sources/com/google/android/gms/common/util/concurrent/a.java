package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;
import com.google.android.gms.internal.common.r;
import java.util.concurrent.Executor;

@I0.a
/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: E, reason: collision with root package name */
    private final Handler f28988E;

    @I0.a
    public a(@N Looper looper) {
        this.f28988E = new r(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@N Runnable runnable) {
        this.f28988E.post(runnable);
    }
}
