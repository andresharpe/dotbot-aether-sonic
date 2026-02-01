package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtd extends zzbff implements zzbgt {
    private static final zzbtd zza;
    private int zzb;
    private int zzf = 0;
    private Object zzg;

    static {
        zzbtd zzbtdVar = new zzbtd();
        zza = zzbtdVar;
        zzbff.zzan(zzbtd.class, zzbtdVar);
    }

    private zzbtd() {
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
                    return new zzbtc(null);
                }
                return new zzbtd();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"zzg", "zzf", "zzb", zzbsx.class, zzbsz.class, zzbtb.class});
        }
        return (byte) 1;
    }
}
