package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzuk implements zzbfh {
    UNKNOWN(0),
    NONE(1),
    BASE64(2),
    WEBSAFE(3),
    BASE64_URL(4),
    WEBSAFE_BASE64_URL(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzui
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzuk.zzb(i4);
        }
    };
    private final int zzi;

    zzuk(int i4) {
        this.zzi = i4;
    }

    public static zzuk zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return NONE;
        }
        if (i4 == 2) {
            return BASE64;
        }
        if (i4 == 3) {
            return WEBSAFE;
        }
        if (i4 == 4) {
            return BASE64_URL;
        }
        if (i4 != 5) {
            return null;
        }
        return WEBSAFE_BASE64_URL;
    }

    public static zzbfj zzc() {
        return zzuj.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzi;
    }
}
