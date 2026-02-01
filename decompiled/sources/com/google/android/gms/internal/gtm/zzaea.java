package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaea extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaea zzb;
    private int zzf;
    private zzaec zzi;
    private byte zzj = 2;
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzh = zzbff.zzaj();

    static {
        zzaea zzaeaVar = new zzaea();
        zzb = zzaeaVar;
        zzbff.zzan(zzaea.class, zzaeaVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaeaVar, zzaeaVar, null, 49520153, zzbip.zzk, zzaea.class);
    }

    private zzaea() {
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
                            this.zzj = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzadz(null);
                }
                return new zzaea();
            }
            return zzbff.zzam(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဉ\u0000", new Object[]{"zzf", "zzg", zzayy.class, "zzh", zzaef.class, "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
