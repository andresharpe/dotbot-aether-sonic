package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
final class r implements C1205n.b<AbstractC1586q> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationAvailability f29240a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(BinderC1339s binderC1339s, LocationAvailability locationAvailability) {
        this.f29240a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final /* bridge */ /* synthetic */ void a(AbstractC1586q abstractC1586q) {
        abstractC1586q.a(this.f29240a);
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final void b() {
    }
}
