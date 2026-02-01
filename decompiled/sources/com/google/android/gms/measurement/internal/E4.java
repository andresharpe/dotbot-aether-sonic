package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class E4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z4 f30171a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L4 f30172b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E4(L4 l4, Z4 z4) {
        this.f30172b = l4;
        this.f30171a = z4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C1653i T3 = this.f30172b.T((String) C1285y.l(this.f30171a.f30506E));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (T3.i(zzahVar) && C1653i.b(this.f30171a.f30527Z).i(zzahVar)) {
            return this.f30172b.Q(this.f30171a).e0();
        }
        this.f30172b.b().t().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
