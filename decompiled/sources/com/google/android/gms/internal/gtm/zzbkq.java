package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbkq extends zzbff implements zzbgt {
    private static final zzbkq zza;
    private int zzb;
    private boolean zzf;
    private zzbks zzg;
    private boolean zzh;

    static {
        zzbkq zzbkqVar = new zzbkq();
        zza = zzbkqVar;
        zzbff.zzan(zzbkq.class, zzbkqVar);
    }

    private zzbkq() {
    }

    public static zzbkq zze() {
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
                    return new zzbkp(null);
                }
                return new zzbkq();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
