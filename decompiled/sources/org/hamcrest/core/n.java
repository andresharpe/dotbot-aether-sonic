package org.hamcrest.core;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class n<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final Iterable<org.hamcrest.k<? super T>> f55443E;

    public n(Iterable<org.hamcrest.k<? super T>> iterable) {
        this.f55443E = iterable;
    }

    @Override // org.hamcrest.m
    public abstract void b(org.hamcrest.g gVar);

    @Override // org.hamcrest.k
    public abstract boolean c(Object obj);

    public void e(org.hamcrest.g gVar, String str) {
        gVar.a("(", " " + str + " ", ")", this.f55443E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f(Object obj, boolean z3) {
        Iterator<org.hamcrest.k<? super T>> it = this.f55443E.iterator();
        while (it.hasNext()) {
            if (it.next().c(obj) == z3) {
                return z3;
            }
        }
        return !z3;
    }
}
