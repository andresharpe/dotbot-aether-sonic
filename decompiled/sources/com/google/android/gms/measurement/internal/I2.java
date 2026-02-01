package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I2 {

    /* renamed from: A, reason: collision with root package name */
    private long f30207A;

    /* renamed from: B, reason: collision with root package name */
    @androidx.annotation.P
    private String f30208B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f30209C;

    /* renamed from: D, reason: collision with root package name */
    private long f30210D;

    /* renamed from: E, reason: collision with root package name */
    private long f30211E;

    /* renamed from: a, reason: collision with root package name */
    private final C1638f2 f30212a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30213b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private String f30214c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private String f30215d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    private String f30216e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.P
    private String f30217f;

    /* renamed from: g, reason: collision with root package name */
    private long f30218g;

    /* renamed from: h, reason: collision with root package name */
    private long f30219h;

    /* renamed from: i, reason: collision with root package name */
    private long f30220i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.P
    private String f30221j;

    /* renamed from: k, reason: collision with root package name */
    private long f30222k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.P
    private String f30223l;

    /* renamed from: m, reason: collision with root package name */
    private long f30224m;

    /* renamed from: n, reason: collision with root package name */
    private long f30225n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30226o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30227p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.P
    private String f30228q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.P
    private Boolean f30229r;

    /* renamed from: s, reason: collision with root package name */
    private long f30230s;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.P
    private List f30231t;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.P
    private String f30232u;

    /* renamed from: v, reason: collision with root package name */
    private long f30233v;

    /* renamed from: w, reason: collision with root package name */
    private long f30234w;

    /* renamed from: x, reason: collision with root package name */
    private long f30235x;

    /* renamed from: y, reason: collision with root package name */
    private long f30236y;

    /* renamed from: z, reason: collision with root package name */
    private long f30237z;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public I2(C1638f2 c1638f2, String str) {
        C1285y.l(c1638f2);
        C1285y.h(str);
        this.f30212a = c1638f2;
        this.f30213b = str;
        c1638f2.a().f();
    }

    @androidx.annotation.j0
    public final long A() {
        this.f30212a.a().f();
        return 0L;
    }

    @androidx.annotation.j0
    public final void B(long j4) {
        boolean z3;
        boolean z4 = false;
        if (j4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        this.f30212a.a().f();
        boolean z5 = this.f30209C;
        if (this.f30218g != j4) {
            z4 = true;
        }
        this.f30209C = z5 | z4;
        this.f30218g = j4;
    }

    @androidx.annotation.j0
    public final void C(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30219h != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30219h = j4;
    }

    @androidx.annotation.j0
    public final void D(boolean z3) {
        boolean z4;
        this.f30212a.a().f();
        boolean z5 = this.f30209C;
        if (this.f30226o != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f30209C = z5 | z4;
        this.f30226o = z3;
    }

    @androidx.annotation.j0
    public final void E(@androidx.annotation.P Boolean bool) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30229r, bool);
        this.f30229r = bool;
    }

    @androidx.annotation.j0
    public final void F(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30216e, str);
        this.f30216e = str;
    }

    @androidx.annotation.j0
    public final void G(@androidx.annotation.P List list) {
        ArrayList arrayList;
        this.f30212a.a().f();
        if (!C1650h2.a(this.f30231t, list)) {
            this.f30209C = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f30231t = arrayList;
        }
    }

    @androidx.annotation.j0
    public final void H(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30232u, str);
        this.f30232u = str;
    }

    @androidx.annotation.j0
    public final boolean I() {
        this.f30212a.a().f();
        return this.f30227p;
    }

    @androidx.annotation.j0
    public final boolean J() {
        this.f30212a.a().f();
        return this.f30226o;
    }

    @androidx.annotation.j0
    public final boolean K() {
        this.f30212a.a().f();
        return this.f30209C;
    }

    @androidx.annotation.j0
    public final long L() {
        this.f30212a.a().f();
        return this.f30222k;
    }

    @androidx.annotation.j0
    public final long M() {
        this.f30212a.a().f();
        return this.f30210D;
    }

    @androidx.annotation.j0
    public final long N() {
        this.f30212a.a().f();
        return this.f30236y;
    }

    @androidx.annotation.j0
    public final long O() {
        this.f30212a.a().f();
        return this.f30237z;
    }

    @androidx.annotation.j0
    public final long P() {
        this.f30212a.a().f();
        return this.f30235x;
    }

    @androidx.annotation.j0
    public final long Q() {
        this.f30212a.a().f();
        return this.f30234w;
    }

    @androidx.annotation.j0
    public final long R() {
        this.f30212a.a().f();
        return this.f30207A;
    }

    @androidx.annotation.j0
    public final long S() {
        this.f30212a.a().f();
        return this.f30233v;
    }

    @androidx.annotation.j0
    public final long T() {
        this.f30212a.a().f();
        return this.f30225n;
    }

    @androidx.annotation.j0
    public final long U() {
        this.f30212a.a().f();
        return this.f30230s;
    }

    @androidx.annotation.j0
    public final long V() {
        this.f30212a.a().f();
        return this.f30211E;
    }

    @androidx.annotation.j0
    public final long W() {
        this.f30212a.a().f();
        return this.f30224m;
    }

    @androidx.annotation.j0
    public final long X() {
        this.f30212a.a().f();
        return this.f30220i;
    }

    @androidx.annotation.j0
    public final long Y() {
        this.f30212a.a().f();
        return this.f30218g;
    }

    @androidx.annotation.j0
    public final long Z() {
        this.f30212a.a().f();
        return this.f30219h;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String a() {
        this.f30212a.a().f();
        return this.f30216e;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final Boolean a0() {
        this.f30212a.a().f();
        return this.f30229r;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String b() {
        this.f30212a.a().f();
        return this.f30232u;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String b0() {
        this.f30212a.a().f();
        return this.f30228q;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final List c() {
        this.f30212a.a().f();
        return this.f30231t;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String c0() {
        this.f30212a.a().f();
        String str = this.f30208B;
        y(null);
        return str;
    }

    @androidx.annotation.j0
    public final void d() {
        this.f30212a.a().f();
        this.f30209C = false;
    }

    @androidx.annotation.j0
    public final String d0() {
        this.f30212a.a().f();
        return this.f30213b;
    }

    @androidx.annotation.j0
    public final void e() {
        this.f30212a.a().f();
        long j4 = this.f30218g + 1;
        if (j4 > 2147483647L) {
            this.f30212a.b().u().b("Bundle index overflow. appId", C1720t1.x(this.f30213b));
            j4 = 0;
        }
        this.f30209C = true;
        this.f30218g = j4;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String e0() {
        this.f30212a.a().f();
        return this.f30214c;
    }

    @androidx.annotation.j0
    public final void f(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f30209C |= true ^ C1650h2.a(this.f30228q, str);
        this.f30228q = str;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String f0() {
        this.f30212a.a().f();
        return this.f30223l;
    }

    @androidx.annotation.j0
    public final void g(boolean z3) {
        boolean z4;
        this.f30212a.a().f();
        boolean z5 = this.f30209C;
        if (this.f30227p != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f30209C = z5 | z4;
        this.f30227p = z3;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String g0() {
        this.f30212a.a().f();
        return this.f30221j;
    }

    @androidx.annotation.j0
    public final void h(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30214c, str);
        this.f30214c = str;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String h0() {
        this.f30212a.a().f();
        return this.f30217f;
    }

    @androidx.annotation.j0
    public final void i(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30223l, str);
        this.f30223l = str;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String i0() {
        this.f30212a.a().f();
        return this.f30215d;
    }

    @androidx.annotation.j0
    public final void j(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30221j, str);
        this.f30221j = str;
    }

    @androidx.annotation.P
    @androidx.annotation.j0
    public final String j0() {
        this.f30212a.a().f();
        return this.f30208B;
    }

    @androidx.annotation.j0
    public final void k(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30222k != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30222k = j4;
    }

    @androidx.annotation.j0
    public final void l(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30210D != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30210D = j4;
    }

    @androidx.annotation.j0
    public final void m(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30236y != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30236y = j4;
    }

    @androidx.annotation.j0
    public final void n(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30237z != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30237z = j4;
    }

    @androidx.annotation.j0
    public final void o(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30235x != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30235x = j4;
    }

    @androidx.annotation.j0
    public final void p(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30234w != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30234w = j4;
    }

    @androidx.annotation.j0
    public final void q(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30207A != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30207A = j4;
    }

    @androidx.annotation.j0
    public final void r(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30233v != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30233v = j4;
    }

    @androidx.annotation.j0
    public final void s(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30225n != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30225n = j4;
    }

    @androidx.annotation.j0
    public final void t(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30230s != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30230s = j4;
    }

    @androidx.annotation.j0
    public final void u(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30211E != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30211E = j4;
    }

    @androidx.annotation.j0
    public final void v(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30217f, str);
        this.f30217f = str;
    }

    @androidx.annotation.j0
    public final void w(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f30209C |= true ^ C1650h2.a(this.f30215d, str);
        this.f30215d = str;
    }

    @androidx.annotation.j0
    public final void x(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30224m != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30224m = j4;
    }

    @androidx.annotation.j0
    public final void y(@androidx.annotation.P String str) {
        this.f30212a.a().f();
        this.f30209C |= !C1650h2.a(this.f30208B, str);
        this.f30208B = str;
    }

    @androidx.annotation.j0
    public final void z(long j4) {
        boolean z3;
        this.f30212a.a().f();
        boolean z4 = this.f30209C;
        if (this.f30220i != j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f30209C = z4 | z3;
        this.f30220i = j4;
    }
}
