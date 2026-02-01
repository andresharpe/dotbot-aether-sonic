package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzatb implements zzbfh {
    TYPE_TEXT(1);

    private static final zzbfi zzb = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzasz
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzatb.zzb(i4);
        }
    };
    private final int zzd = 1;

    zzatb(int i4) {
    }

    public static zzatb zzb(int i4) {
        if (i4 != 1) {
            return null;
        }
        return TYPE_TEXT;
    }

    public static zzbfj zzc() {
        return zzata.zza;
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
