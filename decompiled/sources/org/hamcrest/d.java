package org.hamcrest;

import org.hamcrest.core.c;
import org.hamcrest.core.q;

/* loaded from: classes2.dex */
public class d {
    public static <T> k<Iterable<T>> A(T... tArr) {
        return org.hamcrest.core.h.h(tArr);
    }

    public static <T> k<Iterable<T>> B(k<? super T>... kVarArr) {
        return org.hamcrest.core.h.i(kVarArr);
    }

    public static <T> k<T> C(Class<?> cls) {
        return org.hamcrest.core.j.g(cls);
    }

    public static <T> k<T> D(Class<T> cls) {
        return org.hamcrest.core.f.e(cls);
    }

    public static <T> k<T> E(T t3) {
        return org.hamcrest.core.f.f(t3);
    }

    public static <T> k<T> F(k<T> kVar) {
        return org.hamcrest.core.f.g(kVar);
    }

    public static <T> k<T> G(Class<T> cls) {
        return org.hamcrest.core.f.h(cls);
    }

    public static <T> k<T> H(T t3) {
        return org.hamcrest.core.k.e(t3);
    }

    public static <T> k<T> I(k<T> kVar) {
        return org.hamcrest.core.k.f(kVar);
    }

    public static k<Object> J() {
        return org.hamcrest.core.l.e();
    }

    public static <T> k<T> K(Class<T> cls) {
        return org.hamcrest.core.l.f(cls);
    }

    public static k<Object> L() {
        return org.hamcrest.core.l.g();
    }

    public static <T> k<T> M(Class<T> cls) {
        return org.hamcrest.core.l.h(cls);
    }

    public static <T> k<T> N(T t3) {
        return org.hamcrest.core.m.e(t3);
    }

    public static k<String> O(String str) {
        return q.k(str);
    }

    public static <T> k<T> P(T t3) {
        return org.hamcrest.core.m.f(t3);
    }

    public static <T> k<T> a(Iterable<k<? super T>> iterable) {
        return org.hamcrest.core.a.f(iterable);
    }

    public static <T> k<T> b(k<? super T> kVar, k<? super T> kVar2) {
        return org.hamcrest.core.a.g(kVar, kVar2);
    }

    public static <T> k<T> c(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3) {
        return org.hamcrest.core.a.h(kVar, kVar2, kVar3);
    }

    public static <T> k<T> d(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4) {
        return org.hamcrest.core.a.i(kVar, kVar2, kVar3, kVar4);
    }

    public static <T> k<T> e(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5) {
        return org.hamcrest.core.a.j(kVar, kVar2, kVar3, kVar4, kVar5);
    }

    public static <T> k<T> f(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5, k<? super T> kVar6) {
        return org.hamcrest.core.a.k(kVar, kVar2, kVar3, kVar4, kVar5, kVar6);
    }

    public static <T> k<T> g(k<? super T>... kVarArr) {
        return org.hamcrest.core.a.l(kVarArr);
    }

    public static <T> k<T> h(Class<T> cls) {
        return org.hamcrest.core.j.f(cls);
    }

    public static <T> org.hamcrest.core.b<T> i(Iterable<k<? super T>> iterable) {
        return org.hamcrest.core.b.g(iterable);
    }

    public static <T> org.hamcrest.core.b<T> j(k<T> kVar, k<? super T> kVar2) {
        return org.hamcrest.core.b.h(kVar, kVar2);
    }

    public static <T> org.hamcrest.core.b<T> k(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3) {
        return org.hamcrest.core.b.i(kVar, kVar2, kVar3);
    }

    public static <T> org.hamcrest.core.b<T> l(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4) {
        return org.hamcrest.core.b.j(kVar, kVar2, kVar3, kVar4);
    }

    public static <T> org.hamcrest.core.b<T> m(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5) {
        return org.hamcrest.core.b.k(kVar, kVar2, kVar3, kVar4, kVar5);
    }

    public static <T> org.hamcrest.core.b<T> n(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5, k<? super T> kVar6) {
        return org.hamcrest.core.b.l(kVar, kVar2, kVar3, kVar4, kVar5, kVar6);
    }

    public static <T> org.hamcrest.core.b<T> o(k<? super T>... kVarArr) {
        return org.hamcrest.core.b.m(kVarArr);
    }

    public static k<Object> p() {
        return org.hamcrest.core.g.e();
    }

    public static k<Object> q(String str) {
        return org.hamcrest.core.g.f(str);
    }

    public static <LHS> c.a<LHS> r(k<? super LHS> kVar) {
        return org.hamcrest.core.c.g(kVar);
    }

    public static k<String> s(String str) {
        return org.hamcrest.core.o.k(str);
    }

    public static <T> k<T> t(String str, k<T> kVar, Object... objArr) {
        return org.hamcrest.core.d.e(str, kVar, objArr);
    }

    public static <LHS> c.b<LHS> u(k<? super LHS> kVar) {
        return org.hamcrest.core.c.h(kVar);
    }

    public static k<String> v(String str) {
        return org.hamcrest.core.p.k(str);
    }

    public static <T> k<T> w(T t3) {
        return org.hamcrest.core.i.i(t3);
    }

    public static <U> k<Iterable<U>> x(k<U> kVar) {
        return org.hamcrest.core.e.f(kVar);
    }

    public static <T> k<Iterable<? super T>> y(T t3) {
        return org.hamcrest.core.h.f(t3);
    }

    public static <T> k<Iterable<? super T>> z(k<? super T> kVar) {
        return org.hamcrest.core.h.g(kVar);
    }
}
