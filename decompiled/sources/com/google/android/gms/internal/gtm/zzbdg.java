package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbdg extends zzbfb implements zzbgt {
    private static final zzbdg zza;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private byte zzm = 2;
    private String zzk = "";
    private zzbfp zzl = zzbhc.zze();

    static {
        zzbdg zzbdgVar = new zzbdg();
        zza = zzbdgVar;
        zzbff.zzan(zzbdg.class, zzbdgVar);
    }

    private zzbdg() {
    }

    public static zzbdg zze() {
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
                            this.zzm = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbdf(null);
                }
                return new zzbdg();
            }
            return new zzbhd(zza, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzbei.class});
        }
        return Byte.valueOf(this.zzm);
    }
}
