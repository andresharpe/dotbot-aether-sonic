package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1490s implements r {

    /* renamed from: E, reason: collision with root package name */
    private final String f29769E;

    /* renamed from: F, reason: collision with root package name */
    private final ArrayList f29770F;

    public C1490s(String str, List list) {
        this.f29769E = str;
        ArrayList arrayList = new ArrayList();
        this.f29770F = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f29769E;
    }

    public final ArrayList b() {
        return this.f29770F;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1490s)) {
            return false;
        }
        C1490s c1490s = (C1490s) obj;
        String str = this.f29769E;
        if (str == null ? c1490s.f29769E != null : !str.equals(c1490s.f29769E)) {
            return false;
        }
        return this.f29770F.equals(c1490s.f29770F);
    }

    public final int hashCode() {
        int i4;
        String str = this.f29769E;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * 31) + this.f29770F.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }
}
