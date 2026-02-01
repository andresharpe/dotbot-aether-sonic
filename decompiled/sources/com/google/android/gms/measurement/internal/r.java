package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    final String f30934a;

    /* renamed from: b, reason: collision with root package name */
    final String f30935b;

    /* renamed from: c, reason: collision with root package name */
    final String f30936c;

    /* renamed from: d, reason: collision with root package name */
    final long f30937d;

    /* renamed from: e, reason: collision with root package name */
    final long f30938e;

    /* renamed from: f, reason: collision with root package name */
    final C1724u f30939f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(C1638f2 c1638f2, String str, String str2, String str3, long j4, long j5, Bundle bundle) {
        C1724u c1724u;
        C1285y.h(str2);
        C1285y.h(str3);
        this.f30934a = str2;
        this.f30935b = str3;
        this.f30936c = true == TextUtils.isEmpty(str) ? null : str;
        this.f30937d = j4;
        this.f30938e = j5;
        if (j5 != 0 && j5 > j4) {
            c1638f2.b().u().b("Event created with reverse previous/current timestamps. appId", C1720t1.x(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c1638f2.b().p().a("Param name can't be null");
                    it.remove();
                } else {
                    Object m4 = c1638f2.L().m(next, bundle2.get(next));
                    if (m4 == null) {
                        c1638f2.b().u().b("Param value can't be null", c1638f2.B().e(next));
                        it.remove();
                    } else {
                        c1638f2.L().A(bundle2, next, m4);
                    }
                }
            }
            c1724u = new C1724u(bundle2);
        } else {
            c1724u = new C1724u(new Bundle());
        }
        this.f30939f = c1724u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r a(C1638f2 c1638f2, long j4) {
        return new r(c1638f2, this.f30936c, this.f30934a, this.f30935b, this.f30937d, j4, this.f30939f);
    }

    public final String toString() {
        return "Event{appId='" + this.f30934a + "', name='" + this.f30935b + "', params=" + this.f30939f.toString() + "}";
    }

    private r(C1638f2 c1638f2, String str, String str2, String str3, long j4, long j5, C1724u c1724u) {
        C1285y.h(str2);
        C1285y.h(str3);
        C1285y.l(c1724u);
        this.f30934a = str2;
        this.f30935b = str3;
        this.f30936c = true == TextUtils.isEmpty(str) ? null : str;
        this.f30937d = j4;
        this.f30938e = j5;
        if (j5 != 0 && j5 > j4) {
            c1638f2.b().u().c("Event created with reverse previous/current timestamps. appId, name", C1720t1.x(str2), C1720t1.x(str3));
        }
        this.f30939f = c1724u;
    }
}
