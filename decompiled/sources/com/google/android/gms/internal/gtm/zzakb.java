package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzakb extends zzbff implements zzbgt {
    private static final zzakb zza;
    private int zzb;
    private int zzf;
    private zzamq zzh;
    private zzamq zzi;
    private byte zzl = 2;
    private int zzg = 1;
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();

    static {
        zzakb zzakbVar = new zzakb();
        zza = zzakbVar;
        zzbff.zzan(zzakb.class, zzakbVar);
    }

    private zzakb() {
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
                    return new zzaka(null);
                }
                return new zzakb();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0004\u0001ᔄ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005\u001b\u0006Л", new Object[]{"zzb", "zzf", "zzg", zzajz.zzc(), "zzh", "zzi", "zzj", zzakd.class, "zzk", zzamq.class});
        }
        return Byte.valueOf(this.zzl);
    }
}
