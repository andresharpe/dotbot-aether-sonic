package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzblz extends zzbff implements zzbgt {
    private static final zzblz zza;
    private byte zzf = 2;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzblz zzblzVar = new zzblz();
        zza = zzblzVar;
        zzbff.zzan(zzblz.class, zzblzVar);
    }

    private zzblz() {
    }

    public static zzblz zze() {
        return zza;
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
                            this.zzf = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzblw(null);
                }
                return new zzblz();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", zzbly.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
