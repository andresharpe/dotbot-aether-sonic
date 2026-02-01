package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30238E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30239F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30240G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I3(C1628d4 c1628d4, Z4 z4, InterfaceC1420j0 interfaceC1420j0) {
        this.f30240G = c1628d4;
        this.f30238E = z4;
        this.f30239F = interfaceC1420j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1638f2 c1638f2;
        InterfaceC1661j1 interfaceC1661j1;
        String str = null;
        try {
            try {
                if (!this.f30240G.f31060a.D().o().i(zzah.ANALYTICS_STORAGE)) {
                    this.f30240G.f31060a.b().v().a("Analytics storage consent denied; will not get app instance id");
                    this.f30240G.f31060a.G().A(null);
                    this.f30240G.f31060a.D().f30253g.b(null);
                    c1638f2 = this.f30240G.f31060a;
                } else {
                    C1628d4 c1628d4 = this.f30240G;
                    interfaceC1661j1 = c1628d4.f30589d;
                    if (interfaceC1661j1 == null) {
                        c1628d4.f31060a.b().p().a("Failed to get app instance id");
                        c1638f2 = this.f30240G.f31060a;
                    } else {
                        C1285y.l(this.f30238E);
                        str = interfaceC1661j1.k0(this.f30238E);
                        if (str != null) {
                            this.f30240G.f31060a.G().A(str);
                            this.f30240G.f31060a.D().f30253g.b(str);
                        }
                        this.f30240G.C();
                        c1638f2 = this.f30240G.f31060a;
                    }
                }
            } catch (RemoteException e4) {
                this.f30240G.f31060a.b().p().b("Failed to get app instance id", e4);
                c1638f2 = this.f30240G.f31060a;
            }
            c1638f2.L().H(this.f30239F, str);
        } catch (Throwable th) {
            this.f30240G.f31060a.L().H(this.f30239F, null);
            throw th;
        }
    }
}
