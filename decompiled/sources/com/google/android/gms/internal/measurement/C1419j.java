package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1419j implements r {

    /* renamed from: E, reason: collision with root package name */
    private final Double f29675E;

    public C1419j(Double d4) {
        if (d4 == null) {
            this.f29675E = Double.valueOf(Double.NaN);
        } else {
            this.f29675E = d4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        if ("toString".equals(str)) {
            return new C1514v(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1419j)) {
            return false;
        }
        return this.f29675E.equals(((C1419j) obj).f29675E);
    }

    public final int hashCode() {
        return this.f29675E.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return new C1419j(this.f29675E);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        boolean z3 = false;
        if (!Double.isNaN(this.f29675E.doubleValue()) && this.f29675E.doubleValue() != com.google.firebase.remoteconfig.l.f37524n) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        return this.f29675E;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        int scale;
        if (Double.isNaN(this.f29675E.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f29675E.doubleValue())) {
            if (this.f29675E.doubleValue() > com.google.firebase.remoteconfig.l.f37524n) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal a4 = C1411i.a(BigDecimal.valueOf(this.f29675E.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (a4.scale() > 0) {
            scale = a4.precision();
        } else {
            scale = a4.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(a4);
        int indexOf = format.indexOf(androidx.exifinterface.media.a.U4);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return a4.toPlainString();
            }
            return format.replace("E-", "e-").replace(androidx.exifinterface.media.a.U4, "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }
}
