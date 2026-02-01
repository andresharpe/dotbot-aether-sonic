package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0903e {

    /* renamed from: c, reason: collision with root package name */
    static C0903e f15594c = new C0903e();

    /* renamed from: d, reason: collision with root package name */
    private static final int f15595d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15596e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15597f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f15598a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f15599b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<Lifecycle.Event, List<b>> f15600a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, Lifecycle.Event> f15601b;

        a(Map<b, Lifecycle.Event> map) {
            this.f15601b = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> list = this.f15600a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f15600a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, E e4, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(e4, event, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(E e4, Lifecycle.Event event, Object obj) {
            b(this.f15600a.get(event), e4, event, obj);
            b(this.f15600a.get(Lifecycle.Event.ON_ANY), e4, event, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f15602a;

        /* renamed from: b, reason: collision with root package name */
        final Method f15603b;

        b(int i4, Method method) {
            this.f15602a = i4;
            this.f15603b = method;
            method.setAccessible(true);
        }

        void a(E e4, Lifecycle.Event event, Object obj) {
            try {
                int i4 = this.f15602a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            this.f15603b.invoke(obj, e4, event);
                            return;
                        }
                        return;
                    }
                    this.f15603b.invoke(obj, e4);
                    return;
                }
                this.f15603b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Failed to call observer method", e6.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15602a == bVar.f15602a && this.f15603b.getName().equals(bVar.f15603b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f15602a * 31) + this.f15603b.getName().hashCode();
        }
    }

    C0903e() {
    }

    private a a(Class<?> cls, @androidx.annotation.P Method[] methodArr) {
        int i4;
        a c4;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c4 = c(superclass)) != null) {
            hashMap.putAll(c4.f15601b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : c(cls2).f15601b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            S s4 = (S) method.getAnnotation(S.class);
            if (s4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (E.class.isAssignableFrom(parameterTypes[0])) {
                        i4 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i4 = 0;
                }
                Lifecycle.Event value = s4.value();
                if (parameterTypes.length > 1) {
                    if (Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == Lifecycle.Event.ON_ANY) {
                            i4 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i4, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f15598a.put(cls, aVar);
        this.f15599b.put(cls, Boolean.valueOf(z3));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    private void e(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            throw new IllegalArgumentException("Method " + bVar.f15603b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        }
        if (event2 == null) {
            map.put(bVar, event);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f15598a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f15599b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b4 = b(cls);
        for (Method method : b4) {
            if (((S) method.getAnnotation(S.class)) != null) {
                a(cls, b4);
                return true;
            }
        }
        this.f15599b.put(cls, Boolean.FALSE);
        return false;
    }
}
