package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55576a;

    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final Method f55577a;

        /* renamed from: b, reason: collision with root package name */
        static final Method f55578b;

        /* renamed from: c, reason: collision with root package name */
        private static final String f55579c = "Unable to access ThreadMXBean";

        static {
            Method method;
            Method method2 = null;
            try {
                Class<?> a4 = org.junit.internal.b.a("java.lang.management.ThreadMXBean");
                method = a4.getMethod("getThreadCpuTime", Long.TYPE);
                try {
                    method2 = a4.getMethod("isThreadCpuTimeSupported", new Class[0]);
                } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused2) {
                method = null;
            }
            f55577a = method;
            f55578b = method2;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Object obj) {
        this.f55576a = obj;
    }

    @Override // org.junit.internal.management.g
    public boolean a() {
        Method method = a.f55578b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(this.f55576a, new Object[0])).booleanValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    @Override // org.junit.internal.management.g
    public long b(long j4) {
        Method method = a.f55577a;
        if (method != null) {
            try {
                return ((Long) method.invoke(this.f55576a, Long.valueOf(j4))).longValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e4) {
                throw new UnsupportedOperationException("Unable to access ThreadMXBean", e4);
            }
        }
        throw new UnsupportedOperationException("Unable to access ThreadMXBean");
    }
}
