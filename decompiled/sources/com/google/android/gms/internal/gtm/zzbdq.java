package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbdq implements zzbfh {
    LOG_NONE(0),
    LOG_HEADER_ONLY(1),
    LOG_HEADER_AND_NON_PRIVATE_PAYLOAD_INTERNAL(2),
    LOG_HEADER_AND_FILTERED_PAYLOAD(3),
    LOG_HEADER_AND_PAYLOAD(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbdo
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbdq.zzb(i4);
        }
    };
    private final int zzh;

    zzbdq(int i4) {
        this.zzh = i4;
    }

    public static zzbdq zzb(int i4) {
        if (i4 == 0) {
            return LOG_NONE;
        }
        if (i4 == 1) {
            return LOG_HEADER_ONLY;
        }
        if (i4 == 2) {
            return LOG_HEADER_AND_NON_PRIVATE_PAYLOAD_INTERNAL;
        }
        if (i4 == 3) {
            return LOG_HEADER_AND_FILTERED_PAYLOAD;
        }
        if (i4 != 4) {
            return null;
        }
        return LOG_HEADER_AND_PAYLOAD;
    }

    public static zzbfj zzc() {
        return zzbdp.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzh;
    }
}
