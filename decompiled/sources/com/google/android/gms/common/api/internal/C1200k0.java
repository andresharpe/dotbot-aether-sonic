package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.C0909k;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1304e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200k0 extends com.google.android.gms.common.api.i implements F0 {

    /* renamed from: A, reason: collision with root package name */
    final k1 f28323A;

    /* renamed from: B, reason: collision with root package name */
    private final com.google.android.gms.common.internal.Y f28324B;

    /* renamed from: e, reason: collision with root package name */
    private final Lock f28325e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.internal.Z f28326f;

    /* renamed from: h, reason: collision with root package name */
    private final int f28328h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f28329i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f28330j;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f28332l;

    /* renamed from: m, reason: collision with root package name */
    private long f28333m;

    /* renamed from: n, reason: collision with root package name */
    private long f28334n;

    /* renamed from: o, reason: collision with root package name */
    private final HandlerC1194i0 f28335o;

    /* renamed from: p, reason: collision with root package name */
    private final C1236h f28336p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.P
    @com.google.android.gms.common.util.D
    D0 f28337q;

    /* renamed from: r, reason: collision with root package name */
    final Map<C1164a.c<?>, C1164a.f> f28338r;

    /* renamed from: s, reason: collision with root package name */
    Set<Scope> f28339s;

    /* renamed from: t, reason: collision with root package name */
    final C1250g f28340t;

    /* renamed from: u, reason: collision with root package name */
    final Map<C1164a<?>, Boolean> f28341u;

    /* renamed from: v, reason: collision with root package name */
    final C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28342v;

    /* renamed from: w, reason: collision with root package name */
    private final C1207o f28343w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList<A1> f28344x;

    /* renamed from: y, reason: collision with root package name */
    private Integer f28345y;

    /* renamed from: z, reason: collision with root package name */
    @androidx.annotation.P
    Set<C1195i1> f28346z;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    private H0 f28327g = null;

    /* renamed from: k, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final Queue<C1181e.a<?, ?>> f28331k = new LinkedList();

    public C1200k0(Context context, Lock lock, Looper looper, C1250g c1250g, C1236h c1236h, C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a, Map<C1164a<?>, Boolean> map, List<i.b> list, List<i.c> list2, Map<C1164a.c<?>, C1164a.f> map2, int i4, int i5, ArrayList<A1> arrayList) {
        this.f28333m = true != C1304e.c() ? 120000L : 10000L;
        this.f28334n = C0909k.f15658a;
        this.f28339s = new HashSet();
        this.f28343w = new C1207o();
        this.f28345y = null;
        this.f28346z = null;
        C1179d0 c1179d0 = new C1179d0(this);
        this.f28324B = c1179d0;
        this.f28329i = context;
        this.f28325e = lock;
        this.f28326f = new com.google.android.gms.common.internal.Z(looper, c1179d0);
        this.f28330j = looper;
        this.f28335o = new HandlerC1194i0(this, looper);
        this.f28336p = c1236h;
        this.f28328h = i4;
        if (i4 >= 0) {
            this.f28345y = Integer.valueOf(i5);
        }
        this.f28341u = map;
        this.f28338r = map2;
        this.f28344x = arrayList;
        this.f28323A = new k1();
        Iterator<i.b> it = list.iterator();
        while (it.hasNext()) {
            this.f28326f.f(it.next());
        }
        Iterator<i.c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f28326f.g(it2.next());
        }
        this.f28340t = c1250g;
        this.f28342v = abstractC0265a;
    }

    public static int K(Iterable<C1164a.f> iterable, boolean z3) {
        boolean z4 = false;
        boolean z5 = false;
        for (C1164a.f fVar : iterable) {
            z4 |= fVar.x();
            z5 |= fVar.g();
        }
        if (z4) {
            if (z5 && z3) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    static String N(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void P(C1200k0 c1200k0) {
        c1200k0.f28325e.lock();
        try {
            if (c1200k0.f28332l) {
                c1200k0.U();
            }
        } finally {
            c1200k0.f28325e.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void Q(C1200k0 c1200k0) {
        c1200k0.f28325e.lock();
        try {
            if (c1200k0.R()) {
                c1200k0.U();
            }
        } finally {
            c1200k0.f28325e.unlock();
        }
    }

    private final void S(int i4) {
        Integer num = this.f28345y;
        if (num == null) {
            this.f28345y = Integer.valueOf(i4);
        } else if (num.intValue() != i4) {
            String N3 = N(i4);
            String N4 = N(this.f28345y.intValue());
            StringBuilder sb = new StringBuilder(N3.length() + 51 + N4.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(N3);
            sb.append(". Mode was already set to ");
            sb.append(N4);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f28327g != null) {
            return;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (C1164a.f fVar : this.f28338r.values()) {
            z3 |= fVar.x();
            z4 |= fVar.g();
        }
        int intValue = this.f28345y.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z3) {
                this.f28327g = E.t(this.f28329i, this, this.f28325e, this.f28330j, this.f28336p, this.f28338r, this.f28340t, this.f28341u, this.f28342v, this.f28344x);
                return;
            }
        } else if (z3) {
            if (z4) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f28327g = new C1208o0(this.f28329i, this, this.f28325e, this.f28330j, this.f28336p, this.f28338r, this.f28340t, this.f28341u, this.f28342v, this.f28344x, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(com.google.android.gms.common.api.i iVar, C1228z c1228z, boolean z3) {
        com.google.android.gms.common.internal.service.a.f28805d.a(iVar).setResultCallback(new C1191h0(this, c1228z, z3, iVar));
    }

    @GuardedBy("mLock")
    private final void U() {
        this.f28326f.b();
        ((H0) C1285y.l(this.f28327g)).g();
    }

    @Override // com.google.android.gms.common.api.i
    public final void A() {
        i();
        g();
    }

    @Override // com.google.android.gms.common.api.i
    public final void B(@androidx.annotation.N i.b bVar) {
        this.f28326f.f(bVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void C(@androidx.annotation.N i.c cVar) {
        this.f28326f.g(cVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final <L> C1205n<L> D(@androidx.annotation.N L l4) {
        this.f28325e.lock();
        try {
            return this.f28343w.d(l4, this.f28330j, "NO_TYPE");
        } finally {
            this.f28325e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void E(@androidx.annotation.N ActivityC0889g activityC0889g) {
        C1201l c1201l = new C1201l((Activity) activityC0889g);
        if (this.f28328h >= 0) {
            r1.u(c1201l).w(this.f28328h);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.i
    public final void F(@androidx.annotation.N i.b bVar) {
        this.f28326f.h(bVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void G(@androidx.annotation.N i.c cVar) {
        this.f28326f.i(cVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void H(C1195i1 c1195i1) {
        this.f28325e.lock();
        try {
            if (this.f28346z == null) {
                this.f28346z = new HashSet();
            }
            this.f28346z.add(c1195i1);
            this.f28325e.unlock();
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r3 == false) goto L21;
     */
    @Override // com.google.android.gms.common.api.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.google.android.gms.common.api.internal.C1195i1 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f28325e
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.i1> r0 = r2.f28346z     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L18
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            goto L4c
        L16:
            r3 = move-exception
            goto L59
        L18:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L29
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            goto L4c
        L29:
            java.util.concurrent.locks.Lock r3 = r2.f28325e     // Catch: java.lang.Throwable -> L16
            r3.lock()     // Catch: java.lang.Throwable -> L16
            java.util.Set<com.google.android.gms.common.api.internal.i1> r3 = r2.f28346z     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L38
            java.util.concurrent.locks.Lock r3 = r2.f28325e     // Catch: java.lang.Throwable -> L16
            r3.unlock()     // Catch: java.lang.Throwable -> L16
            goto L45
        L38:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L52
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f28325e     // Catch: java.lang.Throwable -> L16
            r0.unlock()     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L4c
        L45:
            com.google.android.gms.common.api.internal.H0 r3 = r2.f28327g     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L4c
            r3.k()     // Catch: java.lang.Throwable -> L16
        L4c:
            java.util.concurrent.locks.Lock r3 = r2.f28325e
            r3.unlock()
            return
        L52:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f28325e     // Catch: java.lang.Throwable -> L16
            r0.unlock()     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L59:
            java.util.concurrent.locks.Lock r0 = r2.f28325e
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1200k0.I(com.google.android.gms.common.api.internal.i1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String M() {
        StringWriter stringWriter = new StringWriter();
        j("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean R() {
        if (!this.f28332l) {
            return false;
        }
        this.f28332l = false;
        this.f28335o.removeMessages(2);
        this.f28335o.removeMessages(1);
        D0 d02 = this.f28337q;
        if (d02 != null) {
            d02.b();
            this.f28337q = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @GuardedBy("mLock")
    public final void a(@androidx.annotation.P Bundle bundle) {
        while (!this.f28331k.isEmpty()) {
            m(this.f28331k.remove());
        }
        this.f28326f.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @GuardedBy("mLock")
    public final void b(int i4, boolean z3) {
        if (i4 == 1) {
            if (!z3 && !this.f28332l) {
                this.f28332l = true;
                if (this.f28337q == null && !C1304e.c()) {
                    try {
                        this.f28337q = this.f28336p.G(this.f28329i.getApplicationContext(), new C1197j0(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC1194i0 handlerC1194i0 = this.f28335o;
                handlerC1194i0.sendMessageDelayed(handlerC1194i0.obtainMessage(1), this.f28333m);
                HandlerC1194i0 handlerC1194i02 = this.f28335o;
                handlerC1194i02.sendMessageDelayed(handlerC1194i02.obtainMessage(2), this.f28334n);
            }
            i4 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f28323A.f28348a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(k1.f28347c);
        }
        this.f28326f.e(i4);
        this.f28326f.a();
        if (i4 == 2) {
            U();
        }
    }

    @Override // com.google.android.gms.common.api.internal.F0
    @GuardedBy("mLock")
    public final void c(C1231c c1231c) {
        if (!this.f28336p.l(this.f28329i, c1231c.c0())) {
            R();
        }
        if (!this.f28332l) {
            this.f28326f.c(c1231c);
            this.f28326f.a();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final C1231c d() {
        boolean z3;
        boolean z4 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.s(z3, "blockingConnect must not be called on the UI thread");
        this.f28325e.lock();
        try {
            if (this.f28328h >= 0) {
                if (this.f28345y == null) {
                    z4 = false;
                }
                C1285y.s(z4, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f28345y;
                if (num == null) {
                    this.f28345y = Integer.valueOf(K(this.f28338r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            S(((Integer) C1285y.l(this.f28345y)).intValue());
            this.f28326f.b();
            C1231c d4 = ((H0) C1285y.l(this.f28327g)).d();
            this.f28325e.unlock();
            return d4;
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final C1231c e(long j4, @androidx.annotation.N TimeUnit timeUnit) {
        boolean z3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.s(z3, "blockingConnect must not be called on the UI thread");
        C1285y.m(timeUnit, "TimeUnit must not be null");
        this.f28325e.lock();
        try {
            Integer num = this.f28345y;
            if (num == null) {
                this.f28345y = Integer.valueOf(K(this.f28338r.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            S(((Integer) C1285y.l(this.f28345y)).intValue());
            this.f28326f.b();
            C1231c f4 = ((H0) C1285y.l(this.f28327g)).f(j4, timeUnit);
            this.f28325e.unlock();
            return f4;
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final com.google.android.gms.common.api.l<Status> f() {
        C1285y.s(u(), "GoogleApiClient is not connected yet.");
        Integer num = this.f28345y;
        boolean z3 = true;
        if (num != null && num.intValue() == 2) {
            z3 = false;
        }
        C1285y.s(z3, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C1228z c1228z = new C1228z(this);
        if (this.f28338r.containsKey(com.google.android.gms.common.internal.service.a.f28802a)) {
            T(this, c1228z, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C1182e0 c1182e0 = new C1182e0(this, atomicReference, c1228z);
            C1188g0 c1188g0 = new C1188g0(this, c1228z);
            i.a aVar = new i.a(this.f28329i);
            aVar.a(com.google.android.gms.common.internal.service.a.f28803b);
            aVar.e(c1182e0);
            aVar.f(c1188g0);
            aVar.m(this.f28335o);
            com.google.android.gms.common.api.i h4 = aVar.h();
            atomicReference.set(h4);
            h4.g();
        }
        return c1228z;
    }

    @Override // com.google.android.gms.common.api.i
    public final void g() {
        boolean z3;
        this.f28325e.lock();
        try {
            int i4 = 2;
            boolean z4 = false;
            if (this.f28328h >= 0) {
                if (this.f28345y != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1285y.s(z3, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f28345y;
                if (num == null) {
                    this.f28345y = Integer.valueOf(K(this.f28338r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C1285y.l(this.f28345y)).intValue();
            this.f28325e.lock();
            try {
                if (intValue != 3 && intValue != 1) {
                    if (intValue != 2) {
                        i4 = intValue;
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Illegal sign-in mode: ");
                        sb.append(i4);
                        C1285y.b(z4, sb.toString());
                        S(i4);
                        U();
                        this.f28325e.unlock();
                        return;
                    }
                } else {
                    i4 = intValue;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i4);
                C1285y.b(z4, sb2.toString());
                S(i4);
                U();
                this.f28325e.unlock();
                return;
            } finally {
                this.f28325e.unlock();
            }
            z4 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void h(int i4) {
        this.f28325e.lock();
        boolean z3 = true;
        if (i4 != 3 && i4 != 1) {
            if (i4 == 2) {
                i4 = 2;
            } else {
                z3 = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i4);
            C1285y.b(z3, sb.toString());
            S(i4);
            U();
        } finally {
            this.f28325e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void i() {
        Lock lock;
        this.f28325e.lock();
        try {
            this.f28323A.b();
            H0 h02 = this.f28327g;
            if (h02 != null) {
                h02.m();
            }
            this.f28343w.e();
            for (C1181e.a<?, ?> aVar : this.f28331k) {
                aVar.zan(null);
                aVar.cancel();
            }
            this.f28331k.clear();
            if (this.f28327g == null) {
                lock = this.f28325e;
            } else {
                R();
                this.f28326f.a();
                lock = this.f28325e;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void j(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f28329i);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f28332l);
        printWriter.append(" mWorkQueue.size()=").print(this.f28331k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f28323A.f28348a.size());
        H0 h02 = this.f28327g;
        if (h02 != null) {
            h02.o(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T l(@androidx.annotation.N T t3) {
        String str;
        Lock lock;
        C1164a<?> f4 = t3.f();
        boolean containsKey = this.f28338r.containsKey(t3.g());
        if (f4 != null) {
            str = f4.d();
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C1285y.b(containsKey, sb.toString());
        this.f28325e.lock();
        try {
            H0 h02 = this.f28327g;
            if (h02 == null) {
                this.f28331k.add(t3);
                lock = this.f28325e;
            } else {
                t3 = (T) h02.h(t3);
                lock = this.f28325e;
            }
            lock.unlock();
            return t3;
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T m(@androidx.annotation.N T t3) {
        String str;
        Lock lock;
        C1164a<?> f4 = t3.f();
        boolean containsKey = this.f28338r.containsKey(t3.g());
        if (f4 != null) {
            str = f4.d();
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C1285y.b(containsKey, sb.toString());
        this.f28325e.lock();
        try {
            H0 h02 = this.f28327g;
            if (h02 != null) {
                if (this.f28332l) {
                    this.f28331k.add(t3);
                    while (!this.f28331k.isEmpty()) {
                        C1181e.a<?, ?> remove = this.f28331k.remove();
                        this.f28323A.a(remove);
                        remove.a(Status.f28027M);
                    }
                    lock = this.f28325e;
                } else {
                    t3 = (T) h02.j(t3);
                    lock = this.f28325e;
                }
                lock.unlock();
                return t3;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    @androidx.annotation.N
    public final <C extends C1164a.f> C o(@androidx.annotation.N C1164a.c<C> cVar) {
        C c4 = (C) this.f28338r.get(cVar);
        C1285y.m(c4, "Appropriate Api was not requested.");
        return c4;
    }

    @Override // com.google.android.gms.common.api.i
    @androidx.annotation.N
    public final C1231c p(@androidx.annotation.N C1164a<?> c1164a) {
        C1231c c1231c;
        Lock lock;
        this.f28325e.lock();
        try {
            if (!u() && !this.f28332l) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.f28338r.containsKey(c1164a.b())) {
                C1231c p4 = ((H0) C1285y.l(this.f28327g)).p(c1164a);
                if (p4 == null) {
                    if (this.f28332l) {
                        c1231c = C1231c.f28495h0;
                        lock = this.f28325e;
                    } else {
                        Log.w("GoogleApiClientImpl", M());
                        Log.wtf("GoogleApiClientImpl", String.valueOf(c1164a.d()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                        c1231c = new C1231c(8, null);
                        lock = this.f28325e;
                    }
                    lock.unlock();
                    return c1231c;
                }
                this.f28325e.unlock();
                return p4;
            }
            throw new IllegalArgumentException(String.valueOf(c1164a.d()).concat(" was never registered with GoogleApiClient"));
        } catch (Throwable th) {
            this.f28325e.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final Context q() {
        return this.f28329i;
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper r() {
        return this.f28330j;
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean s(@androidx.annotation.N C1164a<?> c1164a) {
        return this.f28338r.containsKey(c1164a.b());
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean t(@androidx.annotation.N C1164a<?> c1164a) {
        C1164a.f fVar;
        if (!u() || (fVar = this.f28338r.get(c1164a.b())) == null || !fVar.a()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean u() {
        H0 h02 = this.f28327g;
        if (h02 != null && h02.i()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean v() {
        H0 h02 = this.f28327g;
        if (h02 != null && h02.e()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean w(@androidx.annotation.N i.b bVar) {
        return this.f28326f.j(bVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean x(@androidx.annotation.N i.c cVar) {
        return this.f28326f.k(cVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean y(InterfaceC1222w interfaceC1222w) {
        H0 h02 = this.f28327g;
        if (h02 != null && h02.n(interfaceC1222w)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.i
    public final void z() {
        H0 h02 = this.f28327g;
        if (h02 != null) {
            h02.l();
        }
    }
}
