package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbrc implements zzbfh {
    SIG_UNKNOWN(0),
    SIG(1),
    SIG_WITHHIDDEN_ATTACHED(2),
    SIG_WITHTIMEOUT(3),
    SIG_RAW(4),
    SIG_URL(5),
    SIG_WITHTIMESTAMP(6);

    private static final zzbfi zzh = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbra
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbrc.zzc(i4);
        }
    };
    private final int zzj;

    zzbrc(int i4) {
        this.zzj = i4;
    }

    public static zzbfj zzb() {
        return zzbrb.zza;
    }

    public static zzbrc zzc(int i4) {
        switch (i4) {
            case 0:
                return SIG_UNKNOWN;
            case 1:
                return SIG;
            case 2:
                return SIG_WITHHIDDEN_ATTACHED;
            case 3:
                return SIG_WITHTIMEOUT;
            case 4:
                return SIG_RAW;
            case 5:
                return SIG_URL;
            case 6:
                return SIG_WITHTIMESTAMP;
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
