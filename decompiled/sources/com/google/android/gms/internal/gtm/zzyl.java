package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyl extends zzbff implements zzbgt {
    private static final zzyl zza;
    private int zzb;
    private int zzf;
    private String zzg = "";

    static {
        zzyl zzylVar = new zzyl();
        zza = zzylVar;
        zzbff.zzan(zzyl.class, zzylVar);
    }

    private zzyl() {
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
                    return new zzyk(null);
                }
                return new zzyl();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", zzaks.zzc(), "zzg"});
        }
        return (byte) 1;
    }
}
