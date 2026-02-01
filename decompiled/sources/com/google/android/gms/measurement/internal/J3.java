package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30271E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30272F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(C1628d4 c1628d4, Z4 z4) {
        this.f30272F = c1628d4;
        this.f30271E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1628d4 c1628d4 = this.f30272F;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C1285y.l(this.f30271E);
            interfaceC1661j1.Q0(this.f30271E);
            this.f30272F.f31060a.A().r();
            this.f30272F.p(interfaceC1661j1, null, this.f30271E);
            this.f30272F.C();
        } catch (RemoteException e4) {
            this.f30272F.f31060a.b().p().b("Failed to send app launch to the service", e4);
        }
    }
}
