package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzacf implements zzbfh {
    UNDEFINED_MASS_UNIT(0),
    GRAM(1),
    MILLIGRAM(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzacd
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzacf.zzb(i4);
        }
    };
    private final int zzf;

    zzacf(int i4) {
        this.zzf = i4;
    }

    public static zzacf zzb(int i4) {
        if (i4 == 0) {
            return UNDEFINED_MASS_UNIT;
        }
        if (i4 == 1) {
            return GRAM;
        }
        if (i4 != 2) {
            return null;
        }
        return MILLIGRAM;
    }

    public static zzbfj zzc() {
        return zzace.zza;
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
