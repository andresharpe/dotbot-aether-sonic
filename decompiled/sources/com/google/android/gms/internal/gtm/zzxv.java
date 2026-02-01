package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzxv extends zzbff implements zzbgt {
    private static final zzxv zza;
    private int zzb;
    private zzaqi zzf;
    private byte zzg = 2;

    static {
        zzxv zzxvVar = new zzxv();
        zza = zzxvVar;
        zzbff.zzan(zzxv.class, zzxvVar);
    }

    private zzxv() {
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
                    return new zzxu(null);
                }
                return new zzxv();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzb", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
