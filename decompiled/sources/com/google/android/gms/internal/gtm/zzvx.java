package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvx extends zzbfb implements zzbgt {
    public static final zzbfd zza;
    private static final zzvx zzf;
    private int zzg;
    private zzvi zzh;
    private byte zzj = 2;
    private zzbfp zzi = zzbff.zzaj();

    static {
        zzvx zzvxVar = new zzvx();
        zzf = zzvxVar;
        zzbff.zzan(zzvx.class, zzvxVar);
        zza = zzbff.zzac(zzbmd.zze(), zzvxVar, zzvxVar, null, 17018692, zzbip.zzk, zzvx.class);
    }

    private zzvx() {
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
                        return zzf;
                    }
                    return new zzvw(null);
                }
                return new zzvx();
            }
            return zzbff.zzam(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"zzg", "zzh", "zzi", zzvv.class});
        }
        return Byte.valueOf(this.zzj);
    }
}
