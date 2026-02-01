package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaxn implements zzbfh {
    COMPONENT_TYPE_POSITIVE(0),
    COMPONENT_TYPE_MISSING_DATA(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaxl
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaxn.zzb(i4);
        }
    };
    private final int zze;

    zzaxn(int i4) {
        this.zze = i4;
    }

    public static zzaxn zzb(int i4) {
        if (i4 == 0) {
            return COMPONENT_TYPE_POSITIVE;
        }
        if (i4 != 1) {
            return null;
        }
        return COMPONENT_TYPE_MISSING_DATA;
    }

    public static zzbfj zzc() {
        return zzaxm.zza;
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
