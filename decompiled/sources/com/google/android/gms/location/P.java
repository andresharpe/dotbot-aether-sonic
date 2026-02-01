package com.google.android.gms.location;

import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class P extends AbstractC1586q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1771l f29942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1572j f29943b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(C1572j c1572j, C1771l c1771l) {
        this.f29943b = c1572j;
        this.f29942a = c1771l;
    }

    @Override // com.google.android.gms.location.AbstractC1586q
    public final void a(LocationAvailability locationAvailability) {
    }

    @Override // com.google.android.gms.location.AbstractC1586q
    public final void b(LocationResult locationResult) {
        this.f29942a.e(locationResult.i0());
        this.f29943b.F(this);
    }
}
