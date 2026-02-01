package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzavb implements zzbfh {
    PRIORITY_UNKNOWN(0),
    PRIORITY_NON_TRAFFIC(16),
    PRIORITY_TERMINAL(32),
    PRIORITY_LOCAL(48),
    PRIORITY_MINOR_ARTERIAL(64),
    PRIORITY_MAJOR_ARTERIAL(80),
    PRIORITY_SECONDARY_ROAD(96),
    PRIORITY_PRIMARY_HIGHWAY(112),
    PRIORITY_LIMITED_ACCESS(128),
    PRIORITY_CONTROLLED_ACCESS(144);

    private static final zzbfi zzk = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzauz
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzavb.zzb(i4);
        }
    };
    private final int zzm;

    zzavb(int i4) {
        this.zzm = i4;
    }

    public static zzavb zzb(int i4) {
        if (i4 == 0) {
            return PRIORITY_UNKNOWN;
        }
        if (i4 == 16) {
            return PRIORITY_NON_TRAFFIC;
        }
        if (i4 == 32) {
            return PRIORITY_TERMINAL;
        }
        if (i4 == 48) {
            return PRIORITY_LOCAL;
        }
        if (i4 == 64) {
            return PRIORITY_MINOR_ARTERIAL;
        }
        if (i4 == 80) {
            return PRIORITY_MAJOR_ARTERIAL;
        }
        if (i4 == 96) {
            return PRIORITY_SECONDARY_ROAD;
        }
        if (i4 == 112) {
            return PRIORITY_PRIMARY_HIGHWAY;
        }
        if (i4 == 128) {
            return PRIORITY_LIMITED_ACCESS;
        }
        if (i4 != 144) {
            return null;
        }
        return PRIORITY_CONTROLLED_ACCESS;
    }

    public static zzbfj zzc() {
        return zzava.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzm;
    }
}
