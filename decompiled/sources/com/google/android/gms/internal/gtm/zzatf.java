package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzatf extends zzbff implements zzbgt {
    private static final zzatf zza;
    private int zzb;
    private int zzf;

    static {
        zzatf zzatfVar = new zzatf();
        zza = zzatfVar;
        zzbff.zzan(zzatf.class, zzatfVar);
    }

    private zzatf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzatd zzatdVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzate(zzatdVar);
                }
                return new zzatf();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
