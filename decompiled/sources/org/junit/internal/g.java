package org.junit.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<Method> f55561a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<Method> f55562b = new b();

    /* loaded from: classes2.dex */
    static class a implements Comparator<Method> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            int hashCode = method.getName().hashCode();
            int hashCode2 = method2.getName().hashCode();
            if (hashCode != hashCode2) {
                if (hashCode < hashCode2) {
                    return -1;
                }
                return 1;
            }
            return g.f55562b.compare(method, method2);
        }
    }

    /* loaded from: classes2.dex */
    static class b implements Comparator<Method> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            int compareTo = method.getName().compareTo(method2.getName());
            if (compareTo != 0) {
                return compareTo;
            }
            return method.toString().compareTo(method2.toString());
        }
    }

    private g() {
    }

    public static Method[] a(Class<?> cls) {
        Comparator<Method> b4 = b((org.junit.h) cls.getAnnotation(org.junit.h.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (b4 != null) {
            Arrays.sort(declaredMethods, b4);
        }
        return declaredMethods;
    }

    private static Comparator<Method> b(org.junit.h hVar) {
        if (hVar == null) {
            return f55561a;
        }
        return hVar.value().b();
    }
}
