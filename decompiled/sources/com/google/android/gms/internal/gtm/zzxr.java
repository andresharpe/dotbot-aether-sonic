package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzxr implements zzbfh {
    UNIT_UNKNOWN(0),
    METERS(1),
    FEET(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzxp
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzxr.zzb(i4);
        }
    };
    private final int zzf;

    zzxr(int i4) {
        this.zzf = i4;
    }

    public static zzxr zzb(int i4) {
        if (i4 == 0) {
            return UNIT_UNKNOWN;
        }
        if (i4 == 1) {
            return METERS;
        }
        if (i4 != 2) {
            return null;
        }
        return FEET;
    }

    public static zzbfj zzc() {
        return zzxq.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzf;
    }
}
