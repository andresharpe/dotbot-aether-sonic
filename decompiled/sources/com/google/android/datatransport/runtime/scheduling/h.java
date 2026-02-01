package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import x0.InterfaceC2435a;

@x0.h
/* loaded from: classes.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    @x0.i
    public static x b(Context context, InterfaceC1134d interfaceC1134d, SchedulerConfig schedulerConfig, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, interfaceC1134d, schedulerConfig);
    }

    @InterfaceC2435a
    abstract e a(c cVar);
}
