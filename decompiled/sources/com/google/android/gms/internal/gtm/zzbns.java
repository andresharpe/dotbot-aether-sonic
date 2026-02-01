package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbns extends zzbff implements zzbgt {
    private static final zzbns zza;
    private int zzb;
    private zzbnj zzg;
    private int zzh;
    private byte zzi = 2;
    private int zzf = 1;

    static {
        zzbns zzbnsVar = new zzbns();
        zza = zzbnsVar;
        zzbff.zzan(zzbns.class, zzbnsVar);
    }

    private zzbns() {
    }

    public static zzbns zze() {
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
                    return new zzbnl(null);
                }
                return new zzbns();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zzf", zzbnr.zzb(), "zzg", "zzh", zzbno.zzb()});
        }
        return Byte.valueOf(this.zzi);
    }
}
