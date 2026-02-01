package com.harman.jbl.cd_biz_comm.logger;

import android.util.Log;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f37863a = false;

    public static void a(String str, String str2) {
        if (f37863a) {
            Log.d(str, str2);
            b.f37854F.g(str + ":" + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f37863a) {
            Log.e(str, str2);
            b.f37854F.g(str + ":" + str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f37863a) {
            Log.e(str, str2, th);
            b.f37854F.g(str + ":" + str2);
        }
    }

    public static void d(String str, String str2) {
        if (f37863a) {
            Log.i(str, str2);
            b.f37854F.g(str + ":" + str2);
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
        if (f37863a) {
            Log.v(str, str2);
            b.f37854F.g(str + ":" + str2);
        }
    }

    public static void g(String str, String str2) {
        if (f37863a) {
            Log.w(str, str2);
            b.f37854F.g(str + ":" + str2);
        }
    }
}
