package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.a;
import com.google.android.gms.internal.common.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class b implements a.InterfaceC0270a {
    @Override // com.google.android.gms.common.providers.a.InterfaceC0270a
    public final ScheduledExecutorService a() {
        q.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
