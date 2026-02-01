package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazb extends zzbff implements zzbgt {
    public static final zzbfd zza;
    public static final zzbfd zzb;
    private static final zzazb zzf;
    private int zzg;
    private zzbbw zzh = zzbbw.zzb;
    private String zzi = "";
    private int zzj = 71644;
    private String zzk = "";

    static {
        zzazb zzazbVar = new zzazb();
        zzf = zzazbVar;
        zzbff.zzan(zzazb.class, zzazbVar);
        zzbcz zze = zzbcz.zze();
        zzbip zzbipVar = zzbip.zze;
        zza = zzbff.zzac(zze, 0, null, null, 209473639, zzbipVar, Integer.class);
        zzb = zzbff.zzac(zzbcz.zze(), 0, null, null, 313857734, zzbipVar, Integer.class);
    }

    private zzazb() {
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
                        return zzf;
                    }
                    return new zzaza(null);
                }
                return new zzazb();
            }
            return zzbff.zzam(zzf, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0006င\u0002", new Object[]{"zzg", "zzh", "zzi", "zzk", "zzj"});
        }
        return (byte) 1;
    }
}
