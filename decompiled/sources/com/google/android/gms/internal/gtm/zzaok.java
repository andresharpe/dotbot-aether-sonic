package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaok extends zzbff implements zzbgt {
    private static final zzaok zza;
    private int zzb;
    private zzagq zzf;

    static {
        zzaok zzaokVar = new zzaok();
        zza = zzaokVar;
        zzbff.zzan(zzaok.class, zzaokVar);
    }

    private zzaok() {
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
                    return new zzaoj(null);
                }
                return new zzaok();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
