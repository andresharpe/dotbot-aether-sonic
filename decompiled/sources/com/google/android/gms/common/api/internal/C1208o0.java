package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208o0 implements H0, B1 {

    /* renamed from: i, reason: collision with root package name */
    private final Lock f28364i;

    /* renamed from: j, reason: collision with root package name */
    private final Condition f28365j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f28366k;

    /* renamed from: l, reason: collision with root package name */
    private final C1237i f28367l;

    /* renamed from: m, reason: collision with root package name */
    private final HandlerC1206n0 f28368m;

    /* renamed from: n, reason: collision with root package name */
    final Map<C1164a.c<?>, C1164a.f> f28369n;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.P
    final C1250g f28371p;

    /* renamed from: q, reason: collision with root package name */
    final Map<C1164a<?>, Boolean> f28372q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.P
    final C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28373r;

    /* renamed from: s, reason: collision with root package name */
    @NotOnlyInitialized
    private volatile InterfaceC1202l0 f28374s;

    /* renamed from: u, reason: collision with root package name */
    int f28376u;

    /* renamed from: v, reason: collision with root package name */
    final C1200k0 f28377v;

    /* renamed from: w, reason: collision with root package name */
    final F0 f28378w;

    /* renamed from: o, reason: collision with root package name */
    final Map<C1164a.c<?>, C1231c> f28370o = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.P
    private C1231c f28375t = null;

    public C1208o0(Context context, C1200k0 c1200k0, Lock lock, Looper looper, C1237i c1237i, Map<C1164a.c<?>, C1164a.f> map, @androidx.annotation.P C1250g c1250g, Map<C1164a<?>, Boolean> map2, @androidx.annotation.P C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a, ArrayList<A1> arrayList, F0 f02) {
        this.f28366k = context;
        this.f28364i = lock;
        this.f28367l = c1237i;
        this.f28369n = map;
        this.f28371p = c1250g;
        this.f28372q = map2;
        this.f28373r = abstractC0265a;
        this.f28377v = c1200k0;
        this.f28378w = f02;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.get(i4).a(this);
        }
        this.f28368m = new HandlerC1206n0(this, looper);
        this.f28365j = lock.newCondition();
        this.f28374s = new C1176c0(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void G(@androidx.annotation.P Bundle bundle) {
        this.f28364i.lock();
        try {
            this.f28374s.a(bundle);
        } finally {
            this.f28364i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.B1
    public final void O0(@androidx.annotation.N C1231c c1231c, @androidx.annotation.N C1164a<?> c1164a, boolean z3) {
        this.f28364i.lock();
        try {
            this.f28374s.c(c1231c, c1164a, z3);
        } finally {
            this.f28364i.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.f28364i.lock();
        try {
            this.f28377v.R();
            this.f28374s = new N(this);
            this.f28374s.e();
            this.f28365j.signalAll();
        } finally {
            this.f28364i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final C1231c d() {
        g();
        while (this.f28374s instanceof C1173b0) {
            try {
                this.f28365j.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C1231c(15, null);
            }
        }
        if (this.f28374s instanceof N) {
            return C1231c.f28495h0;
        }
        C1231c c1231c = this.f28375t;
        if (c1231c != null) {
            return c1231c;
        }
        return new C1231c(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean e() {
        return this.f28374s instanceof C1173b0;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final C1231c f(long j4, TimeUnit timeUnit) {
        g();
        long nanos = timeUnit.toNanos(j4);
        while (this.f28374s instanceof C1173b0) {
            if (nanos <= 0) {
                m();
                return new C1231c(14, null);
            }
            try {
                nanos = this.f28365j.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C1231c(15, null);
            }
            Thread.currentThread().interrupt();
            return new C1231c(15, null);
        }
        if (this.f28374s instanceof N) {
            return C1231c.f28495h0;
        }
        C1231c c1231c = this.f28375t;
        if (c1231c != null) {
            return c1231c;
        }
        return new C1231c(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void g() {
        this.f28374s.b();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T h(@androidx.annotation.N T t3) {
        t3.zak();
        this.f28374s.f(t3);
        return t3;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean i() {
        return this.f28374s instanceof N;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T j(@androidx.annotation.N T t3) {
        t3.zak();
        return (T) this.f28374s.h(t3);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void k() {
        if (this.f28374s instanceof N) {
            ((N) this.f28374s).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void l() {
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void m() {
        if (this.f28374s.g()) {
            this.f28370o.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean n(InterfaceC1222w interfaceC1222w) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void o(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f28374s);
        for (C1164a<?> c1164a : this.f28372q.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c1164a.d()).println(":");
            ((C1164a.f) C1285y.l(this.f28369n.get(c1164a.b()))).p(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @androidx.annotation.P
    @GuardedBy("mLock")
    public final C1231c p(@androidx.annotation.N C1164a<?> c1164a) {
        C1164a.c<?> b4 = c1164a.b();
        if (this.f28369n.containsKey(b4)) {
            if (this.f28369n.get(b4).a()) {
                return C1231c.f28495h0;
            }
            if (this.f28370o.containsKey(b4)) {
                return this.f28370o.get(b4);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        this.f28364i.lock();
        try {
            this.f28374s = new C1173b0(this, this.f28371p, this.f28372q, this.f28367l, this.f28373r, this.f28364i, this.f28366k);
            this.f28374s.e();
            this.f28365j.signalAll();
        } finally {
            this.f28364i.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(@androidx.annotation.P C1231c c1231c) {
        this.f28364i.lock();
        try {
            this.f28375t = c1231c;
            this.f28374s = new C1176c0(this);
            this.f28374s.e();
            this.f28365j.signalAll();
        } finally {
            this.f28364i.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(AbstractC1204m0 abstractC1204m0) {
        this.f28368m.sendMessage(this.f28368m.obtainMessage(1, abstractC1204m0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(RuntimeException runtimeException) {
        this.f28368m.sendMessage(this.f28368m.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void v(int i4) {
        this.f28364i.lock();
        try {
            this.f28374s.d(i4);
        } finally {
            this.f28364i.unlock();
        }
    }
}
