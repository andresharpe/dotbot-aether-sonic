package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazk extends zzbff implements zzbgt {
    private static final zzazk zza;
    private int zzb;
    private int zzf = 0;
    private Object zzg;
    private int zzh;

    static {
        zzazk zzazkVar = new zzazk();
        zza = zzazkVar;
        zzbff.zzan(zzazk.class, zzazkVar);
    }

    private zzazk() {
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
                    return new zzazj(null);
                }
                return new zzazk();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000\u0003ံ\u0000\u0004ျ\u0000", new Object[]{"zzg", "zzf", "zzb", "zzh", zzazh.zzc()});
        }
        return (byte) 1;
    }
}
