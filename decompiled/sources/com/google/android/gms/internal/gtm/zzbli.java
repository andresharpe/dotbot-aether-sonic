package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbli implements zzbfh {
    REQUIRES_CITATION(1),
    REQUIRES_PCOUNSEL_REVIEW(2),
    UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzblg
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbli.zzc(i4);
        }
    };
    private final int zzf;

    zzbli(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzblh.zza;
    }

    public static zzbli zzc(int i4) {
        if (i4 == 1) {
            return REQUIRES_CITATION;
        }
        if (i4 == 2) {
            return REQUIRES_PCOUNSEL_REVIEW;
        }
        if (i4 != 3) {
            return null;
        }
        return UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE;
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
