package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1217t0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f28412E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1223w0 f28413F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1217t0(C1223w0 c1223w0, int i4) {
        this.f28413F = c1223w0;
        this.f28412E = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28413F.h(this.f28412E);
    }
}
