package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagk extends zzbff implements zzbgt {
    private static final zzagk zza;
    private int zzb;
    private String zzf = "";
    private zzana zzg;

    static {
        zzagk zzagkVar = new zzagk();
        zza = zzagkVar;
        zzbff.zzan(zzagk.class, zzagkVar);
    }

    private zzagk() {
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
                    return new zzagj(null);
                }
                return new zzagk();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001Ǵ\u0002\u0000\u0000\u0000\u0001ဈ\u0000Ǵဉ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
