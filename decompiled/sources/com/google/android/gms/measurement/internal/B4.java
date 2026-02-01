package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ N4 f30116E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ L4 f30117F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B4(L4 l4, N4 n4) {
        this.f30117F = l4;
        this.f30116E = n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4.i0(this.f30117F, this.f30116E);
        this.f30117F.v();
    }
}
