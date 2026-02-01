package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzux extends zzbff implements zzbgt {
    private static final zzux zza;
    private int zzb;
    private Object zzg;
    private int zzf = 0;
    private int zzh = 3;

    static {
        zzux zzuxVar = new zzux();
        zza = zzuxVar;
        zzbff.zzan(zzux.class, zzuxVar);
    }

    private zzux() {
    }

    public static zzux zzc() {
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
                    return new zzuw(null);
                }
                return new zzux();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001်\u0000\u0002်\u0000\u0003ဿ\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဌ\u0006", new Object[]{"zzg", "zzf", "zzb", zzvc.zzc(), zzuz.class, "zzh", zzuv.zzc()});
        }
        return (byte) 1;
    }
}
