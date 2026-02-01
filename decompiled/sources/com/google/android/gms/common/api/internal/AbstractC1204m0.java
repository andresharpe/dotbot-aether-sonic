package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1204m0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1202l0 f28352a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1204m0(InterfaceC1202l0 interfaceC1202l0) {
        this.f28352a = interfaceC1202l0;
    }

    protected abstract void a();

    public final void b(C1208o0 c1208o0) {
        Lock lock;
        Lock lock2;
        InterfaceC1202l0 interfaceC1202l0;
        Lock lock3;
        lock = c1208o0.f28364i;
        lock.lock();
        try {
            interfaceC1202l0 = c1208o0.f28374s;
            if (interfaceC1202l0 != this.f28352a) {
                lock3 = c1208o0.f28364i;
            } else {
                a();
                lock3 = c1208o0.f28364i;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = c1208o0.f28364i;
            lock2.unlock();
            throw th;
        }
    }
}
