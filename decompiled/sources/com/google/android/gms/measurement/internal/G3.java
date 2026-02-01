package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class G3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30188E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30189F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(C1628d4 c1628d4, Z4 z4) {
        this.f30189F = c1628d4;
        this.f30188E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1628d4 c1628d4 = this.f30189F;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C1285y.l(this.f30188E);
            interfaceC1661j1.t1(this.f30188E);
        } catch (RemoteException e4) {
            this.f30189F.f31060a.b().p().b("Failed to reset data on the service: remote exception", e4);
        }
        this.f30189F.C();
    }
}
