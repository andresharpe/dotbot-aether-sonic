package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzadv implements zzbfh {
    MEDIA_FORMAT_UNSPECIFIED(0),
    MEDIA_FORMAT_PHOTO(1);

    private static final zzbfi zzc = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzadt
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzadv.zzb(i4);
        }
    };
    private final int zze;

    zzadv(int i4) {
        this.zze = i4;
    }

    public static zzadv zzb(int i4) {
        if (i4 == 0) {
            return MEDIA_FORMAT_UNSPECIFIED;
        }
        if (i4 != 1) {
            return null;
        }
        return MEDIA_FORMAT_PHOTO;
    }

    public static zzbfj zzc() {
        return zzadu.zza;
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
