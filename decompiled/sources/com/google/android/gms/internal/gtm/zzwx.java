package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzwx extends zzbff implements zzbgt {
    private static final zzwx zza;
    private int zzb;
    private int zzf;
    private int zzg;

    static {
        zzwx zzwxVar = new zzwx();
        zza = zzwxVar;
        zzbff.zzan(zzwx.class, zzwxVar);
    }

    private zzwx() {
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
                    return new zzww(null);
                }
                return new zzwx();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzb", "zzf", zzbki.zzb(), "zzg"});
        }
        return (byte) 1;
    }
}
