package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1207o;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class o0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LocationRequest f29233c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1586q f29234d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Looper f29235e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0 u0Var, com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, AbstractC1586q abstractC1586q, Looper looper) {
        super(iVar);
        this.f29233c = locationRequest;
        this.f29234d = abstractC1586q;
        this.f29235e = looper;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.w0(C.c0(null, this.f29233c), C1207o.a(this.f29234d, L.a(this.f29235e), AbstractC1586q.class.getSimpleName()), new t0(this));
    }
}
