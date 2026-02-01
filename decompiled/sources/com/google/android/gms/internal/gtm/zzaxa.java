package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaxa implements zzbfh {
    VOICE(0),
    FAX(1),
    TDD(2),
    DATA(3),
    MOBILE(4),
    MESSAGING(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzawy
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaxa.zzb(i4);
        }
    };
    private final int zzi;

    zzaxa(int i4) {
        this.zzi = i4;
    }

    public static zzaxa zzb(int i4) {
        if (i4 == 0) {
            return VOICE;
        }
        if (i4 == 1) {
            return FAX;
        }
        if (i4 == 2) {
            return TDD;
        }
        if (i4 == 3) {
            return DATA;
        }
        if (i4 == 4) {
            return MOBILE;
        }
        if (i4 != 5) {
            return null;
        }
        return MESSAGING;
    }

    public static zzbfj zzc() {
        return zzawz.zza;
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
