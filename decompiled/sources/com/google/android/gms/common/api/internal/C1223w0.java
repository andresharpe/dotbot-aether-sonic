package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.C1239a0;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1301b;
import com.google.android.gms.tasks.C1771l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes.dex */
public final class C1223w0<O extends C1164a.d> implements i.b, i.c, B1 {

    /* renamed from: j */
    @NotOnlyInitialized
    private final C1164a.f f28433j;

    /* renamed from: k */
    private final C1175c<O> f28434k;

    /* renamed from: l */
    private final H f28435l;

    /* renamed from: o */
    private final int f28438o;

    /* renamed from: p */
    @androidx.annotation.P
    private final BinderC1171a1 f28439p;

    /* renamed from: q */
    private boolean f28440q;

    /* renamed from: u */
    final /* synthetic */ C1193i f28444u;

    /* renamed from: i */
    private final Queue<p1> f28432i = new LinkedList();

    /* renamed from: m */
    private final Set<s1> f28436m = new HashSet();

    /* renamed from: n */
    private final Map<C1205n.a<?>, P0> f28437n = new HashMap();

    /* renamed from: r */
    private final List<C1227y0> f28441r = new ArrayList();

    /* renamed from: s */
    @androidx.annotation.P
    private C1231c f28442s = null;

    /* renamed from: t */
    private int f28443t = 0;

    @androidx.annotation.j0
    public C1223w0(C1193i c1193i, com.google.android.gms.common.api.h<O> hVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f28444u = c1193i;
        handler = c1193i.f28303r;
        C1164a.f w3 = hVar.w(handler.getLooper(), this);
        this.f28433j = w3;
        this.f28434k = hVar.b();
        this.f28435l = new H();
        this.f28438o = hVar.v();
        if (w3.x()) {
            context = c1193i.f28294i;
            handler2 = c1193i.f28303r;
            this.f28439p = hVar.x(context, handler2);
            return;
        }
        this.f28439p = null;
    }

    public static /* bridge */ /* synthetic */ void B(C1223w0 c1223w0, C1227y0 c1227y0) {
        Handler handler;
        Handler handler2;
        C1233e c1233e;
        C1233e[] g4;
        if (c1223w0.f28441r.remove(c1227y0)) {
            handler = c1223w0.f28444u.f28303r;
            handler.removeMessages(15, c1227y0);
            handler2 = c1223w0.f28444u.f28303r;
            handler2.removeMessages(16, c1227y0);
            c1233e = c1227y0.f28451b;
            ArrayList arrayList = new ArrayList(c1223w0.f28432i.size());
            for (p1 p1Var : c1223w0.f28432i) {
                if ((p1Var instanceof G0) && (g4 = ((G0) p1Var).g(c1223w0)) != null && C1301b.d(g4, c1233e)) {
                    arrayList.add(p1Var);
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                p1 p1Var2 = (p1) arrayList.get(i4);
                c1223w0.f28432i.remove(p1Var2);
                p1Var2.b(new UnsupportedApiCallException(c1233e));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean N(C1223w0 c1223w0, boolean z3) {
        return c1223w0.n(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.P
    @androidx.annotation.j0
    private final C1233e b(@androidx.annotation.P C1233e[] c1233eArr) {
        if (c1233eArr != null && c1233eArr.length != 0) {
            C1233e[] t3 = this.f28433j.t();
            if (t3 == null) {
                t3 = new C1233e[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(t3.length);
            for (C1233e c1233e : t3) {
                aVar.put(c1233e.c0(), Long.valueOf(c1233e.e0()));
            }
            for (C1233e c1233e2 : c1233eArr) {
                Long l4 = (Long) aVar.get(c1233e2.c0());
                if (l4 == null || l4.longValue() < c1233e2.e0()) {
                    return c1233e2;
                }
            }
        }
        return null;
    }

    @androidx.annotation.j0
    private final void c(C1231c c1231c) {
        String str;
        for (s1 s1Var : this.f28436m) {
            if (C1281w.b(c1231c, C1231c.f28495h0)) {
                str = this.f28433j.k();
            } else {
                str = null;
            }
            s1Var.c(this.f28434k, c1231c, str);
        }
        this.f28436m.clear();
    }

    @androidx.annotation.j0
    public final void d(Status status) {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        e(status, null, false);
    }

    @androidx.annotation.j0
    private final void e(@androidx.annotation.P Status status, @androidx.annotation.P Exception exc, boolean z3) {
        Handler handler;
        boolean z4;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        boolean z5 = true;
        if (status != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (exc != null) {
            z5 = false;
        }
        if (z4 != z5) {
            Iterator<p1> it = this.f28432i.iterator();
            while (it.hasNext()) {
                p1 next = it.next();
                if (!z3 || next.f28393a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @androidx.annotation.j0
    private final void f() {
        ArrayList arrayList = new ArrayList(this.f28432i);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            p1 p1Var = (p1) arrayList.get(i4);
            if (this.f28433j.a()) {
                if (l(p1Var)) {
                    this.f28432i.remove(p1Var);
                }
            } else {
                return;
            }
        }
    }

    @androidx.annotation.j0
    public final void g() {
        C();
        c(C1231c.f28495h0);
        k();
        Iterator<P0> it = this.f28437n.values().iterator();
        while (it.hasNext()) {
            P0 next = it.next();
            if (b(next.f28201a.c()) != null) {
                it.remove();
            } else {
                try {
                    next.f28201a.d(this.f28433j, new C1771l<>());
                } catch (DeadObjectException unused) {
                    v(3);
                    this.f28433j.j("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        i();
    }

    @androidx.annotation.j0
    public final void h(int i4) {
        Handler handler;
        Handler handler2;
        long j4;
        Handler handler3;
        Handler handler4;
        long j5;
        C1239a0 c1239a0;
        C();
        this.f28440q = true;
        this.f28435l.e(i4, this.f28433j.v());
        C1193i c1193i = this.f28444u;
        handler = c1193i.f28303r;
        handler2 = c1193i.f28303r;
        Message obtain = Message.obtain(handler2, 9, this.f28434k);
        j4 = this.f28444u.f28288c;
        handler.sendMessageDelayed(obtain, j4);
        C1193i c1193i2 = this.f28444u;
        handler3 = c1193i2.f28303r;
        handler4 = c1193i2.f28303r;
        Message obtain2 = Message.obtain(handler4, 11, this.f28434k);
        j5 = this.f28444u.f28289d;
        handler3.sendMessageDelayed(obtain2, j5);
        c1239a0 = this.f28444u.f28296k;
        c1239a0.c();
        Iterator<P0> it = this.f28437n.values().iterator();
        while (it.hasNext()) {
            it.next().f28203c.run();
        }
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j4;
        handler = this.f28444u.f28303r;
        handler.removeMessages(12, this.f28434k);
        C1193i c1193i = this.f28444u;
        handler2 = c1193i.f28303r;
        handler3 = c1193i.f28303r;
        Message obtainMessage = handler3.obtainMessage(12, this.f28434k);
        j4 = this.f28444u.f28290e;
        handler2.sendMessageDelayed(obtainMessage, j4);
    }

    @androidx.annotation.j0
    private final void j(p1 p1Var) {
        p1Var.d(this.f28435l, P());
        try {
            p1Var.c(this);
        } catch (DeadObjectException unused) {
            v(1);
            this.f28433j.j("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @androidx.annotation.j0
    private final void k() {
        Handler handler;
        Handler handler2;
        if (this.f28440q) {
            handler = this.f28444u.f28303r;
            handler.removeMessages(11, this.f28434k);
            handler2 = this.f28444u.f28303r;
            handler2.removeMessages(9, this.f28434k);
            this.f28440q = false;
        }
    }

    @androidx.annotation.j0
    private final boolean l(p1 p1Var) {
        boolean z3;
        Handler handler;
        Handler handler2;
        long j4;
        Handler handler3;
        Handler handler4;
        long j5;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j6;
        if (!(p1Var instanceof G0)) {
            j(p1Var);
            return true;
        }
        G0 g02 = (G0) p1Var;
        C1233e b4 = b(g02.g(this));
        if (b4 == null) {
            j(p1Var);
            return true;
        }
        String name = this.f28433j.getClass().getName();
        String c02 = b4.c0();
        long e02 = b4.e0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(c02).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(c02);
        sb.append(", ");
        sb.append(e02);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z3 = this.f28444u.f28304s;
        if (z3 && g02.f(this)) {
            C1227y0 c1227y0 = new C1227y0(this.f28434k, b4, null);
            int indexOf = this.f28441r.indexOf(c1227y0);
            if (indexOf >= 0) {
                C1227y0 c1227y02 = this.f28441r.get(indexOf);
                handler5 = this.f28444u.f28303r;
                handler5.removeMessages(15, c1227y02);
                C1193i c1193i = this.f28444u;
                handler6 = c1193i.f28303r;
                handler7 = c1193i.f28303r;
                Message obtain = Message.obtain(handler7, 15, c1227y02);
                j6 = this.f28444u.f28288c;
                handler6.sendMessageDelayed(obtain, j6);
                return false;
            }
            this.f28441r.add(c1227y0);
            C1193i c1193i2 = this.f28444u;
            handler = c1193i2.f28303r;
            handler2 = c1193i2.f28303r;
            Message obtain2 = Message.obtain(handler2, 15, c1227y0);
            j4 = this.f28444u.f28288c;
            handler.sendMessageDelayed(obtain2, j4);
            C1193i c1193i3 = this.f28444u;
            handler3 = c1193i3.f28303r;
            handler4 = c1193i3.f28303r;
            Message obtain3 = Message.obtain(handler4, 16, c1227y0);
            j5 = this.f28444u.f28289d;
            handler3.sendMessageDelayed(obtain3, j5);
            C1231c c1231c = new C1231c(2, null);
            if (!m(c1231c)) {
                this.f28444u.h(c1231c, this.f28438o);
                return false;
            }
            return false;
        }
        g02.b(new UnsupportedApiCallException(b4));
        return true;
    }

    @androidx.annotation.j0
    private final boolean m(@androidx.annotation.N C1231c c1231c) {
        Object obj;
        I i4;
        Set set;
        I i5;
        obj = C1193i.f28286v;
        synchronized (obj) {
            try {
                C1193i c1193i = this.f28444u;
                i4 = c1193i.f28300o;
                if (i4 != null) {
                    set = c1193i.f28301p;
                    if (set.contains(this.f28434k)) {
                        i5 = this.f28444u.f28300o;
                        i5.t(c1231c, this.f28438o);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.j0
    public final boolean n(boolean z3) {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        if (!this.f28433j.a() || this.f28437n.size() != 0) {
            return false;
        }
        if (this.f28435l.g()) {
            if (z3) {
                i();
            }
            return false;
        }
        this.f28433j.j("Timing out service connection.");
        return true;
    }

    public static /* bridge */ /* synthetic */ C1175c t(C1223w0 c1223w0) {
        return c1223w0.f28434k;
    }

    public static /* bridge */ /* synthetic */ void w(C1223w0 c1223w0, Status status) {
        c1223w0.d(status);
    }

    public static /* bridge */ /* synthetic */ void z(C1223w0 c1223w0, C1227y0 c1227y0) {
        if (c1223w0.f28441r.contains(c1227y0) && !c1223w0.f28440q) {
            if (!c1223w0.f28433j.a()) {
                c1223w0.D();
            } else {
                c1223w0.f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1211q
    @androidx.annotation.j0
    public final void A(@androidx.annotation.N C1231c c1231c) {
        H(c1231c, null);
    }

    @androidx.annotation.j0
    public final void C() {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        this.f28442s = null;
    }

    @androidx.annotation.j0
    public final void D() {
        Handler handler;
        C1239a0 c1239a0;
        Context context;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        if (!this.f28433j.a() && !this.f28433j.e()) {
            try {
                C1193i c1193i = this.f28444u;
                c1239a0 = c1193i.f28296k;
                context = c1193i.f28294i;
                int b4 = c1239a0.b(context, this.f28433j);
                if (b4 != 0) {
                    C1231c c1231c = new C1231c(b4, null);
                    String name = this.f28433j.getClass().getName();
                    String obj = c1231c.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    H(c1231c, null);
                    return;
                }
                C1193i c1193i2 = this.f28444u;
                C1164a.f fVar = this.f28433j;
                A0 a02 = new A0(c1193i2, fVar, this.f28434k);
                if (fVar.x()) {
                    ((BinderC1171a1) C1285y.l(this.f28439p)).Q1(a02);
                }
                try {
                    this.f28433j.l(a02);
                } catch (SecurityException e4) {
                    H(new C1231c(10), e4);
                }
            } catch (IllegalStateException e5) {
                H(new C1231c(10), e5);
            }
        }
    }

    @androidx.annotation.j0
    public final void E(p1 p1Var) {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        if (this.f28433j.a()) {
            if (l(p1Var)) {
                i();
                return;
            } else {
                this.f28432i.add(p1Var);
                return;
            }
        }
        this.f28432i.add(p1Var);
        C1231c c1231c = this.f28442s;
        if (c1231c != null && c1231c.u0()) {
            H(this.f28442s, null);
        } else {
            D();
        }
    }

    @androidx.annotation.j0
    public final void F() {
        this.f28443t++;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void G(@androidx.annotation.P Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f28444u.f28303r;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f28444u.f28303r;
            handler2.post(new RunnableC1215s0(this));
        } else {
            g();
        }
    }

    @androidx.annotation.j0
    public final void H(@androidx.annotation.N C1231c c1231c, @androidx.annotation.P Exception exc) {
        Handler handler;
        C1239a0 c1239a0;
        boolean z3;
        Status i4;
        Status i5;
        Status i6;
        Handler handler2;
        Handler handler3;
        long j4;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        BinderC1171a1 binderC1171a1 = this.f28439p;
        if (binderC1171a1 != null) {
            binderC1171a1.R1();
        }
        C();
        c1239a0 = this.f28444u.f28296k;
        c1239a0.c();
        c(c1231c);
        if ((this.f28433j instanceof com.google.android.gms.common.internal.service.q) && c1231c.c0() != 24) {
            this.f28444u.f28291f = true;
            C1193i c1193i = this.f28444u;
            handler5 = c1193i.f28303r;
            handler6 = c1193i.f28303r;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c1231c.c0() == 4) {
            status = C1193i.f28285u;
            d(status);
            return;
        }
        if (this.f28432i.isEmpty()) {
            this.f28442s = c1231c;
            return;
        }
        if (exc != null) {
            handler4 = this.f28444u.f28303r;
            C1285y.d(handler4);
            e(null, exc, false);
            return;
        }
        z3 = this.f28444u.f28304s;
        if (z3) {
            i5 = C1193i.i(this.f28434k, c1231c);
            e(i5, null, true);
            if (!this.f28432i.isEmpty() && !m(c1231c) && !this.f28444u.h(c1231c, this.f28438o)) {
                if (c1231c.c0() == 18) {
                    this.f28440q = true;
                }
                if (!this.f28440q) {
                    i6 = C1193i.i(this.f28434k, c1231c);
                    d(i6);
                    return;
                }
                C1193i c1193i2 = this.f28444u;
                handler2 = c1193i2.f28303r;
                handler3 = c1193i2.f28303r;
                Message obtain = Message.obtain(handler3, 9, this.f28434k);
                j4 = this.f28444u.f28288c;
                handler2.sendMessageDelayed(obtain, j4);
                return;
            }
            return;
        }
        i4 = C1193i.i(this.f28434k, c1231c);
        d(i4);
    }

    @androidx.annotation.j0
    public final void I(@androidx.annotation.N C1231c c1231c) {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        C1164a.f fVar = this.f28433j;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(c1231c);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.j(sb.toString());
        H(c1231c, null);
    }

    @androidx.annotation.j0
    public final void J(s1 s1Var) {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        this.f28436m.add(s1Var);
    }

    @androidx.annotation.j0
    public final void K() {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        if (this.f28440q) {
            D();
        }
    }

    @androidx.annotation.j0
    public final void L() {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        d(C1193i.f28284t);
        this.f28435l.f();
        for (C1205n.a aVar : (C1205n.a[]) this.f28437n.keySet().toArray(new C1205n.a[0])) {
            E(new o1(aVar, new C1771l()));
        }
        c(new C1231c(4));
        if (this.f28433j.a()) {
            this.f28433j.m(new C1221v0(this));
        }
    }

    @androidx.annotation.j0
    public final void M() {
        Handler handler;
        C1236h c1236h;
        Context context;
        Status status;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        if (this.f28440q) {
            k();
            C1193i c1193i = this.f28444u;
            c1236h = c1193i.f28295j;
            context = c1193i.f28294i;
            if (c1236h.j(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.f28433j.j("Timing out connection while resuming.");
        }
    }

    public final boolean O() {
        return this.f28433j.a();
    }

    @Override // com.google.android.gms.common.api.internal.B1
    public final void O0(C1231c c1231c, C1164a<?> c1164a, boolean z3) {
        throw null;
    }

    public final boolean P() {
        return this.f28433j.x();
    }

    @androidx.annotation.j0
    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f28438o;
    }

    @androidx.annotation.j0
    public final int p() {
        return this.f28443t;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final C1231c q() {
        Handler handler;
        handler = this.f28444u.f28303r;
        C1285y.d(handler);
        return this.f28442s;
    }

    public final C1164a.f s() {
        return this.f28433j;
    }

    public final Map<C1205n.a<?>, P0> u() {
        return this.f28437n;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void v(int i4) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f28444u.f28303r;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f28444u.f28303r;
            handler2.post(new RunnableC1217t0(this, i4));
        } else {
            h(i4);
        }
    }
}
