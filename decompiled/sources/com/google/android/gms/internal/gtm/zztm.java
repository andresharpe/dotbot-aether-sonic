package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zztm extends zzbff implements zzbgt {
    private static final zztm zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zztm zztmVar = new zztm();
        zza = zztmVar;
        zzbff.zzan(zztm.class, zztmVar);
    }

    private zztm() {
    }

    public static zztm zzc() {
        return zza;
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
                    return new zztl(null);
                }
                return new zztm();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zztk.class});
        }
        return (byte) 1;
    }
}
