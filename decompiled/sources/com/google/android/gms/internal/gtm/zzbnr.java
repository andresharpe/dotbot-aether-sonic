package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbnr implements zzbfh {
    USASCIIBYTES(1),
    RAWBYTES(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbnp
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbnr.zzc(i4);
        }
    };
    private final int zze;

    zzbnr(int i4) {
        this.zze = i4;
    }

    public static zzbfj zzb() {
        return zzbnq.zza;
    }

    public static zzbnr zzc(int i4) {
        if (i4 == 1) {
            return USASCIIBYTES;
        }
        if (i4 != 2) {
            return null;
        }
        return RAWBYTES;
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
