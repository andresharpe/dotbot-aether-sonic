package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class G implements I {

    /* renamed from: a, reason: collision with root package name */
    private final C1398g2 f29325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29326b;

    public G(C1398g2 c1398g2, String str) {
        this.f29325a = c1398g2;
        this.f29326b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final C1398g2 a(r rVar) {
        C1398g2 a4 = this.f29325a.a();
        a4.f(this.f29326b, rVar);
        return a4;
    }
}
