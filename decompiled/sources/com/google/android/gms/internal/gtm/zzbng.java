package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbng extends zzbff implements zzbgt {
    private static final zzbng zza;
    private int zzb;
    private int zzf;
    private zzbnb zzg;
    private zzbmq zzh;
    private zzbmu zzi;
    private zzbmz zzj;
    private zzbms zzk;

    static {
        zzbng zzbngVar = new zzbng();
        zza = zzbngVar;
        zzbff.zzan(zzbng.class, zzbngVar);
    }

    private zzbng() {
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
                    return new zzbnf(null);
                }
                return new zzbng();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zzf", zzbne.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
