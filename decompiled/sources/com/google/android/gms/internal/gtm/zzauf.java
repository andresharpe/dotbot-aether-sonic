package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzauf implements zzbfh {
    BICYCLE_SAFETY_RECOMMENDED(1),
    BICYCLE_SAFETY_NEUTRAL(2),
    BICYCLE_SAFETY_CAUTION(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaud
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzauf.zzb(i4);
        }
    };
    private final int zzf;

    zzauf(int i4) {
        this.zzf = i4;
    }

    public static zzauf zzb(int i4) {
        if (i4 == 1) {
            return BICYCLE_SAFETY_RECOMMENDED;
        }
        if (i4 == 2) {
            return BICYCLE_SAFETY_NEUTRAL;
        }
        if (i4 != 3) {
            return null;
        }
        return BICYCLE_SAFETY_CAUTION;
    }

    public static zzbfj zzc() {
        return zzaue.zza;
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
