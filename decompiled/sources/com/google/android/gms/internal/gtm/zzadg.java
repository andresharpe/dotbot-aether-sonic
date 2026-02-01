package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzadg extends zzbff implements zzbgt {
    private static final zzadg zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzadg zzadgVar = new zzadg();
        zza = zzadgVar;
        zzbff.zzan(zzadg.class, zzadgVar);
    }

    private zzadg() {
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
                    return new zzadf(null);
                }
                return new zzadg();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"zzb", zzaee.class});
        }
        return (byte) 1;
    }
}
