package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbom extends zzbff implements zzbgt {
    private static final zzbom zza;
    private int zzb;
    private long zzf;
    private int zzg;

    static {
        zzbom zzbomVar = new zzbom();
        zza = zzbomVar;
        zzbff.zzan(zzbom.class, zzbomVar);
    }

    private zzbom() {
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
                    return new zzboi(null);
                }
                return new zzbom();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzbol.zzb()});
        }
        return (byte) 1;
    }
}
