package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1427k implements r, InterfaceC1451n {

    /* renamed from: E, reason: collision with root package name */
    protected final String f29699E;

    /* renamed from: F, reason: collision with root package name */
    protected final Map f29700F = new HashMap();

    public AbstractC1427k(String str) {
        this.f29699E = str;
    }

    public abstract r a(C1398g2 c1398g2, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final boolean b(String str) {
        return this.f29700F.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final void c(String str, r rVar) {
        if (rVar == null) {
            this.f29700F.remove(str);
        } else {
            this.f29700F.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        if ("toString".equals(str)) {
            return new C1514v(this.f29699E);
        }
        return C1435l.a(this, new C1514v(str), c1398g2, list);
    }

    public final String e() {
        return this.f29699E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1427k)) {
            return false;
        }
        AbstractC1427k abstractC1427k = (AbstractC1427k) obj;
        String str = this.f29699E;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC1427k.f29699E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1451n
    public final r f(String str) {
        if (this.f29700F.containsKey(str)) {
            return (r) this.f29700F.get(str);
        }
        return r.f29754h;
    }

    public final int hashCode() {
        String str = this.f29699E;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r zzd() {
        return this;
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
        return this.f29699E;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return C1435l.b(this.f29700F);
    }
}
