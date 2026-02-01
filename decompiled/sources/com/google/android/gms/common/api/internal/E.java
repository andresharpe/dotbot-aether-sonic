package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E implements H0 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f28137i;

    /* renamed from: j, reason: collision with root package name */
    private final C1200k0 f28138j;

    /* renamed from: k, reason: collision with root package name */
    private final Looper f28139k;

    /* renamed from: l, reason: collision with root package name */
    private final C1208o0 f28140l;

    /* renamed from: m, reason: collision with root package name */
    private final C1208o0 f28141m;

    /* renamed from: n, reason: collision with root package name */
    private final Map<C1164a.c<?>, C1208o0> f28142n;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.P
    private final C1164a.f f28144p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.P
    private Bundle f28145q;

    /* renamed from: u, reason: collision with root package name */
    private final Lock f28149u;

    /* renamed from: o, reason: collision with root package name */
    private final Set<InterfaceC1222w> f28143o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.P
    private C1231c f28146r = null;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.P
    private C1231c f28147s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28148t = false;

    /* renamed from: v, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f28150v = 0;

    private E(Context context, C1200k0 c1200k0, Lock lock, Looper looper, C1237i c1237i, Map<C1164a.c<?>, C1164a.f> map, Map<C1164a.c<?>, C1164a.f> map2, C1250g c1250g, C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a, @androidx.annotation.P C1164a.f fVar, ArrayList<A1> arrayList, ArrayList<A1> arrayList2, Map<C1164a<?>, Boolean> map3, Map<C1164a<?>, Boolean> map4) {
        this.f28137i = context;
        this.f28138j = c1200k0;
        this.f28149u = lock;
        this.f28139k = looper;
        this.f28144p = fVar;
        this.f28140l = new C1208o0(context, c1200k0, lock, looper, c1237i, map2, null, map4, null, arrayList2, new E1(this, null));
        this.f28141m = new C1208o0(context, c1200k0, lock, looper, c1237i, map, c1250g, map3, abstractC0265a, arrayList, new G1(this, null));
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<C1164a.c<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put(it.next(), this.f28140l);
        }
        Iterator<C1164a.c<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put(it2.next(), this.f28141m);
        }
        this.f28142n = Collections.unmodifiableMap(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void A(E e4, int i4, boolean z3) {
        e4.f28138j.b(i4, z3);
        e4.f28147s = null;
        e4.f28146r = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void B(E e4, Bundle bundle) {
        Bundle bundle2 = e4.f28145q;
        if (bundle2 == null) {
            e4.f28145q = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void C(E e4) {
        C1231c c1231c;
        if (r(e4.f28146r)) {
            if (!r(e4.f28147s) && !e4.c()) {
                C1231c c1231c2 = e4.f28147s;
                if (c1231c2 != null) {
                    if (e4.f28150v == 1) {
                        e4.b();
                        return;
                    } else {
                        e4.a(c1231c2);
                        e4.f28140l.m();
                        return;
                    }
                }
                return;
            }
            int i4 = e4.f28150v;
            if (i4 != 1) {
                if (i4 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    e4.f28150v = 0;
                    return;
                }
                ((C1200k0) C1285y.l(e4.f28138j)).a(e4.f28145q);
            }
            e4.b();
            e4.f28150v = 0;
            return;
        }
        if (e4.f28146r != null && r(e4.f28147s)) {
            e4.f28141m.m();
            e4.a((C1231c) C1285y.l(e4.f28146r));
            return;
        }
        C1231c c1231c3 = e4.f28146r;
        if (c1231c3 != null && (c1231c = e4.f28147s) != null) {
            if (e4.f28141m.f28376u < e4.f28140l.f28376u) {
                c1231c3 = c1231c;
            }
            e4.a(c1231c3);
        }
    }

    @androidx.annotation.P
    private final PendingIntent E() {
        if (this.f28144p == null) {
            return null;
        }
        return com.google.android.gms.internal.base.l.a(this.f28137i, System.identityHashCode(this.f28138j), this.f28144p.w(), com.google.android.gms.internal.base.l.f29121a | 134217728);
    }

    @GuardedBy("mLock")
    private final void a(C1231c c1231c) {
        int i4 = this.f28150v;
        if (i4 != 1) {
            if (i4 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f28150v = 0;
            }
            this.f28138j.c(c1231c);
        }
        b();
        this.f28150v = 0;
    }

    @GuardedBy("mLock")
    private final void b() {
        Iterator<InterfaceC1222w> it = this.f28143o.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f28143o.clear();
    }

    @GuardedBy("mLock")
    private final boolean c() {
        C1231c c1231c = this.f28147s;
        if (c1231c != null && c1231c.c0() == 4) {
            return true;
        }
        return false;
    }

    private final boolean q(C1181e.a<? extends com.google.android.gms.common.api.q, ? extends C1164a.b> aVar) {
        C1208o0 c1208o0 = this.f28142n.get(aVar.g());
        C1285y.m(c1208o0, "GoogleApiClient is not configured to use the API required for this call.");
        return c1208o0.equals(this.f28141m);
    }

    private static boolean r(@androidx.annotation.P C1231c c1231c) {
        if (c1231c != null && c1231c.x0()) {
            return true;
        }
        return false;
    }

    public static E t(Context context, C1200k0 c1200k0, Lock lock, Looper looper, C1237i c1237i, Map<C1164a.c<?>, C1164a.f> map, C1250g c1250g, Map<C1164a<?>, Boolean> map2, C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a, ArrayList<A1> arrayList) {
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        C1164a.f fVar = null;
        for (Map.Entry<C1164a.c<?>, C1164a.f> entry : map.entrySet()) {
            C1164a.f value = entry.getValue();
            if (true == value.g()) {
                fVar = value;
            }
            if (value.x()) {
                aVar.put(entry.getKey(), value);
            } else {
                aVar2.put(entry.getKey(), value);
            }
        }
        C1285y.s(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar3 = new androidx.collection.a();
        androidx.collection.a aVar4 = new androidx.collection.a();
        for (C1164a<?> c1164a : map2.keySet()) {
            C1164a.c<?> b4 = c1164a.b();
            if (aVar.containsKey(b4)) {
                aVar3.put(c1164a, map2.get(c1164a));
            } else if (aVar2.containsKey(b4)) {
                aVar4.put(c1164a, map2.get(c1164a));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            A1 a12 = arrayList.get(i4);
            if (aVar3.containsKey(a12.f28128i)) {
                arrayList2.add(a12);
            } else if (aVar4.containsKey(a12.f28128i)) {
                arrayList3.add(a12);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new E(context, c1200k0, lock, looper, c1237i, aVar, aVar2, c1250g, abstractC0265a, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final C1231c d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean e() {
        boolean z3;
        this.f28149u.lock();
        try {
            if (this.f28150v == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            return z3;
        } finally {
            this.f28149u.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final C1231c f(long j4, @androidx.annotation.N TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void g() {
        this.f28150v = 2;
        this.f28148t = false;
        this.f28147s = null;
        this.f28146r = null;
        this.f28140l.g();
        this.f28141m.g();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T h(@androidx.annotation.N T t3) {
        if (q(t3)) {
            if (c()) {
                t3.a(new Status(4, (String) null, E()));
                return t3;
            }
            this.f28141m.h(t3);
            return t3;
        }
        this.f28140l.h(t3);
        return t3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.f28150v == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.H0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f28149u
            r0.lock()
            com.google.android.gms.common.api.internal.o0 r0 = r3.f28140l     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.o0 r0 = r3.f28141m     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.c()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.f28150v     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.f28149u
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.f28149u
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.E.i():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T j(@androidx.annotation.N T t3) {
        if (q(t3)) {
            if (c()) {
                t3.a(new Status(4, (String) null, E()));
                return t3;
            }
            return (T) this.f28141m.j(t3);
        }
        return (T) this.f28140l.j(t3);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void k() {
        this.f28140l.k();
        this.f28141m.k();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void l() {
        this.f28149u.lock();
        try {
            boolean e4 = e();
            this.f28141m.m();
            this.f28147s = new C1231c(4);
            if (e4) {
                new com.google.android.gms.internal.base.q(this.f28139k).post(new C1(this));
            } else {
                b();
            }
            this.f28149u.unlock();
        } catch (Throwable th) {
            this.f28149u.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @GuardedBy("mLock")
    public final void m() {
        this.f28147s = null;
        this.f28146r = null;
        this.f28150v = 0;
        this.f28140l.m();
        this.f28141m.m();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final boolean n(InterfaceC1222w interfaceC1222w) {
        this.f28149u.lock();
        try {
            if (!e()) {
                if (i()) {
                }
                this.f28149u.unlock();
                return false;
            }
            if (!this.f28141m.i()) {
                this.f28143o.add(interfaceC1222w);
                if (this.f28150v == 0) {
                    this.f28150v = 1;
                }
                this.f28147s = null;
                this.f28141m.g();
                this.f28149u.unlock();
                return true;
            }
            this.f28149u.unlock();
            return false;
        } catch (Throwable th) {
            this.f28149u.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.H0
    public final void o(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f28141m.o(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f28140l.o(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.H0
    @androidx.annotation.P
    @GuardedBy("mLock")
    public final C1231c p(@androidx.annotation.N C1164a<?> c1164a) {
        if (C1281w.b(this.f28142n.get(c1164a.b()), this.f28141m)) {
            if (c()) {
                return new C1231c(4, E());
            }
            return this.f28141m.p(c1164a);
        }
        return this.f28140l.p(c1164a);
    }
}
