package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzamq extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzamq zzb;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzbmd zzi;
    private byte zzj = 2;

    static {
        zzamq zzamqVar = new zzamq();
        zzb = zzamqVar;
        zzbff.zzan(zzamq.class, zzamqVar);
        zza = zzbff.zzac(zzbmd.zze(), zzamqVar, zzamqVar, null, 13258261, zzbip.zzk, zzamq.class);
    }

    private zzamq() {
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
                    return new zzamp(null);
                }
                return new zzamq();
            }
            return zzbff.zzam(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
