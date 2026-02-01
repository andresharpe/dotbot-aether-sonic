package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzxb extends zzbff implements zzbgt {
    private static final zzxb zza;
    private int zzb;
    private double zzf;
    private double zzg;

    static {
        zzxb zzxbVar = new zzxb();
        zza = zzxbVar;
        zzbff.zzan(zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzwy zzwyVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzxa(zzwyVar);
                }
                return new zzxb();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
