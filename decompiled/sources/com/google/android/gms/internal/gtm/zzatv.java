package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzatv implements zzbfh {
    DISPLAY_PREFERRED(1),
    DISPLAY_BEST(17),
    DISPLAY_OK(2),
    DISPLAY_HIDE(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzatt
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzatv.zzb(i4);
        }
    };
    private final int zzg;

    zzatv(int i4) {
        this.zzg = i4;
    }

    public static zzatv zzb(int i4) {
        if (i4 == 1) {
            return DISPLAY_PREFERRED;
        }
        if (i4 == 2) {
            return DISPLAY_OK;
        }
        if (i4 == 3) {
            return DISPLAY_HIDE;
        }
        if (i4 != 17) {
            return null;
        }
        return DISPLAY_BEST;
    }

    public static zzbfj zzc() {
        return zzatu.zza;
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
