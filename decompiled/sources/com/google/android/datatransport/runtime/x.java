package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public final class x implements com.google.android.datatransport.runtime.dagger.internal.g<v> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27715a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27716b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.scheduling.e> f27717c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.r> f27718d;

    /* renamed from: e, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.v> f27719e;

    public x(O2.c<com.google.android.datatransport.runtime.time.a> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.r> cVar4, O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.v> cVar5) {
        this.f27715a = cVar;
        this.f27716b = cVar2;
        this.f27717c = cVar3;
        this.f27718d = cVar4;
        this.f27719e = cVar5;
    }

    public static x a(O2.c<com.google.android.datatransport.runtime.time.a> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.r> cVar4, O2.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.v> cVar5) {
        return new x(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static v c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.r rVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.v vVar) {
        return new v(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f27715a.get(), this.f27716b.get(), this.f27717c.get(), this.f27718d.get(), this.f27719e.get());
    }
}
