package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1231c;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E1 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E f28151a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ E1(E e4, D1 d12) {
        this.f28151a = e4;
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void a(@androidx.annotation.P Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f28151a.f28149u;
        lock.lock();
        try {
            E.B(this.f28151a, bundle);
            this.f28151a.f28146r = C1231c.f28495h0;
            E.C(this.f28151a);
        } finally {
            lock2 = this.f28151a.f28149u;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void b(int i4, boolean z3) {
        Lock lock;
        Lock lock2;
        boolean z4;
        Lock lock3;
        C1231c c1231c;
        C1231c c1231c2;
        C1208o0 c1208o0;
        lock = this.f28151a.f28149u;
        lock.lock();
        try {
            E e4 = this.f28151a;
            z4 = e4.f28148t;
            if (!z4) {
                c1231c = e4.f28147s;
                if (c1231c != null) {
                    c1231c2 = e4.f28147s;
                    if (c1231c2.x0()) {
                        this.f28151a.f28148t = true;
                        c1208o0 = this.f28151a.f28141m;
                        c1208o0.v(i4);
                        lock3 = this.f28151a.f28149u;
                        lock3.unlock();
                    }
                }
            }
            this.f28151a.f28148t = false;
            E.A(this.f28151a, i4, z3);
            lock3 = this.f28151a.f28149u;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f28151a.f28149u;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void c(@androidx.annotation.N C1231c c1231c) {
        Lock lock;
        Lock lock2;
        lock = this.f28151a.f28149u;
        lock.lock();
        try {
            this.f28151a.f28146r = c1231c;
            E.C(this.f28151a);
        } finally {
            lock2 = this.f28151a.f28149u;
            lock2.unlock();
        }
    }
}
