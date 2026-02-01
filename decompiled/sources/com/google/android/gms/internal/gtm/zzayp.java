package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzayp extends zzbff implements zzbgt {
    private static final zzayp zza;
    private int zzb;
    private int zzg;
    private int zzh;
    private int zzi;
    private byte zzk = 2;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();

    static {
        zzayp zzaypVar = new zzayp();
        zza = zzaypVar;
        zzbff.zzan(zzayp.class, zzaypVar);
    }

    private zzayp() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzayl(null);
                }
                return new zzayp();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0002\u0001Л\u0003ဌ\u0000\u0004ဆ\u0001\u0005ဆ\u0002\u0007Л", new Object[]{"zzb", "zzf", zzamq.class, "zzg", zzayo.zzc(), "zzh", "zzi", "zzj", zzamq.class});
        }
        return Byte.valueOf(this.zzk);
    }
}
