package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzajk implements zzbfh {
    ITEMCLASS(1),
    ATTRIBUTE(2),
    VALUESPACE(3),
    DATASTORE(4);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaji
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzajk.zzb(i4);
        }
    };
    private final int zzg;

    zzajk(int i4) {
        this.zzg = i4;
    }

    public static zzajk zzb(int i4) {
        if (i4 == 1) {
            return ITEMCLASS;
        }
        if (i4 == 2) {
            return ATTRIBUTE;
        }
        if (i4 == 3) {
            return VALUESPACE;
        }
        if (i4 != 4) {
            return null;
        }
        return DATASTORE;
    }

    public static zzbfj zzc() {
        return zzajj.zza;
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
