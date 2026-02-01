package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbsu extends zzbff implements zzbgt {
    private static final zzbsu zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();
    private zzbhx zzh;
    private zzbhx zzi;
    private int zzj;

    static {
        zzbsu zzbsuVar = new zzbsu();
        zza = zzbsuVar;
        zzbff.zzan(zzbsu.class, zzbsuVar);
    }

    private zzbsu() {
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
                    return new zzbsq(null);
                }
                return new zzbsu();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u001b\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဌ\u0002", new Object[]{"zzb", "zzf", zzbkl.class, "zzg", zzbkl.class, "zzh", "zzi", "zzj", zzbst.zzb()});
        }
        return (byte) 1;
    }
}
