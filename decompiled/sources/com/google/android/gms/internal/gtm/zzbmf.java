package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbmf implements zzbfh {
    UNKNOWN_EXPORT_MODE(0),
    GOOG_MODULE(2),
    GOOG_MODULE_LEGACY_NAMESPACE(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbme
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbmf.zzc(i4);
        }
    };
    private final int zzf;

    zzbmf(int i4) {
        this.zzf = i4;
    }

    public static zzbfi zzb() {
        return zzd;
    }

    public static zzbmf zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN_EXPORT_MODE;
        }
        if (i4 == 2) {
            return GOOG_MODULE;
        }
        if (i4 != 3) {
            return null;
        }
        return GOOG_MODULE_LEGACY_NAMESPACE;
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
