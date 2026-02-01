package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f29611a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f29612b = new TreeMap();

    private static final int c(C1398g2 c1398g2, C1475q c1475q, r rVar) {
        r a4 = c1475q.a(c1398g2, Collections.singletonList(rVar));
        if (a4 instanceof C1419j) {
            return H2.b(a4.zzh().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i4, C1475q c1475q, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f29612b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f29611a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i4))) {
            i4 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i4), c1475q);
    }

    public final void b(C1398g2 c1398g2, C1363c c1363c) {
        E4 e4 = new E4(c1363c);
        for (Integer num : this.f29611a.keySet()) {
            C1355b clone = c1363c.b().clone();
            int c4 = c(c1398g2, (C1475q) this.f29611a.get(num), e4);
            if (c4 == 2 || c4 == -1) {
                c1363c.f(clone);
            }
        }
        Iterator it = this.f29612b.keySet().iterator();
        while (it.hasNext()) {
            c(c1398g2, (C1475q) this.f29612b.get((Integer) it.next()), e4);
        }
    }
}
