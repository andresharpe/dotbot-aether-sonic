package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbqe extends zzbff implements zzbgt {
    private static final zzbqe zza;
    private int zzb;
    private int zzf;
    private int zzg;

    static {
        zzbqe zzbqeVar = new zzbqe();
        zza = zzbqeVar;
        zzbff.zzan(zzbqe.class, zzbqeVar);
    }

    private zzbqe() {
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
                    return new zzbqd(null);
                }
                return new zzbqe();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzbrf.zzb()});
        }
        return (byte) 1;
    }
}
