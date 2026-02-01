package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzank extends zzbff implements zzbgt {
    private static final zzank zza;
    private int zzb;
    private int zzf = 17;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzank zzankVar = new zzank();
        zza = zzankVar;
        zzbff.zzan(zzank.class, zzankVar);
    }

    private zzank() {
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
                    return new zzang(null);
                }
                return new zzank();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzb", "zzf", zzanj.zzc(), "zzg", zzapd.class});
        }
        return (byte) 1;
    }
}
