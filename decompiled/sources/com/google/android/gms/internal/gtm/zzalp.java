package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzalp implements zzbfh {
    ENTER_AND_EXIT(0),
    ENTER_ONLY(1),
    EXIT_ONLY(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaln
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzalp.zzb(i4);
        }
    };
    private final int zzf;

    zzalp(int i4) {
        this.zzf = i4;
    }

    public static zzalp zzb(int i4) {
        if (i4 == 0) {
            return ENTER_AND_EXIT;
        }
        if (i4 == 1) {
            return ENTER_ONLY;
        }
        if (i4 != 2) {
            return null;
        }
        return EXIT_ONLY;
    }

    public static zzbfj zzc() {
        return zzalo.zza;
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
