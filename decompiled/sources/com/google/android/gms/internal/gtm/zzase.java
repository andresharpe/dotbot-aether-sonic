package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzase extends zzbff implements zzbgt {
    private static final zzase zza;
    private int zzb;
    private zzamq zzg;
    private int zzh;
    private float zzk;
    private boolean zzm;
    private zzbmd zzn;
    private zzana zzo;
    private byte zzp = 2;
    private int zzf = 1;
    private String zzi = "";
    private String zzj = "";
    private zzbfp zzl = zzbff.zzaj();

    static {
        zzase zzaseVar = new zzase();
        zza = zzaseVar;
        zzbff.zzan(zzase.class, zzaseVar);
    }

    private zzase() {
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
                            this.zzp = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzasa(null);
                }
                return new zzase();
            }
            return zzbff.zzam(zza, "\u0001\n\u0000\u0001\u0001Ǵ\n\u0000\u0001\u0004\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ခ\u0005\u0006Л\u0007ဇ\u0006\bဈ\u0004\u0010ᐉ\u0007Ǵဉ\b", new Object[]{"zzb", "zzf", zzasd.zzc(), "zzg", "zzh", "zzi", "zzk", "zzl", zzapo.class, "zzm", "zzj", "zzn", "zzo"});
        }
        return Byte.valueOf(this.zzp);
    }
}
