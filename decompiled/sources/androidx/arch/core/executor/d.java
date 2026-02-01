package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6371a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f6372b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    @P
    private volatile Handler f6373c;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: G, reason: collision with root package name */
        private static final String f6374G = "arch_disk_io_";

        /* renamed from: E, reason: collision with root package name */
        private final AtomicInteger f6375E = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f6374G + this.f6375E.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @N
        public static Handler a(@N Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @N
    private static Handler e(@N Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.e
    public void a(@N Runnable runnable) {
        this.f6372b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // androidx.arch.core.executor.e
    public void d(@N Runnable runnable) {
        if (this.f6373c == null) {
            synchronized (this.f6371a) {
                try {
                    if (this.f6373c == null) {
                        this.f6373c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f6373c.post(runnable);
    }
}
