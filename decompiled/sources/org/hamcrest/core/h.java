package org.hamcrest.core;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h<T> extends org.hamcrest.o<Iterable<? super T>> {

    /* renamed from: G, reason: collision with root package name */
    private final org.hamcrest.k<? super T> f55437G;

    public h(org.hamcrest.k<? super T> kVar) {
        this.f55437G = kVar;
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<Iterable<? super T>> f(T t3) {
        return new h(i.i(t3));
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<Iterable<? super T>> g(org.hamcrest.k<? super T> kVar) {
        return new h(kVar);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<Iterable<T>> h(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t3 : tArr) {
            arrayList.add(f(t3));
        }
        return a.f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<Iterable<T>> i(org.hamcrest.k<? super T>... kVarArr) {
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (org.hamcrest.k<? super T> kVar : kVarArr) {
            arrayList.add(new h(kVar));
        }
        return a.f(arrayList);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("a collection containing ").b(this.f55437G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean e(Iterable<? super T> iterable, org.hamcrest.g gVar) {
        boolean z3 = false;
        for (T t3 : iterable) {
            if (this.f55437G.c(t3)) {
                return true;
            }
            if (z3) {
                gVar.d(", ");
            }
            this.f55437G.a(t3, gVar);
            z3 = true;
        }
        return false;
    }
}
