package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1514v implements Iterable, r {

    /* renamed from: E, reason: collision with root package name */
    private final String f29810E;

    public C1514v(String str) {
        if (str != null) {
            this.f29810E = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0177. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    @Override // com.google.android.gms.internal.measurement.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r d(java.lang.String r21, com.google.android.gms.internal.measurement.C1398g2 r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1514v.d(java.lang.String, com.google.android.gms.internal.measurement.g2, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514v)) {
            return false;
        }
        return this.f29810E.equals(((C1514v) obj).f29810E);
    }

    public final int hashCode() {
        return this.f29810E.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1506u(this);
    }

    public final String toString() {
        return "\"" + this.f29810E + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return new C1514v(this.f29810E);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f29810E.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        if (this.f29810E.isEmpty()) {
            return Double.valueOf(com.google.firebase.remoteconfig.l.f37524n);
        }
        try {
            return Double.valueOf(this.f29810E);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        return this.f29810E;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return new C1498t(this);
    }
}
