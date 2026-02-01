package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdz implements zzbfh {
    MESSAGE(0),
    BYTE(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdx
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdz.zzb(i4);
        }
    };
    private final int zze;

    zzbdz(int i4) {
        this.zze = i4;
    }

    public static zzbdz zzb(int i4) {
        if (i4 == 0) {
            return MESSAGE;
        }
        if (i4 != 1) {
            return null;
        }
        return BYTE;
    }

    public static zzbfj zzc() {
        return zzbdy.zza;
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
