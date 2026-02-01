package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C1205n;

/* renamed from: com.google.android.gms.internal.location.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1341u implements C1205n.b<com.google.android.gms.location.r> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Location f29244a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1341u(BinderC1342v binderC1342v, Location location) {
        this.f29244a = location;
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.location.r rVar) {
        rVar.onLocationChanged(this.f29244a);
    }

    @Override // com.google.android.gms.common.api.internal.C1205n.b
    public final void b() {
    }
}
