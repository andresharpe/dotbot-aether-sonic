package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1736w f30355E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30356F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30357G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30358H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O3(C1628d4 c1628d4, C1736w c1736w, String str, InterfaceC1420j0 interfaceC1420j0) {
        this.f30358H = c1628d4;
        this.f30355E = c1736w;
        this.f30356F = str;
        this.f30357G = interfaceC1420j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1638f2 c1638f2;
        InterfaceC1661j1 interfaceC1661j1;
        byte[] bArr = null;
        try {
            try {
                C1628d4 c1628d4 = this.f30358H;
                interfaceC1661j1 = c1628d4.f30589d;
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().a("Discarding data. Failed to send event to service to bundle");
                    c1638f2 = this.f30358H.f31060a;
                } else {
                    bArr = interfaceC1661j1.f0(this.f30355E, this.f30356F);
                    this.f30358H.C();
                    c1638f2 = this.f30358H.f31060a;
                }
            } catch (RemoteException e4) {
                this.f30358H.f31060a.b().p().b("Failed to send event to the service to bundle", e4);
                c1638f2 = this.f30358H.f31060a;
            }
            c1638f2.L().E(this.f30357G, bArr);
        } catch (Throwable th) {
            this.f30358H.f31060a.L().E(this.f30357G, bArr);
            throw th;
        }
    }
}
