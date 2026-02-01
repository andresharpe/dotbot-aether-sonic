package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1746x3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1728u3 f31037E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1728u3 f31038F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ long f31039G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ boolean f31040H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C3 f31041I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1746x3(C3 c32, C1728u3 c1728u3, C1728u3 c1728u32, long j4, boolean z3) {
        this.f31041I = c32;
        this.f31037E = c1728u3;
        this.f31038F = c1728u32;
        this.f31039G = j4;
        this.f31040H = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31041I.m(this.f31037E, this.f31038F, this.f31039G, this.f31040H, null);
    }
}
