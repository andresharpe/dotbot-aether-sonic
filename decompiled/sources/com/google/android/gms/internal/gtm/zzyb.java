package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyb extends zzbff implements zzbgt {
    private static final zzyb zza;
    private int zzb;
    private zzamq zzf;
    private byte zzg = 2;

    static {
        zzyb zzybVar = new zzyb();
        zza = zzybVar;
        zzbff.zzan(zzyb.class, zzybVar);
    }

    private zzyb() {
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
                            this.zzg = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzya(null);
                }
                return new zzyb();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzb", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
