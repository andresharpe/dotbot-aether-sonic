package com.amazonaws.util;

import java.util.Collection;

/* loaded from: classes.dex */
public class A {
    public static void a(String str, Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static int b(int i4, String str) {
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalArgumentException(String.format("%s must be positive", str));
    }

    public static <T extends Collection<?>> T c(T t3, String str) {
        e(t3, str);
        if (!t3.isEmpty()) {
            return t3;
        }
        throw new IllegalArgumentException(String.format("%s cannot be empty", str));
    }

    public static <T> T[] d(T[] tArr, String str) {
        e(tArr, str);
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format("%s cannot be empty", str));
    }

    public static <T> T e(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null", str));
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static String g(String str, String str2) {
        e(str, str2);
        if (!str.isEmpty()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("%s cannot be empty", str2));
    }
}
