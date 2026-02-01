package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdt implements zzbfh {
    TCP(0),
    UDP(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdr
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdt.zzb(i4);
        }
    };
    private final int zze;

    zzbdt(int i4) {
        this.zze = i4;
    }

    public static zzbdt zzb(int i4) {
        if (i4 == 0) {
            return TCP;
        }
        if (i4 != 1) {
            return null;
        }
        return UDP;
    }

    public static zzbfj zzc() {
        return zzbds.zza;
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
