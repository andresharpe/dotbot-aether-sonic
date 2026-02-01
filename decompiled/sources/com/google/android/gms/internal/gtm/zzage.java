package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzage extends zzbff implements zzbgt {
    private static final zzage zza;
    private int zzb;
    private Object zzg;
    private Object zzi;
    private int zzf = 0;
    private int zzh = 0;
    private byte zzj = 2;

    static {
        zzage zzageVar = new zzage();
        zza = zzageVar;
        zzbff.zzan(zzage.class, zzageVar);
    }

    private zzage() {
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
                    return new zzagd(null);
                }
                return new zzage();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0002\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ᐼ\u0001", new Object[]{"zzg", "zzf", "zzi", "zzh", "zzb", zzaky.class, zzaky.class, zzaky.class, zzaky.class});
        }
        return Byte.valueOf(this.zzj);
    }
}
