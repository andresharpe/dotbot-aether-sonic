package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzwf extends zzbff implements zzbgt {
    private static final zzwf zza;
    private int zzb;
    private String zzf = "";

    static {
        zzwf zzwfVar = new zzwf();
        zza = zzwfVar;
        zzbff.zzan(zzwf.class, zzwfVar);
    }

    private zzwf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzwd zzwdVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzwe(zzwdVar);
                }
                return new zzwf();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
