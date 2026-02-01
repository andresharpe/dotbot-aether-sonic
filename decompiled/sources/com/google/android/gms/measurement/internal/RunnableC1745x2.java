package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1745x2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f31032E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f31033F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f31034G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f31035H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f31036I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1745x2(BinderC1751y2 binderC1751y2, String str, String str2, String str3, long j4) {
        this.f31036I = binderC1751y2;
        this.f31032E = str;
        this.f31033F = str2;
        this.f31034G = str3;
        this.f31035H = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        String str = this.f31032E;
        if (str == null) {
            l42 = this.f31036I.f31053i;
            l42.u(this.f31033F, null);
        } else {
            C1728u3 c1728u3 = new C1728u3(this.f31034G, str, this.f31035H);
            l4 = this.f31036I.f31053i;
            l4.u(this.f31033F, c1728u3);
        }
    }
}
