package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbpg extends zzbff implements zzbgt {
    private static final zzbpg zza;
    private int zzb;
    private boolean zzf;
    private boolean zzg;
    private zzbqb zzh;
    private zzbqb zzi;
    private zzbqb zzj;
    private zzbqb zzk;
    private byte zzl = 2;

    static {
        zzbpg zzbpgVar = new zzbpg();
        zza = zzbpgVar;
        zzbff.zzan(zzbpg.class, zzbpgVar);
    }

    private zzbpg() {
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
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzbpf(null);
                }
                return new zzbpg();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ဇ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
