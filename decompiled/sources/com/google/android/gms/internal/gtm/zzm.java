package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzm extends zzbff implements zzbgt {
    private static final zzm zza;
    private byte zzg = 2;
    private zzbfp zzb = zzbff.zzaj();
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzbff.zzan(zzm.class, zzmVar);
    }

    private zzm() {
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
                    return new zzl(null);
                }
                return new zzm();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzb", zzk.class, "zzf", zzg.class});
        }
        return Byte.valueOf(this.zzg);
    }
}
