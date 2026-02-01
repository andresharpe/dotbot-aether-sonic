package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class D0 extends C1631e1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f30138b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f30139c;

    /* renamed from: d, reason: collision with root package name */
    private long f30140d;

    public D0(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30139c = new androidx.collection.a();
        this.f30138b = new androidx.collection.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(D0 d02, String str, long j4) {
        d02.f();
        C1285y.h(str);
        if (d02.f30139c.isEmpty()) {
            d02.f30140d = j4;
        }
        Integer num = (Integer) d02.f30139c.get(str);
        if (num != null) {
            d02.f30139c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d02.f30139c.size() >= 100) {
            d02.f31060a.b().u().a("Too many ads visible");
        } else {
            d02.f30139c.put(str, 1);
            d02.f30138b.put(str, Long.valueOf(j4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h(D0 d02, String str, long j4) {
        d02.f();
        C1285y.h(str);
        Integer num = (Integer) d02.f30139c.get(str);
        if (num != null) {
            C1728u3 q4 = d02.f31060a.I().q(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                d02.f30139c.remove(str);
                Long l4 = (Long) d02.f30138b.get(str);
                if (l4 == null) {
                    d02.f31060a.b().p().a("First ad unit exposure time was never set");
                } else {
                    long longValue = l4.longValue();
                    d02.f30138b.remove(str);
                    d02.n(str, j4 - longValue, q4);
                }
                if (d02.f30139c.isEmpty()) {
                    long j5 = d02.f30140d;
                    if (j5 == 0) {
                        d02.f31060a.b().p().a("First ad exposure time was never set");
                        return;
                    } else {
                        d02.m(j4 - j5, q4);
                        d02.f30140d = 0L;
                        return;
                    }
                }
                return;
            }
            d02.f30139c.put(str, Integer.valueOf(intValue));
            return;
        }
        d02.f31060a.b().p().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @androidx.annotation.j0
    private final void m(long j4, C1728u3 c1728u3) {
        if (c1728u3 == null) {
            this.f31060a.b().t().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.f31060a.b().t().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j4);
        U4.w(c1728u3, bundle, true);
        this.f31060a.G().s("am", "_xa", bundle);
    }

    @androidx.annotation.j0
    private final void n(String str, long j4, C1728u3 c1728u3) {
        if (c1728u3 == null) {
            this.f31060a.b().t().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.f31060a.b().t().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j4);
        U4.w(c1728u3, bundle, true);
        this.f31060a.G().s("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void o(long j4) {
        Iterator it = this.f30138b.keySet().iterator();
        while (it.hasNext()) {
            this.f30138b.put((String) it.next(), Long.valueOf(j4));
        }
        if (!this.f30138b.isEmpty()) {
            this.f30140d = j4;
        }
    }

    public final void j(String str, long j4) {
        if (str != null && str.length() != 0) {
            this.f31060a.a().x(new RunnableC1605a(this, str, j4));
        } else {
            this.f31060a.b().p().a("Ad unit id must be a non-empty string");
        }
    }

    public final void k(String str, long j4) {
        if (str != null && str.length() != 0) {
            this.f31060a.a().x(new A(this, str, j4));
        } else {
            this.f31060a.b().p().a("Ad unit id must be a non-empty string");
        }
    }

    @androidx.annotation.j0
    public final void l(long j4) {
        C1728u3 q4 = this.f31060a.I().q(false);
        for (String str : this.f30138b.keySet()) {
            n(str, j4 - ((Long) this.f30138b.get(str)).longValue(), q4);
        }
        if (!this.f30138b.isEmpty()) {
            m(j4 - this.f30140d, q4);
        }
        o(j4);
    }
}
