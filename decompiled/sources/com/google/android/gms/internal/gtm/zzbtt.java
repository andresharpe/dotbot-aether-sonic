package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtt extends zzbff implements zzbgt {
    private static final zzbtt zza;
    private int zzb;
    private boolean zzf;

    static {
        zzbtt zzbttVar = new zzbtt();
        zza = zzbttVar;
        zzbff.zzan(zzbtt.class, zzbttVar);
    }

    private zzbtt() {
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
                    return new zzbts(zzbteVar);
                }
                return new zzbtt();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
