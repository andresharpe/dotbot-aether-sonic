package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzr implements zzbfh {
    NO_CACHE(1),
    PRIVATE(2),
    PUBLIC(3);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzp
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzr.zzb(i4);
        }
    };
    private final int zzf;

    zzr(int i4) {
        this.zzf = i4;
    }

    public static zzr zzb(int i4) {
        if (i4 == 1) {
            return NO_CACHE;
        }
        if (i4 == 2) {
            return PRIVATE;
        }
        if (i4 != 3) {
            return null;
        }
        return PUBLIC;
    }

    public static zzbfj zzc() {
        return zzq.zza;
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
