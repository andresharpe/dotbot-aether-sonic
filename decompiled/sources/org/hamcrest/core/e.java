package org.hamcrest.core;

/* loaded from: classes2.dex */
public class e<T> extends org.hamcrest.o<Iterable<T>> {

    /* renamed from: G, reason: collision with root package name */
    private final org.hamcrest.k<? super T> f55434G;

    public e(org.hamcrest.k<? super T> kVar) {
        this.f55434G = kVar;
    }

    @org.hamcrest.i
    public static <U> org.hamcrest.k<Iterable<U>> f(org.hamcrest.k<U> kVar) {
        return new e(kVar);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("every item is ").b(this.f55434G);
    }

    @Override // org.hamcrest.o
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean e(Iterable<T> iterable, org.hamcrest.g gVar) {
        for (T t3 : iterable) {
            if (!this.f55434G.c(t3)) {
                gVar.d("an item ");
                this.f55434G.a(t3, gVar);
                return false;
            }
        }
        return true;
    }
}
