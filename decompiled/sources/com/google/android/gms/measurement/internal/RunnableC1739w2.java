package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1739w2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Z4 f31017E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f31018F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1739w2(BinderC1751y2 binderC1751y2, Z4 z4) {
        this.f31018F = binderC1751y2;
        this.f31017E = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        l4 = this.f31018F.f31053i;
        l4.c();
        l42 = this.f31018F.f31053i;
        l42.o(this.f31017E);
    }
}
