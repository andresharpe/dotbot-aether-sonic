package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapg extends zzbff implements zzbgt {
    private static final zzapg zza;
    private int zzb;
    private float zzf;
    private byte zzh = 2;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzapg zzapgVar = new zzapg();
        zza = zzapgVar;
        zzbff.zzan(zzapg.class, zzapgVar);
    }

    private zzapg() {
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
                    return new zzapf(null);
                }
                return new zzapg();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ခ\u0000\u0002Л", new Object[]{"zzb", "zzf", "zzg", zzamq.class});
        }
        return Byte.valueOf(this.zzh);
    }
}
