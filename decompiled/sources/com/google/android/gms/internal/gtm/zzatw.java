package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzatw extends zzbff implements zzbgt {
    private static final zzatw zza;
    private int zzb;
    private zzamq zzf;
    private int zzh;
    private zzana zzi;
    private byte zzj = 2;
    private int zzg = 2;

    static {
        zzatw zzatwVar = new zzatw();
        zza = zzatwVar;
        zzbff.zzan(zzatw.class, zzatwVar);
    }

    private zzatw() {
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
                    return new zzats(null);
                }
                return new zzatw();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002Ǵဉ\u0003", new Object[]{"zzb", "zzf", "zzg", zzatv.zzc(), "zzh", zzafh.zzc(), "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
