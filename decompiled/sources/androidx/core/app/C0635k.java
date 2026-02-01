package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635k {

    @androidx.annotation.W(18)
    /* renamed from: androidx.core.app.k$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @InterfaceC0577u
        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: androidx.core.app.k$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11957a = "BundleCompatBaseImpl";

        /* renamed from: b, reason: collision with root package name */
        private static Method f11958b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f11959c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f11960d;

        /* renamed from: e, reason: collision with root package name */
        private static boolean f11961e;

        private b() {
        }

        public static IBinder a(Bundle bundle, String str) {
            if (!f11959c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f11958b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e4) {
                    Log.i(f11957a, "Failed to retrieve getIBinder method", e4);
                }
                f11959c = true;
            }
            Method method2 = f11958b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    Log.i(f11957a, "Failed to invoke getIBinder via reflection", e5);
                    f11958b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f11961e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f11960d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e4) {
                    Log.i(f11957a, "Failed to retrieve putIBinder method", e4);
                }
                f11961e = true;
            }
            Method method2 = f11960d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    Log.i(f11957a, "Failed to invoke putIBinder via reflection", e5);
                    f11960d = null;
                }
            }
        }
    }

    private C0635k() {
    }

    @androidx.annotation.P
    public static IBinder a(@androidx.annotation.N Bundle bundle, @androidx.annotation.P String str) {
        return a.a(bundle, str);
    }

    public static void b(@androidx.annotation.N Bundle bundle, @androidx.annotation.P String str, @androidx.annotation.P IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
