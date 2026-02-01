package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1522w implements r {
    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1522w;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return r.f29754h;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }
}
