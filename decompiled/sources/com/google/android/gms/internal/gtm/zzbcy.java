package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbcy extends zzbff implements zzbgt {
    private static final zzbcy zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";

    static {
        zzbcy zzbcyVar = new zzbcy();
        zza = zzbcyVar;
        zzbff.zzan(zzbcy.class, zzbcyVar);
    }

    private zzbcy() {
    }

    public static /* synthetic */ zzbcy zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbcx(null);
                }
                return new zzbcy();
            }
            return new zzbhd(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
