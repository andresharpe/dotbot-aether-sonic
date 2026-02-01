package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzbwk implements zzbfh {
    UNKNOWN(0),
    ANDROID_CARDBOARD_SDK(1),
    IOS_CARDBOARD_SDK(2),
    ANDROID_UNITY_SDK(3),
    IOS_UNITY_SDK(4),
    WINDOWS(5);

    private static final zzbfi zzg = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzbwi
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzbwk.zzc(i4);
        }
    };
    private final int zzi;

    zzbwk(int i4) {
        this.zzi = i4;
    }

    public static zzbfj zzb() {
        return zzbwj.zza;
    }

    public static zzbwk zzc(int i4) {
        if (i4 == 0) {
            return UNKNOWN;
        }
        if (i4 == 1) {
            return ANDROID_CARDBOARD_SDK;
        }
        if (i4 == 2) {
            return IOS_CARDBOARD_SDK;
        }
        if (i4 == 3) {
            return ANDROID_UNITY_SDK;
        }
        if (i4 == 4) {
            return IOS_UNITY_SDK;
        }
        if (i4 != 5) {
            return null;
        }
        return WINDOWS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzi;
    }
}
