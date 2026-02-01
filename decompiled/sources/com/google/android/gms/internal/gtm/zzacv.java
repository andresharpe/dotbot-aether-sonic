package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzacv implements zzbfh {
    OFFERED_UNSPECIFIED(0),
    OFFERED(1),
    OFFERED_NOT(2),
    OFFERED_ON_WEBSITE(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzact
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzacv.zzb(i4);
        }
    };
    private final int zzg;

    zzacv(int i4) {
        this.zzg = i4;
    }

    public static zzacv zzb(int i4) {
        if (i4 == 0) {
            return OFFERED_UNSPECIFIED;
        }
        if (i4 == 1) {
            return OFFERED;
        }
        if (i4 == 2) {
            return OFFERED_NOT;
        }
        if (i4 != 3) {
            return null;
        }
        return OFFERED_ON_WEBSITE;
    }

    public static zzbfj zzc() {
        return zzacu.zza;
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
