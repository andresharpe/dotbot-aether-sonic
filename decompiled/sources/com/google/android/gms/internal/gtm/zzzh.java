package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzzh implements zzbfh {
    UNKNOWN_LOGICAL_MATERIAL(1),
    CONCRETE(2),
    METAL(3),
    PLASTIC(4),
    STONE(5),
    TIMBER(6);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzzf
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzzh.zzb(i4);
        }
    };
    private final int zzi;

    zzzh(int i4) {
        this.zzi = i4;
    }

    public static zzzh zzb(int i4) {
        switch (i4) {
            case 1:
                return UNKNOWN_LOGICAL_MATERIAL;
            case 2:
                return CONCRETE;
            case 3:
                return METAL;
            case 4:
                return PLASTIC;
            case 5:
                return STONE;
            case 6:
                return TIMBER;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzzg.zza;
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
