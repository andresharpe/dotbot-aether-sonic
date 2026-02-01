package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbpv extends zzbff implements zzbgt {
    private static final zzbpv zza;
    private int zzb;
    private byte zzg = 2;
    private int zzf = 1;

    static {
        zzbpv zzbpvVar = new zzbpv();
        zza = zzbpvVar;
        zzbff.zzan(zzbpv.class, zzbpvVar);
    }

    private zzbpv() {
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
                    return new zzbpr(null);
                }
                return new zzbpv();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"zzb", "zzf", zzbpu.zzb()});
        }
        return Byte.valueOf(this.zzg);
    }
}
