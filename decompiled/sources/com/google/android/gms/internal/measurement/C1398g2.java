package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1398g2 {

    /* renamed from: a, reason: collision with root package name */
    public final C1398g2 f29654a;

    /* renamed from: b, reason: collision with root package name */
    final C1546z f29655b;

    /* renamed from: c, reason: collision with root package name */
    final Map f29656c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f29657d = new HashMap();

    public C1398g2(C1398g2 c1398g2, C1546z c1546z) {
        this.f29654a = c1398g2;
        this.f29655b = c1546z;
    }

    public final C1398g2 a() {
        return new C1398g2(this, this.f29655b);
    }

    public final r b(r rVar) {
        return this.f29655b.a(this, rVar);
    }

    public final r c(C1387f c1387f) {
        r rVar = r.f29754h;
        Iterator m4 = c1387f.m();
        while (m4.hasNext()) {
            rVar = this.f29655b.a(this, c1387f.k(((Integer) m4.next()).intValue()));
            if (rVar instanceof C1403h) {
                break;
            }
        }
        return rVar;
    }

    public final r d(String str) {
        if (this.f29656c.containsKey(str)) {
            return (r) this.f29656c.get(str);
        }
        C1398g2 c1398g2 = this.f29654a;
        if (c1398g2 != null) {
            return c1398g2.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, r rVar) {
        if (this.f29657d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f29656c.remove(str);
        } else {
            this.f29656c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f29657d.put(str, Boolean.TRUE);
    }

    public final void g(String str, r rVar) {
        C1398g2 c1398g2;
        if (!this.f29656c.containsKey(str) && (c1398g2 = this.f29654a) != null && c1398g2.h(str)) {
            this.f29654a.g(str, rVar);
        } else {
            if (this.f29657d.containsKey(str)) {
                return;
            }
            if (rVar == null) {
                this.f29656c.remove(str);
            } else {
                this.f29656c.put(str, rVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f29656c.containsKey(str)) {
            return true;
        }
        C1398g2 c1398g2 = this.f29654a;
        if (c1398g2 != null) {
            return c1398g2.h(str);
        }
        return false;
    }
}
