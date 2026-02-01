package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1395g implements r {

    /* renamed from: E, reason: collision with root package name */
    private final boolean f29650E;

    public C1395g(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f29650E = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        if ("toString".equals(str)) {
            return new C1514v(Boolean.toString(this.f29650E));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f29650E), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1395g) && this.f29650E == ((C1395g) obj).f29650E) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f29650E).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f29650E);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return new C1395g(Boolean.valueOf(this.f29650E));
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.valueOf(this.f29650E);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        double d4;
        if (true != this.f29650E) {
            d4 = com.google.firebase.remoteconfig.l.f37524n;
        } else {
            d4 = 1.0d;
        }
        return Double.valueOf(d4);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return Boolean.toString(this.f29650E);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }
}
