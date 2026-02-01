package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class c {

    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Class<?> f55571a;

        static {
            Class<?> cls;
            try {
                cls = org.junit.internal.b.a("java.lang.management.ManagementFactory");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            f55571a = cls;
        }

        private a() {
        }

        static Object a(String str) {
            Class<?> cls = f55571a;
            if (cls != null) {
                try {
                    return cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final f f55572a = b(a.a("getRuntimeMXBean"));

        private b() {
        }

        private static final f b(Object obj) {
            if (obj != null) {
                return new d(obj);
            }
            return new org.junit.internal.management.a();
        }
    }

    /* renamed from: org.junit.internal.management.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0525c {

        /* renamed from: a, reason: collision with root package name */
        private static final g f55573a = b(a.a("getThreadMXBean"));

        private C0525c() {
        }

        private static final g b(Object obj) {
            if (obj != null) {
                return new e(obj);
            }
            return new org.junit.internal.management.b();
        }
    }

    public static f a() {
        return b.f55572a;
    }

    public static g b() {
        return C0525c.f55573a;
    }
}
