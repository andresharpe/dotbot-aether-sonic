package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzacr extends zzbff implements zzbgt {
    private static final zzacr zza;
    private int zzb;
    private Object zzg;
    private int zzh;
    private int zzf = 0;
    private byte zzi = 2;

    static {
        zzacr zzacrVar = new zzacr();
        zza = zzacrVar;
        zzbff.zzan(zzacr.class, zzacrVar);
    }

    private zzacr() {
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
                    return new zzacn(null);
                }
                return new zzacr();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐼ\u0000", new Object[]{"zzg", "zzf", "zzb", "zzh", zzacq.zzc(), zzayv.class});
        }
        return Byte.valueOf(this.zzi);
    }
}
