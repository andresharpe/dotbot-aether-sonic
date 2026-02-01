package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazt extends zzbff implements zzbgt {
    private static final zzazt zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzazt zzaztVar = new zzazt();
        zza = zzaztVar;
        zzbff.zzan(zzazt.class, zzaztVar);
    }

    private zzazt() {
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
                    return new zzazs(null);
                }
                return new zzazt();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzazw.class});
        }
        return (byte) 1;
    }
}
