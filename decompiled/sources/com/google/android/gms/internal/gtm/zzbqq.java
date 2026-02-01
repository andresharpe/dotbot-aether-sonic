package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbqq implements zzbfh {
    X509_SPKI_UNCOMPRESSED(0),
    POINT_UNCOMPRESSED(1),
    POINT_COMPRESSED(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbqo
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbqq.zzc(i4);
        }
    };
    private final int zzf;

    zzbqq(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzbqp.zza;
    }

    public static zzbqq zzc(int i4) {
        if (i4 == 0) {
            return X509_SPKI_UNCOMPRESSED;
        }
        if (i4 == 1) {
            return POINT_UNCOMPRESSED;
        }
        if (i4 != 2) {
            return null;
        }
        return POINT_COMPRESSED;
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
