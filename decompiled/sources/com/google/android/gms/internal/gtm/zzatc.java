package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzatc extends zzbff implements zzbgt {
    private static final zzatc zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private zzapo zzi;
    private zzamq zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;
    private int zzh = 1;

    static {
        zzatc zzatcVar = new zzatc();
        zza = zzatcVar;
        zzbff.zzan(zzatc.class, zzatcVar);
    }

    private zzatc() {
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
                            this.zzm = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzasy(null);
                }
                return new zzatc();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007င\u0005\bဌ\u0006", new Object[]{"zzb", "zzf", "zzg", "zzh", zzatb.zzc(), "zzi", "zzj", "zzk", "zzl", zzafh.zzc()});
        }
        return Byte.valueOf(this.zzm);
    }
}
