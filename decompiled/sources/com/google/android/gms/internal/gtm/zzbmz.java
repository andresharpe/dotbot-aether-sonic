package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbmz extends zzbff implements zzbgt {
    private static final zzbmz zza;
    private int zzb;
    private int zzg;
    private int zzi;
    private zzbng zzj;
    private int zzk;
    private int zzf = 1;
    private zzbbw zzh = zzbbw.zzb;

    static {
        zzbmz zzbmzVar = new zzbmz();
        zza = zzbmzVar;
        zzbff.zzan(zzbmz.class, zzbmzVar);
    }

    private zzbmz() {
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
                    return new zzbmy(null);
                }
                return new zzbmz();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzb", "zzf", zzbqt.zzb(), "zzg", zzbqw.zzb(), "zzh", "zzi", zzbrf.zzb(), "zzj", "zzk", zzbqq.zzb()});
        }
        return (byte) 1;
    }
}
