package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbst implements zzbfh {
    UNKNOWN(0),
    VERTICAL(1),
    HORIZONTAL(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbsr
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbst.zzc(i4);
        }
    };
    private final int zzf;

    zzbst(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzbss.zza;
    }

    public static zzbst zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return VERTICAL;
        }
        if (i4 != 2) {
            return null;
        }
        return HORIZONTAL;
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
