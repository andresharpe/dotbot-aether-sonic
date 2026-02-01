package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaan extends zzbff implements zzbgt {
    private static final zzaan zza;
    private int zzb;
    private int zzg;
    private byte zzh = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzaan zzaanVar = new zzaan();
        zza = zzaanVar;
        zzbff.zzan(zzaan.class, zzaanVar);
    }

    private zzaan() {
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
                    return new zzaaj(null);
                }
                return new zzaan();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"zzb", "zzf", zzamq.class, "zzg", zzaam.zzc()});
        }
        return Byte.valueOf(this.zzh);
    }
}
