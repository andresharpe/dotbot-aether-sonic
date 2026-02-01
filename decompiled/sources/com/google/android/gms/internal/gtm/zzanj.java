package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzanj implements zzbfh {
    HTML_DESCRIPTION(17);

    private static final zzbfi zzb = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzanh
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzanj.zzb(i4);
        }
    };
    private final int zzd = 17;

    zzanj(int i4) {
    }

    public static zzanj zzb(int i4) {
        if (i4 != 17) {
            return null;
        }
        return HTML_DESCRIPTION;
    }

    public static zzbfj zzc() {
        return zzani.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzd;
    }
}
