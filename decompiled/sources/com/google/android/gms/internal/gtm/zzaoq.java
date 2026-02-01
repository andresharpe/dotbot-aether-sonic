package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaoq extends zzbff implements zzbgt {
    private static final zzaoq zza;
    private int zzb;
    private zzamq zzf;
    private int zzg;
    private zzaok zzh;
    private zzxj zzi;
    private boolean zzl;
    private byte zzm = 2;
    private zzbfp zzj = zzbff.zzaj();
    private String zzk = "";

    static {
        zzaoq zzaoqVar = new zzaoq();
        zza = zzaoqVar;
        zzbff.zzan(zzaoq.class, zzaoqVar);
    }

    private zzaoq() {
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
                    return new zzaop(null);
                }
                return new zzaoq();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004Л\u0005ဈ\u0004\u0006ဉ\u0003\u0007ဇ\u0005", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzj", zzaoi.class, "zzk", "zzi", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
