package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzakj extends zzbff implements zzbgt {
    private static final zzakj zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private zzana zzh;
    private float zzi;
    private zzana zzj;
    private float zzk;
    private zzamq zzm;
    private byte zzn = 2;
    private zzbfp zzl = zzbff.zzaj();

    static {
        zzakj zzakjVar = new zzakj();
        zza = zzakjVar;
        zzbff.zzan(zzakj.class, zzakjVar);
    }

    private zzakj() {
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
                    return new zzakf(null);
                }
                return new zzakj();
            }
            return zzbff.zzam(zza, "\u0001\b\u0000\u0001\u0001ǵ\b\u0000\u0001\u0002\u0001ဌ\u0000\u0002င\u0001\u0003ခ\u0003\u0004ခ\u0005\u0006Л\u0007ᐉ\u0006Ǵဉ\u0002ǵဉ\u0004", new Object[]{"zzb", "zzf", zzaki.zzc(), "zzg", "zzi", "zzk", "zzl", zzamq.class, "zzm", "zzh", "zzj"});
        }
        return Byte.valueOf(this.zzn);
    }
}
