package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbct implements zzbfh {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbcr
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbct.zzb(i4);
        }
    };
    private final int zzf;

    zzbct(int i4) {
        this.zzf = i4;
    }

    public static zzbct zzb(int i4) {
        if (i4 == 0) {
            return STRING;
        }
        if (i4 == 1) {
            return CORD;
        }
        if (i4 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    public static zzbfj zzc() {
        return zzbcs.zza;
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
