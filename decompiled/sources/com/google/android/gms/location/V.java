package com.google.android.gms.location;

import com.google.android.gms.internal.location.AbstractBinderC1330i;
import com.google.android.gms.internal.location.C1323b;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
class V extends AbstractBinderC1330i {

    /* renamed from: i, reason: collision with root package name */
    private final C1771l<Void> f29948i;

    public V(C1771l<Void> c1771l) {
        this.f29948i = c1771l;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1331j
    public final void D1(C1323b c1323b) {
        com.google.android.gms.common.api.internal.B.a(c1323b.getStatus(), this.f29948i);
    }

    public void zzc() {
    }
}
