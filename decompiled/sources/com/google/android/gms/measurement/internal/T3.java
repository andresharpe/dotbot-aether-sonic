package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30418E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f30419F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1623d f30420G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1623d f30421H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30422I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T3(C1628d4 c1628d4, boolean z3, Z4 z4, boolean z5, C1623d c1623d, C1623d c1623d2) {
        this.f30422I = c1628d4;
        this.f30418E = z4;
        this.f30419F = z5;
        this.f30420G = c1623d;
        this.f30421H = c1623d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1623d c1623d;
        C1628d4 c1628d4 = this.f30422I;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C1285y.l(this.f30418E);
        C1628d4 c1628d42 = this.f30422I;
        if (this.f30419F) {
            c1623d = null;
        } else {
            c1623d = this.f30420G;
        }
        c1628d42.p(interfaceC1661j1, c1623d, this.f30418E);
        this.f30422I.C();
    }
}
