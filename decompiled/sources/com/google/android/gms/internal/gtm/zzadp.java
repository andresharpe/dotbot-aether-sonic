package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzadp extends zzbff implements zzbgt {
    private static final zzadp zza;
    private int zzb;
    private zzbem zzh;
    private String zzf = "";
    private zzbfp zzg = zzbff.zzaj();
    private String zzi = "";

    static {
        zzadp zzadpVar = new zzadp();
        zza = zzadpVar;
        zzbff.zzan(zzadp.class, zzadpVar);
    }

    private zzadp() {
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
                    return new zzado(null);
                }
                return new zzadp();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zzf", "zzg", zzadr.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
