package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@I0.a
/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244d {
    private C1244d() {
        throw new AssertionError("Uninstantiable");
    }

    @I0.a
    public static void a(@androidx.annotation.N String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS NOT the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(str);
    }

    @I0.a
    public static void b(@androidx.annotation.N String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkNotMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(str);
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    public static void c(@Nullable Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException("null reference");
        }
    }

    @I0.a
    @EnsuresNonNull({"#1"})
    public static void d(@Nullable Object obj, @androidx.annotation.N Object obj2) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @I0.a
    public static void e(@androidx.annotation.N Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @I0.a
    public static void f(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalStateException();
        }
    }

    @I0.a
    public static void g(boolean z3, @androidx.annotation.N Object obj) {
        if (z3) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
