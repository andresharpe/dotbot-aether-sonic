package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
public final class O implements com.google.android.datatransport.runtime.dagger.internal.g<N> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27619a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27620b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<AbstractC1135e> f27621c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<V> f27622d;

    /* renamed from: e, reason: collision with root package name */
    private final O2.c<String> f27623e;

    public O(O2.c<com.google.android.datatransport.runtime.time.a> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<AbstractC1135e> cVar3, O2.c<V> cVar4, O2.c<String> cVar5) {
        this.f27619a = cVar;
        this.f27620b = cVar2;
        this.f27621c = cVar3;
        this.f27622d = cVar4;
        this.f27623e = cVar5;
    }

    public static O a(O2.c<com.google.android.datatransport.runtime.time.a> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<AbstractC1135e> cVar3, O2.c<V> cVar4, O2.c<String> cVar5) {
        return new O(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static N c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, Object obj, Object obj2, x0.e<String> eVar) {
        return new N(aVar, aVar2, (AbstractC1135e) obj, (V) obj2, eVar);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N get() {
        return c(this.f27619a.get(), this.f27620b.get(), this.f27621c.get(), this.f27622d.get(), com.google.android.datatransport.runtime.dagger.internal.f.a(this.f27623e));
    }
}
