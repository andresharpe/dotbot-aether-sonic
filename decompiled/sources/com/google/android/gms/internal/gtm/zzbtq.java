package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbtq implements zzbfh {
    TIER_UNKNOWN(0),
    UNSUPPORTED(1),
    SILVER(2),
    GOLD(3),
    DIAMOND(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbto
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbtq.zzc(i4);
        }
    };
    private final int zzh;

    zzbtq(int i4) {
        this.zzh = i4;
    }

    public static zzbfj zzb() {
        return zzbtp.zza;
    }

    public static zzbtq zzc(int i4) {
        if (i4 == 0) {
            return TIER_UNKNOWN;
        }
        if (i4 == 1) {
            return UNSUPPORTED;
        }
        if (i4 == 2) {
            return SILVER;
        }
        if (i4 == 3) {
            return GOLD;
        }
        if (i4 != 4) {
            return null;
        }
        return DIAMOND;
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
