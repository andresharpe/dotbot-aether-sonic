package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1338q implements C1205n.b<AbstractC1586q> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationResult f29238a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1338q(BinderC1339s binderC1339s, LocationResult locationResult) {
        this.f29238a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final /* bridge */ /* synthetic */ void a(AbstractC1586q abstractC1586q) {
        abstractC1586q.b(this.f29238a);
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final void b() {
    }
}
