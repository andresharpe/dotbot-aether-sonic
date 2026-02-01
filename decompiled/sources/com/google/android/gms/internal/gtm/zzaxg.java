package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaxg extends zzbff implements zzbgt {
    private static final zzaxg zza;
    private int zzb;
    private zzaqi zzf;
    private float zzg;
    private byte zzh = 2;

    static {
        zzaxg zzaxgVar = new zzaxg();
        zza = zzaxgVar;
        zzbff.zzan(zzaxg.class, zzaxgVar);
    }

    private zzaxg() {
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
                        return zza;
                    }
                    return new zzaxf(null);
                }
                return new zzaxg();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔁ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
