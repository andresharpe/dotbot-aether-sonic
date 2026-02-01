package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.g;
import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public class a extends g {

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface b {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface c {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    public a(Class<?> cls, org.junit.runners.model.g gVar) throws InitializationError {
        super(cls, gVar);
        try {
            e(C0517a.g(V(cls), S(cls), U(cls), R(cls)));
        } catch (NoTestsRemainException e4) {
            throw new InitializationError(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> Q(Class<?>[] clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    throw new NullPointerException("has null category");
                }
            }
            if (clsArr.length == 1) {
                return Collections.singleton(clsArr[0]);
            }
            return new LinkedHashSet(Arrays.asList(clsArr));
        }
        return Collections.emptySet();
    }

    private static Set<Class<?>> R(Class<?> cls) {
        Class<?>[] value;
        b bVar = (b) cls.getAnnotation(b.class);
        if (bVar == null) {
            value = null;
        } else {
            value = bVar.value();
        }
        return Q(value);
    }

    private static Set<Class<?>> S(Class<?> cls) {
        Class<?>[] value;
        c cVar = (c) cls.getAnnotation(c.class);
        if (cVar == null) {
            value = null;
        } else {
            value = cVar.value();
        }
        return Q(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean T(Set<Class<?>> set, Class<?> cls) {
        Iterator<Class<?>> it = set.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean U(Class<?> cls) {
        b bVar = (b) cls.getAnnotation(b.class);
        if (bVar != null && !bVar.matchAny()) {
            return false;
        }
        return true;
    }

    private static boolean V(Class<?> cls) {
        c cVar = (c) cls.getAnnotation(c.class);
        if (cVar != null && !cVar.matchAny()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> W(Class<?> cls) {
        if (cls == null) {
            return Collections.emptySet();
        }
        return Collections.singleton(cls);
    }

    /* renamed from: org.junit.experimental.categories.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0517a extends org.junit.runner.manipulation.b {

        /* renamed from: b, reason: collision with root package name */
        private final Set<Class<?>> f55495b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<Class<?>> f55496c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f55497d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f55498e;

        @Deprecated
        public C0517a(Class<?> cls, Class<?> cls2) {
            this.f55497d = true;
            this.f55498e = true;
            this.f55495b = a.W(cls);
            this.f55496c = a.W(cls2);
        }

        private static Set<Class<?>> f(Description description) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, i(description));
            Collections.addAll(hashSet, i(s(description)));
            return hashSet;
        }

        public static C0517a g(boolean z3, Set<Class<?>> set, boolean z4, Set<Class<?>> set2) {
            return new C0517a(z3, set, z4, set2);
        }

        private static Set<Class<?>> h(Set<Class<?>> set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                linkedHashSet.addAll(set);
            }
            linkedHashSet.remove(null);
            return linkedHashSet;
        }

        private static Class<?>[] i(Description description) {
            if (description == null) {
                return new Class[0];
            }
            org.junit.experimental.categories.b bVar = (org.junit.experimental.categories.b) description.l(org.junit.experimental.categories.b.class);
            if (bVar == null) {
                return new Class[0];
            }
            return bVar.value();
        }

        public static C0517a j(Class<?> cls) {
            return k(true, cls);
        }

        public static C0517a k(boolean z3, Class<?>... clsArr) {
            return new C0517a(true, (Class<?>[]) null, z3, clsArr);
        }

        public static C0517a l(Class<?>... clsArr) {
            return k(true, clsArr);
        }

        private boolean m(Description description) {
            Set<Class<?>> f4 = f(description);
            if (f4.isEmpty()) {
                return this.f55495b.isEmpty();
            }
            if (!this.f55496c.isEmpty()) {
                if (this.f55498e) {
                    if (r(f4, this.f55496c)) {
                        return false;
                    }
                } else if (q(f4, this.f55496c)) {
                    return false;
                }
            }
            if (this.f55495b.isEmpty()) {
                return true;
            }
            if (this.f55497d) {
                return r(f4, this.f55495b);
            }
            return q(f4, this.f55495b);
        }

        public static C0517a n(Class<?> cls) {
            return o(true, cls);
        }

        public static C0517a o(boolean z3, Class<?>... clsArr) {
            return new C0517a(z3, clsArr, true, (Class<?>[]) null);
        }

        public static C0517a p(Class<?>... clsArr) {
            return o(true, clsArr);
        }

        private boolean q(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it = set2.iterator();
            while (it.hasNext()) {
                if (!a.T(set, it.next())) {
                    return false;
                }
            }
            return true;
        }

        private boolean r(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it = set2.iterator();
            while (it.hasNext()) {
                if (a.T(set, it.next())) {
                    return true;
                }
            }
            return false;
        }

        private static Description s(Description description) {
            Class<?> r4 = description.r();
            if (r4 == null) {
                return null;
            }
            return Description.c(r4);
        }

        @Override // org.junit.runner.manipulation.b
        public String b() {
            return toString();
        }

        @Override // org.junit.runner.manipulation.b
        public boolean e(Description description) {
            if (m(description)) {
                return true;
            }
            Iterator<Description> it = description.n().iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("categories ");
            if (this.f55495b.isEmpty()) {
                obj = "[all]";
            } else {
                obj = this.f55495b;
            }
            sb.append(obj);
            if (!this.f55496c.isEmpty()) {
                sb.append(" - ");
                sb.append(this.f55496c);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C0517a(boolean z3, Set<Class<?>> set, boolean z4, Set<Class<?>> set2) {
            this.f55497d = z3;
            this.f55498e = z4;
            this.f55495b = h(set);
            this.f55496c = h(set2);
        }

        private C0517a(boolean z3, Class<?>[] clsArr, boolean z4, Class<?>[] clsArr2) {
            this.f55497d = z3;
            this.f55498e = z4;
            this.f55495b = a.Q(clsArr);
            this.f55496c = a.Q(clsArr2);
        }
    }
}
