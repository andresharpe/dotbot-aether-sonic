package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbrj implements zzbfh {
    DEFAULT_ENCODING(0),
    DATE_PACKED32(1),
    __FieldFormat_Encoding__switch_must_have_a_default__(-1);

    private final int zzg;
    public static final zzbrj zzd = DATE_PACKED32;
    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbri
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbrj.zzc(i4);
        }
    };

    zzbrj(int i4) {
        this.zzg = i4;
    }

    public static zzbfi zzb() {
        return zze;
    }

    public static zzbrj zzc(int i4) {
        if (i4 == -1) {
            return __FieldFormat_Encoding__switch_must_have_a_default__;
        }
        if (i4 == 0) {
            return DEFAULT_ENCODING;
        }
        if (i4 != 1) {
            return null;
        }
        return DATE_PACKED32;
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
