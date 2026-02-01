package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class q<T> implements O2.c<x0.e<T>> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f27413b = false;

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<T> f27414a;

    private q(O2.c<T> cVar) {
        this.f27414a = cVar;
    }

    public static <T> O2.c<x0.e<T>> a(O2.c<T> cVar) {
        return new q((O2.c) p.b(cVar));
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x0.e<T> get() {
        return f.a(this.f27414a);
    }
}
