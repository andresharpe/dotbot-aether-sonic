package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbwq implements zzbfh {
    NO_RESTRICTION(0),
    SIDEWINDER_DEVICE(1),
    LATCHSKY_DEVICE(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbwo
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbwq.zzc(i4);
        }
    };
    private final int zzf;

    zzbwq(int i4) {
        this.zzf = i4;
    }

    public static zzbfj zzb() {
        return zzbwp.zza;
    }

    public static zzbwq zzc(int i4) {
        if (i4 == 0) {
            return NO_RESTRICTION;
        }
        if (i4 == 1) {
            return SIDEWINDER_DEVICE;
        }
        if (i4 != 2) {
            return null;
        }
        return LATCHSKY_DEVICE;
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
