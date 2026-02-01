package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzzl implements zzbfh {
    UNKNOWN_BORDER_PATTERN(1),
    NO_BORDER_PATTERN(2),
    SOLID(3),
    DASHED(4);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzzj
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzzl.zzb(i4);
        }
    };
    private final int zzg;

    zzzl(int i4) {
        this.zzg = i4;
    }

    public static zzzl zzb(int i4) {
        if (i4 == 1) {
            return UNKNOWN_BORDER_PATTERN;
        }
        if (i4 == 2) {
            return NO_BORDER_PATTERN;
        }
        if (i4 == 3) {
            return SOLID;
        }
        if (i4 != 4) {
            return null;
        }
        return DASHED;
    }

    public static zzbfj zzc() {
        return zzzk.zza;
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
