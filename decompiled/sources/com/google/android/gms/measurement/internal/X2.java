package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30479E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30480F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30481G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30482H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(C1687n3 c1687n3, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f30482H = c1687n3;
        this.f30479E = atomicReference;
        this.f30480F = str2;
        this.f30481G = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30482H.f31060a.J().S(this.f30479E, null, this.f30480F, this.f30481G);
    }
}
