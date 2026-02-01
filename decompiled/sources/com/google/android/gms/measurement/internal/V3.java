package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30445E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30446F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Z4 f30447G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30448H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30449I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(C1628d4 c1628d4, String str, String str2, Z4 z4, InterfaceC1420j0 interfaceC1420j0) {
        this.f30449I = c1628d4;
        this.f30445E = str;
        this.f30446F = str2;
        this.f30447G = z4;
        this.f30448H = interfaceC1420j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1638f2 c1638f2;
        InterfaceC1661j1 interfaceC1661j1;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C1628d4 c1628d4 = this.f30449I;
                interfaceC1661j1 = c1628d4.f30589d;
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().c("Failed to get conditional properties; not connected to service", this.f30445E, this.f30446F);
                    c1638f2 = this.f30449I.f31060a;
                } else {
                    C1285y.l(this.f30447G);
                    arrayList = U4.t(interfaceC1661j1.R0(this.f30445E, this.f30446F, this.f30447G));
                    this.f30449I.C();
                    c1638f2 = this.f30449I.f31060a;
                }
            } catch (RemoteException e4) {
                this.f30449I.f31060a.b().p().d("Failed to get conditional properties; remote exception", this.f30445E, this.f30446F, e4);
                c1638f2 = this.f30449I.f31060a;
            }
            c1638f2.L().C(this.f30448H, arrayList);
        } catch (Throwable th) {
            this.f30449I.f31060a.L().C(this.f30448H, arrayList);
            throw th;
        }
    }
}
