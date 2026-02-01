package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1621c3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30568E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30569F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1621c3(C1687n3 c1687n3, AtomicReference atomicReference) {
        this.f30569F = c1687n3;
        this.f30568E = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30568E) {
            try {
                try {
                    this.f30568E.set(Long.valueOf(this.f30569F.f31060a.x().p(this.f30569F.f31060a.z().q(), C1643g1.f30685N)));
                } finally {
                    this.f30568E.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
