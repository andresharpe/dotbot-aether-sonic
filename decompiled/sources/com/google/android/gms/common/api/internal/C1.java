package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class C1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ E f28133E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(E e4) {
        this.f28133E = e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f28133E.f28149u;
        lock.lock();
        try {
            E.C(this.f28133E);
        } finally {
            lock2 = this.f28133E.f28149u;
            lock2.unlock();
        }
    }
}
