package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzach extends zzbff implements zzbgt {
    private static final zzach zza;
    private int zzb;
    private double zzf;
    private double zzg;
    private int zzh;

    static {
        zzach zzachVar = new zzach();
        zza = zzachVar;
        zzbff.zzan(zzach.class, zzachVar);
    }

    private zzach() {
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
                    return new zzacg(null);
                }
                return new zzach();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh", zzacf.zzc()});
        }
        return (byte) 1;
    }
}
