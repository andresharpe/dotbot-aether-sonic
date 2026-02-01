package com.google.android.gms.measurement.internal;

import N0.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Bundle f30467E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30468F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W2(C1687n3 c1687n3, Bundle bundle) {
        this.f30468F = c1687n3;
        this.f30467E = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1687n3 c1687n3 = this.f30468F;
        Bundle bundle = this.f30467E;
        c1687n3.f();
        c1687n3.g();
        C1285y.l(bundle);
        String h4 = C1285y.h(bundle.getString(a.C0015a.f1688b));
        if (!c1687n3.f31060a.m()) {
            c1687n3.f31060a.b().t().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c1687n3.f31060a.J().q(new C1623d(bundle.getString("app_id"), "", new P4(h4, 0L, null, ""), bundle.getLong(a.C0015a.f1699m), bundle.getBoolean(a.C0015a.f1700n), bundle.getString(a.C0015a.f1690d), null, bundle.getLong(a.C0015a.f1691e), null, bundle.getLong(a.C0015a.f1696j), c1687n3.f31060a.L().u0(bundle.getString("app_id"), bundle.getString(a.C0015a.f1697k), bundle.getBundle(a.C0015a.f1698l), "", bundle.getLong(a.C0015a.f1699m), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
