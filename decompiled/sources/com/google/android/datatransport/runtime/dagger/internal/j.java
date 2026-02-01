package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class j<T> implements g<T>, x0.e<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final j<Object> f27409b = new j<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f27410a;

    private j(T t3) {
        this.f27410a = t3;
    }

    public static <T> g<T> a(T t3) {
        return new j(p.c(t3, "instance cannot be null"));
    }

    public static <T> g<T> b(T t3) {
        if (t3 == null) {
            return c();
        }
        return new j(t3);
    }

    private static <T> j<T> c() {
        return (j<T>) f27409b;
    }

    @Override // O2.c
    public T get() {
        return this.f27410a;
    }
}
