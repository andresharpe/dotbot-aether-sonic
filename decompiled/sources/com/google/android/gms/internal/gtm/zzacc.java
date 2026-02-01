package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzacc implements zzbfh {
    UNDEFINED_ENERGY_UNIT(0),
    CALORIE(1),
    JOULE(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaca
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzacc.zzb(i4);
        }
    };
    private final int zzf;

    zzacc(int i4) {
        this.zzf = i4;
    }

    public static zzacc zzb(int i4) {
        if (i4 == 0) {
            return UNDEFINED_ENERGY_UNIT;
        }
        if (i4 == 1) {
            return CALORIE;
        }
        if (i4 != 2) {
            return null;
        }
        return JOULE;
    }

    public static zzbfj zzc() {
        return zzacb.zza;
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
