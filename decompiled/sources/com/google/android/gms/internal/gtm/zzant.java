package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzant extends zzbff implements zzbgt {
    private static final zzant zza;
    private int zzb;
    private zzamq zzh;
    private zzamq zzi;
    private byte zzj = 2;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzant zzantVar = new zzant();
        zza = zzantVar;
        zzbff.zzan(zzant.class, zzantVar);
    }

    private zzant() {
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
                            this.zzj = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzans(null);
                }
                return new zzant();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0004\u0001Л\u0002Л\u0003ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"zzb", "zzf", zzamq.class, "zzg", zzamq.class, "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
