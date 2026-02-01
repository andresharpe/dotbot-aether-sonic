package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbcw implements zzbfh {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbcu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbcw.zzb(i4);
        }
    };
    private final int zzf;

    zzbcw(int i4) {
        this.zzf = i4;
    }

    public static zzbcw zzb(int i4) {
        if (i4 == 0) {
            return JS_NORMAL;
        }
        if (i4 == 1) {
            return JS_STRING;
        }
        if (i4 != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    public static zzbfj zzc() {
        return zzbcv.zza;
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
