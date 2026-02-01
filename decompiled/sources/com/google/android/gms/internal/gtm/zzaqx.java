package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaqx extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaqx zzb;
    private int zzf;
    private double zzg;
    private double zzh;
    private String zzi = "";
    private int zzj;

    static {
        zzaqx zzaqxVar = new zzaqx();
        zzb = zzaqxVar;
        zzbff.zzan(zzaqx.class, zzaqxVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaqxVar, zzaqxVar, null, 15000834, zzbip.zzk, zzaqx.class);
    }

    private zzaqx() {
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
                    return new zzaqt(null);
                }
                return new zzaqx();
            }
            return zzbff.zzam(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", zzaqw.zzc()});
        }
        return (byte) 1;
    }
}
