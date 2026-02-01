package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1615b3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30551E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30552F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1615b3(C1687n3 c1687n3, AtomicReference atomicReference) {
        this.f30552F = c1687n3;
        this.f30551E = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30551E) {
            try {
                try {
                    this.f30551E.set(this.f30552F.f31060a.x().v(this.f30552F.f31060a.z().q(), C1643g1.f30684M));
                } finally {
                    this.f30551E.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
