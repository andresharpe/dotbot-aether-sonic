package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdw implements zzbfh {
    NONE(0),
    INTEGRITY(1),
    PRIVACY_AND_INTEGRITY(2),
    STRONG_PRIVACY_AND_INTEGRITY(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdw.zzb(i4);
        }
    };
    private final int zzg;

    zzbdw(int i4) {
        this.zzg = i4;
    }

    public static zzbdw zzb(int i4) {
        if (i4 == 0) {
            return NONE;
        }
        if (i4 == 1) {
            return INTEGRITY;
        }
        if (i4 == 2) {
            return PRIVACY_AND_INTEGRITY;
        }
        if (i4 != 3) {
            return null;
        }
        return STRONG_PRIVACY_AND_INTEGRITY;
    }

    public static zzbfj zzc() {
        return zzbdv.zza;
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
