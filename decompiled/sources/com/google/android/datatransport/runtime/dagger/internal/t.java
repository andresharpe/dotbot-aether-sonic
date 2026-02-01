package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class t<T> implements O2.c<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f27423c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f27424d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile O2.c<T> f27425a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f27426b = f27423c;

    private t(O2.c<T> cVar) {
        this.f27425a = cVar;
    }

    public static <P extends O2.c<T>, T> O2.c<T> a(P p4) {
        if (!(p4 instanceof t) && !(p4 instanceof f)) {
            return new t((O2.c) p.b(p4));
        }
        return p4;
    }

    @Override // O2.c
    public T get() {
        T t3 = (T) this.f27426b;
        if (t3 == f27423c) {
            O2.c<T> cVar = this.f27425a;
            if (cVar == null) {
                return (T) this.f27426b;
            }
            T t4 = cVar.get();
            this.f27426b = t4;
            this.f27425a = null;
            return t4;
        }
        return t3;
    }
}
