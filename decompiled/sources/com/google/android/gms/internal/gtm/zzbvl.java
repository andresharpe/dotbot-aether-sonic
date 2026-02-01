package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvl extends zzbff implements zzbgt {
    private static final zzbvl zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";

    static {
        zzbvl zzbvlVar = new zzbvl();
        zza = zzbvlVar;
        zzbff.zzan(zzbvl.class, zzbvlVar);
    }

    private zzbvl() {
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
                    return new zzbvk(zzbteVar);
                }
                return new zzbvl();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
