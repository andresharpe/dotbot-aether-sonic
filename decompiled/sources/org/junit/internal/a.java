package org.junit.internal;

/* loaded from: classes2.dex */
public final class a {
    private a() {
    }

    public static <T> T a(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T b(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }
}
