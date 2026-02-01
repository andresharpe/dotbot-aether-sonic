package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1740w3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Bundle f31019E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1728u3 f31020F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1728u3 f31021G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f31022H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C3 f31023I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1740w3(C3 c32, Bundle bundle, C1728u3 c1728u3, C1728u3 c1728u32, long j4) {
        this.f31023I = c32;
        this.f31019E = bundle;
        this.f31020F = c1728u3;
        this.f31021G = c1728u32;
        this.f31022H = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3.u(this.f31023I, this.f31019E, this.f31020F, this.f31021G, this.f31022H);
    }
}
