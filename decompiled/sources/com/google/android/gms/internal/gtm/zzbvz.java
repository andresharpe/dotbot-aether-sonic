package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvz extends zzbff implements zzbgt {
    private static final zzbvz zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        zzbvz zzbvzVar = new zzbvz();
        zza = zzbvzVar;
        zzbff.zzan(zzbvz.class, zzbvzVar);
    }

    private zzbvz() {
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
                    return new zzbvy(zzbteVar);
                }
                return new zzbvz();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0001\bဈ\u0006", new Object[]{"zzb", "zzf", "zzh", "zzi", "zzj", "zzk", "zzg", "zzl"});
        }
        return (byte) 1;
    }
}
