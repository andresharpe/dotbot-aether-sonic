package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaid implements zzbfh {
    UNIT_UNKNOWN(0),
    METRIC_TON(1),
    LONG_TON(2),
    SHORT_TON(3),
    POUND(4),
    KILOGRAM(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaib
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaid.zzb(i4);
        }
    };
    private final int zzi;

    zzaid(int i4) {
        this.zzi = i4;
    }

    public static zzaid zzb(int i4) {
        if (i4 == 0) {
            return UNIT_UNKNOWN;
        }
        if (i4 == 1) {
            return METRIC_TON;
        }
        if (i4 == 2) {
            return LONG_TON;
        }
        if (i4 == 3) {
            return SHORT_TON;
        }
        if (i4 == 4) {
            return POUND;
        }
        if (i4 != 5) {
            return null;
        }
        return KILOGRAM;
    }

    public static zzbfj zzc() {
        return zzaic.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzi;
    }
}
