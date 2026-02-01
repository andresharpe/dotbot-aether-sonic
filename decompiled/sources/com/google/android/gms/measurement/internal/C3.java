package com.google.android.gms.measurement.internal;

import N0.a;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spotify.sdk.android.auth.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class C3 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C1728u3 f30125c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C1728u3 f30126d;

    /* renamed from: e, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected C1728u3 f30127e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f30128f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("activityLock")
    private Activity f30129g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.B("activityLock")
    private volatile boolean f30130h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C1728u3 f30131i;

    /* renamed from: j, reason: collision with root package name */
    private C1728u3 f30132j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.B("activityLock")
    private boolean f30133k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f30134l;

    public C3(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30134l = new Object();
        this.f30128f = new ConcurrentHashMap();
    }

    @androidx.annotation.K
    private final C1728u3 D(@androidx.annotation.N Activity activity) {
        C1285y.l(activity);
        C1728u3 c1728u3 = (C1728u3) this.f30128f.get(activity);
        if (c1728u3 == null) {
            C1728u3 c1728u32 = new C1728u3(null, r(activity.getClass(), "Activity"), this.f31060a.L().p0());
            this.f30128f.put(activity, c1728u32);
            c1728u3 = c1728u32;
        }
        if (this.f30131i != null) {
            return this.f30131i;
        }
        return c1728u3;
    }

    @androidx.annotation.K
    private final void E(Activity activity, C1728u3 c1728u3, boolean z3) {
        C1728u3 c1728u32;
        C1728u3 c1728u33;
        String str;
        if (this.f30125c == null) {
            c1728u32 = this.f30126d;
        } else {
            c1728u32 = this.f30125c;
        }
        C1728u3 c1728u34 = c1728u32;
        if (c1728u3.f30998b == null) {
            if (activity != null) {
                str = r(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c1728u33 = new C1728u3(c1728u3.f30997a, str, c1728u3.f30999c, c1728u3.f31001e, c1728u3.f31002f);
        } else {
            c1728u33 = c1728u3;
        }
        this.f30126d = this.f30125c;
        this.f30125c = c1728u33;
        this.f31060a.a().x(new RunnableC1746x3(this, c1728u33, c1728u34, this.f31060a.zzav().c(), z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void m(C1728u3 c1728u3, C1728u3 c1728u32, long j4, boolean z3, Bundle bundle) {
        boolean z4;
        Bundle bundle2;
        String str;
        long j5;
        long j6;
        f();
        boolean z5 = false;
        if (c1728u32 == null || c1728u32.f30999c != c1728u3.f30999c || !C1734v3.a(c1728u32.f30998b, c1728u3.f30998b) || !C1734v3.a(c1728u32.f30997a, c1728u3.f30997a)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && this.f30127e != null) {
            z5 = true;
        }
        if (z4) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            U4.w(c1728u3, bundle3, true);
            if (c1728u32 != null) {
                String str2 = c1728u32.f30997a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c1728u32.f30998b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c1728u32.f30999c);
            }
            if (z5) {
                C1717s4 c1717s4 = this.f31060a.K().f31005e;
                long j7 = j4 - c1717s4.f30966b;
                c1717s4.f30966b = j4;
                if (j7 > 0) {
                    this.f31060a.L().u(bundle3, j7);
                }
            }
            if (!this.f31060a.x().B()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != c1728u3.f31001e) {
                str = kotlinx.coroutines.W.f52989c;
            } else {
                str = com.spotify.android.appremote.internal.l.f48821i;
            }
            String str4 = str;
            long a4 = this.f31060a.zzav().a();
            if (c1728u3.f31001e) {
                j5 = a4;
                long j8 = c1728u3.f31002f;
                if (j8 != 0) {
                    j6 = j8;
                    this.f31060a.G().t(str4, "_vs", j6, bundle3);
                }
            } else {
                j5 = a4;
            }
            j6 = j5;
            this.f31060a.G().t(str4, "_vs", j6, bundle3);
        }
        if (z5) {
            n(this.f30127e, true, j4);
        }
        this.f30127e = c1728u3;
        if (c1728u3.f31001e) {
            this.f30132j = c1728u3;
        }
        this.f31060a.J().s(c1728u3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void n(C1728u3 c1728u3, boolean z3, long j4) {
        boolean z4;
        this.f31060a.w().l(this.f31060a.zzav().c());
        if (c1728u3 != null && c1728u3.f31000d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f31060a.K().f31005e.d(z4, z3, j4) && c1728u3 != null) {
            c1728u3.f31000d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u(C3 c32, Bundle bundle, C1728u3 c1728u3, C1728u3 c1728u32, long j4) {
        bundle.remove(FirebaseAnalytics.b.f34803l0);
        bundle.remove(FirebaseAnalytics.b.f34801k0);
        c32.m(c1728u3, c1728u32, j4, true, c32.f31060a.L().t0(null, FirebaseAnalytics.a.f34719A, bundle, null, false));
    }

    @androidx.annotation.K
    public final void A(Activity activity, Bundle bundle) {
        C1728u3 c1728u3;
        if (!this.f31060a.x().B() || bundle == null || (c1728u3 = (C1728u3) this.f30128f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(b.c.f48986a, c1728u3.f30999c);
        bundle2.putString(a.C0015a.f1688b, c1728u3.f30997a);
        bundle2.putString("referrer_name", c1728u3.f30998b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(@androidx.annotation.N android.app.Activity r4, @androidx.annotation.a0(max = 36, min = 1) java.lang.String r5, @androidx.annotation.a0(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.f2 r0 = r3.f31060a
            com.google.android.gms.measurement.internal.h r0 = r0.x()
            boolean r0 = r0.B()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.u3 r0 = r3.f30125c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f30128f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.r(r6, r1)
        L54:
            java.lang.String r1 = r0.f30998b
            boolean r1 = com.google.android.gms.measurement.internal.C1734v3.a(r1, r6)
            java.lang.String r0 = r0.f30997a
            boolean r0 = com.google.android.gms.measurement.internal.C1734v3.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.f2 r1 = r3.f31060a
            r1.x()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.f2 r1 = r3.f31060a
            r1.x()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.v()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.f2 r0 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r0 = r0.b()
            com.google.android.gms.measurement.internal.r1 r0 = r0.t()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.u3 r0 = new com.google.android.gms.measurement.internal.u3
            com.google.android.gms.measurement.internal.f2 r1 = r3.f31060a
            com.google.android.gms.measurement.internal.U4 r1 = r1.L()
            long r1 = r1.p0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f30128f
            r5.put(r4, r0)
            r5 = 1
            r3.E(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3.B(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3.C(android.os.Bundle, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.F1
    protected final boolean l() {
        return false;
    }

    public final C1728u3 p() {
        return this.f30125c;
    }

    @androidx.annotation.j0
    public final C1728u3 q(boolean z3) {
        g();
        f();
        if (!z3) {
            return this.f30127e;
        }
        C1728u3 c1728u3 = this.f30127e;
        if (c1728u3 != null) {
            return c1728u3;
        }
        return this.f30132j;
    }

    @com.google.android.gms.common.util.D
    final String r(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f31060a.x();
        if (length2 > 100) {
            this.f31060a.x();
            return str2.substring(0, 100);
        }
        return str2;
    }

    @androidx.annotation.K
    public final void w(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f31060a.x().B() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f30128f.put(activity, new C1728u3(bundle2.getString(a.C0015a.f1688b), bundle2.getString("referrer_name"), bundle2.getLong(b.c.f48986a)));
    }

    @androidx.annotation.K
    public final void x(Activity activity) {
        synchronized (this.f30134l) {
            try {
                if (activity == this.f30129g) {
                    this.f30129g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f31060a.x().B()) {
            return;
        }
        this.f30128f.remove(activity);
    }

    @androidx.annotation.K
    public final void y(Activity activity) {
        synchronized (this.f30134l) {
            this.f30133k = false;
            this.f30130h = true;
        }
        long c4 = this.f31060a.zzav().c();
        if (!this.f31060a.x().B()) {
            this.f30125c = null;
            this.f31060a.a().x(new RunnableC1758z3(this, c4));
        } else {
            C1728u3 D3 = D(activity);
            this.f30126d = this.f30125c;
            this.f30125c = null;
            this.f31060a.a().x(new A3(this, D3, c4));
        }
    }

    @androidx.annotation.K
    public final void z(Activity activity) {
        synchronized (this.f30134l) {
            this.f30133k = true;
            if (activity != this.f30129g) {
                synchronized (this.f30134l) {
                    this.f30129g = activity;
                    this.f30130h = false;
                }
                if (this.f31060a.x().B()) {
                    this.f30131i = null;
                    this.f31060a.a().x(new B3(this));
                }
            }
        }
        if (!this.f31060a.x().B()) {
            this.f30125c = this.f30131i;
            this.f31060a.a().x(new RunnableC1752y3(this));
        } else {
            E(activity, D(activity), false);
            D0 w3 = this.f31060a.w();
            w3.f31060a.a().x(new RunnableC1618c0(w3, w3.f31060a.zzav().c()));
        }
    }
}
