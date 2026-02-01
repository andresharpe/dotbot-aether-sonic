package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzwr extends zzbff implements zzbgt {
    private static final zzwr zza;
    private int zzb;
    private zzbor zzf;
    private zzana zzg;
    private byte zzh = 2;

    static {
        zzwr zzwrVar = new zzwr();
        zza = zzwrVar;
        zzbff.zzan(zzwr.class, zzwrVar);
    }

    private zzwr() {
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
                            this.zzh = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzwq(null);
                }
                return new zzwr();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001Ǵ\u0002\u0000\u0000\u0001\u0001ᐉ\u0000Ǵဉ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
