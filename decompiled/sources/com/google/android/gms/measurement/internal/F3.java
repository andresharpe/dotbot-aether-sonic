package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class F3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30178E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Z4 f30179F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ boolean f30180G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30181H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(C1628d4 c1628d4, AtomicReference atomicReference, Z4 z4, boolean z3) {
        this.f30181H = c1628d4;
        this.f30178E = atomicReference;
        this.f30179F = z4;
        this.f30180G = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1628d4 c1628d4;
        InterfaceC1661j1 interfaceC1661j1;
        synchronized (this.f30178E) {
            try {
                try {
                    c1628d4 = this.f30181H;
                    interfaceC1661j1 = c1628d4.f30589d;
                } catch (RemoteException e4) {
                    this.f30181H.f31060a.b().p().b("Failed to get all user properties; remote exception", e4);
                    atomicReference = this.f30178E;
                }
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().a("Failed to get all user properties; not connected to service");
                    return;
                }
                C1285y.l(this.f30179F);
                this.f30178E.set(interfaceC1661j1.d0(this.f30179F, this.f30180G));
                this.f30181H.C();
                atomicReference = this.f30178E;
                atomicReference.notify();
            } finally {
                this.f30178E.notify();
            }
        }
    }
}
