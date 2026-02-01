package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbee extends zzbfb implements zzbgt {
    private static final zzbee zza;
    private int zzf;
    private boolean zzg;
    private boolean zzi;
    private boolean zzj;
    private byte zzl = 2;
    private double zzh = -1.0d;
    private zzbfp zzk = zzbhc.zze();

    static {
        zzbee zzbeeVar = new zzbee();
        zza = zzbeeVar;
        zzbff.zzan(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbee zze() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbed(null);
                }
                return new zzbee();
            }
            return new zzbhd(zza, "\u0001\u0005\u0000\u0001\u0010ϧ\u0005\u0000\u0001\u0001\u0010က\u0001\u0011ဇ\u0002\u0014ဇ\u0000!ဇ\u0003ϧЛ", new Object[]{"zzf", "zzh", "zzi", "zzg", "zzj", "zzk", zzbei.class});
        }
        return Byte.valueOf(this.zzl);
    }
}
