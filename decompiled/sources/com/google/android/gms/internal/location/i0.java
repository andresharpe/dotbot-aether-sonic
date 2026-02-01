package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1207o;
import com.google.android.gms.location.AbstractC1586q;

/* loaded from: classes.dex */
final class i0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1586q f29225c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u0 u0Var, com.google.android.gms.common.api.i iVar, AbstractC1586q abstractC1586q) {
        super(iVar);
        this.f29225c = abstractC1586q;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.C0(C1207o.c(this.f29225c, AbstractC1586q.class.getSimpleName()), new t0(this));
    }
}
