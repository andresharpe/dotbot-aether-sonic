package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1728u3 f30301E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30302F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(C1628d4 c1628d4, C1728u3 c1728u3) {
        this.f30302F = c1628d4;
        this.f30301E = c1728u3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1628d4 c1628d4 = this.f30302F;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Failed to send current screen to service");
            return;
        }
        try {
            C1728u3 c1728u3 = this.f30301E;
            if (c1728u3 == null) {
                interfaceC1661j1.W0(0L, null, null, c1628d4.f31060a.d().getPackageName());
            } else {
                interfaceC1661j1.W0(c1728u3.f30999c, c1728u3.f30997a, c1728u3.f30998b, c1628d4.f31060a.d().getPackageName());
            }
            this.f30302F.C();
        } catch (RemoteException e4) {
            this.f30302F.f31060a.b().p().b("Failed to send current screen to the service", e4);
        }
    }
}
