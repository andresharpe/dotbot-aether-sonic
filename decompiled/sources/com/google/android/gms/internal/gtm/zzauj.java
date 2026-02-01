package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzauj implements zzbfh {
    CONDITION_GOOD(1),
    CONDITION_POOR(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzauh
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzauj.zzb(i4);
        }
    };
    private final int zze;

    zzauj(int i4) {
        this.zze = i4;
    }

    public static zzauj zzb(int i4) {
        if (i4 == 1) {
            return CONDITION_GOOD;
        }
        if (i4 != 2) {
            return null;
        }
        return CONDITION_POOR;
    }

    public static zzbfj zzc() {
        return zzaui.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zze;
    }
}
