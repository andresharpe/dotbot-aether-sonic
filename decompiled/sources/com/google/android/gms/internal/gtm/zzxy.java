package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzxy extends zzbff implements zzbgt {
    private static final zzxy zza;
    private int zzb;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzj;
    private byte zzk = 2;
    private zzbfp zzi = zzbff.zzaj();

    static {
        zzxy zzxyVar = new zzxy();
        zza = zzxyVar;
        zzbff.zzan(zzxy.class, zzxyVar);
    }

    private zzxy() {
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
                            this.zzk = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzxx(null);
                }
                return new zzxy();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004Л\u0005င\u0003", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", zzvx.class, "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
