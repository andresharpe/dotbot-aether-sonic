package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzayv extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzayv zzb;
    private int zzf;
    private int zzi;
    private zzana zzj;
    private byte zzk = 2;
    private String zzg = "";
    private String zzh = "";

    static {
        zzayv zzayvVar = new zzayv();
        zzb = zzayvVar;
        zzbff.zzan(zzayv.class, zzayvVar);
        zza = zzbff.zzac(zzbmd.zze(), zzayvVar, zzayvVar, null, 23880165, zzbip.zzk, zzayv.class);
    }

    private zzayv() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzayu(null);
                }
                return new zzayv();
            }
            return zzbff.zzam(zzb, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0005င\u0002Ǵဉ\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
