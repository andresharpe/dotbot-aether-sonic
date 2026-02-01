package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbms extends zzbff implements zzbgt {
    private static final zzbms zza;
    private int zzb;
    private int zzf;

    static {
        zzbms zzbmsVar = new zzbms();
        zza = zzbmsVar;
        zzbff.zzan(zzbms.class, zzbmsVar);
    }

    private zzbms() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbmo zzbmoVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbmr(zzbmoVar);
                }
                return new zzbms();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
