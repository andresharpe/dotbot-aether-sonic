package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30149E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30150F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Z4 f30151G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ boolean f30152H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ InterfaceC1420j0 f30153I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30154J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(C1628d4 c1628d4, String str, String str2, Z4 z4, boolean z3, InterfaceC1420j0 interfaceC1420j0) {
        this.f30154J = c1628d4;
        this.f30149E = str;
        this.f30150F = str2;
        this.f30151G = z4;
        this.f30152H = z3;
        this.f30153I = interfaceC1420j0;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:156), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e4;
        Bundle bundle2;
        InterfaceC1661j1 interfaceC1661j1;
        Bundle bundle3 = new Bundle();
        try {
            try {
                C1628d4 c1628d4 = this.f30154J;
                interfaceC1661j1 = c1628d4.f30589d;
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().c("Failed to get user properties; not connected to service", this.f30149E, this.f30150F);
                    this.f30154J.f31060a.L().D(this.f30153I, bundle3);
                    return;
                }
                C1285y.l(this.f30151G);
                List<P4> n12 = interfaceC1661j1.n1(this.f30149E, this.f30150F, this.f30152H, this.f30151G);
                bundle = new Bundle();
                if (n12 != null) {
                    for (P4 p4 : n12) {
                        String str = p4.f30369I;
                        if (str != null) {
                            bundle.putString(p4.f30366F, str);
                        } else {
                            Long l4 = p4.f30368H;
                            if (l4 != null) {
                                bundle.putLong(p4.f30366F, l4.longValue());
                            } else {
                                Double d4 = p4.f30371K;
                                if (d4 != null) {
                                    bundle.putDouble(p4.f30366F, d4.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f30154J.C();
                    this.f30154J.f31060a.L().D(this.f30153I, bundle);
                } catch (RemoteException e5) {
                    e4 = e5;
                    this.f30154J.f31060a.b().p().c("Failed to get user properties; remote exception", this.f30149E, e4);
                    this.f30154J.f31060a.L().D(this.f30153I, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.f30154J.f31060a.L().D(this.f30153I, bundle3);
                throw th;
            }
        } catch (RemoteException e6) {
            bundle = bundle3;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            this.f30154J.f31060a.L().D(this.f30153I, bundle3);
            throw th;
        }
    }
}
