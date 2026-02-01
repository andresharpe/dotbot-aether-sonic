package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractRunnableC1170a0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28223E;

    @androidx.annotation.j0
    protected abstract void a();

    @Override // java.lang.Runnable
    @androidx.annotation.j0
    public final void run() {
        Lock lock;
        Lock lock2;
        C1208o0 c1208o0;
        Lock lock3;
        lock = this.f28223E.f28233b;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.f28223E.f28233b;
                } else {
                    a();
                    lock3 = this.f28223E.f28233b;
                }
            } catch (RuntimeException e4) {
                c1208o0 = this.f28223E.f28232a;
                c1208o0.t(e4);
                lock3 = this.f28223E.f28233b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f28223E.f28233b;
            lock2.unlock();
            throw th;
        }
    }
}
