package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzajf extends zzbff implements zzbgt {
    private static final zzajf zza;
    private int zzb;
    private zzbmd zzk;
    private byte zzl = 2;
    private zzbfl zzf = zzbff.zzah();
    private zzbfk zzg = zzbff.zzag();
    private boolean zzh = true;
    private String zzi = "";
    private String zzj = "";

    static {
        zzajf zzajfVar = new zzajf();
        zza = zzajfVar;
        zzbff.zzan(zzajf.class, zzajfVar);
    }

    private zzajf() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaje(null);
                }
                return new zzajf();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
