package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbko extends zzbff implements zzbgt {
    private static final zzbko zza;
    private int zzb;
    private boolean zzf;

    static {
        zzbko zzbkoVar = new zzbko();
        zza = zzbkoVar;
        zzbff.zzan(zzbko.class, zzbkoVar);
    }

    private zzbko() {
    }

    public static zzbko zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbkm zzbkmVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbkn(zzbkmVar);
                }
                return new zzbko();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
