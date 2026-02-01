package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbsa implements zzbfh {
    UNKNOWN_CATEGORY(0),
    END_TO_END(1),
    INGESTED_BUT_NOT_SERVED(2),
    MATERIALIZED_AND_SERVED(3),
    INTERNAL_KG_USE_ONLY(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbrz
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbsa.zzc(i4);
        }
    };
    private final int zzh;

    zzbsa(int i4) {
        this.zzh = i4;
    }

    public static zzbfi zzb() {
        return zzf;
    }

    public static zzbsa zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN_CATEGORY;
        }
        if (i4 == 1) {
            return END_TO_END;
        }
        if (i4 == 2) {
            return INGESTED_BUT_NOT_SERVED;
        }
        if (i4 == 3) {
            return MATERIALIZED_AND_SERVED;
        }
        if (i4 != 4) {
            return null;
        }
        return INTERNAL_KG_USE_ONLY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzh;
    }
}
