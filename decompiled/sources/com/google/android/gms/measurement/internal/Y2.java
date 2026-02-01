package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30489E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30490F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(C1687n3 c1687n3, AtomicReference atomicReference) {
        this.f30490F = c1687n3;
        this.f30489E = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30489E) {
            try {
                try {
                    this.f30489E.set(Boolean.valueOf(this.f30490F.f31060a.x().z(this.f30490F.f31060a.z().q(), C1643g1.f30683L)));
                } finally {
                    this.f30489E.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
