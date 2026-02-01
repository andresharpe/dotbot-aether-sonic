package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements com.google.android.datatransport.runtime.dagger.internal.g<v> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Executor> f27596a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<InterfaceC1134d> f27597b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<x> f27598c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<B0.a> f27599d;

    public w(O2.c<Executor> cVar, O2.c<InterfaceC1134d> cVar2, O2.c<x> cVar3, O2.c<B0.a> cVar4) {
        this.f27596a = cVar;
        this.f27597b = cVar2;
        this.f27598c = cVar3;
        this.f27599d = cVar4;
    }

    public static w a(O2.c<Executor> cVar, O2.c<InterfaceC1134d> cVar2, O2.c<x> cVar3, O2.c<B0.a> cVar4) {
        return new w(cVar, cVar2, cVar3, cVar4);
    }

    public static v c(Executor executor, InterfaceC1134d interfaceC1134d, x xVar, B0.a aVar) {
        return new v(executor, interfaceC1134d, xVar, aVar);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f27596a.get(), this.f27597b.get(), this.f27598c.get(), this.f27599d.get());
    }
}
