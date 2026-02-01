package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class j implements org.junit.runners.model.a {

    /* renamed from: d, reason: collision with root package name */
    private static final c f55843d;

    /* renamed from: e, reason: collision with root package name */
    private static final d f55844e;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f55845a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<? extends Annotation>, List<org.junit.runners.model.d>> f55846b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<? extends Annotation>, List<org.junit.runners.model.b>> f55847c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class a<T> implements e<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f55848a;

        a(List list) {
            this.f55848a = list;
        }

        @Override // org.junit.runners.model.e
        public void a(org.junit.runners.model.c<?> cVar, T t3) {
            this.f55848a.add(t3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class b<T> implements e<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f55850a;

        b(List list) {
            this.f55850a = list;
        }

        @Override // org.junit.runners.model.e
        public void a(org.junit.runners.model.c<?> cVar, T t3) {
            this.f55850a.add(t3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c implements Comparator<Field> {
        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements Comparator<org.junit.runners.model.d> {
        private d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.junit.runners.model.d dVar, org.junit.runners.model.d dVar2) {
            return org.junit.internal.g.f55562b.compare(dVar.m(), dVar2.m());
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f55843d = new c(aVar);
        f55844e = new d(aVar);
    }

    public j(Class<?> cls) {
        this.f55845a = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        w(linkedHashMap, linkedHashMap2);
        this.f55846b = u(linkedHashMap);
        this.f55847c = u(linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T extends org.junit.runners.model.c<T>> void b(T t3, Map<Class<? extends Annotation>, List<T>> map) {
        for (Annotation annotation : t3.i()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            List j4 = j(map, annotationType, true);
            org.junit.runners.model.c f4 = t3.f(j4);
            if (f4 == null) {
                return;
            }
            if (v(annotationType)) {
                j4.add(0, f4);
            } else {
                j4.add(f4);
            }
        }
    }

    private <T> List<T> e(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<List<T>> it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next());
        }
        return new ArrayList(linkedHashSet);
    }

    private static <T> List<T> j(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z3) {
        if (!map.containsKey(cls) && z3) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private static Field[] q(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, f55843d);
        return declaredFields;
    }

    private static List<Class<?>> r(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static <T extends org.junit.runners.model.c<T>> Map<Class<? extends Annotation>, List<T>> u(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Annotation>, List<T>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static boolean v(Class<? extends Annotation> cls) {
        if (!cls.equals(org.junit.e.class) && !cls.equals(org.junit.f.class)) {
            return false;
        }
        return true;
    }

    @Override // org.junit.runners.model.a
    public <T extends Annotation> T a(Class<T> cls) {
        Class<?> cls2 = this.f55845a;
        if (cls2 == null) {
            return null;
        }
        return (T) cls2.getAnnotation(cls);
    }

    public <T> void c(Object obj, Class<? extends Annotation> cls, Class<T> cls2, e<T> eVar) {
        for (org.junit.runners.model.b bVar : h(cls)) {
            try {
                Object l4 = bVar.l(obj);
                if (cls2.isInstance(l4)) {
                    eVar.a(bVar, cls2.cast(l4));
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e4);
            }
        }
    }

    public <T> void d(Object obj, Class<? extends Annotation> cls, Class<T> cls2, e<T> eVar) {
        for (org.junit.runners.model.d dVar : m(cls)) {
            try {
                if (cls2.isAssignableFrom(dVar.o())) {
                    eVar.a(dVar, cls2.cast(dVar.p(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + dVar.d(), th);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f55845a == ((j) obj).f55845a) {
            return true;
        }
        return false;
    }

    public <T> List<T> f(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        c(obj, cls, cls2, new a(arrayList));
        return arrayList;
    }

    public List<org.junit.runners.model.b> g() {
        return e(this.f55847c);
    }

    public List<org.junit.runners.model.b> h(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(j(this.f55847c, cls, false));
    }

    public int hashCode() {
        Class<?> cls = this.f55845a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    @Override // org.junit.runners.model.a
    public Annotation[] i() {
        Class<?> cls = this.f55845a;
        if (cls == null) {
            return new Annotation[0];
        }
        return cls.getAnnotations();
    }

    public <T> List<T> k(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        d(obj, cls, cls2, new b(arrayList));
        return arrayList;
    }

    public List<org.junit.runners.model.d> l() {
        List<org.junit.runners.model.d> e4 = e(this.f55846b);
        Collections.sort(e4, f55844e);
        return e4;
    }

    public List<org.junit.runners.model.d> m(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(j(this.f55846b, cls, false));
    }

    public Class<?> n() {
        return this.f55845a;
    }

    public String o() {
        Class<?> cls = this.f55845a;
        if (cls == null) {
            return "null";
        }
        return cls.getName();
    }

    public Constructor<?> p() {
        Constructor<?>[] constructors = this.f55845a.getConstructors();
        org.junit.c.v(1L, constructors.length);
        return constructors[0];
    }

    public boolean s() {
        if (this.f55845a.isMemberClass() && !Modifier.isStatic(this.f55845a.getModifiers())) {
            return true;
        }
        return false;
    }

    public boolean t() {
        return Modifier.isPublic(this.f55845a.getModifiers());
    }

    protected void w(Map<Class<? extends Annotation>, List<org.junit.runners.model.d>> map, Map<Class<? extends Annotation>, List<org.junit.runners.model.b>> map2) {
        for (Class<?> cls : r(this.f55845a)) {
            for (Method method : org.junit.internal.g.a(cls)) {
                b(new org.junit.runners.model.d(method), map);
            }
            for (Field field : q(cls)) {
                b(new org.junit.runners.model.b(field), map2);
            }
        }
    }
}
