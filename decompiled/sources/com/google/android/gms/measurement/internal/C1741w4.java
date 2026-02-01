package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1741w4 extends AbstractC1695p {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1747x4 f31024e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741w4(C1747x4 c1747x4, B2 b22) {
        super(b22);
        this.f31024e = c1747x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1695p
    public final void c() {
        this.f31024e.k();
        this.f31024e.f31060a.b().t().a("Starting upload from DelayedRunnable");
        this.f31024e.f31057b.A();
    }
}
