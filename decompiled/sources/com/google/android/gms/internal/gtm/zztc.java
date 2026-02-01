package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zztc implements zzbfh {
    INT52(0),
    NUMBER(1),
    STRING(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zztb
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zztc.zzb(i4);
        }
    };
    private final int zzf;

    zztc(int i4) {
        this.zzf = i4;
    }

    public static zztc zzb(int i4) {
        if (i4 == 0) {
            return INT52;
        }
        if (i4 == 1) {
            return NUMBER;
        }
        if (i4 != 2) {
            return null;
        }
        return STRING;
    }

    public static zzbfi zzc() {
        return zzd;
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
