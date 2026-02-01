package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbnj extends zzbff implements zzbgt {
    private static final zzbnj zza;
    private int zzb;
    private zzboc zzk;
    private byte zzl = 2;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzh = zzbff.zzaj();
    private String zzi = "";
    private zzbfp zzj = zzbff.zzaj();

    static {
        zzbnj zzbnjVar = new zzbnj();
        zza = zzbnjVar;
        zzbff.zzan(zzbnj.class, zzbnjVar);
    }

    private zzbnj() {
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
                    return new zzbni(null);
                }
                return new zzbnj();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0004\u0001\u0002Л\u0003\u001b\u0004\u001b\u0005ဈ\u0000\u0006\u001b\u0007ဉ\u0001", new Object[]{"zzb", "zzf", zzbqb.class, "zzg", zzuf.class, "zzh", zzbny.class, "zzi", "zzj", zzbnv.class, "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
