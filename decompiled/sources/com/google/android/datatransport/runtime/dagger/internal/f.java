package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class f<T> implements O2.c<T>, x0.e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f27405c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f27406d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile O2.c<T> f27407a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f27408b = f27405c;

    private f(O2.c<T> cVar) {
        this.f27407a = cVar;
    }

    public static <P extends O2.c<T>, T> x0.e<T> a(P p4) {
        if (p4 instanceof x0.e) {
            return (x0.e) p4;
        }
        return new f((O2.c) p.b(p4));
    }

    public static <P extends O2.c<T>, T> O2.c<T> b(P p4) {
        p.b(p4);
        if (p4 instanceof f) {
            return p4;
        }
        return new f(p4);
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != f27405c && !(obj instanceof o) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // O2.c
    public T get() {
        T t3 = (T) this.f27408b;
        Object obj = f27405c;
        if (t3 == obj) {
            synchronized (this) {
                try {
                    t3 = (T) this.f27408b;
                    if (t3 == obj) {
                        t3 = this.f27407a.get();
                        this.f27408b = c(this.f27408b, t3);
                        this.f27407a = null;
                    }
                } finally {
                }
            }
        }
        return t3;
    }
}
