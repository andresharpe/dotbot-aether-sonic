package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzwk implements zzbfh {
    SPEED_LIMIT_TRUST_LEVEL_UNKNOWN(0),
    LOW_QUALITY(1),
    HIGH_QUALITY(2),
    EXACT(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzwi
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzwk.zzb(i4);
        }
    };
    private final int zzg;

    zzwk(int i4) {
        this.zzg = i4;
    }

    public static zzwk zzb(int i4) {
        if (i4 == 0) {
            return SPEED_LIMIT_TRUST_LEVEL_UNKNOWN;
        }
        if (i4 == 1) {
            return LOW_QUALITY;
        }
        if (i4 == 2) {
            return HIGH_QUALITY;
        }
        if (i4 != 3) {
            return null;
        }
        return EXACT;
    }

    public static zzbfj zzc() {
        return zzwj.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzg;
    }
}
