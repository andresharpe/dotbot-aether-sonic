package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbki implements zzbfh {
    UNSPECIFIED(0),
    EQUAL(1),
    LESS_THAN(2),
    LESS_THAN_OR_EQUAL(3),
    GREATER_THAN(4),
    GREATER_THAN_OR_EQUAL(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbkg
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbki.zzc(i4);
        }
    };
    private final int zzi;

    zzbki(int i4) {
        this.zzi = i4;
    }

    public static zzbfj zzb() {
        return zzbkh.zza;
    }

    public static zzbki zzc(int i4) {
        if (i4 == 0) {
            return UNSPECIFIED;
        }
        if (i4 == 1) {
            return EQUAL;
        }
        if (i4 == 2) {
            return LESS_THAN;
        }
        if (i4 == 3) {
            return LESS_THAN_OR_EQUAL;
        }
        if (i4 == 4) {
            return GREATER_THAN;
        }
        if (i4 != 5) {
            return null;
        }
        return GREATER_THAN_OR_EQUAL;
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
