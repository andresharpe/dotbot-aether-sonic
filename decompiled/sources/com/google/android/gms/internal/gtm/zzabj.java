package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzabj implements zzbfh {
    ANY(0),
    CAR(1),
    MOTORCYCLE(2),
    TRUCK(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzabh
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzabj.zzb(i4);
        }
    };
    private final int zzg;

    zzabj(int i4) {
        this.zzg = i4;
    }

    public static zzabj zzb(int i4) {
        if (i4 == 0) {
            return ANY;
        }
        if (i4 == 1) {
            return CAR;
        }
        if (i4 == 2) {
            return MOTORCYCLE;
        }
        if (i4 != 3) {
            return null;
        }
        return TRUCK;
    }

    public static zzbfj zzc() {
        return zzabi.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzg;
    }
}
