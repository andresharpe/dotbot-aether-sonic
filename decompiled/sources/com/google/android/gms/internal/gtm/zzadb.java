package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzadb implements zzbfh {
    DIET_HALAL(0),
    DIET_KOSHER(1),
    DIET_ORGANIC(2),
    DIET_VEGAN(3),
    DIET_VEGETARIAN(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzacz
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzadb.zzb(i4);
        }
    };
    private final int zzh;

    zzadb(int i4) {
        this.zzh = i4;
    }

    public static zzadb zzb(int i4) {
        if (i4 == 0) {
            return DIET_HALAL;
        }
        if (i4 == 1) {
            return DIET_KOSHER;
        }
        if (i4 == 2) {
            return DIET_ORGANIC;
        }
        if (i4 == 3) {
            return DIET_VEGAN;
        }
        if (i4 != 4) {
            return null;
        }
        return DIET_VEGETARIAN;
    }

    public static zzbfj zzc() {
        return zzada.zza;
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
