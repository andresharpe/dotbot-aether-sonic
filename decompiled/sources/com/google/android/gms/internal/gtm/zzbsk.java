package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbsk extends zzbfb implements zzbgt {
    public static final zzbfd zza;
    private static final zzbsk zzf;
    private byte zzh = 2;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzbsk zzbskVar = new zzbsk();
        zzf = zzbskVar;
        zzbff.zzan(zzbsk.class, zzbskVar);
        zza = zzbff.zzac(zzbmd.zze(), zzbskVar, zzbskVar, null, 45632928, zzbip.zzk, zzbsk.class);
    }

    private zzbsk() {
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
                            this.zzh = b4;
                            return null;
                        }
                        return zzf;
                    }
                    return new zzbsj(null);
                }
                return new zzbsk();
            }
            return zzbff.zzam(zzf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzg", zzbsi.class});
        }
        return Byte.valueOf(this.zzh);
    }
}
