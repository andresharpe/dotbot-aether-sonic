package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzuv implements zzbfh {
    ROLLOUT_STATE_UNKNOWN(0),
    ROLLOUT_DISABLED_KEEP_OVERRIDES(1),
    ROLLOUT_ENABLED_KEEP_OVERRIDES(2),
    ROLLOUT_ENABLED_REMOVE_OVERRIDES(3),
    ROLLOUT_DISABLED_REMOVE_OVERRIDES(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzut
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzuv.zzb(i4);
        }
    };
    private final int zzh;

    zzuv(int i4) {
        this.zzh = i4;
    }

    public static zzuv zzb(int i4) {
        if (i4 == 0) {
            return ROLLOUT_STATE_UNKNOWN;
        }
        if (i4 == 1) {
            return ROLLOUT_DISABLED_KEEP_OVERRIDES;
        }
        if (i4 == 2) {
            return ROLLOUT_ENABLED_KEEP_OVERRIDES;
        }
        if (i4 == 3) {
            return ROLLOUT_ENABLED_REMOVE_OVERRIDES;
        }
        if (i4 != 4) {
            return null;
        }
        return ROLLOUT_DISABLED_REMOVE_OVERRIDES;
    }

    public static zzbfj zzc() {
        return zzuu.zza;
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
