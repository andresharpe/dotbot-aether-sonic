package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30392E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30393F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(C1628d4 c1628d4, Z4 z4) {
        this.f30393F = c1628d4;
        this.f30392E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1628d4 c1628d4 = this.f30393F;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Failed to send consent settings to service");
            return;
        }
        try {
            C1285y.l(this.f30392E);
            interfaceC1661j1.l1(this.f30392E);
            this.f30393F.C();
        } catch (RemoteException e4) {
            this.f30393F.f31060a.b().p().b("Failed to send consent settings to the service", e4);
        }
    }
}
