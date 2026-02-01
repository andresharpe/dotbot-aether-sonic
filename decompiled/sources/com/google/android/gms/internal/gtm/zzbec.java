package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbec extends zzbfb implements zzbgt {
    private static final zzbec zza;
    private byte zzg = 2;
    private zzbfp zzf = zzbhc.zze();

    static {
        zzbec zzbecVar = new zzbec();
        zza = zzbecVar;
        zzbff.zzan(zzbec.class, zzbecVar);
    }

    private zzbec() {
    }

    public static zzbec zze() {
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
                            this.zzg = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbeb(null);
                }
                return new zzbec();
            }
            return new zzbhd(zza, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"zzf", zzbei.class});
        }
        return Byte.valueOf(this.zzg);
    }
}
