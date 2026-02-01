package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.location.AbstractBinderC1567g0;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1339s extends AbstractBinderC1567g0 {

    /* renamed from: i, reason: collision with root package name */
    private final C1205n<AbstractC1586q> f29242i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1339s(C1205n<AbstractC1586q> c1205n) {
        this.f29242i = c1205n;
    }

    @Override // com.google.android.gms.location.InterfaceC1571i0
    public final void Z(LocationResult locationResult) {
        this.f29242i.d(new C1338q(this, locationResult));
    }

    @Override // com.google.android.gms.location.InterfaceC1571i0
    public final void z0(LocationAvailability locationAvailability) {
        this.f29242i.d(new r(this, locationAvailability));
    }

    public final synchronized void zzc() {
        this.f29242i.a();
    }
}
