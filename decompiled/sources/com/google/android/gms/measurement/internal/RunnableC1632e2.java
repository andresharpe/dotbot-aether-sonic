package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1632e2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ K2 f30604E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1638f2 f30605F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1632e2(C1638f2 c1638f2, K2 k22) {
        this.f30605F = c1638f2;
        this.f30604E = k22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1638f2.c(this.f30605F, this.f30604E);
        this.f30605F.k(this.f30604E.f30284g);
    }
}
