package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzk extends zzbff implements zzbgt {
    private static final zzk zza;
    private int zzb;
    private zzam zzl;
    private byte zzm = 2;
    private zzbfp zzf = zzbff.zzaj();
    private zzbfp zzg = zzbff.zzaj();
    private zzbfp zzh = zzbff.zzaj();
    private zzbfp zzi = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();

    static {
        zzk zzkVar = new zzk();
        zza = zzkVar;
        zzbff.zzan(zzk.class, zzkVar);
    }

    private zzk() {
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
                    return new zzj(null);
                }
                return new zzk();
            }
            return zzbff.zzam(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zzb", "zzf", zzg.class, "zzg", zzg.class, "zzh", zzg.class, "zzi", zzg.class, "zzj", zzg.class, "zzk", zzg.class, "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
