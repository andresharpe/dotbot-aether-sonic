package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvv extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzvv zzb;
    private int zzf;
    private zzvi zzg;
    private long zzi;
    private byte zzk = 2;
    private zzbfp zzh = zzbff.zzaj();
    private int zzj = 1;

    static {
        zzvv zzvvVar = new zzvv();
        zzb = zzvvVar;
        zzbff.zzan(zzvv.class, zzvvVar);
        zza = zzbff.zzac(zzbmd.zze(), zzvvVar, zzvvVar, null, 115225276, zzbip.zzk, zzvv.class);
    }

    private zzvv() {
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
                        return zzb;
                    }
                    return new zzvr(null);
                }
                return new zzvv();
            }
            return zzbff.zzam(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဂ\u0001\u0004ဌ\u0002", new Object[]{"zzf", "zzg", "zzh", zzwc.class, "zzi", "zzj", zzvu.zzc()});
        }
        return Byte.valueOf(this.zzk);
    }
}
