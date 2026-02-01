package com.clj.fastble.utils;

import android.util.Log;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f27136a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final String f27137b = "FastBle";

    public static void a(String str) {
        if (f27136a && str != null) {
            Log.d(f27137b, str);
        }
    }

    public static void b(String str) {
        if (f27136a && str != null) {
            Log.e(f27137b, str);
        }
    }

    public static void c(String str) {
        if (f27136a && str != null) {
            Log.i(f27137b, str);
        }
    }

    public static void d(String str) {
        if (f27136a && str != null) {
            Log.w(f27137b, str);
        }
    }
}
