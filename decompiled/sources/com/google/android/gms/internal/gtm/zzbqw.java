package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbqw implements zzbfh {
    SHA1(0),
    SHA224(1),
    SHA256(2),
    SHA384(4),
    SHA512(3),
    USE_DEFAULT_HASH_ALGORITHM(100),
    NO_HASH_ALGORITHM(101);

    private static final zzbfi zzh = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbqu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbqw.zzc(i4);
        }
    };
    private final int zzj;

    zzbqw(int i4) {
        this.zzj = i4;
    }

    public static zzbfj zzb() {
        return zzbqv.zza;
    }

    public static zzbqw zzc(int i4) {
        if (i4 == 0) {
            return SHA1;
        }
        if (i4 == 1) {
            return SHA224;
        }
        if (i4 == 2) {
            return SHA256;
        }
        if (i4 == 3) {
            return SHA512;
        }
        if (i4 == 4) {
            return SHA384;
        }
        if (i4 == 100) {
            return USE_DEFAULT_HASH_ALGORITHM;
        }
        if (i4 != 101) {
            return null;
        }
        return NO_HASH_ALGORITHM;
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
