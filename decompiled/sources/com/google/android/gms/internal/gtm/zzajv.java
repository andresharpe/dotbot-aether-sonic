package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzajv extends zzbff implements zzbgt {
    private static final zzajv zza;
    private int zzb;
    private zzamq zzg;
    private zzana zzh;
    private byte zzi = 2;
    private String zzf = "";

    static {
        zzajv zzajvVar = new zzajv();
        zza = zzajvVar;
        zzbff.zzan(zzajv.class, zzajvVar);
    }

    private zzajv() {
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
                            this.zzi = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaju(null);
                }
                return new zzajv();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001Ǵ\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001Ǵဉ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
