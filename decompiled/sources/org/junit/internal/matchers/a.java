package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.g;
import org.hamcrest.i;
import org.hamcrest.k;
import org.hamcrest.p;
import org.junit.internal.l;

/* loaded from: classes2.dex */
public class a<T extends Throwable> extends p<T> {

    /* renamed from: G, reason: collision with root package name */
    private final k<T> f55580G;

    public a(k<T> kVar) {
        this.f55580G = kVar;
    }

    @i
    public static <T extends Exception> k<T> h(k<T> kVar) {
        return new a(kVar);
    }

    @i
    public static <T extends Throwable> k<T> i(k<T> kVar) {
        return new a(kVar);
    }

    private String k(Throwable th) {
        return l.g(th);
    }

    @Override // org.hamcrest.m
    public void b(g gVar) {
        this.f55580G.b(gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(T t3, g gVar) {
        this.f55580G.a(t3, gVar);
        gVar.d("\nStacktrace was: ");
        gVar.d(k(t3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean f(T t3) {
        return this.f55580G.c(t3);
    }
}
