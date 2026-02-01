package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzalq extends zzbff implements zzbgt {
    private static final zzalq zza;
    private int zzb;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzalq zzalqVar = new zzalq();
        zza = zzalqVar;
        zzbff.zzan(zzalq.class, zzalqVar);
    }

    private zzalq() {
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
                    return new zzalm(null);
                }
                return new zzalq();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0000", new Object[]{"zzb", "zzg", "zzh", "zzf", zzalp.zzc()});
        }
        return (byte) 1;
    }
}
