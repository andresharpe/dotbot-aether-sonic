package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzzy implements zzbfh {
    UNKNOWN_LOGICAL_COLOR(1),
    WHITE(2),
    YELLOW(3),
    RED(4),
    GREEN(5),
    BLUE(6),
    BLACK(7),
    GREY(8),
    ORANGE(9);

    private static final zzbfi zzj = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzzw
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzzy.zzb(i4);
        }
    };
    private final int zzl;

    zzzy(int i4) {
        this.zzl = i4;
    }

    public static zzzy zzb(int i4) {
        switch (i4) {
            case 1:
                return UNKNOWN_LOGICAL_COLOR;
            case 2:
                return WHITE;
            case 3:
                return YELLOW;
            case 4:
                return RED;
            case 5:
                return GREEN;
            case 6:
                return BLUE;
            case 7:
                return BLACK;
            case 8:
                return GREY;
            case 9:
                return ORANGE;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzzx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzl);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzl;
    }
}
