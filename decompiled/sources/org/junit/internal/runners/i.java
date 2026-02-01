package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

@Deprecated
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f55623a;

    public i(Class<?> cls) {
        this.f55623a = cls;
    }

    private List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private boolean i(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i4 = 0; i4 < method2.getParameterTypes().length; i4++) {
            if (!method2.getParameterTypes()[i4].equals(method.getParameterTypes()[i4])) {
                return false;
            }
        }
        return true;
    }

    private boolean j(Method method, List<Method> list) {
        Iterator<Method> it = list.iterator();
        while (it.hasNext()) {
            if (i(method, it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean k(Class<? extends Annotation> cls) {
        if (!cls.equals(org.junit.e.class) && !cls.equals(org.junit.f.class)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> a() {
        return b(org.junit.b.class);
    }

    public List<Method> b(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = g(this.f55623a).iterator();
        while (it.hasNext()) {
            for (Method method : org.junit.internal.g.a(it.next())) {
                if (method.getAnnotation(cls) != null && !j(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (k(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> c() {
        return b(org.junit.f.class);
    }

    public Constructor<?> d() throws SecurityException, NoSuchMethodException {
        return this.f55623a.getConstructor(new Class[0]);
    }

    public Class<?> e() {
        return this.f55623a;
    }

    public String f() {
        return this.f55623a.getName();
    }

    public List<Method> h() {
        return b(Test.class);
    }
}
