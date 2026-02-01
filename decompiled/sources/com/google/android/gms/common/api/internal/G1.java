package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1231c;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class G1 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E f28156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ G1(E e4, F1 f12) {
        this.f28156a = e4;
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void a(@androidx.annotation.P Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f28156a.f28149u;
        lock.lock();
        try {
            this.f28156a.f28147s = C1231c.f28495h0;
            E.C(this.f28156a);
        } finally {
            lock2 = this.f28156a.f28149u;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void b(int i4, boolean z3) {
        Lock lock;
        Lock lock2;
        boolean z4;
        C1208o0 c1208o0;
        Lock lock3;
        lock = this.f28156a.f28149u;
        lock.lock();
        try {
            E e4 = this.f28156a;
            z4 = e4.f28148t;
            if (z4) {
                e4.f28148t = false;
                E.A(this.f28156a, i4, z3);
                lock3 = this.f28156a.f28149u;
            } else {
                e4.f28148t = true;
                c1208o0 = this.f28156a.f28140l;
                c1208o0.v(i4);
                lock3 = this.f28156a.f28149u;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f28156a.f28149u;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    public final void c(@androidx.annotation.N C1231c c1231c) {
        Lock lock;
        Lock lock2;
        lock = this.f28156a.f28149u;
        lock.lock();
        try {
            this.f28156a.f28147s = c1231c;
            E.C(this.f28156a);
        } finally {
            lock2 = this.f28156a.f28149u;
            lock2.unlock();
        }
    }
}
