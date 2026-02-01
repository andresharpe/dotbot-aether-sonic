package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzuq extends zzbff implements zzbgt {
    private static final zzuq zza;
    private int zzb;
    private int zzf = 0;
    private Object zzg;

    static {
        zzuq zzuqVar = new zzuq();
        zza = zzuqVar;
        zzbff.zzan(zzuq.class, zzuqVar);
    }

    private zzuq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzug zzugVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzup(zzugVar);
                }
                return new zzuq();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001်\u0000\u0002ျ\u0000", new Object[]{"zzg", "zzf", "zzb"});
        }
        return (byte) 1;
    }
}
