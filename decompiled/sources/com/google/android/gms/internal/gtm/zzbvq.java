package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvq extends zzbff implements zzbgt {
    private static final zzbvq zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzbvq zzbvqVar = new zzbvq();
        zza = zzbvqVar;
        zzbff.zzan(zzbvq.class, zzbvqVar);
    }

    private zzbvq() {
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
                    return new zzbvp(zzbteVar);
                }
                return new zzbvq();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzf", "zzh", "zzg", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
