package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzaam implements zzbfh {
    STATUS_UNSPECIFIED(0),
    STATUS_NORMAL(1),
    STATUS_DISPUTED(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaak
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaam.zzb(i4);
        }
    };
    private final int zzf;

    zzaam(int i4) {
        this.zzf = i4;
    }

    public static zzaam zzb(int i4) {
        if (i4 == 0) {
            return STATUS_UNSPECIFIED;
        }
        if (i4 == 1) {
            return STATUS_NORMAL;
        }
        if (i4 != 2) {
            return null;
        }
        return STATUS_DISPUTED;
    }

    public static zzbfj zzc() {
        return zzaal.zza;
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
