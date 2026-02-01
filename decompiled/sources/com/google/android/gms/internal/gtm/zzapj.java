package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapj extends zzbff implements zzbgt {
    private static final zzapj zza;
    private int zzb;
    private byte zzh = 2;
    private zzbfp zzf = zzbff.zzaj();
    private String zzg = "";

    static {
        zzapj zzapjVar = new zzapj();
        zza = zzapjVar;
        zzbff.zzan(zzapj.class, zzapjVar);
    }

    private zzapj() {
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
                    return new zzapi(null);
                }
                return new zzapj();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"zzb", "zzf", zzapm.class, "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
