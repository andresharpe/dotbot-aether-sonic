package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvx extends zzbff implements zzbgt {
    private static final zzbvx zza;
    private int zzb;
    private int zzg;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzbvx zzbvxVar = new zzbvx();
        zza = zzbvxVar;
        zzbff.zzan(zzbvx.class, zzbvxVar);
    }

    private zzbvx() {
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
                    return new zzbvt(null);
                }
                return new zzbvx();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzf", "zzg", zzbvw.zzb(), "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
