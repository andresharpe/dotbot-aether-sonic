package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzun implements zzbfh {
    UNSPECIFIED(0),
    WIRE(1),
    TEXT(2),
    JSON(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzul
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzun.zzb(i4);
        }
    };
    private final int zzg;

    zzun(int i4) {
        this.zzg = i4;
    }

    public static zzun zzb(int i4) {
        if (i4 == 0) {
            return UNSPECIFIED;
        }
        if (i4 == 1) {
            return WIRE;
        }
        if (i4 == 2) {
            return TEXT;
        }
        if (i4 != 3) {
            return null;
        }
        return JSON;
    }

    public static zzbfj zzc() {
        return zzum.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzg;
    }
}
