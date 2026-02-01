package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.location.AbstractBinderC1575k0;

/* renamed from: com.google.android.gms.internal.location.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1342v extends AbstractBinderC1575k0 {

    /* renamed from: i, reason: collision with root package name */
    private final C1205n<com.google.android.gms.location.r> f29245i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1342v(C1205n<com.google.android.gms.location.r> c1205n) {
        this.f29245i = c1205n;
    }

    @Override // com.google.android.gms.location.InterfaceC1577l0
    public final synchronized void O(Location location) {
        this.f29245i.d(new C1341u(this, location));
    }

    public final synchronized void zzc() {
        this.f29245i.a();
    }
}
