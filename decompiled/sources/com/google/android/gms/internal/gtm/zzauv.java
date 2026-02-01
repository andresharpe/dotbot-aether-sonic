package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzauv implements zzbfh {
    PEDESTRIAN_FACILITY_UNKNOWN(1),
    PEDESTRIAN_FACILITY_NONE(2),
    PEDESTRIAN_FACILITY_PRESENT(3),
    PEDESTRIAN_FACILITY_SIDEWALK(49),
    PEDESTRIAN_FACILITY_WIDE_SHOULDER(50);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaut
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzauv.zzb(i4);
        }
    };
    private final int zzh;

    zzauv(int i4) {
        this.zzh = i4;
    }

    public static zzauv zzb(int i4) {
        if (i4 == 1) {
            return PEDESTRIAN_FACILITY_UNKNOWN;
        }
        if (i4 == 2) {
            return PEDESTRIAN_FACILITY_NONE;
        }
        if (i4 == 3) {
            return PEDESTRIAN_FACILITY_PRESENT;
        }
        if (i4 == 49) {
            return PEDESTRIAN_FACILITY_SIDEWALK;
        }
        if (i4 != 50) {
            return null;
        }
        return PEDESTRIAN_FACILITY_WIDE_SHOULDER;
    }

    public static zzbfj zzc() {
        return zzauu.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzh;
    }
}
