package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.C0909k;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C1722t3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1421j1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C1421j1 f29676j;

    /* renamed from: a, reason: collision with root package name */
    private final String f29677a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC1306g f29678b;

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f29679c;

    /* renamed from: d, reason: collision with root package name */
    private final N0.a f29680d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.B("listenerList")
    private final List f29681e;

    /* renamed from: f, reason: collision with root package name */
    private int f29682f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29683g;

    /* renamed from: h, reason: collision with root package name */
    private final String f29684h;

    /* renamed from: i, reason: collision with root package name */
    private volatile InterfaceC1396g0 f29685i;

    protected C1421j1(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z3;
        if (str != null && v(str2, str3)) {
            this.f29677a = str;
        } else {
            this.f29677a = "FA";
        }
        this.f29678b = com.google.android.gms.common.util.k.e();
        C1348a0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new M0(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29679c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f29680d = new N0.a(this);
        this.f29681e = new ArrayList();
        try {
            if (C1722t3.c(context, "google_app_id", com.google.android.gms.measurement.internal.X1.a(context)) != null && !r()) {
                this.f29684h = null;
                this.f29683g = true;
                Log.w(this.f29677a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!v(str2, str3)) {
            this.f29684h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f29677a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            } else {
                if (str2 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 ^ (str3 == null)) {
                    Log.w(this.f29677a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f29684h = str2;
        }
        u(new B0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f29677a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C1413i1(this));
        }
    }

    public static C1421j1 C(Context context, String str, String str2, String str3, Bundle bundle) {
        C1285y.l(context);
        if (f29676j == null) {
            synchronized (C1421j1.class) {
                try {
                    if (f29676j == null) {
                        f29676j = new C1421j1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f29676j;
    }

    protected static final boolean r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Exception exc, boolean z3, boolean z4) {
        this.f29683g |= z3;
        if (z3) {
            Log.w(this.f29677a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z4) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f29677a, "Error with data collection. Data lost.", exc);
    }

    private final void t(String str, String str2, Bundle bundle, boolean z3, boolean z4, Long l4) {
        u(new V0(this, l4, str, str2, bundle, z3, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(X0 x02) {
        this.f29679c.execute(x02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(String str, String str2) {
        if (str2 != null && str != null && !r()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC1396g0 B(Context context, boolean z3) {
        try {
            return AbstractBinderC1388f0.asInterface(DynamiteModule.e(context, DynamiteModule.f29071i, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e4) {
            s(e4, true, false);
            return null;
        }
    }

    public final Object D(int i4) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new P0(this, binderC1364c0, i4));
        return BinderC1364c0.O0(binderC1364c0.A(15000L), Object.class);
    }

    public final String F() {
        return this.f29684h;
    }

    @androidx.annotation.j0
    public final String G() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new O0(this, binderC1364c0));
        return binderC1364c0.G(120000L);
    }

    public final String H() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new F0(this, binderC1364c0));
        return binderC1364c0.G(50L);
    }

    public final String I() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new I0(this, binderC1364c0));
        return binderC1364c0.G(500L);
    }

    public final String J() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new H0(this, binderC1364c0));
        return binderC1364c0.G(500L);
    }

    public final String K() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new E0(this, binderC1364c0));
        return binderC1364c0.G(500L);
    }

    public final List L(String str, String str2) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new C1499t0(this, str, str2, binderC1364c0));
        List list = (List) BinderC1364c0.O0(binderC1364c0.A(C0909k.f15658a), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map M(String str, String str2, boolean z3) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new J0(this, str, str2, z3, binderC1364c0));
        Bundle A3 = binderC1364c0.A(C0909k.f15658a);
        if (A3 != null && A3.size() != 0) {
            HashMap hashMap = new HashMap(A3.size());
            for (String str3 : A3.keySet()) {
                Object obj = A3.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void Q(String str) {
        u(new C0(this, str));
    }

    public final void R(String str, String str2, Bundle bundle) {
        u(new C1491s0(this, str, str2, bundle));
    }

    public final void S(String str) {
        u(new D0(this, str));
    }

    public final void T(@androidx.annotation.N String str, Bundle bundle) {
        t(null, str, bundle, false, true, null);
    }

    public final void U(String str, String str2, Bundle bundle) {
        t(str, str2, bundle, true, true, null);
    }

    public final void V(String str, String str2, Bundle bundle, long j4) {
        t(str, str2, bundle, true, false, Long.valueOf(j4));
    }

    public final void a(int i4, String str, Object obj, Object obj2, Object obj3) {
        u(new K0(this, false, 5, str, obj, null, null));
    }

    public final void b(com.google.android.gms.measurement.internal.H2 h22) {
        C1285y.l(h22);
        synchronized (this.f29681e) {
            for (int i4 = 0; i4 < this.f29681e.size(); i4++) {
                try {
                    if (h22.equals(((Pair) this.f29681e.get(i4)).first)) {
                        Log.w(this.f29677a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Z0 z02 = new Z0(h22);
            this.f29681e.add(new Pair(h22, z02));
            if (this.f29685i != null) {
                try {
                    this.f29685i.registerOnMeasurementEventListener(z02);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f29677a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            u(new T0(this, z02));
        }
    }

    public final void c() {
        u(new C1547z0(this));
    }

    public final void d(Bundle bundle) {
        u(new C1483r0(this, bundle));
    }

    public final void e(Bundle bundle) {
        u(new C1531x0(this, bundle));
    }

    public final void f(Bundle bundle) {
        u(new C1539y0(this, bundle));
    }

    public final void g(Activity activity, String str, String str2) {
        u(new C1515v0(this, activity, str, str2));
    }

    public final void h(boolean z3) {
        u(new Q0(this, z3));
    }

    public final void i(Bundle bundle) {
        u(new R0(this, bundle));
    }

    public final void j(com.google.android.gms.measurement.internal.G2 g22) {
        Y0 y02 = new Y0(g22);
        if (this.f29685i != null) {
            try {
                this.f29685i.setEventInterceptor(y02);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f29677a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        u(new S0(this, y02));
    }

    public final void k(Boolean bool) {
        u(new C1523w0(this, bool));
    }

    public final void l(long j4) {
        u(new A0(this, j4));
    }

    public final void m(String str) {
        u(new C1507u0(this, str));
    }

    public final void n(String str, String str2, Object obj, boolean z3) {
        u(new W0(this, str, str2, obj, z3));
    }

    public final void o(com.google.android.gms.measurement.internal.H2 h22) {
        Pair pair;
        C1285y.l(h22);
        synchronized (this.f29681e) {
            int i4 = 0;
            while (true) {
                try {
                    if (i4 < this.f29681e.size()) {
                        if (h22.equals(((Pair) this.f29681e.get(i4)).first)) {
                            pair = (Pair) this.f29681e.get(i4);
                            break;
                        }
                        i4++;
                    } else {
                        pair = null;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.f29677a, "OnEventListener had not been registered.");
                return;
            }
            this.f29681e.remove(pair);
            Z0 z02 = (Z0) pair.second;
            if (this.f29685i != null) {
                try {
                    this.f29685i.unregisterOnMeasurementEventListener(z02);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f29677a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            u(new U0(this, z02));
        }
    }

    public final int w(String str) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new N0(this, str, binderC1364c0));
        Integer num = (Integer) BinderC1364c0.O0(binderC1364c0.A(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long x() {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new G0(this, binderC1364c0));
        Long l4 = (Long) BinderC1364c0.O0(binderC1364c0.A(500L), Long.class);
        if (l4 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f29678b.a()).nextLong();
            int i4 = this.f29682f + 1;
            this.f29682f = i4;
            return nextLong + i4;
        }
        return l4.longValue();
    }

    public final Bundle y(Bundle bundle, boolean z3) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        u(new L0(this, bundle, binderC1364c0));
        if (z3) {
            return binderC1364c0.A(C0909k.f15658a);
        }
        return null;
    }

    public final N0.a z() {
        return this.f29680d;
    }
}
