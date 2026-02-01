package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zztw extends zzbff implements zzbgt {
    private static final zztw zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zztw zztwVar = new zztw();
        zza = zztwVar;
        zzbff.zzan(zztw.class, zztwVar);
    }

    private zztw() {
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
                    return new zzts(null);
                }
                return new zztw();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"zzb", "zzf", zztv.zzc(), "zzg", zztv.zzc(), "zzh", zztv.zzc(), "zzi", zztv.zzc(), "zzj", zztv.zzc(), "zzk", zztv.zzc(), "zzl", zztv.zzc()});
        }
        return (byte) 1;
    }
}
