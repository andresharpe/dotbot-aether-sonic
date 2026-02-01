package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.api.internal.C1218u;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class S0 extends C {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1218u.a f28209b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C1218u.a aVar, C1205n.a aVar2) {
        super(aVar2);
        this.f28209b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C
    public final void b(C1164a.b bVar, C1771l<Boolean> c1771l) throws RemoteException {
        InterfaceC1220v interfaceC1220v;
        interfaceC1220v = this.f28209b.f28420b;
        interfaceC1220v.a(bVar, c1771l);
    }
}
