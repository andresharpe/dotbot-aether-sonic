package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyo extends zzbff implements zzbgt {
    private static final zzyo zza;
    private int zzb;
    private zzamq zzf;
    private zzamq zzg;
    private zzamq zzh;
    private zzamu zzi;
    private byte zzk = 2;
    private zzbfp zzj = zzbff.zzaj();

    static {
        zzyo zzyoVar = new zzyo();
        zza = zzyoVar;
        zzbff.zzan(zzyo.class, zzyoVar);
    }

    private zzyo() {
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
                        return zza;
                    }
                    return new zzyn(null);
                }
                return new zzyo();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", zzamq.class});
        }
        return Byte.valueOf(this.zzk);
    }
}
