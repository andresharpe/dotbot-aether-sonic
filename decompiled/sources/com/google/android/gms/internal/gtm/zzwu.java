package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzwu implements zzbfh {
    COMPARISONOPERATOR_UNKNOWN(0),
    LESS_THAN(1),
    GREATER_THAN(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzws
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzwu.zzb(i4);
        }
    };
    private final int zzf;

    zzwu(int i4) {
        this.zzf = i4;
    }

    public static zzwu zzb(int i4) {
        if (i4 == 0) {
            return COMPARISONOPERATOR_UNKNOWN;
        }
        if (i4 == 1) {
            return LESS_THAN;
        }
        if (i4 != 2) {
            return null;
        }
        return GREATER_THAN;
    }

    public static zzbfj zzc() {
        return zzwt.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzf;
    }
}
