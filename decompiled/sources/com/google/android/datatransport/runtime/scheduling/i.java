package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;

/* loaded from: classes.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.g<x> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27507a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<InterfaceC1134d> f27508b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<SchedulerConfig> f27509c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27510d;

    public i(O2.c<Context> cVar, O2.c<InterfaceC1134d> cVar2, O2.c<SchedulerConfig> cVar3, O2.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        this.f27507a = cVar;
        this.f27508b = cVar2;
        this.f27509c = cVar3;
        this.f27510d = cVar4;
    }

    public static i a(O2.c<Context> cVar, O2.c<InterfaceC1134d> cVar2, O2.c<SchedulerConfig> cVar3, O2.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static x c(Context context, InterfaceC1134d interfaceC1134d, SchedulerConfig schedulerConfig, com.google.android.datatransport.runtime.time.a aVar) {
        return (x) p.c(h.b(context, interfaceC1134d, schedulerConfig, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f27507a.get(), this.f27508b.get(), this.f27509c.get(), this.f27510d.get());
    }
}
