package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* loaded from: classes.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<SchedulerConfig> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27506a;

    public g(O2.c<com.google.android.datatransport.runtime.time.a> cVar) {
        this.f27506a = cVar;
    }

    public static SchedulerConfig a(com.google.android.datatransport.runtime.time.a aVar) {
        return (SchedulerConfig) p.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(O2.c<com.google.android.datatransport.runtime.time.a> cVar) {
        return new g(cVar);
    }

    @Override // O2.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SchedulerConfig get() {
        return a(this.f27506a.get());
    }
}
