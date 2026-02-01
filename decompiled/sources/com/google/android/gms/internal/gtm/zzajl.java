package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzajl extends zzbff implements zzbgt {
    private static final zzajl zza;
    private int zzb;
    private byte zzi = 2;
    private String zzf = "";
    private String zzg = "";
    private int zzh = 1;

    static {
        zzajl zzajlVar = new zzajl();
        zza = zzajlVar;
        zzbff.zzan(zzajl.class, zzajlVar);
    }

    private zzajl() {
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
                            this.zzi = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzajh(null);
                }
                return new zzajl();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔌ\u0002", new Object[]{"zzb", "zzf", "zzg", "zzh", zzajk.zzc()});
        }
        return Byte.valueOf(this.zzi);
    }
}
