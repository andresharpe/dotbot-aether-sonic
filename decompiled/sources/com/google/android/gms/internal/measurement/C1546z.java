package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1546z {

    /* renamed from: a, reason: collision with root package name */
    final Map f29844a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final M f29845b = new M();

    public C1546z() {
        b(new C1530x());
        b(new A());
        b(new B());
        b(new F());
        b(new K());
        b(new L());
        b(new N());
    }

    public final r a(C1398g2 c1398g2, r rVar) {
        AbstractC1538y abstractC1538y;
        H2.c(c1398g2);
        if (rVar instanceof C1490s) {
            C1490s c1490s = (C1490s) rVar;
            ArrayList b4 = c1490s.b();
            String a4 = c1490s.a();
            if (this.f29844a.containsKey(a4)) {
                abstractC1538y = (AbstractC1538y) this.f29844a.get(a4);
            } else {
                abstractC1538y = this.f29845b;
            }
            return abstractC1538y.a(a4, c1398g2, b4);
        }
        return rVar;
    }

    final void b(AbstractC1538y abstractC1538y) {
        Iterator it = abstractC1538y.f29837a.iterator();
        while (it.hasNext()) {
            this.f29844a.put(((zzbl) it.next()).e().toString(), abstractC1538y);
        }
    }
}
