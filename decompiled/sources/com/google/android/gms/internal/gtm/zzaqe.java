package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaqe implements zzbfh {
    UNKNOWN(0),
    CROSSABLE(1),
    UNMARKED_CROSSING(17),
    MARKED_CROSSING(18),
    UNCROSSABLE(2);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaqc
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaqe.zzb(i4);
        }
    };
    private final int zzh;

    zzaqe(int i4) {
        this.zzh = i4;
    }

    public static zzaqe zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return CROSSABLE;
        }
        if (i4 == 2) {
            return UNCROSSABLE;
        }
        if (i4 == 17) {
            return UNMARKED_CROSSING;
        }
        if (i4 != 18) {
            return null;
        }
        return MARKED_CROSSING;
    }

    public static zzbfj zzc() {
        return zzaqd.zza;
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
