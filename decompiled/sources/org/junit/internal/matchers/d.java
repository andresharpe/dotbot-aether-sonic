package org.junit.internal.matchers;

import java.lang.reflect.Method;
import org.junit.internal.g;

@Deprecated
/* loaded from: classes2.dex */
public abstract class d<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private Class<?> f55583E;

    protected d() {
        this.f55583E = e(getClass());
    }

    private static Class<?> e(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : g.a(cls)) {
                if (f(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    private static boolean f(Method method) {
        if ("matchesSafely".equals(method.getName()) && method.getParameterTypes().length == 1 && !method.isSynthetic()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.k
    public final boolean c(Object obj) {
        if (obj != 0 && this.f55583E.isInstance(obj) && g(obj)) {
            return true;
        }
        return false;
    }

    public abstract boolean g(T t3);

    /* JADX WARN: Multi-variable type inference failed */
    protected d(Class<T> cls) {
        this.f55583E = cls;
    }
}
