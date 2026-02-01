package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagv extends zzbff implements zzbgt {
    private static final zzagv zza;
    private int zzb;
    private zzamq zzg;
    private byte zzh = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzagv zzagvVar = new zzagv();
        zza = zzagvVar;
        zzbff.zzan(zzagv.class, zzagvVar);
    }

    private zzagv() {
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
                    return new zzagu(null);
                }
                return new zzagv();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zzb", "zzf", zzagt.class, "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
