package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdd implements zzbfh {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdb
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdd.zzb(i4);
        }
    };
    private final int zzf;

    zzbdd(int i4) {
        this.zzf = i4;
    }

    public static zzbdd zzb(int i4) {
        if (i4 == 1) {
            return SPEED;
        }
        if (i4 == 2) {
            return CODE_SIZE;
        }
        if (i4 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    public static zzbfj zzc() {
        return zzbdc.zza;
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
