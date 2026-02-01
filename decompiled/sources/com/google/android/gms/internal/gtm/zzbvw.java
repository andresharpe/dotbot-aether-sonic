package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbvw implements zzbfh {
    OS_TYPE_UNKNOWN(0),
    OS_TYPE_MAC(1),
    OS_TYPE_WINDOWS(2),
    OS_TYPE_ANDROID(3),
    OS_TYPE_CROS(4),
    OS_TYPE_LINUX(5),
    OS_TYPE_OPENBSD(6);

    private static final zzbfi zzh = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbvu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbvw.zzc(i4);
        }
    };
    private final int zzj;

    zzbvw(int i4) {
        this.zzj = i4;
    }

    public static zzbfj zzb() {
        return zzbvv.zza;
    }

    public static zzbvw zzc(int i4) {
        switch (i4) {
            case 0:
                return OS_TYPE_UNKNOWN;
            case 1:
                return OS_TYPE_MAC;
            case 2:
                return OS_TYPE_WINDOWS;
            case 3:
                return OS_TYPE_ANDROID;
            case 4:
                return OS_TYPE_CROS;
            case 5:
                return OS_TYPE_LINUX;
            case 6:
                return OS_TYPE_OPENBSD;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzj;
    }
}
