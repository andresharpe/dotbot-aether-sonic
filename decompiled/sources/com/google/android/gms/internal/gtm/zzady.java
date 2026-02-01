package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzady extends zzbff implements zzbgt {
    private static final zzady zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private zzadx zzh;
    private int zzi;

    static {
        zzady zzadyVar = new zzady();
        zza = zzadyVar;
        zzbff.zzan(zzady.class, zzadyVar);
    }

    private zzady() {
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
                    return new zzads(null);
                }
                return new zzady();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဌ\u0003\u0004ဈ\u0001", new Object[]{"zzb", "zzf", "zzh", "zzi", zzadv.zzc(), "zzg"});
        }
        return (byte) 1;
    }
}
