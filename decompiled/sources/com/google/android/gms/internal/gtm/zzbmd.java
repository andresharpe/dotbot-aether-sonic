package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbmd extends zzbfb implements zzbgt {
    private static final zzbmd zza;
    private byte zzf = 2;

    static {
        zzbmd zzbmdVar = new zzbmd();
        zza = zzbmdVar;
        zzbff.zzan(zzbmd.class, zzbmdVar);
    }

    private zzbmd() {
    }

    public static zzbmd zze() {
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
                    return new zzbmc(null);
                }
                return new zzbmd();
            }
            return zzbff.zzam(zza, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zzf);
    }
}
