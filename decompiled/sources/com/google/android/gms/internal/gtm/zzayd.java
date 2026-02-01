package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzayd implements zzbfh {
    TYPE_OCCASION(1),
    TYPE_RANGE(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzayb
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzayd.zzb(i4);
        }
    };
    private final int zze;

    zzayd(int i4) {
        this.zze = i4;
    }

    public static zzayd zzb(int i4) {
        if (i4 == 1) {
            return TYPE_OCCASION;
        }
        if (i4 != 2) {
            return null;
        }
        return TYPE_RANGE;
    }

    public static zzbfj zzc() {
        return zzayc.zza;
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
