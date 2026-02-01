package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzyv implements zzbfh {
    NOT_BULK_UPDATABLE(0),
    BULK_UPDATABLE(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzyt
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzyv.zzb(i4);
        }
    };
    private final int zze;

    zzyv(int i4) {
        this.zze = i4;
    }

    public static zzyv zzb(int i4) {
        if (i4 == 0) {
            return NOT_BULK_UPDATABLE;
        }
        if (i4 != 1) {
            return null;
        }
        return BULK_UPDATABLE;
    }

    public static zzbfj zzc() {
        return zzyu.zza;
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
