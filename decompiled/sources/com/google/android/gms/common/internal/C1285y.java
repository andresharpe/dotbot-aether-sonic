package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@I0.a
/* renamed from: com.google.android.gms.common.internal.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285y {
    private C1285y() {
        throw new AssertionError("Uninstantiable");
    }

    @I0.a
    public static void a(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    @I0.a
    public static void b(boolean z3, @androidx.annotation.N Object obj) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @I0.a
    public static void c(boolean z3, @androidx.annotation.N String str, @androidx.annotation.N Object... objArr) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @I0.a
    public static void d(@androidx.annotation.N Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    @I0.a
    public static void e(@androidx.annotation.N Handler handler, @androidx.annotation.N String str) {
        if (Looper.myLooper() == handler.getLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    @I0.a
    public static void f() {
        g("Must be called on the main application thread");
    }

    @I0.a
    public static void g(@androidx.annotation.N String str) {
        if (com.google.android.gms.common.util.G.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    @androidx.annotation.N
    public static String h(@androidx.annotation.P String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    @androidx.annotation.N
    public static String i(@androidx.annotation.P String str, @androidx.annotation.N Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @I0.a
    public static void j() {
        k("Must not be called on the main application thread");
    }

    @I0.a
    public static void k(@androidx.annotation.N String str) {
        if (!com.google.android.gms.common.util.G.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    @androidx.annotation.N
    public static <T> T l(@androidx.annotation.P T t3) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("null reference");
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    @androidx.annotation.N
    public static <T> T m(@androidx.annotation.N T t3, @androidx.annotation.N Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @I0.a
    public static int n(int i4) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @I0.a
    public static int o(int i4, @androidx.annotation.N Object obj) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @I0.a
    public static long p(long j4) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @I0.a
    public static long q(long j4, @androidx.annotation.N Object obj) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @I0.a
    public static void r(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalStateException();
        }
    }

    @I0.a
    public static void s(boolean z3, @androidx.annotation.N Object obj) {
        if (z3) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @I0.a
    public static void t(boolean z3, @androidx.annotation.N String str, @androidx.annotation.N Object... objArr) {
        if (z3) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
