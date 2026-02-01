package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzvq extends zzbfb implements zzbgt {
    private static final zzvq zza;
    private byte zzg = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzvq zzvqVar = new zzvq();
        zza = zzvqVar;
        zzbff.zzan(zzvq.class, zzvqVar);
    }

    private zzvq() {
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
                    return new zzvp(null);
                }
                return new zzvq();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzf", zzvv.class});
        }
        return Byte.valueOf(this.zzg);
    }
}
