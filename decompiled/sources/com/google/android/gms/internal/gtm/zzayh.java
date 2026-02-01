package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzayh extends zzbff implements zzbgt {
    private static final zzayh zza;
    private int zzb;
    private boolean zzg;
    private zzaxz zzi;
    private zzaxz zzj;
    private int zzf = 1;
    private int zzh = 1;

    static {
        zzayh zzayhVar = new zzayh();
        zza = zzayhVar;
        zzbff.zzan(zzayh.class, zzayhVar);
    }

    private zzayh() {
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
                    return new zzaya(null);
                }
                return new zzayh();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"zzb", "zzf", zzayd.zzc(), "zzg", "zzh", zzayg.zzc(), "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
