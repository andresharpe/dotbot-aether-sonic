package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class v extends FutureTask {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ w f27827E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f27827E = wVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        uncaughtExceptionHandler = this.f27827E.f27828E.f27740f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(th)));
        }
        super.setException(th);
    }
}
