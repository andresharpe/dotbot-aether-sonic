package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzamd implements zzbfh {
    CLOSED(0),
    MOVED(1),
    REBRANDED(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzamb
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzamd.zzb(i4);
        }
    };
    private final int zzf;

    zzamd(int i4) {
        this.zzf = i4;
    }

    public static zzamd zzb(int i4) {
        if (i4 == 0) {
            return CLOSED;
        }
        if (i4 == 1) {
            return MOVED;
        }
        if (i4 != 2) {
            return null;
        }
        return REBRANDED;
    }

    public static zzbfj zzc() {
        return zzamc.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzf;
    }
}
