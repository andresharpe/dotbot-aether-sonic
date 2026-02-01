package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1259k0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1268p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173b0 implements InterfaceC1202l0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1208o0 f28232a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f28233b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f28234c;

    /* renamed from: d, reason: collision with root package name */
    private final C1237i f28235d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    private C1231c f28236e;

    /* renamed from: f, reason: collision with root package name */
    private int f28237f;

    /* renamed from: h, reason: collision with root package name */
    private int f28239h;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.P
    private com.google.android.gms.signin.f f28242k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f28243l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28244m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28245n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.P
    private InterfaceC1268p f28246o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28247p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28248q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.P
    private final C1250g f28249r;

    /* renamed from: s, reason: collision with root package name */
    private final Map<C1164a<?>, Boolean> f28250s;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.P
    private final C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28251t;

    /* renamed from: g, reason: collision with root package name */
    private int f28238g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f28240i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    private final Set<C1164a.c> f28241j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList<Future<?>> f28252u = new ArrayList<>();

    public C1173b0(C1208o0 c1208o0, @androidx.annotation.P C1250g c1250g, Map<C1164a<?>, Boolean> map, C1237i c1237i, @androidx.annotation.P C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a, Lock lock, Context context) {
        this.f28232a = c1208o0;
        this.f28249r = c1250g;
        this.f28250s = map;
        this.f28235d = c1237i;
        this.f28251t = abstractC0265a;
        this.f28233b = lock;
        this.f28234c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void B(C1173b0 c1173b0, com.google.android.gms.signin.internal.l lVar) {
        if (!c1173b0.o(0)) {
            return;
        }
        C1231c c02 = lVar.c0();
        if (c02.x0()) {
            C1259k0 c1259k0 = (C1259k0) C1285y.l(lVar.e0());
            C1231c c03 = c1259k0.c0();
            if (!c03.x0()) {
                String valueOf = String.valueOf(c03);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                c1173b0.l(c03);
                return;
            }
            c1173b0.f28245n = true;
            c1173b0.f28246o = (InterfaceC1268p) C1285y.l(c1259k0.e0());
            c1173b0.f28247p = c1259k0.i0();
            c1173b0.f28248q = c1259k0.u0();
            c1173b0.n();
            return;
        }
        if (c1173b0.q(c02)) {
            c1173b0.i();
            c1173b0.n();
        } else {
            c1173b0.l(c02);
        }
    }

    private final void J() {
        ArrayList<Future<?>> arrayList = this.f28252u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.get(i4).cancel(true);
        }
        this.f28252u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void i() {
        this.f28244m = false;
        this.f28232a.f28377v.f28339s = Collections.emptySet();
        for (C1164a.c<?> cVar : this.f28241j) {
            if (!this.f28232a.f28370o.containsKey(cVar)) {
                this.f28232a.f28370o.put(cVar, new C1231c(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    private final void j(boolean z3) {
        com.google.android.gms.signin.f fVar = this.f28242k;
        if (fVar != null) {
            if (fVar.a() && z3) {
                fVar.b();
            }
            fVar.c();
            this.f28246o = null;
        }
    }

    @GuardedBy("mLock")
    private final void k() {
        Bundle bundle;
        this.f28232a.c();
        C1210p0.a().execute(new O(this));
        com.google.android.gms.signin.f fVar = this.f28242k;
        if (fVar != null) {
            if (this.f28247p) {
                fVar.u((InterfaceC1268p) C1285y.l(this.f28246o), this.f28248q);
            }
            j(false);
        }
        Iterator<C1164a.c<?>> it = this.f28232a.f28370o.keySet().iterator();
        while (it.hasNext()) {
            ((C1164a.f) C1285y.l(this.f28232a.f28369n.get(it.next()))).c();
        }
        if (this.f28240i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f28240i;
        }
        this.f28232a.f28378w.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void l(C1231c c1231c) {
        J();
        j(!c1231c.u0());
        this.f28232a.r(c1231c);
        this.f28232a.f28378w.c(c1231c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void m(C1231c c1231c, C1164a<?> c1164a, boolean z3) {
        int b4 = c1164a.c().b();
        if ((!z3 || c1231c.u0() || this.f28235d.d(c1231c.c0()) != null) && (this.f28236e == null || b4 < this.f28237f)) {
            this.f28236e = c1231c;
            this.f28237f = b4;
        }
        this.f28232a.f28370o.put(c1164a.b(), c1231c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void n() {
        if (this.f28239h != 0) {
            return;
        }
        if (!this.f28244m || this.f28245n) {
            ArrayList arrayList = new ArrayList();
            this.f28238g = 1;
            this.f28239h = this.f28232a.f28369n.size();
            for (C1164a.c<?> cVar : this.f28232a.f28369n.keySet()) {
                if (this.f28232a.f28370o.containsKey(cVar)) {
                    if (p()) {
                        k();
                    }
                } else {
                    arrayList.add(this.f28232a.f28369n.get(cVar));
                }
            }
            if (!arrayList.isEmpty()) {
                this.f28252u.add(C1210p0.a().submit(new U(this, arrayList)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean o(int i4) {
        if (this.f28238g != i4) {
            Log.w("GACConnecting", this.f28232a.f28377v.M());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i5 = this.f28239h;
            StringBuilder sb = new StringBuilder(33);
            sb.append("mRemainingConnections=");
            sb.append(i5);
            Log.w("GACConnecting", sb.toString());
            String r4 = r(this.f28238g);
            String r5 = r(i4);
            StringBuilder sb2 = new StringBuilder(r4.length() + 70 + r5.length());
            sb2.append("GoogleApiClient connecting is in step ");
            sb2.append(r4);
            sb2.append(" but received callback for step ");
            sb2.append(r5);
            Log.e("GACConnecting", sb2.toString(), new Exception());
            l(new C1231c(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean p() {
        int i4 = this.f28239h - 1;
        this.f28239h = i4;
        if (i4 > 0) {
            return false;
        }
        if (i4 < 0) {
            Log.w("GACConnecting", this.f28232a.f28377v.M());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            l(new C1231c(8, null));
            return false;
        }
        C1231c c1231c = this.f28236e;
        if (c1231c != null) {
            this.f28232a.f28376u = this.f28237f;
            l(c1231c);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean q(C1231c c1231c) {
        if (this.f28243l && !c1231c.u0()) {
            return true;
        }
        return false;
    }

    private static final String r(int i4) {
        return i4 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Set y(C1173b0 c1173b0) {
        C1250g c1250g = c1173b0.f28249r;
        if (c1250g == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(c1250g.i());
        Map<C1164a<?>, com.google.android.gms.common.internal.P> n4 = c1173b0.f28249r.n();
        for (C1164a<?> c1164a : n4.keySet()) {
            if (!c1173b0.f28232a.f28370o.containsKey(c1164a.b())) {
                hashSet.addAll(n4.get(c1164a).f28637a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    @GuardedBy("mLock")
    public final void a(@androidx.annotation.P Bundle bundle) {
        if (!o(1)) {
            return;
        }
        if (bundle != null) {
            this.f28240i.putAll(bundle);
        }
        if (p()) {
            k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    @GuardedBy("mLock")
    public final void c(C1231c c1231c, C1164a<?> c1164a, boolean z3) {
        if (!o(1)) {
            return;
        }
        m(c1231c, c1164a, z3);
        if (p()) {
            k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    @GuardedBy("mLock")
    public final void d(int i4) {
        l(new C1231c(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    @GuardedBy("mLock")
    public final void e() {
        boolean z3;
        this.f28232a.f28370o.clear();
        this.f28244m = false;
        X x3 = null;
        this.f28236e = null;
        this.f28238g = 0;
        this.f28243l = true;
        this.f28245n = false;
        this.f28247p = false;
        HashMap hashMap = new HashMap();
        boolean z4 = false;
        for (C1164a<?> c1164a : this.f28250s.keySet()) {
            C1164a.f fVar = (C1164a.f) C1285y.l(this.f28232a.f28369n.get(c1164a.b()));
            if (c1164a.c().b() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 |= z3;
            boolean booleanValue = this.f28250s.get(c1164a).booleanValue();
            if (fVar.x()) {
                this.f28244m = true;
                if (booleanValue) {
                    this.f28241j.add(c1164a.b());
                } else {
                    this.f28243l = false;
                }
            }
            hashMap.put(fVar, new P(this, c1164a, booleanValue));
        }
        if (z4) {
            this.f28244m = false;
        }
        if (this.f28244m) {
            C1285y.l(this.f28249r);
            C1285y.l(this.f28251t);
            this.f28249r.o(Integer.valueOf(System.identityHashCode(this.f28232a.f28377v)));
            Y y3 = new Y(this, x3);
            C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a = this.f28251t;
            Context context = this.f28234c;
            Looper r4 = this.f28232a.f28377v.r();
            C1250g c1250g = this.f28249r;
            this.f28242k = abstractC0265a.c(context, r4, c1250g, c1250g.k(), y3, y3);
        }
        this.f28239h = this.f28232a.f28369n.size();
        this.f28252u.add(C1210p0.a().submit(new T(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T f(T t3) {
        this.f28232a.f28377v.f28331k.add(t3);
        return t3;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    @GuardedBy("mLock")
    public final boolean g() {
        J();
        j(true);
        this.f28232a.r(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T h(T t3) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
