package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1435l {
    public static r a(InterfaceC1451n interfaceC1451n, r rVar, C1398g2 c1398g2, List list) {
        if (interfaceC1451n.b(rVar.zzi())) {
            r f4 = interfaceC1451n.f(rVar.zzi());
            if (f4 instanceof AbstractC1427k) {
                return ((AbstractC1427k) f4).a(c1398g2, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.zzi()));
        }
        if ("hasOwnProperty".equals(rVar.zzi())) {
            H2.h("hasOwnProperty", 1, list);
            if (interfaceC1451n.b(c1398g2.b((r) list.get(0)).zzi())) {
                return r.f29759m;
            }
            return r.f29760n;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", rVar.zzi()));
    }

    public static Iterator b(Map map) {
        return new C1443m(map.keySet().iterator());
    }
}
