package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1715s2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1736w f30962E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30963F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30964G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1715s2(BinderC1751y2 binderC1751y2, C1736w c1736w, String str) {
        this.f30964G = binderC1751y2;
        this.f30962E = c1736w;
        this.f30963F = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        L4 l42;
        l4 = this.f30964G.f31053i;
        l4.c();
        l42 = this.f30964G.f31053i;
        l42.i(this.f30962E, this.f30963F);
    }
}
