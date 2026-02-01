package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzarm extends zzbff implements zzbgt {
    private static final zzarm zza;
    private int zzb;
    private int zzf;
    private float zzg;
    private float zzh;
    private String zzi = "";
    private zzana zzj;

    static {
        zzarm zzarmVar = new zzarm();
        zza = zzarmVar;
        zzbff.zzan(zzarm.class, zzarmVar);
    }

    private zzarm() {
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
                    return new zzari(null);
                }
                return new zzarm();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001Ǵ\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0004ခ\u0002\u0005ဈ\u0003Ǵဉ\u0004", new Object[]{"zzb", "zzf", zzarl.zzc(), "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
