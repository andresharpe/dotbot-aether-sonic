package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbqt implements zzbfh {
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbqr
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbqt.zzc(i4);
        }
    };
    private final int zzg;

    zzbqt(int i4) {
        this.zzg = i4;
    }

    public static zzbfj zzb() {
        return zzbqs.zza;
    }

    public static zzbqt zzc(int i4) {
        if (i4 == 1) {
            return NIST_P224;
        }
        if (i4 == 2) {
            return NIST_P256;
        }
        if (i4 == 3) {
            return NIST_P384;
        }
        if (i4 != 4) {
            return null;
        }
        return NIST_P521;
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
