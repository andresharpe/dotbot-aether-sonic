package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30407E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f30408F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1736w f30409G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ String f30410H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30411I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(C1628d4 c1628d4, boolean z3, Z4 z4, boolean z5, C1736w c1736w, String str) {
        this.f30411I = c1628d4;
        this.f30407E = z4;
        this.f30408F = z5;
        this.f30409G = c1736w;
        this.f30410H = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1736w c1736w;
        C1628d4 c1628d4 = this.f30411I;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Discarding data. Failed to send event to service");
            return;
        }
        C1285y.l(this.f30407E);
        C1628d4 c1628d42 = this.f30411I;
        if (this.f30408F) {
            c1736w = null;
        } else {
            c1736w = this.f30409G;
        }
        c1628d42.p(interfaceC1661j1, c1736w, this.f30407E);
        this.f30411I.C();
    }
}
