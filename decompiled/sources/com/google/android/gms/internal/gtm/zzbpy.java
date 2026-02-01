package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbpy extends zzbff implements zzbgt {
    private static final zzbpy zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private zzbrh zzh;

    static {
        zzbpy zzbpyVar = new zzbpy();
        zza = zzbpyVar;
        zzbff.zzan(zzbpy.class, zzbpyVar);
    }

    private zzbpy() {
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
                    return new zzbpx(null);
                }
                return new zzbpy();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
