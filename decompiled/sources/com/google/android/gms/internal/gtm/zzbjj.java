package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbjj implements zzbfh {
    NONE(0),
    SD_CLEARCUT_SOURCE_EXTENSION(1),
    SD_CLEARCUT_SOURCE_EXTENSION_JS(2),
    SD_CLEARCUT_LOGEVENTS(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbji
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbjj.zzc(i4);
        }
    };
    private final int zzg;

    zzbjj(int i4) {
        this.zzg = i4;
    }

    public static zzbfi zzb() {
        return zze;
    }

    public static zzbjj zzc(int i4) {
        if (i4 == 0) {
            return NONE;
        }
        if (i4 == 1) {
            return SD_CLEARCUT_SOURCE_EXTENSION;
        }
        if (i4 == 2) {
            return SD_CLEARCUT_SOURCE_EXTENSION_JS;
        }
        if (i4 != 3) {
            return null;
        }
        return SD_CLEARCUT_LOGEVENTS;
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
