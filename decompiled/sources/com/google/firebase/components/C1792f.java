package com.google.firebase.components;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l1.InterfaceC2354a;

/* renamed from: com.google.firebase.components.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1792f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f34889a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<? super T>> f34890b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<u> f34891c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34892d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34893e;

    /* renamed from: f, reason: collision with root package name */
    private final j<T> f34894f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f34895g;

    /* renamed from: com.google.firebase.components.f$b */
    /* loaded from: classes2.dex */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f34896a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<Class<? super T>> f34897b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<u> f34898c;

        /* renamed from: d, reason: collision with root package name */
        private int f34899d;

        /* renamed from: e, reason: collision with root package name */
        private int f34900e;

        /* renamed from: f, reason: collision with root package name */
        private j<T> f34901f;

        /* renamed from: g, reason: collision with root package name */
        private Set<Class<?>> f34902g;

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC2354a
        public b<T> g() {
            this.f34900e = 1;
            return this;
        }

        @InterfaceC2354a
        private b<T> j(int i4) {
            boolean z3;
            if (this.f34899d == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            D.d(z3, "Instantiation type has already been set.");
            this.f34899d = i4;
            return this;
        }

        private void k(Class<?> cls) {
            D.a(!this.f34897b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @InterfaceC2354a
        public b<T> b(u uVar) {
            D.c(uVar, "Null dependency");
            k(uVar.c());
            this.f34898c.add(uVar);
            return this;
        }

        @InterfaceC2354a
        public b<T> c() {
            return j(1);
        }

        public C1792f<T> d() {
            boolean z3;
            if (this.f34901f != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            D.d(z3, "Missing required property: factory.");
            return new C1792f<>(this.f34896a, new HashSet(this.f34897b), new HashSet(this.f34898c), this.f34899d, this.f34900e, this.f34901f, this.f34902g);
        }

        @InterfaceC2354a
        public b<T> e() {
            return j(2);
        }

        @InterfaceC2354a
        public b<T> f(j<T> jVar) {
            this.f34901f = (j) D.c(jVar, "Null factory");
            return this;
        }

        public b<T> h(@N String str) {
            this.f34896a = str;
            return this;
        }

        @InterfaceC2354a
        public b<T> i(Class<?> cls) {
            this.f34902g.add(cls);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f34896a = null;
            HashSet hashSet = new HashSet();
            this.f34897b = hashSet;
            this.f34898c = new HashSet();
            this.f34899d = 0;
            this.f34900e = 0;
            this.f34902g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                D.c(cls2, "Null interface");
            }
            Collections.addAll(this.f34897b, clsArr);
        }
    }

    public static <T> b<T> d(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> e(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> C1792f<T> k(final T t3, Class<T> cls) {
        return l(cls).f(new j() { // from class: com.google.firebase.components.c
            @Override // com.google.firebase.components.j
            public final Object a(g gVar) {
                Object q4;
                q4 = C1792f.q(t3, gVar);
                return q4;
            }
        }).d();
    }

    public static <T> b<T> l(Class<T> cls) {
        return d(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, g gVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, g gVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s(Object obj, g gVar) {
        return obj;
    }

    @Deprecated
    public static <T> C1792f<T> t(Class<T> cls, final T t3) {
        return d(cls).f(new j() { // from class: com.google.firebase.components.d
            @Override // com.google.firebase.components.j
            public final Object a(g gVar) {
                Object r4;
                r4 = C1792f.r(t3, gVar);
                return r4;
            }
        }).d();
    }

    @SafeVarargs
    public static <T> C1792f<T> u(final T t3, Class<T> cls, Class<? super T>... clsArr) {
        return e(cls, clsArr).f(new j() { // from class: com.google.firebase.components.e
            @Override // com.google.firebase.components.j
            public final Object a(g gVar) {
                Object s4;
                s4 = C1792f.s(t3, gVar);
                return s4;
            }
        }).d();
    }

    public Set<u> f() {
        return this.f34891c;
    }

    public j<T> g() {
        return this.f34894f;
    }

    @P
    public String h() {
        return this.f34889a;
    }

    public Set<Class<? super T>> i() {
        return this.f34890b;
    }

    public Set<Class<?>> j() {
        return this.f34895g;
    }

    public boolean m() {
        if (this.f34892d == 1) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f34892d == 2) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f34892d == 0) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f34893e == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f34890b.toArray()) + ">{" + this.f34892d + ", type=" + this.f34893e + ", deps=" + Arrays.toString(this.f34891c.toArray()) + "}";
    }

    public C1792f<T> v(j<T> jVar) {
        return new C1792f<>(this.f34889a, this.f34890b, this.f34891c, this.f34892d, this.f34893e, jVar, this.f34895g);
    }

    private C1792f(@P String str, Set<Class<? super T>> set, Set<u> set2, int i4, int i5, j<T> jVar, Set<Class<?>> set3) {
        this.f34889a = str;
        this.f34890b = Collections.unmodifiableSet(set);
        this.f34891c = Collections.unmodifiableSet(set2);
        this.f34892d = i4;
        this.f34893e = i5;
        this.f34894f = jVar;
        this.f34895g = Collections.unmodifiableSet(set3);
    }
}
