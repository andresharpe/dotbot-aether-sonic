package org.hamcrest.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f55450a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55451b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55452c;

    public b(String str, int i4, int i5) {
        this.f55450a = str;
        this.f55451b = i4;
        this.f55452c = i5;
    }

    protected boolean a(Method method) {
        if (method.getName().equals(this.f55450a) && method.getParameterTypes().length == this.f55451b && !method.isSynthetic()) {
            return true;
        }
        return false;
    }

    protected Class<?> b(Method method) {
        return method.getParameterTypes()[this.f55452c];
    }

    public Class<?> c(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (a(method)) {
                    return b(method);
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for " + this.f55450a + "() method.");
    }
}
