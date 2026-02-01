package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class Q extends W {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1205n f29944b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1572j f29945c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(C1572j c1572j, C1205n c1205n) {
        this.f29945c = c1572j;
        this.f29944b = c1205n;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.internal.location.A a4, C1771l<Boolean> c1771l) throws RemoteException {
        com.google.android.gms.internal.location.A a5 = a4;
        C1771l<Boolean> c1771l2 = c1771l;
        if (b()) {
            S s4 = new S(this.f29945c, c1771l2);
            try {
                C1205n.a<AbstractC1586q> b4 = this.f29944b.b();
                if (b4 != null) {
                    a5.C0(b4, s4);
                }
            } catch (RuntimeException e4) {
                c1771l2.d(e4);
            }
        }
    }
}
