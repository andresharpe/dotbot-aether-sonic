package org.hamcrest.core;

/* loaded from: classes2.dex */
public class f<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final org.hamcrest.k<T> f55435E;

    public f(org.hamcrest.k<T> kVar) {
        this.f55435E = kVar;
    }

    @org.hamcrest.i
    @Deprecated
    public static <T> org.hamcrest.k<T> e(Class<T> cls) {
        return g(j.g(cls));
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> f(T t3) {
        return g(i.i(t3));
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> g(org.hamcrest.k<T> kVar) {
        return new f(kVar);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> h(Class<T> cls) {
        return g(j.g(cls));
    }

    @Override // org.hamcrest.b, org.hamcrest.k
    public void a(Object obj, org.hamcrest.g gVar) {
        this.f55435E.a(obj, gVar);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("is ").b(this.f55435E);
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        return this.f55435E.c(obj);
    }
}
