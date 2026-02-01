package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.C1372d0;
import com.google.android.gms.internal.measurement.C1533x2;
import com.google.android.gms.internal.measurement.C1549z2;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.U6;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.X6;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzko;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC1759z4 implements InterfaceC1641g {

    /* renamed from: d, reason: collision with root package name */
    private final Map f30456d;

    /* renamed from: e, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final Map f30457e;

    /* renamed from: f, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final Map f30458f;

    /* renamed from: g, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final Map f30459g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f30460h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f30461i;

    /* renamed from: j, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final androidx.collection.j f30462j;

    /* renamed from: k, reason: collision with root package name */
    final U6 f30463k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f30464l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f30465m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f30466n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W1(L4 l4) {
        super(l4);
        this.f30456d = new androidx.collection.a();
        this.f30457e = new androidx.collection.a();
        this.f30458f = new androidx.collection.a();
        this.f30459g = new androidx.collection.a();
        this.f30460h = new androidx.collection.a();
        this.f30464l = new androidx.collection.a();
        this.f30465m = new androidx.collection.a();
        this.f30466n = new androidx.collection.a();
        this.f30461i = new androidx.collection.a();
        this.f30462j = new T1(this, 20);
        this.f30463k = new U1(this);
    }

    @androidx.annotation.j0
    private final com.google.android.gms.internal.measurement.K1 k(String str, byte[] bArr) {
        Long l4;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.K1.G();
        }
        try {
            com.google.android.gms.internal.measurement.K1 k12 = (com.google.android.gms.internal.measurement.K1) ((com.google.android.gms.internal.measurement.J1) O4.A(com.google.android.gms.internal.measurement.K1.E(), bArr)).q();
            C1708r1 t3 = this.f31060a.b().t();
            String str2 = null;
            if (k12.R()) {
                l4 = Long.valueOf(k12.C());
            } else {
                l4 = null;
            }
            if (k12.Q()) {
                str2 = k12.H();
            }
            t3.c("Parsed config. version, gmp_app_id", l4, str2);
            return k12;
        } catch (zzko e4) {
            this.f31060a.b().u().c("Unable to merge remote config. appId", C1720t1.x(str), e4);
            return com.google.android.gms.internal.measurement.K1.G();
        } catch (RuntimeException e5) {
            this.f31060a.b().u().c("Unable to merge remote config. appId", C1720t1.x(str), e5);
            return com.google.android.gms.internal.measurement.K1.G();
        }
    }

    private final void l(String str, com.google.android.gms.internal.measurement.J1 j12) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        if (j12 != null) {
            A6.b();
            if (this.f31060a.x().z(null, C1643g1.f30725n0)) {
                Iterator it = j12.B().iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.G1) it.next()).B());
                }
            }
            for (int i4 = 0; i4 < j12.t(); i4++) {
                com.google.android.gms.internal.measurement.H1 h12 = (com.google.android.gms.internal.measurement.H1) j12.u(i4).w();
                if (h12.w().isEmpty()) {
                    this.f31060a.b().u().a("EventConfig contained null event name");
                } else {
                    String w3 = h12.w();
                    String b4 = D2.b(h12.w());
                    if (!TextUtils.isEmpty(b4)) {
                        h12.u(b4);
                        j12.x(i4, h12);
                    }
                    if (h12.A() && h12.x()) {
                        aVar.put(w3, Boolean.TRUE);
                    }
                    if (h12.B() && h12.y()) {
                        aVar2.put(h12.w(), Boolean.TRUE);
                    }
                    if (h12.C()) {
                        if (h12.t() >= 2 && h12.t() <= 65535) {
                            aVar3.put(h12.w(), Integer.valueOf(h12.t()));
                        } else {
                            this.f31060a.b().u().c("Invalid sampling rate. Event name, sample rate", h12.w(), Integer.valueOf(h12.t()));
                        }
                    }
                }
            }
        }
        this.f30457e.put(str, hashSet);
        this.f30458f.put(str, aVar);
        this.f30459g.put(str, aVar2);
        this.f30461i.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.W1.m(java.lang.String):void");
    }

    @androidx.annotation.j0
    private final void n(final String str, com.google.android.gms.internal.measurement.K1 k12) {
        if (k12.A() != 0) {
            this.f31060a.b().t().b("EES programs found", Integer.valueOf(k12.A()));
            C1549z2 c1549z2 = (C1549z2) k12.L().get(0);
            try {
                C1372d0 c1372d0 = new C1372d0();
                c1372d0.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.Q1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new E5("internal.remoteConfig", new V1(W1.this, str));
                    }
                });
                c1372d0.d("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.R1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final W1 w12 = W1.this;
                        final String str2 = str;
                        return new X6("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.P1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                W1 w13 = W1.this;
                                String str3 = str2;
                                I2 P3 = w13.f31057b.U().P(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                w13.f31060a.x().o();
                                hashMap.put("gmp_version", 73000L);
                                if (P3 != null) {
                                    String g02 = P3.g0();
                                    if (g02 != null) {
                                        hashMap.put("app_version", g02);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(P3.L()));
                                    hashMap.put("dynamite_version", Long.valueOf(P3.U()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c1372d0.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.S1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new W6(W1.this.f30463k);
                    }
                });
                c1372d0.c(c1549z2);
                this.f30462j.j(str, c1372d0);
                this.f31060a.b().t().c("EES program loaded for appId, activities", str, Integer.valueOf(c1549z2.A().A()));
                Iterator it = c1549z2.A().D().iterator();
                while (it.hasNext()) {
                    this.f31060a.b().t().b("EES program activity", ((C1533x2) it.next()).B());
                }
                return;
            } catch (zzd unused) {
                this.f31060a.b().p().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f30462j.l(str);
    }

    private static final Map o(com.google.android.gms.internal.measurement.K1 k12) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (k12 != null) {
            for (com.google.android.gms.internal.measurement.O1 o12 : k12.M()) {
                aVar.put(o12.B(), o12.C());
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ C1372d0 q(W1 w12, String str) {
        w12.g();
        C1285y.h(str);
        if (!w12.A(str)) {
            return null;
        }
        if (w12.f30460h.containsKey(str) && w12.f30460h.get(str) != null) {
            w12.n(str, (com.google.android.gms.internal.measurement.K1) w12.f30460h.get(str));
        } else {
            w12.m(str);
        }
        return (C1372d0) w12.f30462j.q().get(str);
    }

    public final boolean A(String str) {
        com.google.android.gms.internal.measurement.K1 k12;
        if (TextUtils.isEmpty(str) || (k12 = (com.google.android.gms.internal.measurement.K1) this.f30460h.get(str)) == null || k12.A() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean C(String str, String str2) {
        Boolean bool;
        f();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f30459g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean D(String str, String str2) {
        Boolean bool;
        f();
        m(str);
        if (B(str) && U4.U(str2)) {
            return true;
        }
        if (E(str) && U4.V(str2)) {
            return true;
        }
        Map map = (Map) this.f30458f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final boolean F(String str, byte[] bArr, String str2, String str3) {
        g();
        f();
        C1285y.h(str);
        com.google.android.gms.internal.measurement.J1 j12 = (com.google.android.gms.internal.measurement.J1) k(str, bArr).w();
        if (j12 == null) {
            return false;
        }
        l(str, j12);
        n(str, (com.google.android.gms.internal.measurement.K1) j12.q());
        this.f30460h.put(str, (com.google.android.gms.internal.measurement.K1) j12.q());
        this.f30464l.put(str, j12.y());
        this.f30465m.put(str, str2);
        this.f30466n.put(str, str3);
        this.f30456d.put(str, o((com.google.android.gms.internal.measurement.K1) j12.q()));
        this.f31057b.U().l(str, new ArrayList(j12.A()));
        try {
            j12.w();
            bArr = ((com.google.android.gms.internal.measurement.K1) j12.q()).k();
        } catch (RuntimeException e4) {
            this.f31060a.b().u().c("Unable to serialize reduced-size config. Storing full config instead. appId", C1720t1.x(str), e4);
        }
        C1677m U3 = this.f31057b.U();
        C1285y.h(str);
        U3.f();
        U3.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (U3.f31060a.x().z(null, C1643g1.f30747y0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (U3.N().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                U3.f31060a.b().p().b("Failed to update remote config (got 0). appId", C1720t1.x(str));
            }
        } catch (SQLiteException e5) {
            U3.f31060a.b().p().c("Error storing remote config. appId", C1720t1.x(str), e5);
        }
        this.f30460h.put(str, (com.google.android.gms.internal.measurement.K1) j12.q());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean G(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) != null && ((Set) this.f30457e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean H(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f30457e.get(str)).contains("device_model") && !((Set) this.f30457e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean I(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) != null && ((Set) this.f30457e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean J(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) != null && ((Set) this.f30457e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean K(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f30457e.get(str)).contains("os_version") && !((Set) this.f30457e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean L(String str) {
        f();
        m(str);
        if (this.f30457e.get(str) != null && ((Set) this.f30457e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1641g
    @androidx.annotation.j0
    public final String c(String str, String str2) {
        f();
        m(str);
        Map map = (Map) this.f30456d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final int p(String str, String str2) {
        Integer num;
        f();
        m(str);
        Map map = (Map) this.f30461i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final com.google.android.gms.internal.measurement.K1 r(String str) {
        g();
        f();
        C1285y.h(str);
        m(str);
        return (com.google.android.gms.internal.measurement.K1) this.f30460h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final String s(String str) {
        f();
        return (String) this.f30466n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final String t(String str) {
        f();
        return (String) this.f30465m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final String u(String str) {
        f();
        m(str);
        return (String) this.f30464l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final Set w(String str) {
        f();
        m(str);
        return (Set) this.f30457e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    public final void x(String str) {
        f();
        this.f30465m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void y(String str) {
        f();
        this.f30460h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean z(String str) {
        f();
        com.google.android.gms.internal.measurement.K1 r4 = r(str);
        if (r4 == null) {
            return false;
        }
        return r4.P();
    }
}
