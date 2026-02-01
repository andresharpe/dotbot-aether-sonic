package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaaz implements zzbfh {
    STANDARD(0),
    VALET(1),
    PERMIT(2),
    PICKUP_GOODS(3),
    PICKUP_PASSENGERS(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaax
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaaz.zzb(i4);
        }
    };
    private final int zzh;

    zzaaz(int i4) {
        this.zzh = i4;
    }

    public static zzaaz zzb(int i4) {
        if (i4 == 0) {
            return STANDARD;
        }
        if (i4 == 1) {
            return VALET;
        }
        if (i4 == 2) {
            return PERMIT;
        }
        if (i4 == 3) {
            return PICKUP_GOODS;
        }
        if (i4 != 4) {
            return null;
        }
        return PICKUP_PASSENGERS;
    }

    public static zzbfj zzc() {
        return zzaay.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzh;
    }
}
