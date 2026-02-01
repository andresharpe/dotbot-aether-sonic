package org.hamcrest.core;

/* loaded from: classes2.dex */
public class m<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final T f55442E;

    public m(T t3) {
        this.f55442E = t3;
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> e(T t3) {
        return new m(t3);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> f(T t3) {
        return new m(t3);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("sameInstance(").e(this.f55442E).d(")");
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        if (obj == this.f55442E) {
            return true;
        }
        return false;
    }
}
