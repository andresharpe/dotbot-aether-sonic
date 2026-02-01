package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzuo extends zzbff implements zzbgt {
    private static final zzuo zza;
    private int zzb;
    private zzuq zzg;
    private zzuq zzh;
    private int zzj;
    private int zzk;
    private zzbnj zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzi = "";

    static {
        zzuo zzuoVar = new zzuo();
        zza = zzuoVar;
        zzbff.zzan(zzuo.class, zzuoVar);
    }

    private zzuo() {
    }

    public static zzuo zzc() {
        return zza;
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
                    return new zzuh(null);
                }
                return new zzuo();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0004\u0005ဌ\u0005\u0006ဈ\u0003\tᐉ\u0006", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzj", zzuk.zzc(), "zzk", zzun.zzc(), "zzi", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
