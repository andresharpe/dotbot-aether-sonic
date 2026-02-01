package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzain implements zzbfh {
    TYPE_PRIMARY(1),
    TYPE_SECONDARY(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzail
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzain.zzb(i4);
        }
    };
    private final int zze;

    zzain(int i4) {
        this.zze = i4;
    }

    public static zzain zzb(int i4) {
        if (i4 == 1) {
            return TYPE_PRIMARY;
        }
        if (i4 != 2) {
            return null;
        }
        return TYPE_SECONDARY;
    }

    public static zzbfj zzc() {
        return zzaim.zza;
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
