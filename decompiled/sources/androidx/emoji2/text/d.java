package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14308a = 15;

    @W(28)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    @Deprecated
    public static Executor b(@N final Handler handler) {
        Objects.requireNonNull(handler);
        return new Executor() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor c(@N final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread d4;
                d4 = d.d(str, runnable);
                return d4;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Handler e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
