package com.google.firebase.components;

import l1.InterfaceC2354a;

/* loaded from: classes2.dex */
public final class D {
    public static void a(boolean z3, String str) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    @InterfaceC2354a
    public static <T> T b(T t3) {
        t3.getClass();
        return t3;
    }

    @InterfaceC2354a
    public static <T> T c(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z3, String str) {
        if (z3) {
        } else {
            throw new IllegalStateException(str);
        }
    }
}
