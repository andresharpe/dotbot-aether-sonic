package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzasn implements zzbfh {
    STYLE_CONTIGUOUS(0),
    STYLE_SINGLE(1),
    STYLE_TURN(2),
    STYLE_IN_OUT(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzasl
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzasn.zzb(i4);
        }
    };
    private final int zzg;

    zzasn(int i4) {
        this.zzg = i4;
    }

    public static zzasn zzb(int i4) {
        if (i4 == 0) {
            return STYLE_CONTIGUOUS;
        }
        if (i4 == 1) {
            return STYLE_SINGLE;
        }
        if (i4 == 2) {
            return STYLE_TURN;
        }
        if (i4 != 3) {
            return null;
        }
        return STYLE_IN_OUT;
    }

    public static zzbfj zzc() {
        return zzasm.zza;
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
