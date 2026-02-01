package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzara extends zzbff implements zzbgt {
    private static final zzara zza;
    private int zzb;
    private zzazk zzf;
    private int zzg;

    static {
        zzara zzaraVar = new zzara();
        zza = zzaraVar;
        zzbff.zzan(zzara.class, zzaraVar);
    }

    private zzara() {
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
                    return new zzaqz(null);
                }
                return new zzara();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzael.zzc()});
        }
        return (byte) 1;
    }
}
