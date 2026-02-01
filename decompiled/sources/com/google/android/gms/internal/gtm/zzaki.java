package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaki implements zzbfh {
    STRUCTURE_ANY(0),
    STRUCTURE_TOWER(1),
    STRUCTURE_DOME(2),
    STRUCTURE_CASTLE(3),
    STRUCTURE_SHRINE(4),
    STRUCTURE_TEMPLE(5),
    STRUCTURE_TANK(6);

    private static final zzbfi zzh = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzakg
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaki.zzb(i4);
        }
    };
    private final int zzj;

    zzaki(int i4) {
        this.zzj = i4;
    }

    public static zzaki zzb(int i4) {
        switch (i4) {
            case 0:
                return STRUCTURE_ANY;
            case 1:
                return STRUCTURE_TOWER;
            case 2:
                return STRUCTURE_DOME;
            case 3:
                return STRUCTURE_CASTLE;
            case 4:
                return STRUCTURE_SHRINE;
            case 5:
                return STRUCTURE_TEMPLE;
            case 6:
                return STRUCTURE_TANK;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzakh.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzj;
    }
}
