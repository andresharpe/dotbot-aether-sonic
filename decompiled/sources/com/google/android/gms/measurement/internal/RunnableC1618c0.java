package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1618c0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f30555E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ D0 f30556F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1618c0(D0 d02, long j4) {
        this.f30556F = d02;
        this.f30555E = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30556F.o(this.f30555E);
    }
}
