package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class A1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ boolean f30101E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ B1 f30102F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(B1 b12, boolean z3) {
        this.f30102F = b12;
        this.f30101E = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L4 l4;
        l4 = this.f30102F.f30112a;
        l4.m(this.f30101E);
    }
}
