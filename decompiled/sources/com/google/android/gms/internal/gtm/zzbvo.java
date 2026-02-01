package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvo extends zzbff implements zzbgt {
    private static final zzbvo zza;
    private int zzb;
    private int zzh;
    private int zzk;
    private zzbvn zzn;
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzl = "";
    private String zzm = "";

    static {
        zzbvo zzbvoVar = new zzbvo();
        zza = zzbvoVar;
        zzbff.zzan(zzbvo.class, zzbvoVar);
    }

    private zzbvo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbvd(null);
                }
                return new zzbvo();
            }
            return zzbff.zzam(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဈ\u0006\bဈ\u0007\tဉ\b", new Object[]{"zzb", "zzf", "zzg", "zzh", zzbvg.zzb(), "zzi", "zzj", "zzk", zzbvj.zzb(), "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
