package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaly extends zzbff implements zzbgt {
    private static final zzaly zza;
    private int zzb;
    private zzayj zzh;
    private zzaaq zzi;
    private zzalt zzj;
    private zzaea zzk;
    private zzafk zzl;
    private byte zzm = 2;
    private int zzf = 241;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzaly zzalyVar = new zzaly();
        zza = zzalyVar;
        zzbff.zzan(zzaly.class, zzalyVar);
    }

    private zzaly() {
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
                    return new zzalu(null);
                }
                return new zzaly();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0001\u0004\u0001ဌ\u0000\u0002Л\u0007ဉ\u0001\tဉ\u0003\nᐉ\u0004\rᐉ\u0002\u000eᐉ\u0005", new Object[]{"zzb", "zzf", zzalx.zzc(), "zzg", zzawq.class, "zzh", "zzj", "zzk", "zzi", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
