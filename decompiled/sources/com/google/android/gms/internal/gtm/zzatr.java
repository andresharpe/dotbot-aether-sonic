package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzatr implements zzbfh {
    UNKNOWN(0),
    TRAVEL_MOTOR_VEHICLE(1),
    TRAVEL_AUTO(17),
    TRAVEL_TWO_WHEELER(18),
    TRAVEL_BICYCLE(2),
    TRAVEL_PEDESTRIAN(3);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzatp
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzatr.zzb(i4);
        }
    };
    private final int zzi;

    zzatr(int i4) {
        this.zzi = i4;
    }

    public static zzatr zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return TRAVEL_MOTOR_VEHICLE;
        }
        if (i4 == 2) {
            return TRAVEL_BICYCLE;
        }
        if (i4 == 3) {
            return TRAVEL_PEDESTRIAN;
        }
        if (i4 == 17) {
            return TRAVEL_AUTO;
        }
        if (i4 != 18) {
            return null;
        }
        return TRAVEL_TWO_WHEELER;
    }

    public static zzbfj zzc() {
        return zzatq.zza;
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
