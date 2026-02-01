package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdk implements zzbfh {
    UNCOMPRESSED(0),
    ZIPPY_COMPRESSED(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdi
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdk.zzb(i4);
        }
    };
    private final int zze;

    zzbdk(int i4) {
        this.zze = i4;
    }

    public static zzbdk zzb(int i4) {
        if (i4 == 0) {
            return UNCOMPRESSED;
        }
        if (i4 != 1) {
            return null;
        }
        return ZIPPY_COMPRESSED;
    }

    public static zzbfj zzc() {
        return zzbdj.zza;
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
