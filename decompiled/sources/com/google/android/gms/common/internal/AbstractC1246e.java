package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.InterfaceC0566i;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@I0.a
/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1246e<T extends IInterface> {

    /* renamed from: F, reason: collision with root package name */
    @I0.a
    public static final int f28684F = 1;

    /* renamed from: G, reason: collision with root package name */
    @I0.a
    public static final int f28685G = 4;

    /* renamed from: H, reason: collision with root package name */
    @I0.a
    public static final int f28686H = 5;

    /* renamed from: I, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28687I = "pendingIntent";

    /* renamed from: J, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28688J = "<<default account>>";

    /* renamed from: A, reason: collision with root package name */
    @androidx.annotation.P
    private volatile String f28691A;

    /* renamed from: B, reason: collision with root package name */
    @androidx.annotation.P
    private C1231c f28692B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f28693C;

    /* renamed from: D, reason: collision with root package name */
    @androidx.annotation.P
    private volatile J0 f28694D;

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    @com.google.android.gms.common.util.D
    protected AtomicInteger f28695E;

    /* renamed from: c, reason: collision with root package name */
    private int f28696c;

    /* renamed from: d, reason: collision with root package name */
    private long f28697d;

    /* renamed from: e, reason: collision with root package name */
    private long f28698e;

    /* renamed from: f, reason: collision with root package name */
    private int f28699f;

    /* renamed from: g, reason: collision with root package name */
    private long f28700g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.P
    private volatile String f28701h;

    /* renamed from: i, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    V0 f28702i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f28703j;

    /* renamed from: k, reason: collision with root package name */
    private final Looper f28704k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC1262m f28705l;

    /* renamed from: m, reason: collision with root package name */
    private final C1237i f28706m;

    /* renamed from: n, reason: collision with root package name */
    final Handler f28707n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f28708o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f28709p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("mServiceBrokerLock")
    private InterfaceC1273s f28710q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.N
    @com.google.android.gms.common.util.D
    protected c f28711r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("mLock")
    private IInterface f28712s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f28713t;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.P
    @GuardedBy("mLock")
    private E0 f28714u;

    /* renamed from: v, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f28715v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.P
    private final a f28716w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.P
    private final b f28717x;

    /* renamed from: y, reason: collision with root package name */
    private final int f28718y;

    /* renamed from: z, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28719z;

    /* renamed from: L, reason: collision with root package name */
    private static final C1233e[] f28690L = new C1233e[0];

    /* renamed from: K, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String[] f28689K = {"service_esmobile", "service_googleme"};

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        public static final int f28720a = 1;

        /* renamed from: b, reason: collision with root package name */
        @I0.a
        public static final int f28721b = 3;

        @I0.a
        void G(@androidx.annotation.P Bundle bundle);

        @I0.a
        void v(int i4);
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.e$b */
    /* loaded from: classes.dex */
    public interface b {
        @I0.a
        void A(@androidx.annotation.N C1231c c1231c);
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.e$c */
    /* loaded from: classes.dex */
    public interface c {
        @I0.a
        void a(@androidx.annotation.N C1231c c1231c);
    }

    /* renamed from: com.google.android.gms.common.internal.e$d */
    /* loaded from: classes.dex */
    protected class d implements c {
        @I0.a
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC1246e.c
        public final void a(@androidx.annotation.N C1231c c1231c) {
            if (c1231c.x0()) {
                AbstractC1246e abstractC1246e = AbstractC1246e.this;
                abstractC1246e.i(null, abstractC1246e.L());
            } else if (AbstractC1246e.this.f28717x != null) {
                AbstractC1246e.this.f28717x.A(c1231c);
            }
        }
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0269e {
        @I0.a
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @com.google.android.gms.common.util.D
    public AbstractC1246e(@androidx.annotation.N Context context, @androidx.annotation.N Handler handler, @androidx.annotation.N AbstractC1262m abstractC1262m, @androidx.annotation.N C1237i c1237i, int i4, @androidx.annotation.P a aVar, @androidx.annotation.P b bVar) {
        this.f28701h = null;
        this.f28708o = new Object();
        this.f28709p = new Object();
        this.f28713t = new ArrayList();
        this.f28715v = 1;
        this.f28692B = null;
        this.f28693C = false;
        this.f28694D = null;
        this.f28695E = new AtomicInteger(0);
        C1285y.m(context, "Context must not be null");
        this.f28703j = context;
        C1285y.m(handler, "Handler must not be null");
        this.f28707n = handler;
        this.f28704k = handler.getLooper();
        C1285y.m(abstractC1262m, "Supervisor must not be null");
        this.f28705l = abstractC1262m;
        C1285y.m(c1237i, "API availability must not be null");
        this.f28706m = c1237i;
        this.f28718y = i4;
        this.f28716w = aVar;
        this.f28717x = bVar;
        this.f28719z = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void k0(AbstractC1246e abstractC1246e, J0 j02) {
        B y02;
        abstractC1246e.f28694D = j02;
        if (abstractC1246e.a0()) {
            C1252h c1252h = j02.f28630H;
            A b4 = A.b();
            if (c1252h == null) {
                y02 = null;
            } else {
                y02 = c1252h.y0();
            }
            b4.c(y02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void l0(AbstractC1246e abstractC1246e, int i4) {
        int i5;
        int i6;
        synchronized (abstractC1246e.f28708o) {
            i5 = abstractC1246e.f28715v;
        }
        if (i5 == 3) {
            abstractC1246e.f28693C = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = abstractC1246e.f28707n;
        handler.sendMessage(handler.obtainMessage(i6, abstractC1246e.f28695E.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean o0(AbstractC1246e abstractC1246e, int i4, int i5, IInterface iInterface) {
        synchronized (abstractC1246e.f28708o) {
            try {
                if (abstractC1246e.f28715v != i4) {
                    return false;
                }
                abstractC1246e.q0(i5, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean p0(com.google.android.gms.common.internal.AbstractC1246e r2) {
        /*
            boolean r0 = r2.f28693C
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.N()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.N()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1246e.p0(com.google.android.gms.common.internal.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(int i4, @androidx.annotation.P IInterface iInterface) {
        boolean z3;
        boolean z4;
        V0 v02;
        V0 v03;
        boolean z5 = false;
        if (i4 != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iInterface == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 == z4) {
            z5 = true;
        }
        C1285y.a(z5);
        synchronized (this.f28708o) {
            try {
                this.f28715v = i4;
                this.f28712s = iInterface;
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        if (i4 == 4) {
                            C1285y.l(iInterface);
                            T(iInterface);
                        }
                    } else {
                        E0 e02 = this.f28714u;
                        if (e02 != null && (v03 = this.f28702i) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + v03.c() + " on " + v03.b());
                            AbstractC1262m abstractC1262m = this.f28705l;
                            String c4 = this.f28702i.c();
                            C1285y.l(c4);
                            abstractC1262m.j(c4, this.f28702i.b(), this.f28702i.a(), e02, f0(), this.f28702i.d());
                            this.f28695E.incrementAndGet();
                        }
                        E0 e03 = new E0(this, this.f28695E.get());
                        this.f28714u = e03;
                        if (this.f28715v == 3 && J() != null) {
                            v02 = new V0(G().getPackageName(), J(), true, AbstractC1262m.c(), false);
                        } else {
                            v02 = new V0(P(), O(), false, AbstractC1262m.c(), R());
                        }
                        this.f28702i = v02;
                        if (v02.d() && s() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f28702i.c())));
                        }
                        AbstractC1262m abstractC1262m2 = this.f28705l;
                        String c5 = this.f28702i.c();
                        C1285y.l(c5);
                        if (!abstractC1262m2.k(new N0(c5, this.f28702i.b(), this.f28702i.a(), this.f28702i.d()), e03, f0(), E())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f28702i.c() + " on " + this.f28702i.b());
                            m0(16, null, this.f28695E.get());
                        }
                    }
                } else {
                    E0 e04 = this.f28714u;
                    if (e04 != null) {
                        AbstractC1262m abstractC1262m3 = this.f28705l;
                        String c6 = this.f28702i.c();
                        C1285y.l(c6);
                        abstractC1262m3.j(c6, this.f28702i.b(), this.f28702i.a(), e04, f0(), this.f28702i.d());
                        this.f28714u = null;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.P
    @I0.a
    public abstract T A(@androidx.annotation.N IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public boolean B() {
        return false;
    }

    @androidx.annotation.P
    @I0.a
    public Account C() {
        return null;
    }

    @I0.a
    @androidx.annotation.N
    public C1233e[] D() {
        return f28690L;
    }

    @androidx.annotation.P
    @I0.a
    protected Executor E() {
        return null;
    }

    @androidx.annotation.P
    @I0.a
    public Bundle F() {
        return null;
    }

    @I0.a
    @androidx.annotation.N
    public final Context G() {
        return this.f28703j;
    }

    @I0.a
    public int H() {
        return this.f28718y;
    }

    @I0.a
    @androidx.annotation.N
    protected Bundle I() {
        return new Bundle();
    }

    @androidx.annotation.P
    @I0.a
    protected String J() {
        return null;
    }

    @I0.a
    @androidx.annotation.N
    public final Looper K() {
        return this.f28704k;
    }

    @I0.a
    @androidx.annotation.N
    protected Set<Scope> L() {
        return Collections.emptySet();
    }

    @I0.a
    @androidx.annotation.N
    public final T M() throws DeadObjectException {
        T t3;
        synchronized (this.f28708o) {
            try {
                if (this.f28715v != 5) {
                    z();
                    t3 = (T) this.f28712s;
                    C1285y.m(t3, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @androidx.annotation.N
    public abstract String N();

    @I0.a
    @androidx.annotation.N
    protected abstract String O();

    @I0.a
    @androidx.annotation.N
    protected String P() {
        return "com.google.android.gms";
    }

    @androidx.annotation.P
    @I0.a
    public C1252h Q() {
        J0 j02 = this.f28694D;
        if (j02 == null) {
            return null;
        }
        return j02.f28630H;
    }

    @I0.a
    protected boolean R() {
        if (s() >= 211700000) {
            return true;
        }
        return false;
    }

    @I0.a
    public boolean S() {
        return this.f28694D != null;
    }

    @I0.a
    @InterfaceC0566i
    protected void T(@androidx.annotation.N T t3) {
        this.f28698e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @InterfaceC0566i
    public void U(@androidx.annotation.N C1231c c1231c) {
        this.f28699f = c1231c.c0();
        this.f28700g = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @InterfaceC0566i
    public void V(int i4) {
        this.f28696c = i4;
        this.f28697d = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public void W(int i4, @androidx.annotation.P IBinder iBinder, @androidx.annotation.P Bundle bundle, int i5) {
        Handler handler = this.f28707n;
        handler.sendMessage(handler.obtainMessage(1, i5, -1, new F0(this, i4, iBinder, bundle)));
    }

    @I0.a
    public void X(@androidx.annotation.N String str) {
        this.f28691A = str;
    }

    @I0.a
    public void Y(int i4) {
        Handler handler = this.f28707n;
        handler.sendMessage(handler.obtainMessage(6, this.f28695E.get(), i4));
    }

    @I0.a
    @com.google.android.gms.common.util.D
    protected void Z(@androidx.annotation.N c cVar, int i4, @androidx.annotation.P PendingIntent pendingIntent) {
        C1285y.m(cVar, "Connection progress callbacks cannot be null.");
        this.f28711r = cVar;
        Handler handler = this.f28707n;
        handler.sendMessage(handler.obtainMessage(3, this.f28695E.get(), i4, pendingIntent));
    }

    @I0.a
    public boolean a() {
        boolean z3;
        synchronized (this.f28708o) {
            if (this.f28715v == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @I0.a
    public boolean a0() {
        return false;
    }

    @I0.a
    public void c() {
        this.f28695E.incrementAndGet();
        synchronized (this.f28713t) {
            try {
                int size = this.f28713t.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C0) this.f28713t.get(i4)).d();
                }
                this.f28713t.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f28709p) {
            this.f28710q = null;
        }
        q0(1, null);
    }

    @I0.a
    public boolean e() {
        boolean z3;
        synchronized (this.f28708o) {
            int i4 = this.f28715v;
            z3 = true;
            if (i4 != 2 && i4 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    @I0.a
    public boolean f() {
        return false;
    }

    @androidx.annotation.N
    protected final String f0() {
        String str = this.f28719z;
        if (str == null) {
            return this.f28703j.getClass().getName();
        }
        return str;
    }

    @I0.a
    public boolean g() {
        return false;
    }

    @I0.a
    @androidx.annotation.j0
    public void i(@androidx.annotation.P InterfaceC1268p interfaceC1268p, @androidx.annotation.N Set<Scope> set) {
        Bundle I3 = I();
        int i4 = this.f28718y;
        String str = this.f28691A;
        int i5 = C1237i.f28553a;
        Scope[] scopeArr = C1258k.f28761S;
        Bundle bundle = new Bundle();
        C1233e[] c1233eArr = C1258k.f28762T;
        C1258k c1258k = new C1258k(6, i4, i5, null, null, scopeArr, bundle, null, c1233eArr, c1233eArr, true, 0, false, str);
        c1258k.f28766H = this.f28703j.getPackageName();
        c1258k.f28769K = I3;
        if (set != null) {
            c1258k.f28768J = (Scope[]) set.toArray(new Scope[0]);
        }
        if (x()) {
            Account C3 = C();
            if (C3 == null) {
                C3 = new Account("<<default account>>", C1240b.f28682a);
            }
            c1258k.f28770L = C3;
            if (interfaceC1268p != null) {
                c1258k.f28767I = interfaceC1268p.asBinder();
            }
        } else if (f()) {
            c1258k.f28770L = C();
        }
        c1258k.f28771M = f28690L;
        c1258k.f28772N = D();
        if (a0()) {
            c1258k.f28775Q = true;
        }
        try {
            synchronized (this.f28709p) {
                try {
                    InterfaceC1273s interfaceC1273s = this.f28710q;
                    if (interfaceC1273s != null) {
                        interfaceC1273s.l0(new D0(this, this.f28695E.get()), c1258k);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            Y(3);
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            W(8, null, null, this.f28695E.get());
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            W(8, null, null, this.f28695E.get());
        }
    }

    @I0.a
    public void j(@androidx.annotation.N String str) {
        this.f28701h = str;
        c();
    }

    @I0.a
    @androidx.annotation.N
    public String k() {
        V0 v02;
        if (a() && (v02 = this.f28702i) != null) {
            return v02.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @I0.a
    public void l(@androidx.annotation.N c cVar) {
        C1285y.m(cVar, "Connection progress callbacks cannot be null.");
        this.f28711r = cVar;
        q0(2, null);
    }

    @I0.a
    public void m(@androidx.annotation.N InterfaceC0269e interfaceC0269e) {
        interfaceC0269e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m0(int i4, @androidx.annotation.P Bundle bundle, int i5) {
        Handler handler = this.f28707n;
        handler.sendMessage(handler.obtainMessage(7, i5, -1, new G0(this, i4, null)));
    }

    @I0.a
    public void n() {
        int k4 = this.f28706m.k(this.f28703j, s());
        if (k4 != 0) {
            q0(1, null);
            Z(new d(), k4, null);
        } else {
            l(new d());
        }
    }

    @I0.a
    public void p(@androidx.annotation.N String str, @androidx.annotation.N FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.N String[] strArr) {
        int i4;
        IInterface iInterface;
        InterfaceC1273s interfaceC1273s;
        synchronized (this.f28708o) {
            i4 = this.f28715v;
            iInterface = this.f28712s;
        }
        synchronized (this.f28709p) {
            interfaceC1273s = this.f28710q;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) N()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1273s == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1273s.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f28698e > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j4 = this.f28698e;
            append.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
        if (this.f28697d > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i5 = this.f28696c;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i5));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j5 = this.f28697d;
            append2.println(j5 + " " + simpleDateFormat.format(new Date(j5)));
        }
        if (this.f28700g > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.f.a(this.f28699f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j6 = this.f28700g;
            append3.println(j6 + " " + simpleDateFormat.format(new Date(j6)));
        }
    }

    @I0.a
    public boolean q() {
        return true;
    }

    @I0.a
    public int s() {
        return C1237i.f28553a;
    }

    @androidx.annotation.P
    @I0.a
    public final C1233e[] t() {
        J0 j02 = this.f28694D;
        if (j02 == null) {
            return null;
        }
        return j02.f28628F;
    }

    @androidx.annotation.P
    @I0.a
    public String v() {
        return this.f28701h;
    }

    @I0.a
    @androidx.annotation.N
    public Intent w() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @I0.a
    public boolean x() {
        return false;
    }

    @androidx.annotation.P
    @I0.a
    public IBinder y() {
        synchronized (this.f28709p) {
            try {
                InterfaceC1273s interfaceC1273s = this.f28710q;
                if (interfaceC1273s == null) {
                    return null;
                }
                return interfaceC1273s.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public final void z() {
        if (a()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1246e(@androidx.annotation.N android.content.Context r10, @androidx.annotation.N android.os.Looper r11, int r12, @androidx.annotation.P com.google.android.gms.common.internal.AbstractC1246e.a r13, @androidx.annotation.P com.google.android.gms.common.internal.AbstractC1246e.b r14, @androidx.annotation.P java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.m r3 = com.google.android.gms.common.internal.AbstractC1262m.d(r10)
            com.google.android.gms.common.i r4 = com.google.android.gms.common.C1237i.i()
            com.google.android.gms.common.internal.C1285y.l(r13)
            com.google.android.gms.common.internal.C1285y.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1246e.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e$a, com.google.android.gms.common.internal.e$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @com.google.android.gms.common.util.D
    public AbstractC1246e(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, @androidx.annotation.N AbstractC1262m abstractC1262m, @androidx.annotation.N C1237i c1237i, int i4, @androidx.annotation.P a aVar, @androidx.annotation.P b bVar, @androidx.annotation.P String str) {
        this.f28701h = null;
        this.f28708o = new Object();
        this.f28709p = new Object();
        this.f28713t = new ArrayList();
        this.f28715v = 1;
        this.f28692B = null;
        this.f28693C = false;
        this.f28694D = null;
        this.f28695E = new AtomicInteger(0);
        C1285y.m(context, "Context must not be null");
        this.f28703j = context;
        C1285y.m(looper, "Looper must not be null");
        this.f28704k = looper;
        C1285y.m(abstractC1262m, "Supervisor must not be null");
        this.f28705l = abstractC1262m;
        C1285y.m(c1237i, "API availability must not be null");
        this.f28706m = c1237i;
        this.f28707n = new B0(this, looper);
        this.f28718y = i4;
        this.f28716w = aVar;
        this.f28717x = bVar;
        this.f28719z = str;
    }
}
