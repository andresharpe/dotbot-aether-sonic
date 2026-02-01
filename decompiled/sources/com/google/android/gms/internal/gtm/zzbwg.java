package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbwg extends zzbff implements zzbgt {
    private static final zzbwg zza;
    private int zzb;
    private int zzf;

    static {
        zzbwg zzbwgVar = new zzbwg();
        zza = zzbwgVar;
        zzbff.zzan(zzbwg.class, zzbwgVar);
    }

    private zzbwg() {
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
                    return new zzbwc(null);
                }
                return new zzbwg();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zzf", zzbwf.zzb()});
        }
        return (byte) 1;
    }
}
