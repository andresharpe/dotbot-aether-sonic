package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbqz implements zzbfh {
    NIST_800_108_KDF_CTR(0);

    private static final zzbfi zzb = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbqx
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbqz.zzc(i4);
        }
    };

    zzbqz(int i4) {
    }

    public static zzbfj zzb() {
        return zzbqy.zza;
    }

    public static zzbqz zzc(int i4) {
        if (i4 != 0) {
            return null;
        }
        return NIST_800_108_KDF_CTR;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return 0;
    }
}
