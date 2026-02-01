package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f30426E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30427F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(C1687n3 c1687n3, long j4) {
        this.f30427F = c1687n3;
        this.f30426E = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30427F.x(this.f30426E, true);
        this.f30427F.f31060a.J().Q(new AtomicReference());
    }
}
