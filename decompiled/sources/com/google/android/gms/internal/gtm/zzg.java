package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzg extends zzbff implements zzbgt {
    private static final zzg zza;
    private int zzb;
    private zzam zzg;
    private byte zzi = 2;
    private zzbfp zzf = zzbff.zzaj();
    private String zzh = "";

    static {
        zzg zzgVar = new zzg();
        zza = zzgVar;
        zzbff.zzan(zzg.class, zzgVar);
    }

    private zzg() {
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
                    return new zzf(null);
                }
                return new zzg();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzb", "zzf", zzi.class, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
