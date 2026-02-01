package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30340E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Bundle f30341F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30342G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M3(C1628d4 c1628d4, Z4 z4, Bundle bundle) {
        this.f30342G = c1628d4;
        this.f30340E = z4;
        this.f30341F = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1661j1 interfaceC1661j1;
        C1628d4 c1628d4 = this.f30342G;
        interfaceC1661j1 = c1628d4.f30589d;
        if (interfaceC1661j1 == null) {
            c1628d4.f31060a.b().p().a("Failed to send default event parameters to service");
            return;
        }
        try {
            C1285y.l(this.f30340E);
            interfaceC1661j1.S(this.f30341F, this.f30340E);
        } catch (RemoteException e4) {
            this.f30342G.f31060a.b().p().b("Failed to send default event parameters to service", e4);
        }
    }
}
