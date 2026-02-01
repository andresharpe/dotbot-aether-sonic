package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1218u;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class R0 extends AbstractC1216t {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1218u.a f28207e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C1218u.a aVar, C1205n c1205n, C1233e[] c1233eArr, boolean z3, int i4) {
        super(c1205n, c1233eArr, z3, i4);
        this.f28207e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC1216t
    public final void d(C1164a.b bVar, C1771l<Void> c1771l) throws RemoteException {
        InterfaceC1220v interfaceC1220v;
        interfaceC1220v = this.f28207e.f28419a;
        interfaceC1220v.a(bVar, c1771l);
    }
}
