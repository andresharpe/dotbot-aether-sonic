package com.google.android.gms.measurement.internal;

import N0.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Bundle f30443E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30444F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(C1687n3 c1687n3, Bundle bundle) {
        this.f30444F = c1687n3;
        this.f30443E = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1687n3 c1687n3 = this.f30444F;
        Bundle bundle = this.f30443E;
        c1687n3.f();
        c1687n3.g();
        C1285y.l(bundle);
        String string = bundle.getString(a.C0015a.f1688b);
        String string2 = bundle.getString("origin");
        C1285y.h(string);
        C1285y.h(string2);
        C1285y.l(bundle.get("value"));
        if (!c1687n3.f31060a.m()) {
            c1687n3.f31060a.b().t().a("Conditional property not set since app measurement is disabled");
            return;
        }
        P4 p4 = new P4(string, bundle.getLong(a.C0015a.f1701o), bundle.get("value"), string2);
        try {
            C1736w u02 = c1687n3.f31060a.L().u0(bundle.getString("app_id"), bundle.getString(a.C0015a.f1694h), bundle.getBundle(a.C0015a.f1695i), string2, 0L, true, true);
            c1687n3.f31060a.J().q(new C1623d(bundle.getString("app_id"), string2, p4, bundle.getLong(a.C0015a.f1699m), false, bundle.getString(a.C0015a.f1690d), c1687n3.f31060a.L().u0(bundle.getString("app_id"), bundle.getString(a.C0015a.f1692f), bundle.getBundle(a.C0015a.f1693g), string2, 0L, true, true), bundle.getLong(a.C0015a.f1691e), u02, bundle.getLong(a.C0015a.f1696j), c1687n3.f31060a.L().u0(bundle.getString("app_id"), bundle.getString(a.C0015a.f1697k), bundle.getBundle(a.C0015a.f1698l), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
