package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.util.E;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@D
@I0.a
@ThreadSafe
/* loaded from: classes2.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    private static final long f31114r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f31115s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f31116t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile h f31117u = new f();

    /* renamed from: a, reason: collision with root package name */
    private final Object f31118a;

    /* renamed from: b, reason: collision with root package name */
    @B("acquireReleaseLock")
    private final PowerManager.WakeLock f31119b;

    /* renamed from: c, reason: collision with root package name */
    @B("acquireReleaseLock")
    private int f31120c;

    /* renamed from: d, reason: collision with root package name */
    @B("acquireReleaseLock")
    private Future<?> f31121d;

    /* renamed from: e, reason: collision with root package name */
    @B("acquireReleaseLock")
    private long f31122e;

    /* renamed from: f, reason: collision with root package name */
    @B("acquireReleaseLock")
    private final Set<i> f31123f;

    /* renamed from: g, reason: collision with root package name */
    @B("acquireReleaseLock")
    private boolean f31124g;

    /* renamed from: h, reason: collision with root package name */
    @B("acquireReleaseLock")
    private int f31125h;

    /* renamed from: i, reason: collision with root package name */
    @B("acquireReleaseLock")
    com.google.android.gms.internal.stats.b f31126i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1306g f31127j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f31128k;

    /* renamed from: l, reason: collision with root package name */
    private final String f31129l;

    /* renamed from: m, reason: collision with root package name */
    private final String f31130m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f31131n;

    /* renamed from: o, reason: collision with root package name */
    @B("acquireReleaseLock")
    private final Map<String, g> f31132o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f31133p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f31134q;

    @I0.a
    public d(@N Context context, int i4, @N String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f31118a = new Object();
        this.f31120c = 0;
        this.f31123f = new HashSet();
        this.f31124g = true;
        this.f31127j = k.e();
        this.f31132o = new HashMap();
        this.f31133p = new AtomicInteger(0);
        C1285y.m(context, "WakeLock: context must not be null");
        C1285y.i(str, "WakeLock: wakeLockName must not be empty");
        this.f31131n = context.getApplicationContext();
        this.f31130m = str;
        this.f31126i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f31129l = str2;
        } else {
            this.f31129l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(L1.a.f1635p3);
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i4, str);
            this.f31119b = newWakeLock;
            if (E.g(context)) {
                WorkSource b4 = E.b(context, com.google.android.gms.common.util.B.b(packageName) ? context.getPackageName() : packageName);
                this.f31128k = b4;
                if (b4 != null) {
                    i(newWakeLock, b4);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f31115s;
            if (scheduledExecutorService == null) {
                synchronized (f31116t) {
                    try {
                        scheduledExecutorService = f31115s;
                        if (scheduledExecutorService == null) {
                            com.google.android.gms.internal.stats.h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f31115s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f31134q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    public static /* synthetic */ void e(@N d dVar) {
        synchronized (dVar.f31118a) {
            try {
                if (!dVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(dVar.f31129l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                dVar.g();
                if (!dVar.b()) {
                    return;
                }
                dVar.f31120c = 1;
                dVar.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B("acquireReleaseLock")
    private final String f(String str) {
        if (this.f31124g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @B("acquireReleaseLock")
    private final void g() {
        if (this.f31123f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f31123f);
        this.f31123f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i4) {
        synchronized (this.f31118a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f31124g) {
                    int i5 = this.f31120c - 1;
                    this.f31120c = i5;
                    if (i5 > 0) {
                        return;
                    }
                } else {
                    this.f31120c = 0;
                }
                g();
                Iterator<g> it = this.f31132o.values().iterator();
                while (it.hasNext()) {
                    it.next().f31136a = 0;
                }
                this.f31132o.clear();
                Future<?> future = this.f31121d;
                if (future != null) {
                    future.cancel(false);
                    this.f31121d = null;
                    this.f31122e = 0L;
                }
                this.f31125h = 0;
                if (this.f31119b.isHeld()) {
                    try {
                        try {
                            this.f31119b.release();
                            if (this.f31126i != null) {
                                this.f31126i = null;
                            }
                        } catch (RuntimeException e4) {
                            if (e4.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.f31129l).concat(" failed to release!"), e4);
                                if (this.f31126i != null) {
                                    this.f31126i = null;
                                }
                            } else {
                                throw e4;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f31126i != null) {
                            this.f31126i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f31129l).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
            Log.wtf("WakeLock", e4.toString());
        }
    }

    @I0.a
    public void a(long j4) {
        this.f31133p.incrementAndGet();
        long j5 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f31114r), 1L);
        if (j4 > 0) {
            max = Math.min(j4, max);
        }
        synchronized (this.f31118a) {
            try {
                if (!b()) {
                    this.f31126i = com.google.android.gms.internal.stats.b.a(false, null);
                    this.f31119b.acquire();
                    this.f31127j.c();
                }
                this.f31120c++;
                this.f31125h++;
                f(null);
                g gVar = this.f31132o.get(null);
                if (gVar == null) {
                    gVar = new g(null);
                    this.f31132o.put(null, gVar);
                }
                gVar.f31136a++;
                long c4 = this.f31127j.c();
                if (Long.MAX_VALUE - c4 > max) {
                    j5 = c4 + max;
                }
                if (j5 > this.f31122e) {
                    this.f31122e = j5;
                    Future<?> future = this.f31121d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f31121d = this.f31134q.schedule(new Runnable() { // from class: com.google.android.gms.stats.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.e(d.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public boolean b() {
        boolean z3;
        synchronized (this.f31118a) {
            if (this.f31120c > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @I0.a
    public void c() {
        if (this.f31133p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f31129l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f31118a) {
            try {
                f(null);
                if (this.f31132o.containsKey(null)) {
                    g gVar = this.f31132o.get(null);
                    if (gVar != null) {
                        int i4 = gVar.f31136a - 1;
                        gVar.f31136a = i4;
                        if (i4 == 0) {
                            this.f31132o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f31129l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public void d(boolean z3) {
        synchronized (this.f31118a) {
            this.f31124g = z3;
        }
    }
}
