package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1459o implements r, InterfaceC1451n {

    /* renamed from: E, reason: collision with root package name */
    final Map f29726E = new HashMap();

    public final List a() {
        return new ArrayList(this.f29726E.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final boolean b(String str) {
        return this.f29726E.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final void c(String str, r rVar) {
        if (rVar == null) {
            this.f29726E.remove(str);
        } else {
            this.f29726E.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r d(String str, C1398g2 c1398g2, List list) {
        if ("toString".equals(str)) {
            return new C1514v(toString());
        }
        return C1435l.a(this, new C1514v(str), c1398g2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1459o)) {
            return false;
        }
        return this.f29726E.equals(((C1459o) obj).f29726E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final r f(String str) {
        if (this.f29726E.containsKey(str)) {
            return (r) this.f29726E.get(str);
        }
        return r.f29754h;
    }

    public final int hashCode() {
        return this.f29726E.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f29726E.isEmpty()) {
            for (String str : this.f29726E.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f29726E.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        C1459o c1459o = new C1459o();
        for (Map.Entry entry : this.f29726E.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1451n) {
                c1459o.f29726E.put((String) entry.getKey(), (r) entry.getValue());
            } else {
                c1459o.f29726E.put((String) entry.getKey(), ((r) entry.getValue()).zzd());
            }
        }
        return c1459o;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return C1435l.b(this.f29726E);
    }
}
