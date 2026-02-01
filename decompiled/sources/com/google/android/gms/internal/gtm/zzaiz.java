package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaiz extends zzbff implements zzbgt {
    private static final zzaiz zza;
    private int zzb;
    private int zzh;
    private zzamq zzi;
    private zzajf zzj;
    private zzbmd zzk;
    private int zzl;
    private byte zzn = 2;
    private int zzf = 17;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzm = zzbff.zzaj();

    static {
        zzaiz zzaizVar = new zzaiz();
        zza = zzaizVar;
        zzbff.zzan(zzaiz.class, zzaizVar);
    }

    private zzaiz() {
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
                            this.zzn = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaiv(null);
                }
                return new zzaiz();
            }
            return zzbff.zzam(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzb", "zzf", zzaiy.zzc(), "zzg", zzapo.class, "zzh", "zzi", "zzj", "zzl", "zzm", zzaxd.class, "zzk"});
        }
        return Byte.valueOf(this.zzn);
    }
}
