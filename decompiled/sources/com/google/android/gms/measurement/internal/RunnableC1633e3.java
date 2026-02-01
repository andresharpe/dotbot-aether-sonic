package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1633e3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30606E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30607F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1633e3(C1687n3 c1687n3, AtomicReference atomicReference) {
        this.f30607F = c1687n3;
        this.f30606E = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30606E) {
            try {
                try {
                    this.f30606E.set(Double.valueOf(this.f30607F.f31060a.x().i(this.f30607F.f31060a.z().q(), C1643g1.f30687P)));
                } finally {
                    this.f30606E.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
