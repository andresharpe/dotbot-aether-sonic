package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class E3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30167E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f30168F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ P4 f30169G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30170H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(C1628d4 c1628d4, Z4 z4, boolean z3, P4 p4) {
        this.f30170H = c1628d4;
        this.f30167E = z4;
        this.f30168F = z3;
        this.f30169G = p4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        P4 p4;
        C1628d4 c1628d4 = this.f30170H;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Discarding data. Failed to set user property");
            return;
        }
        C1285y.l(this.f30167E);
        C1628d4 c1628d42 = this.f30170H;
        if (this.f30168F) {
            p4 = null;
        } else {
            p4 = this.f30169G;
        }
        c1628d42.p(interfaceC1661j1, p4, this.f30167E);
        this.f30170H.C();
    }
}
