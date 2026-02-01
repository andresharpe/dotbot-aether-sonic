package z0;

import android.os.Build;
import android.util.Log;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f58218a = "TRuntime.";

    /* renamed from: b, reason: collision with root package name */
    private static final int f58219b = 23;

    private C2447a() {
    }

    private static String a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    public static void b(String str, String str2) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 3)) {
            Log.d(g4, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 3)) {
            Log.d(g4, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 3)) {
            Log.d(g4, String.format(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 3)) {
            Log.d(g4, String.format(str2, objArr));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 6)) {
            Log.e(g4, str2, th);
        }
    }

    private static String g(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a(f58218a, str);
        }
        return f58218a + str;
    }

    public static void h(String str, String str2, Object obj) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 4)) {
            Log.i(g4, String.format(str2, obj));
        }
    }

    public static void i(String str, String str2, Object obj) {
        String g4 = g(str);
        if (Log.isLoggable(g4, 5)) {
            Log.w(g4, String.format(str2, obj));
        }
    }
}
