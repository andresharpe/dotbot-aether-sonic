package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaxo extends zzbff implements zzbgt {
    private static final zzaxo zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private int zzg;

    static {
        zzaxo zzaxoVar = new zzaxo();
        zza = zzaxoVar;
        zzbff.zzan(zzaxo.class, zzaxoVar);
    }

    private zzaxo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzaxk(null);
                }
                return new zzaxo();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"zzb", "zzf", zzayh.class, "zzg", zzaxn.zzc()});
        }
        return (byte) 1;
    }
}
