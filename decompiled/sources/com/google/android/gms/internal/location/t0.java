package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;

/* loaded from: classes.dex */
final class t0 extends AbstractBinderC1330i {

    /* renamed from: i, reason: collision with root package name */
    private final C1181e.b<Status> f29243i;

    public t0(C1181e.b<Status> bVar) {
        this.f29243i = bVar;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1331j
    public final void D1(C1323b c1323b) {
        this.f29243i.b(c1323b.getStatus());
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1331j
    public final void zzc() {
    }
}
