package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdn implements zzbfh {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdl
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdn.zzb(i4);
        }
    };
    private final int zzf;

    zzbdn(int i4) {
        this.zzf = i4;
    }

    public static zzbdn zzb(int i4) {
        if (i4 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i4 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i4 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    public static zzbfj zzc() {
        return zzbdm.zza;
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
