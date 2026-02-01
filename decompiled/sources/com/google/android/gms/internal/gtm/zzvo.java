package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvo extends zzbff implements zzbgt {
    private static final zzvo zza;
    private int zzb;
    private float zzf;
    private byte zzh = 2;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzvo zzvoVar = new zzvo();
        zza = zzvoVar;
        zzbff.zzan(zzvo.class, zzvoVar);
    }

    private zzvo() {
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
                    return new zzvl(null);
                }
                return new zzvo();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ခ\u0000\u0002Л", new Object[]{"zzb", "zzf", "zzg", zzvn.class});
        }
        return Byte.valueOf(this.zzh);
    }
}
