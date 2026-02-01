package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaiq implements zzbfh {
    TRAVEL_MODE_MOTOR_VEHICLE(1),
    TRAVEL_MODE_AUTO(17),
    TRAVEL_MODE_TWO_WHEELER(18),
    TRAVEL_MODE_BICYCLE(2),
    TRAVEL_MODE_PEDESTRIAN(3),
    TRAVEL_MODE_PUBLIC_TRANSIT(4);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaio
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaiq.zzb(i4);
        }
    };
    private final int zzi;

    zzaiq(int i4) {
        this.zzi = i4;
    }

    public static zzaiq zzb(int i4) {
        if (i4 == 1) {
            return TRAVEL_MODE_MOTOR_VEHICLE;
        }
        if (i4 == 2) {
            return TRAVEL_MODE_BICYCLE;
        }
        if (i4 == 3) {
            return TRAVEL_MODE_PEDESTRIAN;
        }
        if (i4 == 4) {
            return TRAVEL_MODE_PUBLIC_TRANSIT;
        }
        if (i4 == 17) {
            return TRAVEL_MODE_AUTO;
        }
        if (i4 != 18) {
            return null;
        }
        return TRAVEL_MODE_TWO_WHEELER;
    }

    public static zzbfj zzc() {
        return zzaip.zza;
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
