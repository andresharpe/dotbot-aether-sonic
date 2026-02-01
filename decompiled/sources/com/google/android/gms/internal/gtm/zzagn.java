package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagn extends zzbff implements zzbgt {
    private static final zzagn zza;
    private byte zzf = 2;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzagn zzagnVar = new zzagn();
        zza = zzagnVar;
        zzbff.zzan(zzagn.class, zzagnVar);
    }

    private zzagn() {
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
                            this.zzf = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzagm(null);
                }
                return new zzagn();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", zzamq.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
