package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzwl extends zzbff implements zzbgt {
    private static final zzwl zza;
    private int zzb;
    private zzafq zzf;
    private int zzg;

    static {
        zzwl zzwlVar = new zzwl();
        zza = zzwlVar;
        zzbff.zzan(zzwl.class, zzwlVar);
    }

    private zzwl() {
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
                    return new zzwh(null);
                }
                return new zzwl();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzwk.zzc()});
        }
        return (byte) 1;
    }
}
