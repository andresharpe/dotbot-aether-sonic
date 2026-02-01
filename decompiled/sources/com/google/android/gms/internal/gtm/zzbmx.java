package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbmx implements zzbfh {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbmv
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbmx.zzc(i4);
        }
    };
    private final int zzf;

    zzbmx(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzbmw.zza;
    }

    public static zzbmx zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i4 == 1) {
            return IEEE_P1363;
        }
        if (i4 != 2) {
            return null;
        }
        return DER;
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
