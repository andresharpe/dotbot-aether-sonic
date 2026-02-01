package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbun extends zzbff implements zzbgt {
    private static final zzbun zza;
    private int zzb;
    private String zzf = "";
    private int zzg;

    static {
        zzbun zzbunVar = new zzbun();
        zza = zzbunVar;
        zzbff.zzan(zzbun.class, zzbunVar);
    }

    private zzbun() {
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
                    return new zzbuj(null);
                }
                return new zzbun();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzbum.zzb()});
        }
        return (byte) 1;
    }
}
