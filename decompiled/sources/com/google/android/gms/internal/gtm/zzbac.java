package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbac extends zzbff implements zzbgt {
    private static final zzbac zza;
    private int zzb;
    private String zzf = "";
    private int zzg;
    private zzana zzh;

    static {
        zzbac zzbacVar = new zzbac();
        zza = zzbacVar;
        zzbff.zzan(zzbac.class, zzbacVar);
    }

    private zzbac() {
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
                    return new zzazy(null);
                }
                return new zzbac();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001Ǵ\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001Ǵဉ\u0002", new Object[]{"zzb", "zzf", "zzg", zzbab.zzc(), "zzh"});
        }
        return (byte) 1;
    }
}
