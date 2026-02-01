package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1647h extends C1757z2 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f30765b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1641g f30766c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f30767d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1647h(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30766c = new InterfaceC1641g() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC1641g
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static final long G() {
        return ((Long) C1643g1.f30706e.a(null)).longValue();
    }

    public static final long g() {
        return ((Long) C1643g1.f30676E.a(null)).longValue();
    }

    private final String h(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C1285y.l(str3);
            return str3;
        } catch (ClassNotFoundException e4) {
            this.f31060a.b().p().b("Could not find SystemProperties class", e4);
            return "";
        } catch (IllegalAccessException e5) {
            this.f31060a.b().p().b("Could not access SystemProperties.get()", e5);
            return "";
        } catch (NoSuchMethodException e6) {
            this.f31060a.b().p().b("Could not find SystemProperties.get() method", e6);
            return "";
        } catch (InvocationTargetException e7) {
            this.f31060a.b().p().b("SystemProperties.get() threw an exception", e7);
            return "";
        }
    }

    public final boolean A(String str) {
        return "1".equals(this.f30766c.c(str, "gaia_collection_enabled"));
    }

    public final boolean B() {
        Boolean r4 = r("google_analytics_automatic_screen_reporting_enabled");
        if (r4 != null && !r4.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean C() {
        this.f31060a.zzaw();
        Boolean r4 = r("firebase_analytics_collection_deactivated");
        if (r4 != null && r4.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean D(String str) {
        return "1".equals(this.f30766c.c(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean E() {
        if (this.f30765b == null) {
            Boolean r4 = r("app_measurement_lite");
            this.f30765b = r4;
            if (r4 == null) {
                this.f30765b = Boolean.FALSE;
            }
        }
        if (!this.f30765b.booleanValue() && this.f31060a.q()) {
            return false;
        }
        return true;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean F() {
        if (this.f30767d == null) {
            synchronized (this) {
                try {
                    if (this.f30767d == null) {
                        ApplicationInfo applicationInfo = this.f31060a.d().getApplicationInfo();
                        String a4 = com.google.android.gms.common.util.x.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z3 = false;
                            if (str != null && str.equals(a4)) {
                                z3 = true;
                            }
                            this.f30767d = Boolean.valueOf(z3);
                        }
                        if (this.f30767d == null) {
                            this.f30767d = Boolean.TRUE;
                            this.f31060a.b().p().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f30767d.booleanValue();
    }

    @androidx.annotation.j0
    public final double i(String str, C1637f1 c1637f1) {
        if (str == null) {
            return ((Double) c1637f1.a(null)).doubleValue();
        }
        String c4 = this.f30766c.c(str, c1637f1.b());
        if (TextUtils.isEmpty(c4)) {
            return ((Double) c1637f1.a(null)).doubleValue();
        }
        try {
            return ((Double) c1637f1.a(Double.valueOf(Double.parseDouble(c4)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1637f1.a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int j(@androidx.annotation.a0(min = 1) String str) {
        return n(str, C1643g1.f30680I, 500, 2000);
    }

    public final int k() {
        U4 L3 = this.f31060a.L();
        Boolean H3 = L3.f31060a.J().H();
        if (L3.m0() < 201500) {
            if (H3 == null || H3.booleanValue()) {
                return 25;
            }
            return 100;
        }
        return 100;
    }

    public final int l(@androidx.annotation.a0(min = 1) String str) {
        return n(str, C1643g1.f30681J, 25, 100);
    }

    @androidx.annotation.j0
    public final int m(String str, C1637f1 c1637f1) {
        if (str == null) {
            return ((Integer) c1637f1.a(null)).intValue();
        }
        String c4 = this.f30766c.c(str, c1637f1.b());
        if (TextUtils.isEmpty(c4)) {
            return ((Integer) c1637f1.a(null)).intValue();
        }
        try {
            return ((Integer) c1637f1.a(Integer.valueOf(Integer.parseInt(c4)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1637f1.a(null)).intValue();
        }
    }

    @androidx.annotation.j0
    public final int n(String str, C1637f1 c1637f1, int i4, int i5) {
        return Math.max(Math.min(m(str, c1637f1), i5), i4);
    }

    public final long o() {
        this.f31060a.zzaw();
        return 73000L;
    }

    @androidx.annotation.j0
    public final long p(String str, C1637f1 c1637f1) {
        if (str == null) {
            return ((Long) c1637f1.a(null)).longValue();
        }
        String c4 = this.f30766c.c(str, c1637f1.b());
        if (TextUtils.isEmpty(c4)) {
            return ((Long) c1637f1.a(null)).longValue();
        }
        try {
            return ((Long) c1637f1.a(Long.valueOf(Long.parseLong(c4)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1637f1.a(null)).longValue();
        }
    }

    @com.google.android.gms.common.util.D
    final Bundle q() {
        try {
            if (this.f31060a.d().getPackageManager() == null) {
                this.f31060a.b().p().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c4 = com.google.android.gms.common.wrappers.e.a(this.f31060a.d()).c(this.f31060a.d().getPackageName(), 128);
            if (c4 == null) {
                this.f31060a.b().p().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c4.metaData;
        } catch (PackageManager.NameNotFoundException e4) {
            this.f31060a.b().p().b("Failed to load metadata: Package name not found", e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final Boolean r(@androidx.annotation.a0(min = 1) String str) {
        C1285y.h(str);
        Bundle q4 = q();
        if (q4 == null) {
            this.f31060a.b().p().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!q4.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(q4.getBoolean(str));
    }

    public final String s() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String t() {
        return h("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String u() {
        this.f31060a.zzaw();
        return "FA";
    }

    @androidx.annotation.j0
    public final String v(String str, C1637f1 c1637f1) {
        if (str == null) {
            return (String) c1637f1.a(null);
        }
        return (String) c1637f1.a(this.f30766c.c(str, c1637f1.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List w(@androidx.annotation.a0(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C1285y.h(r4)
            android.os.Bundle r0 = r3.q()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.f2 r4 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()
            com.google.android.gms.measurement.internal.r1 r4 = r4.p()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.f2 r0 = r3.f31060a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.f2 r0 = r3.f31060a
            com.google.android.gms.measurement.internal.t1 r0 = r0.b()
            com.google.android.gms.measurement.internal.r1 r0 = r0.p()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1647h.w(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(InterfaceC1641g interfaceC1641g) {
        this.f30766c = interfaceC1641g;
    }

    public final boolean y() {
        Boolean r4 = r("google_analytics_adid_collection_enabled");
        if (r4 != null && !r4.booleanValue()) {
            return false;
        }
        return true;
    }

    @androidx.annotation.j0
    public final boolean z(String str, C1637f1 c1637f1) {
        if (str == null) {
            return ((Boolean) c1637f1.a(null)).booleanValue();
        }
        String c4 = this.f30766c.c(str, c1637f1.b());
        if (TextUtils.isEmpty(c4)) {
            return ((Boolean) c1637f1.a(null)).booleanValue();
        }
        return ((Boolean) c1637f1.a(Boolean.valueOf("1".equals(c4)))).booleanValue();
    }
}
