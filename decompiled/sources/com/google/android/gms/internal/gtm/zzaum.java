package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaum implements zzbfh {
    CONSTRUCTION_PLANNED(1),
    CONSTRUCTION_STARTED(2),
    CONSTRUCTION_COMPLETE(3),
    CONSTRUCTION_CLOSED_FOR_MAINTENANCE(4),
    CONSTRUCTION_DISTURBED_BY_MAINTENANCE(5);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzauk
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaum.zzb(i4);
        }
    };
    private final int zzh;

    zzaum(int i4) {
        this.zzh = i4;
    }

    public static zzaum zzb(int i4) {
        if (i4 == 1) {
            return CONSTRUCTION_PLANNED;
        }
        if (i4 == 2) {
            return CONSTRUCTION_STARTED;
        }
        if (i4 == 3) {
            return CONSTRUCTION_COMPLETE;
        }
        if (i4 == 4) {
            return CONSTRUCTION_CLOSED_FOR_MAINTENANCE;
        }
        if (i4 != 5) {
            return null;
        }
        return CONSTRUCTION_DISTURBED_BY_MAINTENANCE;
    }

    public static zzbfj zzc() {
        return zzaul.zza;
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
