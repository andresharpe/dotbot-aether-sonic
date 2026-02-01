package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbro implements zzbfh {
    DEFAULT_TABLE_TYPE(0),
    SQL_TABLE(1),
    VALUE_TABLE(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbrn
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbro.zzc(i4);
        }
    };
    private final int zzf;

    zzbro(int i4) {
        this.zzf = i4;
    }

    public static zzbfi zzb() {
        return zzd;
    }

    public static zzbro zzc(int i4) {
        if (i4 == 0) {
            return DEFAULT_TABLE_TYPE;
        }
        if (i4 == 1) {
            return SQL_TABLE;
        }
        if (i4 != 2) {
            return null;
        }
        return VALUE_TABLE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzf;
    }
}
