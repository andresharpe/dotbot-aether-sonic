package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbei extends zzbff implements zzbgt {
    private static final zzbei zza;
    private int zzb;
    private long zzh;
    private long zzi;
    private double zzj;
    private byte zzm = 2;
    private zzbfp zzf = zzbhc.zze();
    private String zzg = "";
    private zzbbw zzk = zzbbw.zzb;
    private String zzl = "";

    static {
        zzbei zzbeiVar = new zzbei();
        zza = zzbeiVar;
        zzbff.zzan(zzbei.class, zzbeiVar);
    }

    private zzbei() {
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
                            this.zzm = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbef(null);
                }
                return new zzbei();
            }
            return new zzbhd(zza, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzb", "zzf", zzbeh.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
