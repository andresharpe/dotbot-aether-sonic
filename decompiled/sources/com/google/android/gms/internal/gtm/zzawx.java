package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzawx implements zzbfh {
    FLAG_NO_COLD_CALLS(1),
    FLAG_PREFERRED(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzawv
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzawx.zzb(i4);
        }
    };
    private final int zze;

    zzawx(int i4) {
        this.zze = i4;
    }

    public static zzawx zzb(int i4) {
        if (i4 == 1) {
            return FLAG_NO_COLD_CALLS;
        }
        if (i4 != 2) {
            return null;
        }
        return FLAG_PREFERRED;
    }

    public static zzbfj zzc() {
        return zzaww.zza;
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
