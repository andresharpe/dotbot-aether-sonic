package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzblm extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzblm zzb;
    private int zzf;
    private zzblq zzi;
    private boolean zzj;
    private String zzg = "";
    private String zzh = "";
    private zzbfp zzk = zzbff.zzaj();
    private zzbfp zzl = zzbff.zzaj();

    static {
        zzblm zzblmVar = new zzblm();
        zzb = zzblmVar;
        zzbff.zzan(zzblm.class, zzblmVar);
        zza = zzbff.zzac(zzbmd.zze(), zzblmVar, zzblmVar, null, 75852567, zzbip.zzk, zzblm.class);
    }

    private zzblm() {
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
                    return new zzbld(null);
                }
                return new zzblm();
            }
            return zzbff.zzam(zzb, "\u0001\u0006\u0000\u0001\u0001\u0014\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0010\u001b\u0011ဉ\u0002\u0013ဇ\u0003\u0014\u001b", new Object[]{"zzf", "zzg", "zzh", "zzk", zzble.class, "zzi", "zzj", "zzl", zzblc.class});
        }
        return (byte) 1;
    }
}
