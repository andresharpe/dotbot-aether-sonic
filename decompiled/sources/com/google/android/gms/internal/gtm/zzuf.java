package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzuf extends zzbff implements zzbgt {
    private static final zzuf zza;
    private String zzb = "";
    private zzbbw zzf = zzbbw.zzb;
    private int zzg;

    static {
        zzuf zzufVar = new zzuf();
        zza = zzufVar;
        zzbff.zzan(zzuf.class, zzufVar);
    }

    private zzuf() {
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
                    return new zzue(null);
                }
                return new zzuf();
            }
            return zzbff.zzam(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
