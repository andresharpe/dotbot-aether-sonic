package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbmu extends zzbff implements zzbgt {
    private static final zzbmu zza;
    private int zzb;
    private int zzf;
    private int zzg = 1;
    private int zzh;

    static {
        zzbmu zzbmuVar = new zzbmu();
        zza = zzbmuVar;
        zzbff.zzan(zzbmu.class, zzbmuVar);
    }

    private zzbmu() {
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
                    return new zzbmt(null);
                }
                return new zzbmu();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zzf", zzbqw.zzb(), "zzg", zzbqt.zzb(), "zzh", zzbmx.zzb()});
        }
        return (byte) 1;
    }
}
