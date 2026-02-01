package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zztk extends zzbff implements zzbgt {
    private static final zztk zza;
    private int zzb;
    private int zzf = 1;
    private int zzg;

    static {
        zztk zztkVar = new zztk();
        zza = zztkVar;
        zzbff.zzan(zztk.class, zztkVar);
    }

    private zztk() {
    }

    public static zztk zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzte zzteVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zztj(zzteVar);
                }
                return new zztk();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
