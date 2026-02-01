package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzask implements zzbfh {
    SCOPE_DIRECTION(0),
    SCOPE_SIDE(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzasi
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzask.zzb(i4);
        }
    };
    private final int zze;

    zzask(int i4) {
        this.zze = i4;
    }

    public static zzask zzb(int i4) {
        if (i4 == 0) {
            return SCOPE_DIRECTION;
        }
        if (i4 != 1) {
            return null;
        }
        return SCOPE_SIDE;
    }

    public static zzbfj zzc() {
        return zzasj.zza;
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
