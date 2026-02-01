package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1658i4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ L4 f30793E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Runnable f30794F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1658i4(C1670k4 c1670k4, L4 l4, Runnable runnable) {
        this.f30793E = l4;
        this.f30794F = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30793E.c();
        this.f30793E.j0(this.f30794F);
        this.f30793E.A();
    }
}
