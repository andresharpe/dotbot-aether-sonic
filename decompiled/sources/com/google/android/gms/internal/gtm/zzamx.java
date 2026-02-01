package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzamx extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzamx zzb;
    private int zzf;
    private zzbbw zzg;
    private zzbbw zzh;
    private zzbfp zzi;
    private byte zzj = 2;

    static {
        zzamx zzamxVar = new zzamx();
        zzb = zzamxVar;
        zzbff.zzan(zzamx.class, zzamxVar);
        zza = zzbff.zzac(zzbmd.zze(), zzamxVar, zzamxVar, null, 1244700, zzbip.zzk, zzamx.class);
    }

    private zzamx() {
        zzbbw zzbbwVar = zzbbw.zzb;
        this.zzg = zzbbwVar;
        this.zzh = zzbbwVar;
        this.zzi = zzbff.zzaj();
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzj = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzamw(null);
                }
                return new zzamx();
            }
            return zzbff.zzam(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002ည\u0001\u0003Л", new Object[]{"zzf", "zzg", "zzh", "zzi", zzamn.class});
        }
        return Byte.valueOf(this.zzj);
    }
}
