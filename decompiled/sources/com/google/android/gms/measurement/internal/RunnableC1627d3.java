package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1627d3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30586E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30587F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1627d3(C1687n3 c1687n3, AtomicReference atomicReference) {
        this.f30587F = c1687n3;
        this.f30586E = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30586E) {
            try {
                try {
                    this.f30586E.set(Integer.valueOf(this.f30587F.f31060a.x().m(this.f30587F.f31060a.z().q(), C1643g1.f30686O)));
                } finally {
                    this.f30586E.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
