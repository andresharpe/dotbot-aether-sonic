package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzzz extends zzbff implements zzbgt {
    private static final zzzz zza;
    private int zzb;
    private int zzf = 1;

    static {
        zzzz zzzzVar = new zzzz();
        zza = zzzzVar;
        zzbff.zzan(zzzz.class, zzzzVar);
    }

    private zzzz() {
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
                    return new zzzv(null);
                }
                return new zzzz();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zzf", zzzy.zzc()});
        }
        return (byte) 1;
    }
}
