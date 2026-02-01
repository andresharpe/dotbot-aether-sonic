package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbof implements zzbfh {
    KEY_MATERIAL_NO_METADATA(1),
    IV(2),
    IV_SIZE_BITS(3),
    IV_SIZE_BYTES(4),
    KEY_SIZE_BITS(5),
    KEY_SIZE_BYTES(6);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzboe
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbof.zzc(i4);
        }
    };
    private final int zzi;

    zzbof(int i4) {
        this.zzi = i4;
    }

    public static zzbfi zzb() {
        return zzg;
    }

    public static zzbof zzc(int i4) {
        switch (i4) {
            case 1:
                return KEY_MATERIAL_NO_METADATA;
            case 2:
                return IV;
            case 3:
                return IV_SIZE_BITS;
            case 4:
                return IV_SIZE_BYTES;
            case 5:
                return KEY_SIZE_BITS;
            case 6:
                return KEY_SIZE_BYTES;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzi;
    }
}
