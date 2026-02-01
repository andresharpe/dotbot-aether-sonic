package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzawi extends zzbff implements zzbgt {
    private static final zzawi zza;
    private int zzb;
    private int zzf = 3;
    private int zzg;

    static {
        zzawi zzawiVar = new zzawi();
        zza = zzawiVar;
        zzbff.zzan(zzawi.class, zzawiVar);
    }

    private zzawi() {
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
                    return new zzawb(null);
                }
                return new zzawi();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", zzawh.zzc(), "zzg", zzawe.zzc()});
        }
        return (byte) 1;
    }
}
