package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaxs implements zzbfh {
    DAY_OF_WEEK(0),
    DAY_OF_MONTH(1),
    DAY_OF_YEAR(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaxq
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaxs.zzb(i4);
        }
    };
    private final int zzf;

    zzaxs(int i4) {
        this.zzf = i4;
    }

    public static zzaxs zzb(int i4) {
        if (i4 == 0) {
            return DAY_OF_WEEK;
        }
        if (i4 == 1) {
            return DAY_OF_MONTH;
        }
        if (i4 != 2) {
            return null;
        }
        return DAY_OF_YEAR;
    }

    public static zzbfj zzc() {
        return zzaxr.zza;
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
