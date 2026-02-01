package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaog implements zzbfh {
    UNKNOWN(0),
    LEFT(1),
    RIGHT(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaoe
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaog.zzb(i4);
        }
    };
    private final int zzf;

    zzaog(int i4) {
        this.zzf = i4;
    }

    public static zzaog zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return LEFT;
        }
        if (i4 != 2) {
            return null;
        }
        return RIGHT;
    }

    public static zzbfj zzc() {
        return zzaof.zza;
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
