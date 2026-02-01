package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvs extends zzbff implements zzbgt {
    private static final zzbvs zza;
    private int zzb;
    private int zzj;
    private int zzk;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";

    static {
        zzbvs zzbvsVar = new zzbvs();
        zza = zzbvsVar;
        zzbff.zzan(zzbvs.class, zzbvsVar);
    }

    private zzbvs() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbte zzbteVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbvr(zzbteVar);
                }
                return new zzbvs();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
