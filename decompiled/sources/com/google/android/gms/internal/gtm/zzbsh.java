package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbsh implements zzbfh {
    THIRD_PARTY(1),
    CURATION(2),
    PARTNER_FEED(3),
    EXTRACTION(4);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbsf
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbsh.zzc(i4);
        }
    };
    private final int zzg;

    zzbsh(int i4) {
        this.zzg = i4;
    }

    public static zzbfj zzb() {
        return zzbsg.zza;
    }

    public static zzbsh zzc(int i4) {
        if (i4 == 1) {
            return THIRD_PARTY;
        }
        if (i4 == 2) {
            return CURATION;
        }
        if (i4 == 3) {
            return PARTNER_FEED;
        }
        if (i4 != 4) {
            return null;
        }
        return EXTRACTION;
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
