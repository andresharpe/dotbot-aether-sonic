package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746i {

    /* renamed from: androidx.core.os.i$a */
    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: E, reason: collision with root package name */
        private final Handler f12739E;

        a(@androidx.annotation.N Handler handler) {
            this.f12739E = (Handler) androidx.core.util.u.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.N Runnable runnable) {
            if (this.f12739E.post((Runnable) androidx.core.util.u.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f12739E + " is shutting down");
        }
    }

    private C0746i() {
    }

    @androidx.annotation.N
    public static Executor a(@androidx.annotation.N Handler handler) {
        return new a(handler);
    }
}
