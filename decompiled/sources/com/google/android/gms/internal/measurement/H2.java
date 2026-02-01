package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class H2 {
    public static double a(double d4) {
        int i4;
        if (Double.isNaN(d4)) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        if (!Double.isInfinite(d4) && d4 != com.google.firebase.remoteconfig.l.f37524n && d4 != com.google.firebase.remoteconfig.l.f37524n) {
            if (d4 > com.google.firebase.remoteconfig.l.f37524n) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            return i4 * Math.floor(Math.abs(d4));
        }
        return d4;
    }

    public static int b(double d4) {
        int i4;
        if (!Double.isNaN(d4) && !Double.isInfinite(d4) && d4 != com.google.firebase.remoteconfig.l.f37524n) {
            if (d4 > com.google.firebase.remoteconfig.l.f37524n) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            return (int) ((i4 * Math.floor(Math.abs(d4))) % 4.294967296E9d);
        }
        return 0;
    }

    public static int c(C1398g2 c1398g2) {
        int b4 = b(c1398g2.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (b4 <= 1000000) {
            c1398g2.g("runtime.counter", new C1419j(Double.valueOf(b4)));
            return b4;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d4) {
        return b(d4) & 4294967295L;
    }

    public static zzbl e(String str) {
        zzbl zzblVar = null;
        if (str != null && !str.isEmpty()) {
            zzblVar = zzbl.b(Integer.parseInt(str));
        }
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(r rVar) {
        if (r.f29755i.equals(rVar)) {
            return null;
        }
        if (r.f29754h.equals(rVar)) {
            return "";
        }
        if (rVar instanceof C1459o) {
            return g((C1459o) rVar);
        }
        if (rVar instanceof C1387f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C1387f) rVar).iterator();
            while (it.hasNext()) {
                Object f4 = f((r) it.next());
                if (f4 != null) {
                    arrayList.add(f4);
                }
            }
            return arrayList;
        }
        if (!rVar.zzh().isNaN()) {
            return rVar.zzh();
        }
        return rVar.zzi();
    }

    public static Map g(C1459o c1459o) {
        HashMap hashMap = new HashMap();
        for (String str : c1459o.a()) {
            Object f4 = f(c1459o.f(str));
            if (f4 != null) {
                hashMap.put(str, f4);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i4, List list) {
        if (list.size() == i4) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i4, List list) {
        if (list.size() >= i4) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i4, List list) {
        if (list.size() <= i4) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double zzh = rVar.zzh();
        if (zzh.isNaN() || zzh.doubleValue() < com.google.firebase.remoteconfig.l.f37524n || !zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean l(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof C1522w) || (rVar instanceof C1467p)) {
            return true;
        }
        if (rVar instanceof C1419j) {
            if (Double.isNaN(rVar.zzh().doubleValue()) || Double.isNaN(rVar2.zzh().doubleValue())) {
                return false;
            }
            return rVar.zzh().equals(rVar2.zzh());
        }
        if (rVar instanceof C1514v) {
            return rVar.zzi().equals(rVar2.zzi());
        }
        if (rVar instanceof C1395g) {
            return rVar.zzg().equals(rVar2.zzg());
        }
        if (rVar != rVar2) {
            return false;
        }
        return true;
    }
}
