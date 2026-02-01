package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbpu implements zzbfh {
    NONCE(1),
    TWEAK(2),
    WITH_DATA(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbps
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbpu.zzc(i4);
        }
    };
    private final int zzf;

    zzbpu(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzbpt.zza;
    }

    public static zzbpu zzc(int i4) {
        if (i4 == 1) {
            return NONCE;
        }
        if (i4 == 2) {
            return TWEAK;
        }
        if (i4 != 3) {
            return null;
        }
        return WITH_DATA;
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
