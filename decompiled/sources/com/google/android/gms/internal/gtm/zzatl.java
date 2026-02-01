package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzatl extends zzbff implements zzbgt {
    private static final zzatl zza;
    private int zzb;
    private int zzf;

    static {
        zzatl zzatlVar = new zzatl();
        zza = zzatlVar;
        zzbff.zzan(zzatl.class, zzatlVar);
    }

    private zzatl() {
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
                    return new zzath(null);
                }
                return new zzatl();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zzf", zzatk.zzc()});
        }
        return (byte) 1;
    }
}
