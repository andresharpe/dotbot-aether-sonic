package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaxy implements zzbfh {
    WEEK_OF_MONTH(0),
    WEEK_OF_YEAR(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaxw
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaxy.zzb(i4);
        }
    };
    private final int zze;

    zzaxy(int i4) {
        this.zze = i4;
    }

    public static zzaxy zzb(int i4) {
        if (i4 == 0) {
            return WEEK_OF_MONTH;
        }
        if (i4 != 1) {
            return null;
        }
        return WEEK_OF_YEAR;
    }

    public static zzbfj zzc() {
        return zzaxx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zze;
    }
}
