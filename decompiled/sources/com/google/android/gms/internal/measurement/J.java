package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    private final C1398g2 f29359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29360b;

    public J(C1398g2 c1398g2, String str) {
        this.f29359a = c1398g2;
        this.f29360b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final C1398g2 a(r rVar) {
        this.f29359a.e(this.f29360b, rVar);
        return this.f29359a;
    }
}
