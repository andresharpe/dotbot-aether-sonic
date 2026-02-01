package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C2108v;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    private static final int f15428b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15429c = 2;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final J f15427a = new J();

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final Map<Class<?>, Integer> f15430d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC0917t>>> f15431e = new HashMap();

    private J() {
    }

    private final InterfaceC0917t a(Constructor<? extends InterfaceC0917t> constructor, Object obj) {
        try {
            InterfaceC0917t newInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.F.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private final Constructor<? extends InterfaceC0917t> b(Class<?> cls) {
        String fullPackage;
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            if (r02 != null) {
                fullPackage = r02.getName();
            } else {
                fullPackage = "";
            }
            kotlin.jvm.internal.F.o(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                kotlin.jvm.internal.F.o(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.F.o(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.F.o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c4 = c(name);
            if (fullPackage.length() != 0) {
                c4 = fullPackage + '.' + c4;
            }
            Class<?> cls2 = Class.forName(c4);
            kotlin.jvm.internal.F.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    @W2.n
    @l3.d
    public static final String c(@l3.d String className) {
        String i22;
        kotlin.jvm.internal.F.p(className, "className");
        StringBuilder sb = new StringBuilder();
        i22 = kotlin.text.z.i2(className, ".", "_", false, 4, null);
        sb.append(i22);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f15430d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g4 = g(cls);
        map.put(cls, Integer.valueOf(g4));
        return g4;
    }

    private final boolean e(Class<?> cls) {
        if (cls != null && D.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    @W2.n
    @l3.d
    public static final A f(@l3.d Object object) {
        kotlin.jvm.internal.F.p(object, "object");
        boolean z3 = object instanceof A;
        boolean z4 = object instanceof InterfaceC0910l;
        if (z3 && z4) {
            return new DefaultLifecycleObserverAdapter((InterfaceC0910l) object, (A) object);
        }
        if (z4) {
            return new DefaultLifecycleObserverAdapter((InterfaceC0910l) object, null);
        }
        if (z3) {
            return (A) object;
        }
        Class<?> cls = object.getClass();
        J j4 = f15427a;
        if (j4.d(cls) == 2) {
            List<Constructor<? extends InterfaceC0917t>> list = f15431e.get(cls);
            kotlin.jvm.internal.F.m(list);
            List<Constructor<? extends InterfaceC0917t>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(j4.a(list2.get(0), object));
            }
            int size = list2.size();
            InterfaceC0917t[] interfaceC0917tArr = new InterfaceC0917t[size];
            for (int i4 = 0; i4 < size; i4++) {
                interfaceC0917tArr[i4] = f15427a.a(list2.get(i4), object);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0917tArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends InterfaceC0917t>> k4;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0917t> b4 = b(cls);
        if (b4 != null) {
            Map<Class<?>, List<Constructor<? extends InterfaceC0917t>>> map = f15431e;
            k4 = C2108v.k(b4);
            map.put(cls, k4);
            return 2;
        }
        if (C0903e.f15594c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.F.o(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0917t>> list = f15431e.get(superclass);
            kotlin.jvm.internal.F.m(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.F.o(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.F.o(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0917t>> list2 = f15431e.get(intrface);
                kotlin.jvm.internal.F.m(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f15431e.put(cls, arrayList);
        return 2;
    }
}
