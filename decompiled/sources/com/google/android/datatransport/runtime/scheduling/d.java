package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.g<c> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Executor> f27501a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.backends.e> f27502b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<x> f27503c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<InterfaceC1134d> f27504d;

    /* renamed from: e, reason: collision with root package name */
    private final O2.c<B0.a> f27505e;

    public d(O2.c<Executor> cVar, O2.c<com.google.android.datatransport.runtime.backends.e> cVar2, O2.c<x> cVar3, O2.c<InterfaceC1134d> cVar4, O2.c<B0.a> cVar5) {
        this.f27501a = cVar;
        this.f27502b = cVar2;
        this.f27503c = cVar3;
        this.f27504d = cVar4;
        this.f27505e = cVar5;
    }

    public static d a(O2.c<Executor> cVar, O2.c<com.google.android.datatransport.runtime.backends.e> cVar2, O2.c<x> cVar3, O2.c<InterfaceC1134d> cVar4, O2.c<B0.a> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, x xVar, InterfaceC1134d interfaceC1134d, B0.a aVar) {
        return new c(executor, eVar, xVar, interfaceC1134d, aVar);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f27501a.get(), this.f27502b.get(), this.f27503c.get(), this.f27504d.get(), this.f27505e.get());
    }
}
