package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzagh extends zzbff implements zzbgt {
    private static final zzagh zza;
    private int zzb;
    private zzayj zzg;
    private zzayj zzh;
    private boolean zzi;
    private byte zzj = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzagh zzaghVar = new zzagh();
        zza = zzaghVar;
        zzbff.zzan(zzagh.class, zzaghVar);
    }

    private zzagh() {
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
                    return new zzagg(null);
                }
                return new zzagh();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zzf", zzxy.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
