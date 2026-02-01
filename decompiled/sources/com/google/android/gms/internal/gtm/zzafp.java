package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzafp implements zzbfh {
    SPEED_LIMIT_CATEGORY_UNKNOWN(0),
    NONE(1),
    SCHOOL(2),
    CONSTRUCTION(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzafn
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzafp.zzb(i4);
        }
    };
    private final int zzg;

    zzafp(int i4) {
        this.zzg = i4;
    }

    public static zzafp zzb(int i4) {
        if (i4 == 0) {
            return SPEED_LIMIT_CATEGORY_UNKNOWN;
        }
        if (i4 == 1) {
            return NONE;
        }
        if (i4 == 2) {
            return SCHOOL;
        }
        if (i4 != 3) {
            return null;
        }
        return CONSTRUCTION;
    }

    public static zzbfj zzc() {
        return zzafo.zza;
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
