package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzayj extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzayj zzb;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzayj zzayjVar = new zzayj();
        zzb = zzayjVar;
        zzbff.zzan(zzayj.class, zzayjVar);
        zza = zzbff.zzac(zzbmd.zze(), zzayjVar, zzayjVar, null, 15256124, zzbip.zzk, zzayj.class);
    }

    private zzayj() {
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
                        return zzb;
                    }
                    return new zzayi(null);
                }
                return new zzayj();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzaxo.class});
        }
        return (byte) 1;
    }
}
