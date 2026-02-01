package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1467p implements r {
    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1467p;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return r.f29755i;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        return Double.valueOf(com.google.firebase.remoteconfig.l.f37524n);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }
}
