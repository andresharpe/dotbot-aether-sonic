package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzzs extends zzbff implements zzbgt {
    private static final zzzs zza;
    private int zzb;
    private zzzu zzf;
    private zzzq zzg;
    private zzze zzh;

    static {
        zzzs zzzsVar = new zzzs();
        zza = zzzsVar;
        zzbff.zzan(zzzs.class, zzzsVar);
    }

    private zzzs() {
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
                    return new zzzr(null);
                }
                return new zzzs();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
