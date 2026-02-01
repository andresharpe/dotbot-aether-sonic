package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzvu implements zzbfh {
    HAS_UNKNOWN_VALUE(1),
    HAS_NO_VALUE(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzvs
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzvu.zzb(i4);
        }
    };
    private final int zze;

    zzvu(int i4) {
        this.zze = i4;
    }

    public static zzvu zzb(int i4) {
        if (i4 == 1) {
            return HAS_UNKNOWN_VALUE;
        }
        if (i4 != 2) {
            return null;
        }
        return HAS_NO_VALUE;
    }

    public static zzbfj zzc() {
        return zzvt.zza;
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
