package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagq extends zzbff implements zzbgt {
    private static final zzagq zza;
    private int zzb;
    private int zzf;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzagq zzagqVar = new zzagq();
        zza = zzagqVar;
        zzbff.zzan(zzagq.class, zzagqVar);
    }

    private zzagq() {
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
                    return new zzagp(null);
                }
                return new zzagq();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"zzb", "zzf", "zzg", zzabp.class});
        }
        return (byte) 1;
    }
}
