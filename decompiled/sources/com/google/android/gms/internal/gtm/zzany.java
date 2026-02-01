package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzany implements zzbfh {
    GROUP_ARTIFACT(1),
    GROUP_LOGICAL(2);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzanw
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzany.zzb(i4);
        }
    };
    private final int zze;

    zzany(int i4) {
        this.zze = i4;
    }

    public static zzany zzb(int i4) {
        if (i4 == 1) {
            return GROUP_ARTIFACT;
        }
        if (i4 != 2) {
            return null;
        }
        return GROUP_LOGICAL;
    }

    public static zzbfj zzc() {
        return zzanx.zza;
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
