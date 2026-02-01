package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1362b6;
import com.google.android.gms.internal.measurement.C1454n2;
import com.google.android.gms.internal.measurement.C1462o2;
import com.google.android.gms.internal.measurement.C1470p2;
import com.google.android.gms.internal.measurement.C1478q2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    private String f30595a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30596b;

    /* renamed from: c, reason: collision with root package name */
    private C1462o2 f30597c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f30598d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f30599e;

    /* renamed from: f, reason: collision with root package name */
    private Map f30600f;

    /* renamed from: g, reason: collision with root package name */
    private Map f30601g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C1611b f30602h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d5(C1611b c1611b, String str, c5 c5Var) {
        this.f30602h = c1611b;
        this.f30595a = str;
        this.f30596b = true;
        this.f30598d = new BitSet();
        this.f30599e = new BitSet();
        this.f30600f = new androidx.collection.a();
        this.f30601g = new androidx.collection.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(d5 d5Var) {
        return d5Var.f30598d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public final com.google.android.gms.internal.measurement.U1 a(int i4) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.T1 B3 = com.google.android.gms.internal.measurement.U1.B();
        B3.t(i4);
        B3.w(this.f30596b);
        C1462o2 c1462o2 = this.f30597c;
        if (c1462o2 != null) {
            B3.x(c1462o2);
        }
        C1454n2 F3 = C1462o2.F();
        F3.u(O4.F(this.f30598d));
        F3.x(O4.F(this.f30599e));
        Map map = this.f30600f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.f30600f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l4 = (Long) this.f30600f.get(Integer.valueOf(intValue));
                if (l4 != null) {
                    com.google.android.gms.internal.measurement.V1 C3 = com.google.android.gms.internal.measurement.W1.C();
                    C3.u(intValue);
                    C3.t(l4.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.W1) C3.q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            F3.t(arrayList);
        }
        Map map2 = this.f30601g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f30601g.keySet()) {
                C1470p2 D3 = C1478q2.D();
                D3.u(num.intValue());
                List list2 = (List) this.f30601g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    D3.t(list2);
                }
                arrayList3.add((C1478q2) D3.q());
            }
            list = arrayList3;
        }
        F3.w(list);
        B3.u(F3);
        return (com.google.android.gms.internal.measurement.U1) B3.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(@androidx.annotation.N h5 h5Var) {
        int a4 = h5Var.a();
        Boolean bool = h5Var.f30781c;
        if (bool != null) {
            this.f30599e.set(a4, bool.booleanValue());
        }
        Boolean bool2 = h5Var.f30782d;
        if (bool2 != null) {
            this.f30598d.set(a4, bool2.booleanValue());
        }
        if (h5Var.f30783e != null) {
            Map map = this.f30600f;
            Integer valueOf = Integer.valueOf(a4);
            Long l4 = (Long) map.get(valueOf);
            long longValue = h5Var.f30783e.longValue() / 1000;
            if (l4 == null || longValue > l4.longValue()) {
                this.f30600f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (h5Var.f30784f != null) {
            Map map2 = this.f30601g;
            Integer valueOf2 = Integer.valueOf(a4);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f30601g.put(valueOf2, list);
            }
            if (h5Var.c()) {
                list.clear();
            }
            C1362b6.b();
            C1647h x3 = this.f30602h.f31060a.x();
            String str = this.f30595a;
            C1637f1 c1637f1 = C1643g1.f30696Y;
            if (x3.z(str, c1637f1) && h5Var.b()) {
                list.clear();
            }
            C1362b6.b();
            if (this.f30602h.f31060a.x().z(this.f30595a, c1637f1)) {
                Long valueOf3 = Long.valueOf(h5Var.f30784f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(h5Var.f30784f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d5(C1611b c1611b, String str, C1462o2 c1462o2, BitSet bitSet, BitSet bitSet2, Map map, Map map2, c5 c5Var) {
        this.f30602h = c1611b;
        this.f30595a = str;
        this.f30598d = bitSet;
        this.f30599e = bitSet2;
        this.f30600f = map;
        this.f30601g = new androidx.collection.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f30601g.put(num, arrayList);
        }
        this.f30596b = false;
        this.f30597c = c1462o2;
    }
}
