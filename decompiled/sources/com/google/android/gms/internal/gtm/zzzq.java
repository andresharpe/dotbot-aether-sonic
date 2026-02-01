package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzzq extends zzbff implements zzbgt {
    private static final zzzq zza;
    private int zzb;
    private zzaaa zzh;
    private int zzf = 1;
    private int zzg = 1;
    private zzbfp zzi = zzbff.zzaj();

    static {
        zzzq zzzqVar = new zzzq();
        zza = zzzqVar;
        zzbff.zzan(zzzq.class, zzzqVar);
    }

    private zzzq() {
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
                    return new zzzm(null);
                }
                return new zzzq();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zzb", "zzf", zzzp.zzc(), "zzg", zzzl.zzc(), "zzi", zzzz.class, "zzh"});
        }
        return (byte) 1;
    }
}
