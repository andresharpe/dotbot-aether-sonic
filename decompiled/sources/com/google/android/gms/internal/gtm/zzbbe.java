package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbbe extends zzbff implements zzbgt {
    private static final zzbbe zza;
    private String zzb = "";
    private zzbbw zzf = zzbbw.zzb;

    static {
        zzbbe zzbbeVar = new zzbbe();
        zza = zzbbeVar;
        zzbff.zzan(zzbbe.class, zzbbeVar);
    }

    private zzbbe() {
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
                    return new zzbbd(null);
                }
                return new zzbbe();
            }
            return new zzbhd(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
