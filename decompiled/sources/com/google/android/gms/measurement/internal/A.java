package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30097E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f30098F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ D0 f30099G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(D0 d02, String str, long j4) {
        this.f30099G = d02;
        this.f30097E = str;
        this.f30098F = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0.h(this.f30099G, this.f30097E, this.f30098F);
    }
}
