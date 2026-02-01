package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Z2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30499E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30500F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30501G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ boolean f30502H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30503I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(C1687n3 c1687n3, AtomicReference atomicReference, String str, String str2, String str3, boolean z3) {
        this.f30503I = c1687n3;
        this.f30499E = atomicReference;
        this.f30500F = str2;
        this.f30501G = str3;
        this.f30502H = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30503I.f31060a.J().V(this.f30499E, null, this.f30500F, this.f30501G, this.f30502H);
    }
}
