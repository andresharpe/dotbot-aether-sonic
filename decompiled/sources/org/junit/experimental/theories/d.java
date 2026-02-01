package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f55523c = a();

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f55524a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f55525b;

    private d(Class<?> cls, Annotation[] annotationArr) {
        this.f55524a = cls;
        this.f55525b = annotationArr;
    }

    private static Map<Class<?>, Class<?>> a() {
        HashMap hashMap = new HashMap();
        l(hashMap, Boolean.TYPE, Boolean.class);
        l(hashMap, Byte.TYPE, Byte.class);
        l(hashMap, Short.TYPE, Short.class);
        l(hashMap, Character.TYPE, Character.class);
        l(hashMap, Integer.TYPE, Integer.class);
        l(hashMap, Long.TYPE, Long.class);
        l(hashMap, Float.TYPE, Float.class);
        l(hashMap, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(hashMap);
    }

    private <T extends Annotation> T f(Annotation[] annotationArr, Class<T> cls, int i4) {
        if (i4 == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
            Annotation f4 = f(annotation.annotationType().getAnnotations(), cls, i4 - 1);
            if (f4 != null) {
                return cls.cast(f4);
            }
        }
        return null;
    }

    private boolean k(Class<?> cls, Class<?> cls2) {
        Map<Class<?>, Class<?>> map = f55523c;
        if (map.containsKey(cls2)) {
            return cls.isAssignableFrom(map.get(cls2));
        }
        return false;
    }

    private static <T> void l(Map<T, T> map, T t3, T t4) {
        map.put(t3, t4);
        map.put(t4, t3);
    }

    public static ArrayList<d> m(Method method) {
        return n(method.getParameterTypes(), method.getParameterAnnotations());
    }

    private static ArrayList<d> n(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<d> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            arrayList.add(new d(clsArr[i4], annotationArr[i4]));
        }
        return arrayList;
    }

    public static List<d> o(Constructor<?> constructor) {
        return n(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    public boolean b(Class<?> cls) {
        if (!this.f55524a.isAssignableFrom(cls) && !k(this.f55524a, cls)) {
            return false;
        }
        return true;
    }

    public boolean c(Object obj) {
        if (obj == null) {
            if (!this.f55524a.isPrimitive()) {
                return true;
            }
            return false;
        }
        return b(obj.getClass());
    }

    public boolean d(Class<?> cls) {
        if (!cls.isAssignableFrom(this.f55524a) && !k(cls, this.f55524a) && !b(cls)) {
            return false;
        }
        return true;
    }

    public <T extends Annotation> T e(Class<T> cls) {
        return (T) f(this.f55525b, cls, 3);
    }

    public <T extends Annotation> T g(Class<T> cls) {
        for (Annotation annotation : h()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> h() {
        return Arrays.asList(this.f55525b);
    }

    public Class<?> i() {
        return this.f55524a;
    }

    public boolean j(Class<? extends Annotation> cls) {
        if (g(cls) != null) {
            return true;
        }
        return false;
    }
}
