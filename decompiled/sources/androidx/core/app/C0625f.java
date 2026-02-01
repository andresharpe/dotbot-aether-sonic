package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11931a = "ActivityRecreator";

    /* renamed from: b, reason: collision with root package name */
    protected static final Class<?> f11932b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f11933c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Field f11934d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f11935e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f11936f;

    /* renamed from: g, reason: collision with root package name */
    protected static final Method f11937g;

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f11938h = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d f11939E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Object f11940F;

        a(d dVar, Object obj) {
            this.f11939E = dVar;
            this.f11940F = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11939E.f11945E = this.f11940F;
        }
    }

    /* renamed from: androidx.core.app.f$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Application f11941E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ d f11942F;

        b(Application application, d dVar) {
            this.f11941E = application;
            this.f11942F = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11941E.unregisterActivityLifecycleCallbacks(this.f11942F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f11943E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Object f11944F;

        c(Object obj, Object obj2) {
            this.f11943E = obj;
            this.f11944F = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0625f.f11935e;
                if (method != null) {
                    method.invoke(this.f11943E, this.f11944F, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0625f.f11936f.invoke(this.f11943E, this.f11944F, Boolean.FALSE);
                }
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable th) {
                Log.e(C0625f.f11931a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.f$d */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: E, reason: collision with root package name */
        Object f11945E;

        /* renamed from: F, reason: collision with root package name */
        private Activity f11946F;

        /* renamed from: G, reason: collision with root package name */
        private final int f11947G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f11948H = false;

        /* renamed from: I, reason: collision with root package name */
        private boolean f11949I = false;

        /* renamed from: J, reason: collision with root package name */
        private boolean f11950J = false;

        d(@androidx.annotation.N Activity activity) {
            this.f11946F = activity;
            this.f11947G = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f11946F == activity) {
                this.f11946F = null;
                this.f11949I = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f11949I && !this.f11950J && !this.f11948H && C0625f.h(this.f11945E, this.f11947G, activity)) {
                this.f11950J = true;
                this.f11945E = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f11946F == activity) {
                this.f11948H = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a4 = a();
        f11932b = a4;
        f11933c = b();
        f11934d = f();
        f11935e = d(a4);
        f11936f = c(a4);
        f11937g = e(a4);
    }

    private C0625f() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 != 26 && i4 != 27) {
            return false;
        }
        return true;
    }

    protected static boolean h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f11934d.get(activity);
            if (obj2 == obj && activity.hashCode() == i4) {
                f11938h.postAtFrontOfQueue(new c(f11933c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f11931a, "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(@androidx.annotation.N Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f11937g == null) {
            return false;
        }
        if (f11936f == null && f11935e == null) {
            return false;
        }
        try {
            Object obj2 = f11934d.get(activity);
            if (obj2 == null || (obj = f11933c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f11938h;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f11937g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f11938h.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
