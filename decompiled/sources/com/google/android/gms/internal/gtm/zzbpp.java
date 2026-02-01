package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbpp extends zzbff implements zzbgt {
    private static final zzbpp zza;
    private int zzb;
    private int zzf = 1;
    private zzbqn zzg;

    static {
        zzbpp zzbppVar = new zzbpp();
        zza = zzbppVar;
        zzbff.zzan(zzbpp.class, zzbppVar);
    }

    private zzbpp() {
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
                    return new zzbpo(null);
                }
                return new zzbpp();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zzf", zzbqt.zzb(), "zzg"});
        }
        return (byte) 1;
    }
}
