package org.junit.internal;

/* loaded from: classes2.dex */
public class b {
    @Deprecated
    public b() {
    }

    public static Class<?> a(String str) throws ClassNotFoundException {
        return b(str, b.class);
    }

    public static Class<?> b(String str, Class<?> cls) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = cls.getClassLoader();
        }
        return Class.forName(str, true, contextClassLoader);
    }
}
