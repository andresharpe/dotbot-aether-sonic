package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbcp extends zzbfb implements zzbgt {
    private static final zzbcp zza;
    private int zzf;
    private boolean zzg;
    private byte zzi = 2;
    private zzbfp zzh = zzbhc.zze();

    static {
        zzbcp zzbcpVar = new zzbcp();
        zza = zzbcpVar;
        zzbff.zzan(zzbcp.class, zzbcpVar);
    }

    private zzbcp() {
    }

    public static zzbcp zze() {
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
                            this.zzi = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbco(null);
                }
                return new zzbcp();
            }
            return new zzbhd(zza, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"zzf", "zzg", "zzh", zzbei.class});
        }
        return Byte.valueOf(this.zzi);
    }
}
