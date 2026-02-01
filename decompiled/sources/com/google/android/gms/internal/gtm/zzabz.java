package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzabz extends zzbff implements zzbgt {
    private static final zzabz zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzabz zzabzVar = new zzabz();
        zza = zzabzVar;
        zzbff.zzan(zzabz.class, zzabzVar);
    }

    private zzabz() {
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
                    return new zzaby(null);
                }
                return new zzabz();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh", zzacc.zzc()});
        }
        return (byte) 1;
    }
}
