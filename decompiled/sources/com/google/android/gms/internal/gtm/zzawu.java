package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzawu implements zzbfh {
    CONTACT_CATEGORY_UNSPECIFIED(0),
    CUSTOMER_SERVICE(1),
    RESERVATIONS(2),
    SALES(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaws
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzawu.zzb(i4);
        }
    };
    private final int zzg;

    zzawu(int i4) {
        this.zzg = i4;
    }

    public static zzawu zzb(int i4) {
        if (i4 == 0) {
            return CONTACT_CATEGORY_UNSPECIFIED;
        }
        if (i4 == 1) {
            return CUSTOMER_SERVICE;
        }
        if (i4 == 2) {
            return RESERVATIONS;
        }
        if (i4 != 3) {
            return null;
        }
        return SALES;
    }

    public static zzbfj zzc() {
        return zzawt.zza;
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
