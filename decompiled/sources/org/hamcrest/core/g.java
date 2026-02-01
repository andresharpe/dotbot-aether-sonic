package org.hamcrest.core;

/* loaded from: classes2.dex */
public class g<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final String f55436E;

    public g() {
        this("ANYTHING");
    }

    @org.hamcrest.i
    public static org.hamcrest.k<Object> e() {
        return new g();
    }

    @org.hamcrest.i
    public static org.hamcrest.k<Object> f(String str) {
        return new g(str);
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d(this.f55436E);
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        return true;
    }

    public g(String str) {
        this.f55436E = str;
    }
}
