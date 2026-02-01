package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbcn extends zzbfb implements zzbgt {
    private static final zzbcn zza;
    private int zzf;
    private boolean zzh;
    private boolean zzi;
    private byte zzk = 2;
    private String zzg = "";
    private zzbfp zzj = zzbhc.zze();

    static {
        zzbcn zzbcnVar = new zzbcn();
        zza = zzbcnVar;
        zzbff.zzan(zzbcn.class, zzbcnVar);
    }

    private zzbcn() {
    }

    public static zzbcn zze() {
        return zza;
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
                    return new zzbcm(null);
                }
                return new zzbcn();
            }
            return new zzbhd(zza, "\u0001\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", zzbei.class});
        }
        return Byte.valueOf(this.zzk);
    }
}
