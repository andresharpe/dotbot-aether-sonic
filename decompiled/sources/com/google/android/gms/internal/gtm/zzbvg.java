package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbvg implements zzbfh {
    UNKNOWN(0),
    MOBILE(1),
    TABLET(2),
    DESKTOP(3),
    GOOGLE_HOME(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbve
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbvg.zzc(i4);
        }
    };
    private final int zzh;

    zzbvg(int i4) {
        this.zzh = i4;
    }

    public static zzbfj zzb() {
        return zzbvf.zza;
    }

    public static zzbvg zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return MOBILE;
        }
        if (i4 == 2) {
            return TABLET;
        }
        if (i4 == 3) {
            return DESKTOP;
        }
        if (i4 != 4) {
            return null;
        }
        return GOOGLE_HOME;
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
