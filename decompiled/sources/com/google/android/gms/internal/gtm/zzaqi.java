package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaqi extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaqi zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzana zzi;
    private zzbmd zzj;
    private byte zzk = 2;

    static {
        zzaqi zzaqiVar = new zzaqi();
        zzb = zzaqiVar;
        zzbff.zzan(zzaqi.class, zzaqiVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaqiVar, zzaqiVar, null, 14827556, zzbip.zzk, zzaqi.class);
    }

    private zzaqi() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaqh(null);
                }
                return new zzaqi();
            }
            return zzbff.zzam(zzb, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0003\u0001ᔆ\u0000\u0002ᔆ\u0001\u000fᐉ\u0003Ǵဉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzj", "zzi"});
        }
        return Byte.valueOf(this.zzk);
    }
}
