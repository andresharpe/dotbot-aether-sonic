package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbaw extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzbaw zzb;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private zzbfp zzj = zzbff.zzaj();
    private String zzk = "";

    static {
        zzbaw zzbawVar = new zzbaw();
        zzb = zzbawVar;
        zzbff.zzan(zzbaw.class, zzbawVar);
        zza = zzbff.zzac(zzbmd.zze(), zzbawVar, zzbawVar, null, 3546500, zzbip.zzk, zzbaw.class);
    }

    private zzbaw() {
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
                        return zzb;
                    }
                    return new zzbav(null);
                }
                return new zzbaw();
            }
            return zzbff.zzam(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
