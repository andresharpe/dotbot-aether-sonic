package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyj extends zzbff implements zzbgt {
    private static final zzyj zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzyj zzyjVar = new zzyj();
        zza = zzyjVar;
        zzbff.zzan(zzyj.class, zzyjVar);
    }

    private zzyj() {
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
                    return new zzyg(null);
                }
                return new zzyj();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzyi.class});
        }
        return (byte) 1;
    }
}
