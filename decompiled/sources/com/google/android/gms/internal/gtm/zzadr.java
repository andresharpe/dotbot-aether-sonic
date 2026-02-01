package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzadr extends zzbff implements zzbgt {
    private static final zzadr zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzadr zzadrVar = new zzadr();
        zza = zzadrVar;
        zzbff.zzan(zzadr.class, zzadrVar);
    }

    private zzadr() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzacm zzacmVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzadq(zzacmVar);
                }
                return new zzadr();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
