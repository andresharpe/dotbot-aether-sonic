package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.g;
import org.hamcrest.i;
import org.hamcrest.k;
import org.hamcrest.p;

/* loaded from: classes2.dex */
public class b<T extends Throwable> extends p<T> {

    /* renamed from: G, reason: collision with root package name */
    private final k<?> f55581G;

    public b(k<?> kVar) {
        this.f55581G = kVar;
    }

    @i
    public static <T extends Throwable> k<T> h(k<?> kVar) {
        return new b(kVar);
    }

    @Override // org.hamcrest.m
    public void b(g gVar) {
        gVar.d("exception with cause ");
        gVar.b(this.f55581G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(T t3, g gVar) {
        gVar.d("cause ");
        this.f55581G.a(t3.getCause(), gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.hamcrest.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean f(T t3) {
        return this.f55581G.c(t3.getCause());
    }
}
