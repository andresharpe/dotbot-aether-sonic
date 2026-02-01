package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaeu implements zzbfh {
    UNKNOWN_RIGHTS(0),
    GT_RIGHTS(5),
    FULL_RIGHTS(10);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaes
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaeu.zzb(i4);
        }
    };
    private final int zzf;

    zzaeu(int i4) {
        this.zzf = i4;
    }

    public static zzaeu zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN_RIGHTS;
        }
        if (i4 == 5) {
            return GT_RIGHTS;
        }
        if (i4 != 10) {
            return null;
        }
        return FULL_RIGHTS;
    }

    public static zzbfj zzc() {
        return zzaet.zza;
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
