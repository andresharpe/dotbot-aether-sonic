package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagt extends zzbff implements zzbgt {
    private static final zzagt zza;
    private int zzb;
    private zzamq zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzagt zzagtVar = new zzagt();
        zza = zzagtVar;
        zzbff.zzan(zzagt.class, zzagtVar);
    }

    private zzagt() {
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
                    return new zzags(null);
                }
                return new zzagt();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
