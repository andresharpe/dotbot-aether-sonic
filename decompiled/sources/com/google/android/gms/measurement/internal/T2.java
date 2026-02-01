package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30415E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f30416F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30417G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T2(C1687n3 c1687n3, AtomicReference atomicReference, boolean z3) {
        this.f30417G = c1687n3;
        this.f30415E = atomicReference;
        this.f30416F = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30417G.f31060a.J().T(this.f30415E, this.f30416F);
    }
}
