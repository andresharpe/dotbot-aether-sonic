package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.g;
import org.hamcrest.i;
import org.hamcrest.k;
import org.hamcrest.p;

/* loaded from: classes2.dex */
public class c<T extends Throwable> extends p<T> {

    /* renamed from: G, reason: collision with root package name */
    private final k<String> f55582G;

    public c(k<String> kVar) {
        this.f55582G = kVar;
    }

    @i
    public static <T extends Throwable> k<T> h(k<String> kVar) {
        return new c(kVar);
    }

    @Override // org.hamcrest.m
    public void b(g gVar) {
        gVar.d("exception with message ");
        gVar.b(this.f55582G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(T t3, g gVar) {
        gVar.d("message ");
        this.f55582G.a(t3.getMessage(), gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean f(T t3) {
        return this.f55582G.c(t3.getMessage());
    }
}
