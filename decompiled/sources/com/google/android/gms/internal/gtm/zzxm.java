package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzxm extends zzbff implements zzbgt {
    private static final zzxm zza;
    private int zzb;
    private int zzf;
    private zzxs zzg;

    static {
        zzxm zzxmVar = new zzxm();
        zza = zzxmVar;
        zzbff.zzan(zzxm.class, zzxmVar);
    }

    private zzxm() {
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
                    return new zzxl(null);
                }
                return new zzxm();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zzf", zzbki.zzb(), "zzg"});
        }
        return (byte) 1;
    }
}
