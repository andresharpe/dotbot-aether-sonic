package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zztv implements zzbfh {
    UNKNOWN(0),
    ON(1),
    OFF(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zztt
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zztv.zzb(i4);
        }
    };
    private final int zzf;

    zztv(int i4) {
        this.zzf = i4;
    }

    public static zztv zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return ON;
        }
        if (i4 != 2) {
            return null;
        }
        return OFF;
    }

    public static zzbfj zzc() {
        return zztu.zza;
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
