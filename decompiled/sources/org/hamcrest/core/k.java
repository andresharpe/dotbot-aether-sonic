package org.hamcrest.core;

/* loaded from: classes2.dex */
public class k<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final org.hamcrest.k<T> f55441E;

    public k(org.hamcrest.k<T> kVar) {
        this.f55441E = kVar;
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> e(T t3) {
        return f(i.i(t3));
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> f(org.hamcrest.k<T> kVar) {
        return new k(kVar);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("not ").b(this.f55441E);
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        return !this.f55441E.c(obj);
    }
}
