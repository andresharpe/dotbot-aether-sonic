package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbkl extends zzbff implements zzbgt {
    private static final zzbkl zza;
    private zzbfp zzb = zzbff.zzaj();
    private int zzf;

    static {
        zzbkl zzbklVar = new zzbkl();
        zza = zzbklVar;
        zzbff.zzan(zzbkl.class, zzbklVar);
    }

    private zzbkl() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbkj zzbkjVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbkk(zzbkjVar);
                }
                return new zzbkl();
            }
            return zzbff.zzam(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
