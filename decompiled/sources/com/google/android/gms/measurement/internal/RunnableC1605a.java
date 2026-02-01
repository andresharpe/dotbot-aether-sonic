package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1605a implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30530E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f30531F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ D0 f30532G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1605a(D0 d02, String str, long j4) {
        this.f30532G = d02;
        this.f30530E = str;
        this.f30531F = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0.g(this.f30532G, this.f30530E, this.f30531F);
    }
}
