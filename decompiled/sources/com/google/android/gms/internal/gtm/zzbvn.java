package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbvn extends zzbff implements zzbgt {
    private static final zzbvn zza;
    private int zzb;
    private boolean zzg;
    private zzbfp zzf = zzbff.zzaj();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";

    static {
        zzbvn zzbvnVar = new zzbvn();
        zza = zzbvnVar;
        zzbff.zzan(zzbvn.class, zzbvnVar);
    }

    private zzbvn() {
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
                    return new zzbvm(null);
                }
                return new zzbvn();
            }
            return zzbff.zzam(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"zzb", "zzf", zzbvl.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
