package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.lifecycle.C0909k;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.AbstractC1262m;
import com.google.android.gms.common.internal.C1239a0;
import com.google.android.gms.common.internal.C1279v;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@com.google.android.gms.common.internal.D
@I0.a
/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1193i implements Handler.Callback {

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.N
    public static final Status f28284t = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: u, reason: collision with root package name */
    private static final Status f28285u = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: v, reason: collision with root package name */
    private static final Object f28286v = new Object();

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("lock")
    private static C1193i f28287w;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    private com.google.android.gms.common.internal.F f28292g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.P
    private com.google.android.gms.common.internal.H f28293h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f28294i;

    /* renamed from: j, reason: collision with root package name */
    private final C1236h f28295j;

    /* renamed from: k, reason: collision with root package name */
    private final C1239a0 f28296k;

    /* renamed from: r, reason: collision with root package name */
    @NotOnlyInitialized
    private final Handler f28303r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f28304s;

    /* renamed from: c, reason: collision with root package name */
    private long f28288c = C0909k.f15658a;

    /* renamed from: d, reason: collision with root package name */
    private long f28289d = 120000;

    /* renamed from: e, reason: collision with root package name */
    private long f28290e = 10000;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28291f = false;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f28297l = new AtomicInteger(1);

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f28298m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    private final Map<C1175c<?>, C1223w0<?>> f28299n = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("lock")
    private I f28300o = null;

    /* renamed from: p, reason: collision with root package name */
    @GuardedBy("lock")
    private final Set<C1175c<?>> f28301p = new androidx.collection.c();

    /* renamed from: q, reason: collision with root package name */
    private final Set<C1175c<?>> f28302q = new androidx.collection.c();

    @I0.a
    private C1193i(Context context, Looper looper, C1236h c1236h) {
        this.f28304s = true;
        this.f28294i = context;
        com.google.android.gms.internal.base.q qVar = new com.google.android.gms.internal.base.q(looper, this);
        this.f28303r = qVar;
        this.f28295j = c1236h;
        this.f28296k = new C1239a0(c1236h);
        if (com.google.android.gms.common.util.l.a(context)) {
            this.f28304s = false;
        }
        qVar.sendMessage(qVar.obtainMessage(6));
    }

    @I0.a
    public static void a() {
        synchronized (f28286v) {
            try {
                C1193i c1193i = f28287w;
                if (c1193i != null) {
                    c1193i.f28298m.incrementAndGet();
                    Handler handler = c1193i.f28303r;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status i(C1175c<?> c1175c, C1231c c1231c) {
        String b4 = c1175c.b();
        String valueOf = String.valueOf(c1231c);
        StringBuilder sb = new StringBuilder(String.valueOf(b4).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b4);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(c1231c, sb.toString());
    }

    @androidx.annotation.j0
    private final C1223w0<?> j(com.google.android.gms.common.api.h<?> hVar) {
        C1175c<?> b4 = hVar.b();
        C1223w0<?> c1223w0 = this.f28299n.get(b4);
        if (c1223w0 == null) {
            c1223w0 = new C1223w0<>(this, hVar);
            this.f28299n.put(b4, c1223w0);
        }
        if (c1223w0.P()) {
            this.f28302q.add(b4);
        }
        c1223w0.D();
        return c1223w0;
    }

    @androidx.annotation.j0
    private final com.google.android.gms.common.internal.H k() {
        if (this.f28293h == null) {
            this.f28293h = com.google.android.gms.common.internal.G.a(this.f28294i);
        }
        return this.f28293h;
    }

    @androidx.annotation.j0
    private final void l() {
        com.google.android.gms.common.internal.F f4 = this.f28292g;
        if (f4 != null) {
            if (f4.b() > 0 || g()) {
                k().a(f4);
            }
            this.f28292g = null;
        }
    }

    private final <T> void m(C1771l<T> c1771l, int i4, com.google.android.gms.common.api.h hVar) {
        K0 b4;
        if (i4 != 0 && (b4 = K0.b(this, i4, hVar.b())) != null) {
            AbstractC1770k<T> a4 = c1771l.a();
            final Handler handler = this.f28303r;
            handler.getClass();
            a4.f(new Executor() { // from class: com.google.android.gms.common.api.internal.q0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b4);
        }
    }

    @androidx.annotation.N
    public static C1193i y() {
        C1193i c1193i;
        synchronized (f28286v) {
            C1285y.m(f28287w, "Must guarantee manager is non-null before using getInstance");
            c1193i = f28287w;
        }
        return c1193i;
    }

    @androidx.annotation.N
    public static C1193i z(@androidx.annotation.N Context context) {
        C1193i c1193i;
        synchronized (f28286v) {
            try {
                if (f28287w == null) {
                    f28287w = new C1193i(context.getApplicationContext(), AbstractC1262m.e().getLooper(), C1236h.x());
                }
                c1193i = f28287w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1193i;
    }

    @androidx.annotation.N
    public final AbstractC1770k<Map<C1175c<?>, String>> B(@androidx.annotation.N Iterable<? extends com.google.android.gms.common.api.j<?>> iterable) {
        s1 s1Var = new s1(iterable);
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(2, s1Var));
        return s1Var.a();
    }

    @androidx.annotation.N
    public final AbstractC1770k<Boolean> C(@androidx.annotation.N com.google.android.gms.common.api.h<?> hVar) {
        J j4 = new J(hVar.b());
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(14, j4));
        return j4.b().a();
    }

    @androidx.annotation.N
    public final <O extends C1164a.d> AbstractC1770k<Void> D(@androidx.annotation.N com.google.android.gms.common.api.h<O> hVar, @androidx.annotation.N AbstractC1216t<C1164a.b, ?> abstractC1216t, @androidx.annotation.N C<C1164a.b, ?> c4, @androidx.annotation.N Runnable runnable) {
        C1771l c1771l = new C1771l();
        m(c1771l, abstractC1216t.e(), hVar);
        m1 m1Var = new m1(new P0(abstractC1216t, c4, runnable), c1771l);
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(8, new O0(m1Var, this.f28298m.get(), hVar)));
        return c1771l.a();
    }

    @androidx.annotation.N
    public final <O extends C1164a.d> AbstractC1770k<Boolean> E(@androidx.annotation.N com.google.android.gms.common.api.h<O> hVar, @androidx.annotation.N C1205n.a aVar, int i4) {
        C1771l c1771l = new C1771l();
        m(c1771l, i4, hVar);
        o1 o1Var = new o1(aVar, c1771l);
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(13, new O0(o1Var, this.f28298m.get(), hVar)));
        return c1771l.a();
    }

    public final <O extends C1164a.d> void J(@androidx.annotation.N com.google.android.gms.common.api.h<O> hVar, int i4, @androidx.annotation.N C1181e.a<? extends com.google.android.gms.common.api.q, C1164a.b> aVar) {
        l1 l1Var = new l1(i4, aVar);
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(4, new O0(l1Var, this.f28298m.get(), hVar)));
    }

    public final <O extends C1164a.d, ResultT> void K(@androidx.annotation.N com.google.android.gms.common.api.h<O> hVar, int i4, @androidx.annotation.N A<C1164a.b, ResultT> a4, @androidx.annotation.N C1771l<ResultT> c1771l, @androidx.annotation.N InterfaceC1226y interfaceC1226y) {
        m(c1771l, a4.d(), hVar);
        n1 n1Var = new n1(i4, a4, c1771l, interfaceC1226y);
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(4, new O0(n1Var, this.f28298m.get(), hVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(C1279v c1279v, int i4, long j4, int i5) {
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(18, new L0(c1279v, i4, j4, i5)));
    }

    public final void M(@androidx.annotation.N C1231c c1231c, int i4) {
        if (!h(c1231c, i4)) {
            Handler handler = this.f28303r;
            handler.sendMessage(handler.obtainMessage(5, i4, 0, c1231c));
        }
    }

    public final void b() {
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(@androidx.annotation.N com.google.android.gms.common.api.h<?> hVar) {
        Handler handler = this.f28303r;
        handler.sendMessage(handler.obtainMessage(7, hVar));
    }

    public final void d(@androidx.annotation.N I i4) {
        synchronized (f28286v) {
            try {
                if (this.f28300o != i4) {
                    this.f28300o = i4;
                    this.f28301p.clear();
                }
                this.f28301p.addAll(i4.u());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(@androidx.annotation.N I i4) {
        synchronized (f28286v) {
            try {
                if (this.f28300o == i4) {
                    this.f28300o = null;
                    this.f28301p.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean g() {
        if (this.f28291f) {
            return false;
        }
        com.google.android.gms.common.internal.B a4 = com.google.android.gms.common.internal.A.b().a();
        if (a4 != null && !a4.i0()) {
            return false;
        }
        int a5 = this.f28296k.a(this.f28294i, 203400000);
        if (a5 != -1 && a5 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(C1231c c1231c, int i4) {
        return this.f28295j.L(this.f28294i, c1231c, i4);
    }

    @Override // android.os.Handler.Callback
    @androidx.annotation.j0
    public final boolean handleMessage(@androidx.annotation.N Message message) {
        C1175c c1175c;
        C1175c c1175c2;
        C1175c c1175c3;
        C1175c c1175c4;
        int i4 = message.what;
        long j4 = 300000;
        C1223w0<?> c1223w0 = null;
        switch (i4) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j4 = 10000;
                }
                this.f28290e = j4;
                this.f28303r.removeMessages(12);
                for (C1175c<?> c1175c5 : this.f28299n.keySet()) {
                    Handler handler = this.f28303r;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1175c5), this.f28290e);
                }
                return true;
            case 2:
                s1 s1Var = (s1) message.obj;
                Iterator<C1175c<?>> it = s1Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C1175c<?> next = it.next();
                        C1223w0<?> c1223w02 = this.f28299n.get(next);
                        if (c1223w02 == null) {
                            s1Var.c(next, new C1231c(13), null);
                        } else if (c1223w02.O()) {
                            s1Var.c(next, C1231c.f28495h0, c1223w02.s().k());
                        } else {
                            C1231c q4 = c1223w02.q();
                            if (q4 != null) {
                                s1Var.c(next, q4, null);
                            } else {
                                c1223w02.J(s1Var);
                                c1223w02.D();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C1223w0<?> c1223w03 : this.f28299n.values()) {
                    c1223w03.C();
                    c1223w03.D();
                }
                return true;
            case 4:
            case 8:
            case 13:
                O0 o02 = (O0) message.obj;
                C1223w0<?> c1223w04 = this.f28299n.get(o02.f28197c.b());
                if (c1223w04 == null) {
                    c1223w04 = j(o02.f28197c);
                }
                if (c1223w04.P() && this.f28298m.get() != o02.f28196b) {
                    o02.f28195a.a(f28284t);
                    c1223w04.L();
                } else {
                    c1223w04.E(o02.f28195a);
                }
                return true;
            case 5:
                int i5 = message.arg1;
                C1231c c1231c = (C1231c) message.obj;
                Iterator<C1223w0<?>> it2 = this.f28299n.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1223w0<?> next2 = it2.next();
                        if (next2.o() == i5) {
                            c1223w0 = next2;
                        }
                    }
                }
                if (c1223w0 != null) {
                    if (c1231c.c0() == 13) {
                        String h4 = this.f28295j.h(c1231c.c0());
                        String e02 = c1231c.e0();
                        StringBuilder sb = new StringBuilder(String.valueOf(h4).length() + 69 + String.valueOf(e02).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(h4);
                        sb.append(": ");
                        sb.append(e02);
                        C1223w0.w(c1223w0, new Status(17, sb.toString()));
                    } else {
                        C1223w0.w(c1223w0, i(C1223w0.t(c1223w0), c1231c));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i5);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.f28294i.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1178d.c((Application) this.f28294i.getApplicationContext());
                    ComponentCallbacks2C1178d.b().a(new C1213r0(this));
                    if (!ComponentCallbacks2C1178d.b().e(true)) {
                        this.f28290e = 300000L;
                    }
                }
                return true;
            case 7:
                j((com.google.android.gms.common.api.h) message.obj);
                return true;
            case 9:
                if (this.f28299n.containsKey(message.obj)) {
                    this.f28299n.get(message.obj).K();
                }
                return true;
            case 10:
                Iterator<C1175c<?>> it3 = this.f28302q.iterator();
                while (it3.hasNext()) {
                    C1223w0<?> remove = this.f28299n.remove(it3.next());
                    if (remove != null) {
                        remove.L();
                    }
                }
                this.f28302q.clear();
                return true;
            case 11:
                if (this.f28299n.containsKey(message.obj)) {
                    this.f28299n.get(message.obj).M();
                }
                return true;
            case 12:
                if (this.f28299n.containsKey(message.obj)) {
                    this.f28299n.get(message.obj).a();
                }
                return true;
            case 14:
                J j5 = (J) message.obj;
                C1175c<?> a4 = j5.a();
                if (!this.f28299n.containsKey(a4)) {
                    j5.b().c(Boolean.FALSE);
                } else {
                    j5.b().c(Boolean.valueOf(C1223w0.N(this.f28299n.get(a4), false)));
                }
                return true;
            case 15:
                C1227y0 c1227y0 = (C1227y0) message.obj;
                Map<C1175c<?>, C1223w0<?>> map = this.f28299n;
                c1175c = c1227y0.f28450a;
                if (map.containsKey(c1175c)) {
                    Map<C1175c<?>, C1223w0<?>> map2 = this.f28299n;
                    c1175c2 = c1227y0.f28450a;
                    C1223w0.z(map2.get(c1175c2), c1227y0);
                }
                return true;
            case 16:
                C1227y0 c1227y02 = (C1227y0) message.obj;
                Map<C1175c<?>, C1223w0<?>> map3 = this.f28299n;
                c1175c3 = c1227y02.f28450a;
                if (map3.containsKey(c1175c3)) {
                    Map<C1175c<?>, C1223w0<?>> map4 = this.f28299n;
                    c1175c4 = c1227y02.f28450a;
                    C1223w0.B(map4.get(c1175c4), c1227y02);
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                L0 l02 = (L0) message.obj;
                if (l02.f28185c == 0) {
                    k().a(new com.google.android.gms.common.internal.F(l02.f28184b, Arrays.asList(l02.f28183a)));
                } else {
                    com.google.android.gms.common.internal.F f4 = this.f28292g;
                    if (f4 != null) {
                        List<C1279v> c02 = f4.c0();
                        if (f4.b() == l02.f28184b && (c02 == null || c02.size() < l02.f28186d)) {
                            this.f28292g.e0(l02.f28183a);
                        } else {
                            this.f28303r.removeMessages(17);
                            l();
                        }
                    }
                    if (this.f28292g == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l02.f28183a);
                        this.f28292g = new com.google.android.gms.common.internal.F(l02.f28184b, arrayList);
                        Handler handler2 = this.f28303r;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), l02.f28185c);
                    }
                }
                return true;
            case 19:
                this.f28291f = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i4);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int n() {
        return this.f28297l.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public final C1223w0 x(C1175c<?> c1175c) {
        return this.f28299n.get(c1175c);
    }
}
