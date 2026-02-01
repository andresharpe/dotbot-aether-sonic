package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12740a = "HandlerCompat";

    @W(28)
    /* renamed from: androidx.core.os.j$a */
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler b(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean c(Handler handler, Runnable runnable, Object obj, long j4) {
            return handler.postDelayed(runnable, obj, j4);
        }
    }

    @W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.os.j$b */
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        public static boolean a(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private C0747j() {
    }

    @androidx.annotation.N
    public static Handler a(@androidx.annotation.N Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @androidx.annotation.N
    public static Handler b(@androidx.annotation.N Looper looper, @androidx.annotation.N Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(looper, callback);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w(f12740a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @W(16)
    public static boolean c(@androidx.annotation.N Handler handler, @androidx.annotation.N Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e6) {
            e = e6;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d(@androidx.annotation.N Handler handler, @androidx.annotation.N Runnable runnable, @P Object obj, long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(handler, runnable, obj, j4);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j4);
    }
}
