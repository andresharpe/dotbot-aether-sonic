package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzave implements zzbfh {
    SURFACE_UNKNOWN(0),
    SURFACE_PAVED(1),
    SURFACE_ASPHALT(17),
    SURFACE_CONCRETE(18),
    SURFACE_CHIPSEAL(19),
    SURFACE_BRICK(20),
    SURFACE_SETT(21),
    SURFACE_COBBLESTONE(22),
    SURFACE_UNPAVED(2),
    SURFACE_GRAVEL(33),
    SURFACE_DIRT(34),
    SURFACE_SAND(35);

    private static final zzbfi zzm = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzavc
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzave.zzb(i4);
        }
    };
    private final int zzo;

    zzave(int i4) {
        this.zzo = i4;
    }

    public static zzave zzb(int i4) {
        if (i4 == 0) {
            return SURFACE_UNKNOWN;
        }
        if (i4 == 1) {
            return SURFACE_PAVED;
        }
        if (i4 == 2) {
            return SURFACE_UNPAVED;
        }
        switch (i4) {
            case 17:
                return SURFACE_ASPHALT;
            case 18:
                return SURFACE_CONCRETE;
            case 19:
                return SURFACE_CHIPSEAL;
            case 20:
                return SURFACE_BRICK;
            case 21:
                return SURFACE_SETT;
            case 22:
                return SURFACE_COBBLESTONE;
            default:
                switch (i4) {
                    case 33:
                        return SURFACE_GRAVEL;
                    case 34:
                        return SURFACE_DIRT;
                    case 35:
                        return SURFACE_SAND;
                    default:
                        return null;
                }
        }
    }

    public static zzbfj zzc() {
        return zzavd.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzo);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzo;
    }
}
