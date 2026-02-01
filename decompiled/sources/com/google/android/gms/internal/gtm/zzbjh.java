package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbjh implements zzbfh {
    PR_ALL_RESTRICTED(0),
    PR_CONTAINS_NON_RESTRICTED(1),
    PR_CONTAINS_SERIALIZED_NON_RESTRICTED(2);

    private static final zzbfi zzd = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbjg
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbjh.zzc(i4);
        }
    };
    private final int zzf;

    zzbjh(int i4) {
        this.zzf = i4;
    }

    public static zzbfi zzb() {
        return zzd;
    }

    public static zzbjh zzc(int i4) {
        if (i4 == 0) {
            return PR_ALL_RESTRICTED;
        }
        if (i4 == 1) {
            return PR_CONTAINS_NON_RESTRICTED;
        }
        if (i4 != 2) {
            return null;
        }
        return PR_CONTAINS_SERIALIZED_NON_RESTRICTED;
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
