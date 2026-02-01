package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N3 extends AbstractC1695p {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30349e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(C1628d4 c1628d4, B2 b22) {
        super(b22);
        this.f30349e = c1628d4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1695p
    public final void c() {
        C1628d4 c1628d4 = this.f30349e;
        c1628d4.f();
        if (!c1628d4.x()) {
            return;
        }
        c1628d4.f31060a.b().t().a("Inactivity, disconnecting from the service");
        c1628d4.O();
    }
}
