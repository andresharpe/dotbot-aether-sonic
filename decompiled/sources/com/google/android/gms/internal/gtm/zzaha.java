package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaha implements zzbfh {
    UNKNOWN(0),
    BLOCKED(16),
    NOT_TRUSTED(32),
    YP_FEEDS(40),
    TRUSTED(48),
    SUPER_TRUSTED(64);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzagy
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaha.zzb(i4);
        }
    };
    private final int zzi;

    zzaha(int i4) {
        this.zzi = i4;
    }

    public static zzaha zzb(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 16) {
            return BLOCKED;
        }
        if (i4 == 32) {
            return NOT_TRUSTED;
        }
        if (i4 == 40) {
            return YP_FEEDS;
        }
        if (i4 == 48) {
            return TRUSTED;
        }
        if (i4 != 64) {
            return null;
        }
        return SUPER_TRUSTED;
    }

    public static zzbfj zzc() {
        return zzagz.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzi;
    }
}
