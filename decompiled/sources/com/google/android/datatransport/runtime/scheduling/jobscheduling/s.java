package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1133c;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements com.google.android.datatransport.runtime.dagger.internal.g<r> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27581a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.backends.e> f27582b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<InterfaceC1134d> f27583c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<x> f27584d;

    /* renamed from: e, reason: collision with root package name */
    private final O2.c<Executor> f27585e;

    /* renamed from: f, reason: collision with root package name */
    private final O2.c<B0.a> f27586f;

    /* renamed from: g, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27587g;

    /* renamed from: h, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27588h;

    /* renamed from: i, reason: collision with root package name */
    private final O2.c<InterfaceC1133c> f27589i;

    public s(O2.c<Context> cVar, O2.c<com.google.android.datatransport.runtime.backends.e> cVar2, O2.c<InterfaceC1134d> cVar3, O2.c<x> cVar4, O2.c<Executor> cVar5, O2.c<B0.a> cVar6, O2.c<com.google.android.datatransport.runtime.time.a> cVar7, O2.c<com.google.android.datatransport.runtime.time.a> cVar8, O2.c<InterfaceC1133c> cVar9) {
        this.f27581a = cVar;
        this.f27582b = cVar2;
        this.f27583c = cVar3;
        this.f27584d = cVar4;
        this.f27585e = cVar5;
        this.f27586f = cVar6;
        this.f27587g = cVar7;
        this.f27588h = cVar8;
        this.f27589i = cVar9;
    }

    public static s a(O2.c<Context> cVar, O2.c<com.google.android.datatransport.runtime.backends.e> cVar2, O2.c<InterfaceC1134d> cVar3, O2.c<x> cVar4, O2.c<Executor> cVar5, O2.c<B0.a> cVar6, O2.c<com.google.android.datatransport.runtime.time.a> cVar7, O2.c<com.google.android.datatransport.runtime.time.a> cVar8, O2.c<InterfaceC1133c> cVar9) {
        return new s(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static r c(Context context, com.google.android.datatransport.runtime.backends.e eVar, InterfaceC1134d interfaceC1134d, x xVar, Executor executor, B0.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.time.a aVar3, InterfaceC1133c interfaceC1133c) {
        return new r(context, eVar, interfaceC1134d, xVar, executor, aVar, aVar2, aVar3, interfaceC1133c);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f27581a.get(), this.f27582b.get(), this.f27583c.get(), this.f27584d.get(), this.f27585e.get(), this.f27586f.get(), this.f27587g.get(), this.f27588h.get(), this.f27589i.get());
    }
}
