package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.C1285y;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class P implements AbstractC1246e.c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<C1173b0> f28198a;

    /* renamed from: b, reason: collision with root package name */
    private final C1164a<?> f28199b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28200c;

    public P(C1173b0 c1173b0, C1164a<?> c1164a, boolean z3) {
        this.f28198a = new WeakReference<>(c1173b0);
        this.f28199b = c1164a;
        this.f28200c = z3;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.c
    public final void a(@androidx.annotation.N C1231c c1231c) {
        C1208o0 c1208o0;
        boolean z3;
        Lock lock;
        Lock lock2;
        boolean o4;
        boolean p4;
        Lock lock3;
        C1173b0 c1173b0 = this.f28198a.get();
        if (c1173b0 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        c1208o0 = c1173b0.f28232a;
        if (myLooper == c1208o0.f28377v.r()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.s(z3, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = c1173b0.f28233b;
        lock.lock();
        try {
            o4 = c1173b0.o(0);
            if (!o4) {
                lock3 = c1173b0.f28233b;
            } else {
                if (!c1231c.x0()) {
                    c1173b0.m(c1231c, this.f28199b, this.f28200c);
                }
                p4 = c1173b0.p();
                if (p4) {
                    c1173b0.n();
                }
                lock3 = c1173b0.f28233b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = c1173b0.f28233b;
            lock2.unlock();
            throw th;
        }
    }
}
