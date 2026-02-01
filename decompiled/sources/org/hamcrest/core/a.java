package org.hamcrest.core;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class a<T> extends org.hamcrest.h<T> {

    /* renamed from: E, reason: collision with root package name */
    private final Iterable<org.hamcrest.k<? super T>> f55426E;

    public a(Iterable<org.hamcrest.k<? super T>> iterable) {
        this.f55426E = iterable;
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> f(Iterable<org.hamcrest.k<? super T>> iterable) {
        return new a(iterable);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> g(org.hamcrest.k<? super T> kVar, org.hamcrest.k<? super T> kVar2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        return f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> h(org.hamcrest.k<? super T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        return f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> i(org.hamcrest.k<? super T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        return f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> j(org.hamcrest.k<? super T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4, org.hamcrest.k<? super T> kVar5) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        return f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> k(org.hamcrest.k<? super T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4, org.hamcrest.k<? super T> kVar5, org.hamcrest.k<? super T> kVar6) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        arrayList.add(kVar6);
        return f(arrayList);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> l(org.hamcrest.k<? super T>... kVarArr) {
        return f(Arrays.asList(kVarArr));
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.a("(", " and ", ")", this.f55426E);
    }

    @Override // org.hamcrest.h
    public boolean e(Object obj, org.hamcrest.g gVar) {
        for (org.hamcrest.k<? super T> kVar : this.f55426E) {
            if (!kVar.c(obj)) {
                gVar.b(kVar).d(" ");
                kVar.a(obj, gVar);
                return false;
            }
        }
        return true;
    }
}
