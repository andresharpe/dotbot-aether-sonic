package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class H3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30198E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Z4 f30199F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30200G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(C1628d4 c1628d4, AtomicReference atomicReference, Z4 z4) {
        this.f30200G = c1628d4;
        this.f30198E = atomicReference;
        this.f30199F = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC1661j1 interfaceC1661j1;
        synchronized (this.f30198E) {
            try {
                try {
                } catch (RemoteException e4) {
                    this.f30200G.f31060a.b().p().b("Failed to get app instance id", e4);
                    atomicReference = this.f30198E;
                }
                if (!this.f30200G.f31060a.D().o().i(zzah.ANALYTICS_STORAGE)) {
                    this.f30200G.f31060a.b().v().a("Analytics storage consent denied; will not get app instance id");
                    this.f30200G.f31060a.G().A(null);
                    this.f30200G.f31060a.D().f30253g.b(null);
                    this.f30198E.set(null);
                    return;
                }
                C1628d4 c1628d4 = this.f30200G;
                interfaceC1661j1 = c1628d4.f30589d;
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().a("Failed to get app instance id");
                    return;
                }
                C1285y.l(this.f30199F);
                this.f30198E.set(interfaceC1661j1.k0(this.f30199F));
                String str = (String) this.f30198E.get();
                if (str != null) {
                    this.f30200G.f31060a.G().A(str);
                    this.f30200G.f31060a.D().f30253g.b(str);
                }
                this.f30200G.C();
                atomicReference = this.f30198E;
                atomicReference.notify();
            } finally {
                this.f30198E.notify();
            }
        }
    }
}
