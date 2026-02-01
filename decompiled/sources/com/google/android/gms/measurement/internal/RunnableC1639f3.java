package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1639f3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Boolean f30655E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30656F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1639f3(C1687n3 c1687n3, Boolean bool) {
        this.f30656F = c1687n3;
        this.f30655E = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30656F.M(this.f30655E, true);
    }
}
