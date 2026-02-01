package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazw extends zzbff implements zzbgt {
    private static final zzazw zza;
    private int zzb;
    private zzbac zzf;
    private boolean zzg;

    static {
        zzazw zzazwVar = new zzazw();
        zza = zzazwVar;
        zzbff.zzan(zzazw.class, zzazwVar);
    }

    private zzazw() {
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
                    return new zzazv(null);
                }
                return new zzazw();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
