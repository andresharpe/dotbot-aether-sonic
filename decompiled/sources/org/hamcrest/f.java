package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class f<T> extends p<T> {

    /* renamed from: G, reason: collision with root package name */
    private final String f55446G;

    public f(String str) {
        if (str != null) {
            this.f55446G = str;
            return;
        }
        throw new IllegalArgumentException("Description must be non null!");
    }

    @Override // org.hamcrest.m
    public final void b(g gVar) {
        gVar.d(this.f55446G);
    }
}
