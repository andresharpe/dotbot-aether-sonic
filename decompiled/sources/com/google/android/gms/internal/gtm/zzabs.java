package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzabs implements zzbfh {
    TYPE_ANY(0),
    TYPE_FOOD(1),
    TYPE_SERVICE(2),
    TYPE_PRODUCT(3),
    TYPE_JOB(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzabq
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzabs.zzb(i4);
        }
    };
    private final int zzh;

    zzabs(int i4) {
        this.zzh = i4;
    }

    public static zzabs zzb(int i4) {
        if (i4 == 0) {
            return TYPE_ANY;
        }
        if (i4 == 1) {
            return TYPE_FOOD;
        }
        if (i4 == 2) {
            return TYPE_SERVICE;
        }
        if (i4 == 3) {
            return TYPE_PRODUCT;
        }
        if (i4 != 4) {
            return null;
        }
        return TYPE_JOB;
    }

    public static zzbfj zzc() {
        return zzabr.zza;
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
