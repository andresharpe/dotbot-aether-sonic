package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class Q2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f30376E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30377F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(C1687n3 c1687n3, long j4) {
        this.f30377F = c1687n3;
        this.f30376E = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30377F.f31060a.D().f30257k.b(this.f30376E);
        this.f30377F.f31060a.b().o().b("Session timeout duration set", Long.valueOf(this.f30376E));
    }
}
