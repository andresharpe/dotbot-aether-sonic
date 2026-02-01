package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzahr implements zzbfh {
    UNKNOWN(0),
    ANY(1),
    CAR(2),
    MOTORCYCLE(3),
    TRUCK(4),
    BUS(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzahp
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzahr.zzb(i4);
        }
    };
    private final int zzi;

    zzahr(int i4) {
        this.zzi = i4;
    }

    public static zzahr zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return ANY;
        }
        if (i4 == 2) {
            return CAR;
        }
        if (i4 == 3) {
            return MOTORCYCLE;
        }
        if (i4 == 4) {
            return TRUCK;
        }
        if (i4 != 5) {
            return null;
        }
        return BUS;
    }

    public static zzbfj zzc() {
        return zzahq.zza;
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
