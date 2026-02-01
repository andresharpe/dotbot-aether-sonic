package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzait extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzait zzb;
    private int zzf;
    private zzbmd zzk;
    private zzait zzl;
    private zzana zzm;
    private byte zzn = 2;
    private String zzg = "";
    private zzbfp zzh = zzbff.zzaj();
    private zzbfp zzi = zzbff.zzaj();
    private zzbfp zzj = zzbff.zzaj();

    static {
        zzait zzaitVar = new zzait();
        zzb = zzaitVar;
        zzbff.zzan(zzait.class, zzaitVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaitVar, zzaitVar, null, 12208774, zzbip.zzk, zzait.class);
    }

    private zzait() {
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
                            this.zzn = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzais(null);
                }
                return new zzait();
            }
            return zzbff.zzam(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzf", "zzh", zzaiz.class, "zzj", zzaiz.class, "zzi", zzajc.class, "zzk", "zzg", "zzl", "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }
}
