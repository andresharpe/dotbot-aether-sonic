package com.blankj.utilcode.util;

import java.lang.reflect.Type;

/* renamed from: com.blankj.utilcode.util.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111v {
    private C1111v() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T a(T t3, Type type) {
        try {
            return (T) H0.H(H0.b1(t3), type);
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
