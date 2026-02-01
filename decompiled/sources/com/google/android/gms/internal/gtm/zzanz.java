package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzanz extends zzbff implements zzbgt {
    private static final zzanz zza;
    private int zzb;
    private zzamq zzi;
    private byte zzj = 2;
    private zzbfp zzf = zzbff.zzaj();
    private int zzg = 1;
    private zzbfp zzh = zzbff.zzaj();

    static {
        zzanz zzanzVar = new zzanz();
        zza = zzanzVar;
        zzbff.zzan(zzanz.class, zzanzVar);
    }

    private zzanz() {
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
                    return new zzanv(null);
                }
                return new zzanz();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0003\u0001Л\u0002ဌ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"zzb", "zzf", zzamq.class, "zzg", zzany.zzc(), "zzh", zzamq.class, "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
