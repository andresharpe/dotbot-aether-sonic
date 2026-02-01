package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbab implements zzbfh {
    NON_PRIMARY(0),
    PRIMARY(1000);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzazz
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbab.zzb(i4);
        }
    };
    private final int zze;

    zzbab(int i4) {
        this.zze = i4;
    }

    public static zzbab zzb(int i4) {
        if (i4 == 0) {
            return NON_PRIMARY;
        }
        if (i4 != 1000) {
            return null;
        }
        return PRIMARY;
    }

    public static zzbfj zzc() {
        return zzbaa.zza;
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
