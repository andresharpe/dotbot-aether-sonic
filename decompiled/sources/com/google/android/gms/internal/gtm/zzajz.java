package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzajz implements zzbfh {
    STATUS_NORMAL(1),
    STATUS_DISPUTED(2),
    STATUS_UNSURVEYED(3),
    STATUS_INTERNATIONAL_WATER(4),
    STATUS_NEVER_DISPLAY(5),
    STATUS_TREATY(6),
    STATUS_PROVISIONAL(7),
    STATUS_NO_LABEL(8);

    private static final zzbfi zzi = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzajx
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzajz.zzb(i4);
        }
    };
    private final int zzk;

    zzajz(int i4) {
        this.zzk = i4;
    }

    public static zzajz zzb(int i4) {
        switch (i4) {
            case 1:
                return STATUS_NORMAL;
            case 2:
                return STATUS_DISPUTED;
            case 3:
                return STATUS_UNSURVEYED;
            case 4:
                return STATUS_INTERNATIONAL_WATER;
            case 5:
                return STATUS_NEVER_DISPLAY;
            case 6:
                return STATUS_TREATY;
            case 7:
                return STATUS_PROVISIONAL;
            case 8:
                return STATUS_NO_LABEL;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzajy.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzk;
    }
}
