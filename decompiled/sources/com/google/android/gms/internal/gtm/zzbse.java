package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbse implements zzbfh {
    REQUIRES_CITATION(1),
    REQUIRES_PCOUNSEL_REVIEW(2),
    REQUIRES_ACCESS_CONTROL(3),
    UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE(4);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbsc
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbse.zzc(i4);
        }
    };
    private final int zzg;

    zzbse(int i4) {
        this.zzg = i4;
    }

    public static zzbfj zzb() {
        return zzbsd.zza;
    }

    public static zzbse zzc(int i4) {
        if (i4 == 1) {
            return REQUIRES_CITATION;
        }
        if (i4 == 2) {
            return REQUIRES_PCOUNSEL_REVIEW;
        }
        if (i4 == 3) {
            return REQUIRES_ACCESS_CONTROL;
        }
        if (i4 != 4) {
            return null;
        }
        return UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE;
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
