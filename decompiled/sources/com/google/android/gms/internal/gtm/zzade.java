package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzade implements zzbfh {
    ALLERGEN_DAIRY(0),
    ALLERGEN_EGG(1),
    ALLERGEN_FISH(2),
    ALLERGEN_PEANUT(3),
    ALLERGEN_SHELLFISH(4),
    ALLERGEN_SOY(5),
    ALLERGEN_TREE_NUT(6),
    ALLERGEN_WHEAT(7);

    private static final zzbfi zzi = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzadc
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzade.zzb(i4);
        }
    };
    private final int zzk;

    zzade(int i4) {
        this.zzk = i4;
    }

    public static zzade zzb(int i4) {
        switch (i4) {
            case 0:
                return ALLERGEN_DAIRY;
            case 1:
                return ALLERGEN_EGG;
            case 2:
                return ALLERGEN_FISH;
            case 3:
                return ALLERGEN_PEANUT;
            case 4:
                return ALLERGEN_SHELLFISH;
            case 5:
                return ALLERGEN_SOY;
            case 6:
                return ALLERGEN_TREE_NUT;
            case 7:
                return ALLERGEN_WHEAT;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzadd.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzk;
    }
}
