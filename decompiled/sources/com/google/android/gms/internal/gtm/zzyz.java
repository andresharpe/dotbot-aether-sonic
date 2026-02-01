package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyz extends zzbff implements zzbgt {
    private static final zzyz zza;
    private byte zzh = 2;
    private zzbfp zzb = zzbff.zzaj();
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzyz zzyzVar = new zzyz();
        zza = zzyzVar;
        zzbff.zzan(zzyz.class, zzyzVar);
    }

    private zzyz() {
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
                    return new zzyy(null);
                }
                return new zzyz();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0003Л", new Object[]{"zzb", zzamq.class, "zzf", zzamq.class, "zzg", zzamq.class});
        }
        return Byte.valueOf(this.zzh);
    }
}
