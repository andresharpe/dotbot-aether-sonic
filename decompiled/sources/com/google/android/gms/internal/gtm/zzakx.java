package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.recyclerview.widget.n;

/* loaded from: classes.dex */
public enum zzakx implements zzbfh {
    PRECISION_CENTURY(100),
    PRECISION_DECADE(n.f.f18255b),
    PRECISION_YEAR(300),
    PRECISION_MONTH(400),
    PRECISION_DAY(500),
    PRECISION_HOUR(600),
    PRECISION_MINUTE(v.h.f7546j),
    PRECISION_SECOND(800);

    private static final zzbfi zzi = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzakv
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzakx.zzb(i4);
        }
    };
    private final int zzk;

    zzakx(int i4) {
        this.zzk = i4;
    }

    public static zzakx zzb(int i4) {
        if (i4 == 100) {
            return PRECISION_CENTURY;
        }
        if (i4 == 200) {
            return PRECISION_DECADE;
        }
        if (i4 == 300) {
            return PRECISION_YEAR;
        }
        if (i4 == 400) {
            return PRECISION_MONTH;
        }
        if (i4 == 500) {
            return PRECISION_DAY;
        }
        if (i4 == 600) {
            return PRECISION_HOUR;
        }
        if (i4 == 700) {
            return PRECISION_MINUTE;
        }
        if (i4 != 800) {
            return null;
        }
        return PRECISION_SECOND;
    }

    public static zzbfj zzc() {
        return zzakw.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzk;
    }
}
