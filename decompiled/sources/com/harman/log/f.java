package com.harman.log;

import android.util.Log;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f47586a = false;

    public static void a(String str, String str2) {
        if (f47586a) {
            Log.d(str, str2);
            DebugHelper.d(str + ":" + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f47586a) {
            Log.e(str, str2);
            DebugHelper.d(str + ":" + str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f47586a) {
            Log.e(str, str2, th);
            DebugHelper.d(str + ":" + str2);
        }
    }

    public static void d(String str, String str2) {
        if (f47586a) {
            Log.i(str, str2);
            DebugHelper.d(str + ":" + str2);
        }
    }

    public static void e(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement != null) {
                a(str, stackTraceElement.toString());
            }
        }
    }

    public static void f(String str, String str2) {
        if (f47586a) {
            Log.v(str, str2);
            DebugHelper.d(str + ":" + str2);
        }
    }

    public static void g(String str, String str2) {
        if (f47586a) {
            Log.w(str, str2);
            DebugHelper.d(str + ":" + str2);
        }
    }
}
