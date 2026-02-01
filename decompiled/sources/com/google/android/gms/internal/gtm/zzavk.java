package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzavk extends zzbff implements zzbgt {
    private static final zzavk zza;
    private int zzb;
    private zzaqo zzf;
    private zzamq zzg;
    private zzxj zzh;
    private byte zzj = 2;
    private String zzi = "";

    static {
        zzavk zzavkVar = new zzavk();
        zza = zzavkVar;
        zzbff.zzan(zzavk.class, zzavkVar);
    }

    private zzavk() {
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
                        return zza;
                    }
                    return new zzavj(null);
                }
                return new zzavk();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0010ဈ\u0003", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
