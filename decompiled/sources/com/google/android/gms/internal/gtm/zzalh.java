package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzalh extends zzbff implements zzbgt {
    private static final zzalh zza;
    private int zzb;
    private double zzf;
    private zzapz zzg;

    static {
        zzalh zzalhVar = new zzalh();
        zza = zzalhVar;
        zzbff.zzan(zzalh.class, zzalhVar);
    }

    private zzalh() {
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
                    return new zzalg(null);
                }
                return new zzalh();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001က\u0000\u0003ဉ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
