package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzavs implements zzbfh {
    TYPE_ANY(0),
    TYPE_DANGER(1),
    TYPE_SKI_AREA(2),
    TYPE_SLOW_ZONE(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzavq
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzavs.zzb(i4);
        }
    };
    private final int zzg;

    zzavs(int i4) {
        this.zzg = i4;
    }

    public static zzavs zzb(int i4) {
        if (i4 == 0) {
            return TYPE_ANY;
        }
        if (i4 == 1) {
            return TYPE_DANGER;
        }
        if (i4 == 2) {
            return TYPE_SKI_AREA;
        }
        if (i4 != 3) {
            return null;
        }
        return TYPE_SLOW_ZONE;
    }

    public static zzbfj zzc() {
        return zzavr.zza;
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
