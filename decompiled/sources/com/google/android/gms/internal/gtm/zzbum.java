package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbum implements zzbfh {
    CLIENT_UNKNOWN(0),
    PHENOTYPE(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbuk
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbum.zzc(i4);
        }
    };
    private final int zze;

    zzbum(int i4) {
        this.zze = i4;
    }

    public static zzbfj zzb() {
        return zzbul.zza;
    }

    public static zzbum zzc(int i4) {
        if (i4 == 0) {
            return CLIENT_UNKNOWN;
        }
        if (i4 != 1) {
            return null;
        }
        return PHENOTYPE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zze;
    }
}
