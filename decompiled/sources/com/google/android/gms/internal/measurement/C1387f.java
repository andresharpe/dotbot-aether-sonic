package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1387f implements Iterable, r, InterfaceC1451n {

    /* renamed from: E, reason: collision with root package name */
    final SortedMap f29634E;

    /* renamed from: F, reason: collision with root package name */
    final Map f29635F;

    public C1387f() {
        this.f29634E = new TreeMap();
        this.f29635F = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final boolean b(String str) {
        if (!"length".equals(str) && !this.f29635F.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final void c(String str, r rVar) {
        if (rVar == null) {
            this.f29635F.remove(str);
        } else {
            this.f29635F.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return C1435l.a(this, new C1514v(str), c1398g2, list);
        }
        return E.a(str, this, c1398g2, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1387f)) {
            return false;
        }
        C1387f c1387f = (C1387f) obj;
        if (j() != c1387f.j()) {
            return false;
        }
        if (this.f29634E.isEmpty()) {
            return c1387f.f29634E.isEmpty();
        }
        for (int intValue = ((Integer) this.f29634E.firstKey()).intValue(); intValue <= ((Integer) this.f29634E.lastKey()).intValue(); intValue++) {
            if (!k(intValue).equals(c1387f.k(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final r f(String str) {
        r rVar;
        if ("length".equals(str)) {
            return new C1419j(Double.valueOf(j()));
        }
        if (b(str) && (rVar = (r) this.f29635F.get(str)) != null) {
            return rVar;
        }
        return r.f29754h;
    }

    public final int g() {
        return this.f29634E.size();
    }

    public final int hashCode() {
        return this.f29634E.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1379e(this);
    }

    public final int j() {
        if (this.f29634E.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f29634E.lastKey()).intValue() + 1;
    }

    public final r k(int i4) {
        r rVar;
        if (i4 < j()) {
            if (s(i4) && (rVar = (r) this.f29634E.get(Integer.valueOf(i4))) != null) {
                return rVar;
            }
            return r.f29754h;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String l(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f29634E.isEmpty()) {
            for (int i4 = 0; i4 < j(); i4++) {
                r k4 = k(i4);
                sb.append(str);
                if (!(k4 instanceof C1522w) && !(k4 instanceof C1467p)) {
                    sb.append(k4.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator m() {
        return this.f29634E.keySet().iterator();
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(j());
        for (int i4 = 0; i4 < j(); i4++) {
            arrayList.add(k(i4));
        }
        return arrayList;
    }

    public final void o() {
        this.f29634E.clear();
    }

    public final void p(int i4, r rVar) {
        if (i4 >= 0) {
            if (i4 >= j()) {
                r(i4, rVar);
                return;
            }
            for (int intValue = ((Integer) this.f29634E.lastKey()).intValue(); intValue >= i4; intValue--) {
                SortedMap sortedMap = this.f29634E;
                Integer valueOf = Integer.valueOf(intValue);
                r rVar2 = (r) sortedMap.get(valueOf);
                if (rVar2 != null) {
                    r(intValue + 1, rVar2);
                    this.f29634E.remove(valueOf);
                }
            }
            r(i4, rVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i4);
    }

    public final void q(int i4) {
        int intValue = ((Integer) this.f29634E.lastKey()).intValue();
        if (i4 <= intValue && i4 >= 0) {
            this.f29634E.remove(Integer.valueOf(i4));
            if (i4 == intValue) {
                SortedMap sortedMap = this.f29634E;
                int i5 = i4 - 1;
                Integer valueOf = Integer.valueOf(i5);
                if (!sortedMap.containsKey(valueOf) && i5 >= 0) {
                    this.f29634E.put(valueOf, r.f29754h);
                    return;
                }
                return;
            }
            while (true) {
                i4++;
                if (i4 <= ((Integer) this.f29634E.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f29634E;
                    Integer valueOf2 = Integer.valueOf(i4);
                    r rVar = (r) sortedMap2.get(valueOf2);
                    if (rVar != null) {
                        this.f29634E.put(Integer.valueOf(i4 - 1), rVar);
                        this.f29634E.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void r(int i4, r rVar) {
        if (i4 <= 32468) {
            if (i4 >= 0) {
                if (rVar == null) {
                    this.f29634E.remove(Integer.valueOf(i4));
                    return;
                } else {
                    this.f29634E.put(Integer.valueOf(i4), rVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i4);
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean s(int i4) {
        if (i4 >= 0 && i4 <= ((Integer) this.f29634E.lastKey()).intValue()) {
            return this.f29634E.containsKey(Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i4);
    }

    public final String toString() {
        return l(",");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        C1387f c1387f = new C1387f();
        for (Map.Entry entry : this.f29634E.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1451n) {
                c1387f.f29634E.put((Integer) entry.getKey(), (r) entry.getValue());
            } else {
                c1387f.f29634E.put((Integer) entry.getKey(), ((r) entry.getValue()).zzd());
            }
        }
        return c1387f;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        if (this.f29634E.size() == 1) {
            return k(0).zzh();
        }
        if (this.f29634E.size() <= 0) {
            return Double.valueOf(com.google.firebase.remoteconfig.l.f37524n);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return l(",");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return new C1371d(this, this.f29634E.keySet().iterator(), this.f29635F.keySet().iterator());
    }

    public C1387f(List list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                r(i4, (r) list.get(i4));
            }
        }
    }
}
