package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtu extends zzbff implements zzbgt {
    private static final zzbtu zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;
    private zzbtt zzj;
    private int zzk;

    static {
        zzbtu zzbtuVar = new zzbtu();
        zza = zzbtuVar;
        zzbff.zzan(zzbtu.class, zzbtuVar);
    }

    private zzbtu() {
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
                    return new zzbtr(null);
                }
                return new zzbtu();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0003\u0003ဉ\u0004\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဌ\u0005", new Object[]{"zzb", "zzf", "zzi", zzbtn.zzb(), "zzj", "zzg", "zzh", "zzk", zzbtq.zzb()});
        }
        return (byte) 1;
    }
}
