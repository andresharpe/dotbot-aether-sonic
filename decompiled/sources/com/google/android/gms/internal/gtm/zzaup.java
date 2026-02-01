package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaup implements zzbfh {
    ELEVATION_NORMAL(1),
    ELEVATION_BRIDGE(2),
    ELEVATION_TUNNEL(3),
    ELEVATION_SKYWAY(4),
    ELEVATION_STAIRWAY(5),
    ELEVATION_ESCALATOR(6),
    ELEVATION_ELEVATOR(7),
    ELEVATION_SLOPEWAY(8),
    ELEVATION_MOVING_WALKWAY(9);

    private static final zzbfi zzj = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaun
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaup.zzb(i4);
        }
    };
    private final int zzl;

    zzaup(int i4) {
        this.zzl = i4;
    }

    public static zzaup zzb(int i4) {
        switch (i4) {
            case 1:
                return ELEVATION_NORMAL;
            case 2:
                return ELEVATION_BRIDGE;
            case 3:
                return ELEVATION_TUNNEL;
            case 4:
                return ELEVATION_SKYWAY;
            case 5:
                return ELEVATION_STAIRWAY;
            case 6:
                return ELEVATION_ESCALATOR;
            case 7:
                return ELEVATION_ELEVATOR;
            case 8:
                return ELEVATION_SLOPEWAY;
            case 9:
                return ELEVATION_MOVING_WALKWAY;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzauo.zza;
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
