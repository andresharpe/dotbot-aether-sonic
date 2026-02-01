package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaae implements zzbfh {
    UNKNOWN_DASH_PATTERN(1),
    SOLID(2),
    DASHED(3),
    DOTTED(4),
    DOTTED_DASHED(5);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaac
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaae.zzb(i4);
        }
    };
    private final int zzh;

    zzaae(int i4) {
        this.zzh = i4;
    }

    public static zzaae zzb(int i4) {
        if (i4 == 1) {
            return UNKNOWN_DASH_PATTERN;
        }
        if (i4 == 2) {
            return SOLID;
        }
        if (i4 == 3) {
            return DASHED;
        }
        if (i4 == 4) {
            return DOTTED;
        }
        if (i4 != 5) {
            return null;
        }
        return DOTTED_DASHED;
    }

    public static zzbfj zzc() {
        return zzaad.zza;
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
