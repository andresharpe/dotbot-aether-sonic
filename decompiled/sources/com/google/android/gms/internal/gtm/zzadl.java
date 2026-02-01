package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzadl implements zzbfh {
    SPICINESS_NONE(0),
    SPICINESS_MILD(1),
    SPICINESS_MEDIUM(2),
    SPICINESS_HOT(3);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzadj
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzadl.zzb(i4);
        }
    };
    private final int zzg;

    zzadl(int i4) {
        this.zzg = i4;
    }

    public static zzadl zzb(int i4) {
        if (i4 == 0) {
            return SPICINESS_NONE;
        }
        if (i4 == 1) {
            return SPICINESS_MILD;
        }
        if (i4 == 2) {
            return SPICINESS_MEDIUM;
        }
        if (i4 != 3) {
            return null;
        }
        return SPICINESS_HOT;
    }

    public static zzbfj zzc() {
        return zzadk.zza;
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
