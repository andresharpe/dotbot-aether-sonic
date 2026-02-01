package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzalk extends zzbff implements zzbgt {
    private static final zzalk zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private zzbmd zzk;
    private byte zzl = 2;

    static {
        zzalk zzalkVar = new zzalk();
        zza = zzalkVar;
        zzbff.zzan(zzalk.class, zzalkVar);
    }

    private zzalk() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzalj(null);
                }
                return new zzalk();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ᐉ\u0005", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
