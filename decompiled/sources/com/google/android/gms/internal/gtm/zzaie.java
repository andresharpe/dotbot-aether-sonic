package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaie extends zzbff implements zzbgt {
    private static final zzaie zza;
    private int zzb;
    private float zzf;
    private int zzg;

    static {
        zzaie zzaieVar = new zzaie();
        zza = zzaieVar;
        zzbff.zzan(zzaie.class, zzaieVar);
    }

    private zzaie() {
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
                    return new zzaia(null);
                }
                return new zzaie();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzaid.zzc()});
        }
        return (byte) 1;
    }
}
