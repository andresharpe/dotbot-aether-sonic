package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1692o2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f30896E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30897F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1692o2(BinderC1751y2 binderC1751y2, Z4 z4) {
        this.f30897F = binderC1751y2;
        this.f30896E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        l4 = this.f30897F.f31053i;
        l4.c();
        l42 = this.f30897F.f31053i;
        l42.t(this.f30896E);
    }
}
