package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class H implements I {

    /* renamed from: a, reason: collision with root package name */
    private final C1398g2 f29344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29345b;

    public H(C1398g2 c1398g2, String str) {
        this.f29344a = c1398g2;
        this.f29345b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final C1398g2 a(r rVar) {
        C1398g2 a4 = this.f29344a.a();
        a4.e(this.f29345b, rVar);
        return a4;
    }
}
