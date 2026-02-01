package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements androidx.startup.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17306a = 5000;

    /* JADX INFO: Access modifiers changed from: private */
    @W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.n
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j4) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(@N final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.m
            @Override // java.lang.Runnable
            public final void run() {
                j.l(context);
            }
        });
    }

    @Override // androidx.startup.b
    @N
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.emptyList();
    }

    @Override // androidx.startup.b
    @N
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c a(@N Context context) {
        f(context.getApplicationContext());
        return new c();
    }

    @W(16)
    void f(@N final Context context) {
        a.c(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void h(@N final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.k(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + f17306a);
    }
}
