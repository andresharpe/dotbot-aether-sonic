package org.hamcrest.core;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class b<T> extends n<T> {
    public b(Iterable<org.hamcrest.k<? super T>> iterable) {
        super(iterable);
    }

    @org.hamcrest.i
    public static <T> b<T> g(Iterable<org.hamcrest.k<? super T>> iterable) {
        return new b<>(iterable);
    }

    @org.hamcrest.i
    public static <T> b<T> h(org.hamcrest.k<T> kVar, org.hamcrest.k<? super T> kVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        return g(arrayList);
    }

    @org.hamcrest.i
    public static <T> b<T> i(org.hamcrest.k<T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        return g(arrayList);
    }

    @org.hamcrest.i
    public static <T> b<T> j(org.hamcrest.k<T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        return g(arrayList);
    }

    @org.hamcrest.i
    public static <T> b<T> k(org.hamcrest.k<T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4, org.hamcrest.k<? super T> kVar5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        return g(arrayList);
    }

    @org.hamcrest.i
    public static <T> b<T> l(org.hamcrest.k<T> kVar, org.hamcrest.k<? super T> kVar2, org.hamcrest.k<? super T> kVar3, org.hamcrest.k<? super T> kVar4, org.hamcrest.k<? super T> kVar5, org.hamcrest.k<? super T> kVar6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        arrayList.add(kVar6);
        return g(arrayList);
    }

    @org.hamcrest.i
    public static <T> b<T> m(org.hamcrest.k<? super T>... kVarArr) {
        return g(Arrays.asList(kVarArr));
    }

    @Override // org.hamcrest.core.n, org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        e(gVar, "or");
    }

    @Override // org.hamcrest.core.n, org.hamcrest.k
    public boolean c(Object obj) {
        return f(obj, true);
    }

    @Override // org.hamcrest.core.n
    public /* bridge */ /* synthetic */ void e(org.hamcrest.g gVar, String str) {
        super.e(gVar, str);
    }
}
