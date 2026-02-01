package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1758z3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f31061E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C3 f31062F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1758z3(C3 c32, long j4) {
        this.f31062F = c32;
        this.f31061E = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31062F.f31060a.w().l(this.f31061E);
        this.f31062F.f30127e = null;
    }
}
