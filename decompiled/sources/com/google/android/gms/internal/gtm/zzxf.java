package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzxf extends zzbff implements zzbgt {
    private static final zzxf zza;
    private int zzb;
    private double zzf;

    static {
        zzxf zzxfVar = new zzxf();
        zza = zzxfVar;
        zzbff.zzan(zzxf.class, zzxfVar);
    }

    private zzxf() {
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
                    return new zzxe(zzwyVar);
                }
                return new zzxf();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
