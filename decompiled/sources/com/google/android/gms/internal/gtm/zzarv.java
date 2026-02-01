package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzarv extends zzbff implements zzbgt {
    private static final zzarv zza;
    private int zzb;
    private int zzi;
    private byte zzj = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzarv zzarvVar = new zzarv();
        zza = zzarvVar;
        zzbff.zzan(zzarv.class, zzarvVar);
    }

    private zzarv() {
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
                    return new zzarr(null);
                }
                return new zzarv();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ဌ\u0003", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", zzaru.zzc()});
        }
        return Byte.valueOf(this.zzj);
    }
}
