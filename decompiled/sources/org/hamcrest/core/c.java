package org.hamcrest.core;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c<T> extends org.hamcrest.o<T> {

    /* renamed from: G, reason: collision with root package name */
    private final org.hamcrest.k<? super T> f55427G;

    /* loaded from: classes2.dex */
    public static final class a<X> {

        /* renamed from: a, reason: collision with root package name */
        private final org.hamcrest.k<? super X> f55428a;

        public a(org.hamcrest.k<? super X> kVar) {
            this.f55428a = kVar;
        }

        public c<X> a(org.hamcrest.k<? super X> kVar) {
            return new c(this.f55428a).f(kVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<X> {

        /* renamed from: a, reason: collision with root package name */
        private final org.hamcrest.k<? super X> f55429a;

        public b(org.hamcrest.k<? super X> kVar) {
            this.f55429a = kVar;
        }

        public c<X> a(org.hamcrest.k<? super X> kVar) {
            return new c(this.f55429a).i(kVar);
        }
    }

    public c(org.hamcrest.k<? super T> kVar) {
        this.f55427G = kVar;
    }

    @org.hamcrest.i
    public static <LHS> a<LHS> g(org.hamcrest.k<? super LHS> kVar) {
        return new a<>(kVar);
    }

    @org.hamcrest.i
    public static <LHS> b<LHS> h(org.hamcrest.k<? super LHS> kVar) {
        return new b<>(kVar);
    }

    private ArrayList<org.hamcrest.k<? super T>> j(org.hamcrest.k<? super T> kVar) {
        ArrayList<org.hamcrest.k<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.f55427G);
        arrayList.add(kVar);
        return arrayList;
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.b(this.f55427G);
    }

    @Override // org.hamcrest.o
    protected boolean e(T t3, org.hamcrest.g gVar) {
        if (!this.f55427G.c(t3)) {
            this.f55427G.a(t3, gVar);
            return false;
        }
        return true;
    }

    public c<T> f(org.hamcrest.k<? super T> kVar) {
        return new c<>(new org.hamcrest.core.a(j(kVar)));
    }

    public c<T> i(org.hamcrest.k<? super T> kVar) {
        return new c<>(new org.hamcrest.core.b(j(kVar)));
    }
}
