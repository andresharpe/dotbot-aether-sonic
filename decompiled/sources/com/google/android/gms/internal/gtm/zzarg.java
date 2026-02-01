package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzarg extends zzbff implements zzbgt {
    private static final zzarg zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private int zzg;

    static {
        zzarg zzargVar = new zzarg();
        zza = zzargVar;
        zzbff.zzan(zzarg.class, zzargVar);
    }

    private zzarg() {
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
                    return new zzarc(null);
                }
                return new zzarg();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\r\u0010\u0002\u0000\u0001\u0000\r\u001b\u0010ဌ\u0000", new Object[]{"zzb", "zzf", zzarm.class, "zzg", zzarf.zzc()});
        }
        return (byte) 1;
    }
}
