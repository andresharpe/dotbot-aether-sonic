package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1415i3 {
    public static r a(E2 e22) {
        if (e22 == null) {
            return r.f29754h;
        }
        int J3 = e22.J() - 1;
        if (J3 != 1) {
            if (J3 != 2) {
                if (J3 != 3) {
                    if (J3 == 4) {
                        List E3 = e22.E();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = E3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a((E2) it.next()));
                        }
                        return new C1490s(e22.C(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (e22.G()) {
                    return new C1395g(Boolean.valueOf(e22.F()));
                }
                return new C1395g(null);
            }
            if (e22.H()) {
                return new C1419j(Double.valueOf(e22.A()));
            }
            return new C1419j(null);
        }
        if (e22.I()) {
            return new C1514v(e22.D());
        }
        return r.f29761o;
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.f29755i;
        }
        if (obj instanceof String) {
            return new C1514v((String) obj);
        }
        if (obj instanceof Double) {
            return new C1419j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1419j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1419j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1395g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C1459o c1459o = new C1459o();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                r b4 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c1459o.c((String) obj2, b4);
                }
            }
            return c1459o;
        }
        if (obj instanceof List) {
            C1387f c1387f = new C1387f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1387f.r(c1387f.j(), b(it.next()));
            }
            return c1387f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
