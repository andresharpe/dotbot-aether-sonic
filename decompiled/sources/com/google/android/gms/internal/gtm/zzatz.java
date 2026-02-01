package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzatz implements zzbfh {
    BARRIER_NONE(1),
    BARRIER_PRESENT(2),
    BARRIER_LEGAL(33),
    BARRIER_PHYSICAL(34);

    private static final zzbfi zze = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzatx
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzatz.zzb(i4);
        }
    };
    private final int zzg;

    zzatz(int i4) {
        this.zzg = i4;
    }

    public static zzatz zzb(int i4) {
        if (i4 == 1) {
            return BARRIER_NONE;
        }
        if (i4 == 2) {
            return BARRIER_PRESENT;
        }
        if (i4 == 33) {
            return BARRIER_LEGAL;
        }
        if (i4 != 34) {
            return null;
        }
        return BARRIER_PHYSICAL;
    }

    public static zzbfj zzc() {
        return zzaty.zza;
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
